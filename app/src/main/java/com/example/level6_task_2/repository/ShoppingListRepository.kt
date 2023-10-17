package com.example.level6_task_2.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.level6_task_2.data.ShoppingListItem
import com.example.level6_task_2.db.ShoppingListDao
import com.example.level6_task_2.db.ShoppingListDatabase

class ShoppingListRepository(context: Context) {

    private var shoppingListDao: ShoppingListDao

    init {
        val shoppingListDatabase = ShoppingListDatabase.getDatabase(context)
        shoppingListDao = shoppingListDatabase.shoppingListDao()
    }

    fun getAllShoppingListItems(): LiveData<List<ShoppingListItem>> {
        return shoppingListDao.getAllShoppingListItems()
    }

    fun insertShoppingListItem(shoppingListItem: ShoppingListItem) {
        shoppingListDao.insertShoppingListItem(shoppingListItem)
    }

    fun deleteShoppingListItem(shoppingListItem: ShoppingListItem) {
        shoppingListDao.deleteShoppingListItem(shoppingListItem)
    }

    fun deleteAllShoppingListItems() {
        shoppingListDao.deleteAllShoppingListItems()
    }

    fun updateShoppingListItem(shoppingListItem: ShoppingListItem) {
        shoppingListDao.updateShoppingListItem(shoppingListItem)
    }

}