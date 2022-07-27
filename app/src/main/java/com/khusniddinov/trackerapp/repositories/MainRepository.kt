package com.khusniddinov.trackerapp.repositories

import com.khusniddinov.trackerapp.db.Run
import com.khusniddinov.trackerapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(val runDAO: RunDAO) {
    suspend fun insert(run: Run) = runDAO.insertRun(run)
    suspend fun delete(run: Run) = runDAO.deleteRun(run)
    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()
    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()
    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()
    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()
    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()
    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()
    fun getTotalDistance() = runDAO.getTotalDistance()
    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()
    fun getTotalTimeInMills() = runDAO.getTotalTimeInMills()

}