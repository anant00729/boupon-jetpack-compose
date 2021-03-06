package com.an2t.moviereviewapp.presentation.components

import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.an2t.moviereviewapp.presentation.ui.recipe_list.FoodCategory
import com.an2t.moviereviewapp.presentation.ui.recipe_list.getAllFoodCategories

@Composable
fun HomeAppBar(
  query: String,
  onQueryChanged: (String) -> Unit,
  newSearch: () -> Unit,
  categoryScrollPosition: Float,
  selectedCategory: FoodCategory?,
  onSelectedCategory: (String) -> Unit,
  onChangeCategoryPosition: (Float) -> Unit
) {
  Surface(
    modifier = Modifier.fillMaxWidth(),
    color = Color.White,
    elevation = 8.dp
  ) {
    Column {
      Row(
        modifier = Modifier.fillMaxWidth(),
      ) {
        TextField(
          modifier = Modifier.fillMaxWidth(0.9f),
          value = query,
          onValueChange = {
            onQueryChanged(it)
          },
          label = {
            Text(text = "Search")
          },
          keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Done,
          ),
          leadingIcon = {
            Icon(Icons.Filled.Search)
          },
          onImeActionPerformed = { action, softKeyboardController ->
            if (action == ImeAction.Done) {
              newSearch()
              softKeyboardController?.hideSoftwareKeyboard()
            }
          },
          textStyle = TextStyle(color = MaterialTheme.colors.onSurface),
          backgroundColor = MaterialTheme.colors.surface
        )
      }
      Spacer(modifier = Modifier.padding(8.dp))
      val scrollState = rememberScrollState()
      ScrollableRow(
        modifier = Modifier.fillMaxWidth(),
        scrollState = scrollState
      ) {
        scrollState.scrollTo(categoryScrollPosition)
        var allCategory = getAllFoodCategories()
        for (category in allCategory) {
          var index = allCategory.indexOf(category)
          FoodCategoryChip(
            index = index,
            category = category.value,
            isSelected = selectedCategory == category,
            onCategorySelected = {
              onSelectedCategory(it)
              onChangeCategoryPosition(scrollState.value)
            },
            onExecuteSearch = newSearch
          )
        }
      }
    }
  }
}