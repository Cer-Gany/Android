package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrContact;

    public RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContact) {
        this.context = context;
        this.arrContact = arrContact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgContact.setImageResource(arrContact.get(position).img);
        holder.txtName.setText(arrContact.get(position).name);
        holder.txtNumber.setText(arrContact.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgContact;
        TextView txtNumber, txtName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgContact = itemView.findViewById(R.id.imgContact);
            txtNumber = itemView.findViewById(R.id.txtNumber);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
