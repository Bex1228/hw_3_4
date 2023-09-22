package com.example.hw_3_4;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_4.databinding.ItemContinentsBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentHolder> {
    private ArrayList<Continent> listContinent;
    private ItemContinentsBinding binding;
    private OnClick onitemClick;

    public ContinentAdapter(ArrayList<Continent> listContinent, OnClick onitemClick) {
        this.listContinent = listContinent;
        this.onitemClick = onitemClick;
    }

    @NonNull
    @Override
    public ContinentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("create", "toje rabotaet adap ");
        return new ContinentHolder(ItemContinentsBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ContinentHolder holder, int position) {
        Log.d("onBind", "ADPATERRABOTAET: ");
        holder.bind(listContinent.get(position));
        holder.itemView.setOnClickListener(view -> onitemClick.onClick(position));

    }

    @Override
    public int getItemCount() {
        return listContinent.size();
    }
}
