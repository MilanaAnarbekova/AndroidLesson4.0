package com.example.androidlesson40;
//обработка и передача данных
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<String> names = new ArrayList<>();//данные

    public Adapter(ArrayList<String> names) {
        this.names = names;//заполняем адаптер данными
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_name, parent, false));//создание ViewHolder
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(names.get(position));//отправляем во ViewHolder данные
    }


    @Override
    public int getItemCount() {
        return names.size();
    }
}
