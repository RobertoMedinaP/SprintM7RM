package certificacion.td.sprintm7rm.Model.Local.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import certificacion.td.sprintm7rm.Model.Local.Entities.PlantByIdEntity
import certificacion.td.sprintm7rm.Model.Local.Entities.PlantEntity
import certificacion.td.sprintm7rm.Model.Local.PlantDao

@Database(entities = [PlantEntity::class, PlantByIdEntity::class], version = 1, exportSchema = false)
abstract class PlantDB: RoomDatabase() {

    abstract fun getPlantDao(): PlantDao

    companion object{

        @Volatile
        private var
                INSTANCE : PlantDB? = null
        fun getDataBase(context: Context) : PlantDB {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PlantDB::class.java, "plantDb")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}