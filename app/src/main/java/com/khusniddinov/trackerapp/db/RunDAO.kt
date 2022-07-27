package com.khusniddinov.trackerapp.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("select * from running_table Order by timestamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("select * from running_table Order by timeInMillis DESC")
    fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("select * from running_table Order by caloriesBurned DESC")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("select * from running_table Order by avgSpeedInKMH DESC")
    fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("select * from running_table Order by distanceInMeters DESC")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    @Query("select SUM(timeInMillis) from running_table ")
    fun getTotalTimeInMills(): LiveData<Long>

    @Query("select SUM(caloriesBurned) from running_table ")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("select SUM(distanceInMeters) from running_table ")
    fun getTotalDistance(): LiveData<Int>

    @Query("select AVG(avgSpeedInKMH) from running_table ")
    fun getTotalAvgSpeed(): LiveData<Float>

}
