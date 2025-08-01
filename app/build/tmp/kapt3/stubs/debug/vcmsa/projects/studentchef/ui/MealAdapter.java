package vcmsa.projects.studentchef.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\tR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lvcmsa/projects/studentchef/ui/MealAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lvcmsa/projects/studentchef/ui/MealAdapter$MealViewHolder;", "onClick", "Lkotlin/Function1;", "Lvcmsa/projects/studentchef/model/Meal;", "", "(Lkotlin/jvm/functions/Function1;)V", "meals", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newList", "MealViewHolder", "app_debug"})
public final class MealAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<vcmsa.projects.studentchef.ui.MealAdapter.MealViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<vcmsa.projects.studentchef.model.Meal, kotlin.Unit> onClick = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<vcmsa.projects.studentchef.model.Meal> meals;
    
    public MealAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super vcmsa.projects.studentchef.model.Meal, kotlin.Unit> onClick) {
        super();
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<vcmsa.projects.studentchef.model.Meal> newList) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public vcmsa.projects.studentchef.ui.MealAdapter.MealViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    vcmsa.projects.studentchef.ui.MealAdapter.MealViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lvcmsa/projects/studentchef/ui/MealAdapter$MealViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lvcmsa/projects/studentchef/ui/MealAdapter;Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "bind", "", "meal", "Lvcmsa/projects/studentchef/model/Meal;", "app_debug"})
    public final class MealViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final error.NonExistentClass binding = null;
        
        public MealViewHolder(@org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        vcmsa.projects.studentchef.model.Meal meal) {
        }
    }
}