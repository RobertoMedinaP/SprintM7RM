package certificacion.td.sprintm7rm.Model

import certificacion.td.sprintm7rm.Model.Local.Entities.PlantByIdEntity
import certificacion.td.sprintm7rm.Model.Local.Entities.PlantEntity
import certificacion.td.sprintm7rm.Model.Remote.FromInternet.Plant
import certificacion.td.sprintm7rm.Model.Remote.FromInternet.PlantByID

fun fromInternetPLantEntity(phoneList: List<Plant>): List<PlantEntity>{

    return phoneList.map {
        PlantEntity(
            id=it.id,
            nombre = it.nombre,
            tipo = it.tipo,
            imagen = it.imagen,
            descripcion = it.descripcion

        )
    }
}

fun fromInternetPlantByIdEntity(plantById: PlantByID): PlantByIdEntity{

    return PlantByIdEntity(
        id = plantById.id,
        nombre= plantById.nombre,
        tipo= plantById.tipo,
        imagen=plantById.imagen,
        descripcion = plantById.descripcion,
    )
}
