package com.btechbuddy.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterNames extends RecyclerView.Adapter<AdapterNames.NameVH>  {

    ArrayList<String> data;

    Context context;

    public AdapterNames (ArrayList<String> data) {
        this.data = data;
    }



    @NonNull
    @Override //to create a item in list view
    public NameVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        NameVH viewholder = new NameVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_view,parent,false));
        return viewholder;
    }


    @Override //set properties to viewholder, basically sets value
    public void onBindViewHolder(@NonNull NameVH holder, final int position) {
        holder.txtName.setText(data.get(position));


    }

    @Override //defines how many items in the lists
    public int getItemCount() {
        return data.size();
    }

    //Viewholder to represnt an item in the list
    class NameVH extends RecyclerView.ViewHolder {
        TextView txtName;
        public NameVH(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.textName);
        }
    }
}
