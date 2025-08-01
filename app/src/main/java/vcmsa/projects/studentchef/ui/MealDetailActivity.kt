package vcmsa.projects.studentchef.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import vcmsa.projects.studentchef.R
import vcmsa.projects.studentchef.api.RetrofitClient
import vcmsa.projects.studentchef.databinding.ActivityMealDetailBinding
import vcmsa.projects.studentchef.model.MealResponse

class MealDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMealDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMealDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 🌟 Setup Toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            finish() // 🔙 Go back to previous screen
        }

        // 🍽️ Get meal ID from intent
        val mealId = intent.getStringExtra("MEAL_ID")

        if (mealId.isNullOrEmpty()) {
            Toast.makeText(this, "🚫 No meal ID passed!", Toast.LENGTH_LONG).show()
            Log.e("MealDetailActivity", "❌ No meal ID found in intent")
            finish()
            return
        }

        Log.d("MealDetailActivity", "📡 Fetching meal details for ID: $mealId")

        // 📦 Fetch meal details
        RetrofitClient.instance.getMealById(mealId).enqueue(object : Callback<MealResponse> {
            override fun onResponse(call: Call<MealResponse>, response: Response<MealResponse>) {
                if (!response.isSuccessful) {
                    Toast.makeText(this@MealDetailActivity, "❌ Failed to load meal (Code ${response.code()})", Toast.LENGTH_LONG).show()
                    Log.e("MealDetailActivity", "❗ Unsuccessful response: ${response.code()}")
                    return
                }

                val meal = response.body()?.meals?.firstOrNull()
                if (meal == null) {
                    Toast.makeText(this@MealDetailActivity, "⚠️ Meal not found!", Toast.LENGTH_LONG).show()
                    Log.e("MealDetailActivity", "⚠️ No meal data returned")
                    return
                }

                // 🎉 Display meal details
                binding.title.text = meal.strMeal
                binding.instructions.text = meal.strInstructions

                Glide.with(this@MealDetailActivity)
                    .load(meal.strMealThumb)
                    .into(binding.imageView)
            }

            override fun onFailure(call: Call<MealResponse>, t: Throwable) {
                Toast.makeText(this@MealDetailActivity, "💥 Network error: ${t.message}", Toast.LENGTH_LONG).show()
                Log.e("MealDetailActivity", "💥 API failure: ${t.message}")
            }
        })
    }
}
