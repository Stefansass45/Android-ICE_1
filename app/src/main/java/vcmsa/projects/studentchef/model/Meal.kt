package vcmsa.projects.studentchef.model

data class MealResponse(val meals: List<Meal>?)
data class Meal(
    val idMeal: String,
    val strMeal: String,
    val strCategory: String?,
    val strMealThumb: String,
    val strInstructions: String,
    val strIngredient1: String?,
    val strIngredient2: String?,
    val strIngredient3: String?
    // Add more ingredients as needed...
)
