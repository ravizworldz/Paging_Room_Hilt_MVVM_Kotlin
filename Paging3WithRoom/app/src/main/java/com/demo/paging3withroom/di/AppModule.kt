package com.demo.paging3withroom.di

import android.app.Application
import android.content.Context
import com.demo.paging3withroom.db.AppDao
import com.demo.paging3withroom.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun getAppDatabase(context: Application): AppDatabase {
        return AppDatabase.getAppDbInstance(context)
    }

    @Singleton
    @Provides
    fun appDao(appDatabase: AppDatabase): AppDao {
        return appDatabase.getAppDao()
    }
}