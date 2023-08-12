package certificacion.td.sprintm7rm.Model.Local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import certificacion.td.sprintm7rm.Model.Local.Entities.PlantByIdEntity
import certificacion.td.sprintm7rm.Model.Local.Entities.PlantEntity

@Dao
interface PlantDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllPlants(plantList: List<PlantEntity>)

    @Query("SELECT * FROM PLANT_TABLE ORDER BY id ASC")
    fun getAllPlants(): LiveData<List<PlantEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPlantByID(phone: PlantByIdEntity)

    @Query("SELECT * FROM PLANT_ID_TABLE WHERE id=:id")
    fun getPlantById(id: String): LiveData<PlantByIdEntity>


}