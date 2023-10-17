package com.example.level6_task_2.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.level6_task_2.data.ShoppingListItem

@Dao
interface ShoppingListDao {

    @Query("SELECT * FROM shoppingListTable")
    fun getAllShoppingListItems(): LiveData<List<ShoppingListItem>>

    @Insert
    fun insertShoppingListItem(shoppingListItem: ShoppingListItem)

    @Delete
    fun deleteShoppingListItem(shoppingListItem: ShoppingListItem)

    @Query("DELETE FROM shoppingListTable")
    fun deleteAllShoppingListItems()

    @Update
    fun updateShoppingListItem(shoppingListItem: ShoppingListItem)

}