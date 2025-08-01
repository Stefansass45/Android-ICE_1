package vcmsa.projects.studentchef.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import vcmsa.projects.studentchef.model.MealResponse

interface ApiService {
    @GET("search.php")
    fun searchMeals(@Query("s") query: String): Call<MealResponse>

    @GET("lookup.php")
    fun getMealById(@Query("i") id: String): Call<MealResponse>
}
