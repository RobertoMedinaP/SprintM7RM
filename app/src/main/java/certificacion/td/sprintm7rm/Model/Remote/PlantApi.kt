package certificacion.td.sprintm7rm.Model.Remote

import certificacion.td.sprintm7rm.Model.Remote.FromInternet.Plant
import certificacion.td.sprintm7rm.Model.Remote.FromInternet.PlantByID
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PlantApi {

    @GET("plantas")
    suspend fun fetchPlantList(): Response<List<Plant>>

    @GET("plantas/{id}")
    suspend fun fetchPlantByID(@Path("id")id: String): Response<PlantByID>
}