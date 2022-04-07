package com.example.tp62_correctionrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tp62_correctionrecyclerview.Model.Person;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Person> personList;

    public MyAdapter(List<Person> personList) {
        this.personList = personList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewNameRow, textViewFirstnameRow;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNameRow = itemView.findViewById(R.id.text_list_name);
            textViewFirstnameRow = itemView.findViewById(R.id.text_list_firstname);
        }

        public TextView getTextViewNameRow() {
            return textViewNameRow;
        }

        public TextView getTextViewFirstnameRow() {
            return textViewFirstnameRow;
        }
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.getTextViewNameRow().setText(personList.get(position).getName());
        holder.getTextViewFirstnameRow().setText(personList.get(position).getFirstname());
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
