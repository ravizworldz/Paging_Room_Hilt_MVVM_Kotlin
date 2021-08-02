package com.demo.paging3withroom.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "character")
class CharacterData (
    @PrimaryKey(autoGenerate = true)@ColumnInfo(name = "id")val id: Int = 0,
    @ColumnInfo(name = "name")val name: String
        )
