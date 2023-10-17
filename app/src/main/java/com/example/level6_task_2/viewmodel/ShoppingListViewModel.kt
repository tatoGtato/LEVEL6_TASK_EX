package com.example.level6_task_2.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.level6_task_2.data.ShoppingListItem
import com.example.level6_task_2.repository.ShoppingListRepository

class ShoppingListViewModel (application: Application) : AndroidViewModel(application) {

    private val shoppingListRepository = ShoppingListRepository(application.applicationContext)

    val shoppingListItems: LiveData<List<ShoppingListItem>> = shoppingListRepository.getAllShoppingListItems()

    fun insertShoppingListItem(shoppingListItem: ShoppingListItem) {
        shoppingListRepository.insertShoppingListItem(shoppingListItem)
    }

    fun deleteShoppingListItem(shoppingListItem: ShoppingListItem) {
        shoppingListRepository.deleteShoppingListItem(shoppingListItem)
    }

    fun deleteAllShoppingListItems() {
        shoppingListRepository.deleteAllShoppingListItems()
    }

    fun updateShoppingListItem(shoppingListItem: ShoppingListItem) {
        shoppingListRepository.updateShoppingListItem(shoppingListItem)
    }

}