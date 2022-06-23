
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.roomdb.R;
import com.example.roomdb.databinding.ItemRecyclerBinding;
import com.example.roomdb.interfaces.ItemClicked;
import com.example.roomdb.model.ToDoList;
import com.example.roomdb.singleton.SingletonHelper;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006("}, d2 = {"LRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LRecyclerAdapter$ViewHolder;", "list", "", "Lcom/example/roomdb/model/ToDoList;", "context", "Landroid/content/Context;", "clickedItem", "Lcom/example/roomdb/interfaces/ItemClicked;", "(Ljava/util/List;Landroid/content/Context;Lcom/example/roomdb/interfaces/ItemClicked;)V", "getClickedItem", "()Lcom/example/roomdb/interfaces/ItemClicked;", "setClickedItem", "(Lcom/example/roomdb/interfaces/ItemClicked;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "singletonHelper", "Lcom/example/roomdb/singleton/SingletonHelper;", "getSingletonHelper", "()Lcom/example/roomdb/singleton/SingletonHelper;", "setSingletonHelper", "(Lcom/example/roomdb/singleton/SingletonHelper;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.roomdb.model.ToDoList> list;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private com.example.roomdb.interfaces.ItemClicked clickedItem;
    @javax.inject.Inject()
    public com.example.roomdb.singleton.SingletonHelper singletonHelper;
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.roomdb.model.ToDoList> list, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.roomdb.interfaces.ItemClicked clickedItem) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.roomdb.model.ToDoList> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.roomdb.model.ToDoList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.interfaces.ItemClicked getClickedItem() {
        return null;
    }
    
    public final void setClickedItem(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.interfaces.ItemClicked p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.singleton.SingletonHelper getSingletonHelper() {
        return null;
    }
    
    public final void setSingletonHelper(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.singleton.SingletonHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    RecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"LRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/roomdb/databinding/ItemRecyclerBinding;", "(Lcom/example/roomdb/databinding/ItemRecyclerBinding;)V", "getBinding", "()Lcom/example/roomdb/databinding/ItemRecyclerBinding;", "app_debug"})
    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.roomdb.databinding.ItemRecyclerBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.roomdb.databinding.ItemRecyclerBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.roomdb.databinding.ItemRecyclerBinding getBinding() {
            return null;
        }
    }
}