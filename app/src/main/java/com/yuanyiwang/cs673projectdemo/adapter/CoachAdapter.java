package com.yuanyiwang.cs673projectdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yuanyiwang.cs673projectdemo.R;
import com.yuanyiwang.cs673projectdemo.items.CoachItems;

import java.util.ArrayList;

public class CoachAdapter extends RecyclerView.Adapter<CoachAdapter.ViewHolder> {
    private final Context context;
    private final ArrayList<CoachItems> coachItems;

    public CoachAdapter(Context context, ArrayList<CoachItems> coachItems) {
        this.context = context;
        this.coachItems = coachItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.coach_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(coachItems.get(position).getName());
        holder.title.setText(coachItems.get(position).getTitle());
        holder.desc.setText(coachItems.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return coachItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, title, desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameIn);
            title = itemView.findViewById(R.id.titleIn);
            desc = itemView.findViewById(R.id.descIn);
        }
    }

}
