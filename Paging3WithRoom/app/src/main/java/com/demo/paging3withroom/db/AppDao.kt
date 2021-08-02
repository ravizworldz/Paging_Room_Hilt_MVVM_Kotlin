package com.demo.paging3withroom.db

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AppDao {

    @Query("SELECT * FROM character ORDER BY id DESC")
    fun getAllRecords(): PagingSource<Int, CharacterData>


    @Insert
    fun insertRecord(characterData: CharacterData)
}