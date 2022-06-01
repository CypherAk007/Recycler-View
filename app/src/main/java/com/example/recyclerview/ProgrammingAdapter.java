package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//2 New javaclass for adapter extends adapter view class
public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    private String [] data;

    //4 - make a constructor
    public ProgrammingAdapter(String [] data){
//        this passes the data that has to be showed in the recycler view.
        this.data = data;

    }

    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //5
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());//returns all the view objects of the views in the layout.

        //6-creating view
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);

        // 7-creating view holder
        return new ProgrammingViewHolder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
       //9
        String title = data[position];
        holder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    //3 - new class viewholder which retains view
    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        // 8
        ImageView imgIcon;
        TextView txtTitle;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
        }
//        After this layoutmanager in mainactivity

    }
}
