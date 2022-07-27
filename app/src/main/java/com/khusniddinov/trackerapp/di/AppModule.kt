package com.khusniddinov.trackerapp.di

import android.content.Context
import androidx.room.Room
import com.khusniddinov.trackerapp.db.RunningDatabase
import com.khusniddinov.trackerapp.utils.Constans.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideRunningDatabase(@ApplicationContext appContext: Context) =
        Room.databaseBuilder(appContext, RunningDatabase::class.java, DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}