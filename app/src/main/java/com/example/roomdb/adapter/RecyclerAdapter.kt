import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdb.R
import com.example.roomdb.databinding.ItemRecyclerBinding
import com.example.roomdb.helper.setTextView
import com.example.roomdb.helper.visible
import com.example.roomdb.interfaces.ItemClicked
import com.example.roomdb.model.ToDoList
import com.example.roomdb.singleton.SingletonHelper
import javax.inject.Inject


class RecyclerAdapter(
    var list: List<ToDoList>,
    var context: Context,
    var clickedItem: ItemClicked
) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    @Inject
    lateinit var singletonHelper: SingletonHelper

    open class ViewHolder(val binding: ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        singletonHelper = SingletonHelper(context)
        holder.binding.tvTitleItem.text = list.get(position).taskTitle
        holder.binding.tvDescrption.text = list.get(position).taskDescription
        when (list.get(position).priority) {
            "High" -> holder.binding.clItem.background =
                getDrawable(context, R.drawable.custom_item_high_p_background)
            "Medium" -> holder.binding.clItem.background =
                getDrawable(context, R.drawable.custom_item_medium_p_background)
            else -> holder.binding.clItem.background =
                getDrawable(context, R.drawable.custom_item_low_p_background)
        }
        if (list[position].isAlarmSet == 1) {
            holder.binding.tvAlarmTime.visible()
            val hour = singletonHelper.changeHourFormat(list[position].taskHour)
            val minute = singletonHelper.changeMinuteFormat(list.get(position).taskMinute)
            val isAmOrPm = singletonHelper.isTimeAMOrPM(list[position].taskHour)
            holder.binding.tvAlarmTime.setTextView("$hour:$minute $isAmOrPm")

        }
        holder.binding.clItem.setOnClickListener {
            clickedItem.clicked(list.get(position))
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
