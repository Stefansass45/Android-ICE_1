package vcmsa.projects.studentchef.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import vcmsa.projects.studentchef.databinding.ItemMealBinding
import vcmsa.projects.studentchef.model.Meal

class MealAdapter(private val onClick: (Meal) -> Unit) : RecyclerView.Adapter<MealAdapter.MealViewHolder>() {

    private var meals = listOf<Meal>()

    fun submitList(newList: List<Meal>) {
        meals = newList
        notifyDataSetChanged()
    }

    inner class MealViewHolder(private val binding: ItemMealBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(meal: Meal) {
            binding.mealTitle.text = meal.strMeal
            Glide.with(binding.mealImage.context).load(meal.strMealThumb).into(binding.mealImage)
            binding.root.setOnClickListener { onClick(meal) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        val binding = ItemMealBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MealViewHolder(binding)
    }

    override fun getItemCount() = meals.size
    override fun onBindViewHolder(holder: MealViewHolder, position: Int) = holder.bind(meals[position])
}
