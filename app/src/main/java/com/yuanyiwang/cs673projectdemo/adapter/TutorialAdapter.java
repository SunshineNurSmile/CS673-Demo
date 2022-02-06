package com.yuanyiwang.cs673projectdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yuanyiwang.cs673projectdemo.R;
import com.yuanyiwang.cs673projectdemo.items.Items;

import java.util.ArrayList;

public class TutorialAdapter extends RecyclerView.Adapter<TutorialAdapter.ViewHolder> {
    private final Context context;
    private final ArrayList<Items> tutorialItems;

    public TutorialAdapter(Context context, ArrayList<Items> tutorialItems) {
        this.context = context;
        this.tutorialItems = tutorialItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(tutorialItems.get(position).getUserName());
        holder.title.setText(tutorialItems.get(position).getTitle());
        holder.desc.setText(tutorialItems.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return tutorialItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, title, desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
        }
    }

}
