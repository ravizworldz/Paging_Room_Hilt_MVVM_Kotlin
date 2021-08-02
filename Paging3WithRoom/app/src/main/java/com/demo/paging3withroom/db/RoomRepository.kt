package com.demo.paging3withroom.db

import androidx.paging.PagingSource
import javax.inject.Inject

class RoomRepository @Inject constructor(private val appDao: AppDao) {

    fun getAllRecords(): PagingSource<Int, CharacterData> {
        return appDao.getAllRecords()
    }

    fun insertRecord(characterData: CharacterData) {
        appDao.insertRecord(characterData)
    }
}