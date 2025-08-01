package vcmsa.projects.studentchef.ui

import android.content.Intent
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import vcmsa.projects.studentchef.api.RetrofitClient
import vcmsa.projects.studentchef.databinding.ActivityMainBinding
import vcmsa.projects.studentchef.model.Meal

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MealAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MealAdapter { meal ->
            val intent = Intent(this, MealDetailActivity::class.java)
            intent.putExtra("MEAL_ID", meal.idMeal)
            startActivity(intent)
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let { searchMeals(it) }
                return true
            }

            override fun onQueryTextChange(newText: String?) = false
        })
    }

    private fun searchMeals(query: String) {
        RetrofitClient.instance.searchMeals(query).enqueue(object : retrofit2.Callback<vcmsa.projects.studentchef.model.MealResponse> {
            override fun onResponse(call: retrofit2.Call<vcmsa.projects.studentchef.model.MealResponse>, response: retrofit2.Response<vcmsa.projects.studentchef.model.MealResponse>) {
                val meals = response.body()?.meals
                if (meals != null) adapter.submitList(meals)
                else Toast.makeText(this@MainActivity, "No meals found", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: retrofit2.Call<vcmsa.projects.studentchef.model.MealResponse>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
