package com.emon.recyclerviewdemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.emon.recyclerviewdemo.R;
import com.emon.recyclerviewdemo.model.Model;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyRecyclerViewHolder> {
    private Context context;
    private List<Model>models;
    View.OnLongClickListener onLongClickListener;

    public MyAdapter(Context context, List<Model> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemview,viewGroup,false);
        return new MyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int i) {

        holder.name.setText(models.get(i).getName());
        holder.email.setText(models.get(i).getEmail());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }



    public static class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView name,email;

        public MyRecyclerViewHolder(View itemView) {

            super(itemView);
            name=(TextView) itemView.findViewById(R.id.name);
            email=(TextView) itemView.findViewById(R.id.email);

        }
    }
}
