package vcmsa.projects.studentchef.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lvcmsa/projects/studentchef/api/ApiService;", "", "getMealById", "Lretrofit2/Call;", "Lvcmsa/projects/studentchef/model/MealResponse;", "id", "", "searchMeals", "query", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "search.php")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<vcmsa.projects.studentchef.model.MealResponse> searchMeals(@retrofit2.http.Query(value = "s")
    @org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @retrofit2.http.GET(value = "lookup.php")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<vcmsa.projects.studentchef.model.MealResponse> getMealById(@retrofit2.http.Query(value = "i")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id);
}