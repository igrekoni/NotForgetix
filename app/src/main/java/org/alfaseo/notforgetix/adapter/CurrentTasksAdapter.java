package org.alfaseo.notforgetix.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.alfaseo.notforgetix.R;
import org.alfaseo.notforgetix.Utils;
import org.alfaseo.notforgetix.fragment.CurrentTaskFragment;
import org.alfaseo.notforgetix.model.Item;
import org.alfaseo.notforgetix.model.ModelTask;

/**
 * Created by Gre on 18.03.2016.
 */
public class CurrentTasksAdapter extends TaskAdapter {

    private static final int TYPE_TASK = 0;
    private static final int TYPE_SEPARATOR = 1;

    public CurrentTasksAdapter(CurrentTaskFragment taskFragment) {
        super(taskFragment);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        switch (viewType){
            case TYPE_TASK:
                View v = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.model_task, viewGroup, false);
                TextView title = (TextView) v.findViewById(R.id.tvTaskTitle);
                TextView date = (TextView) v.findViewById(R.id.tvTaskDate);

                return new TaskViewHolder(v, title, date);

            //case TYPE_SEPARATOR:
              //  break;

            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        Item item = items.get(position);

        if (item.isTask()) {
            viewHolder.itemView.setEnabled(true);
            ModelTask task = (ModelTask) item;
            TaskViewHolder taskViewHolder = (TaskViewHolder) viewHolder;

            taskViewHolder.title.setText(task.getTitle());
            if (task.getDate() != 0) {
                taskViewHolder.date.setText(Utils.getFullDate(task.getDate()));
            }
        }

    }

    public int getItemViewType(int position){
        if (getItem(position).isTask()){
            return TYPE_TASK;
        } else {
            return TYPE_SEPARATOR;
        }
    }


}
