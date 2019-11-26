package com.example.recyclerviewstudentversion;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// Todo Implement methods required
//onCreateViewHolder()
//onBindViewHolder
//getItemCount
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>
{
private
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_player_view, parent, false);

        //Im gonna send my view group to my view holder
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
    holder.
    }

    @Override
    public int getItemCount()
    {
        return 0;
    }

    // Todo implement ViewHolder
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        // get references to each of the views in the single_item.xml
        // Todo implement constructor
        private MyViewHolder(@NonNull View itemView)
        {

        }
    }

    // Todo Create the MyRecyclerAdapter class initializer and put the list into a variable.
    public MyRecyclerAdapter(List list)
    {

    }

}
