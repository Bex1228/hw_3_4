package com.example.hw_3_4;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_4.databinding.ItemContinentsBinding;

public class ContinentHolder extends RecyclerView.ViewHolder {
    private ItemContinentsBinding binding;

    public ContinentHolder(ItemContinentsBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
        if (binding.tvContinent == null) {
            Log.e("ContinentHolder", "TextView tvContinent is null");
        }
    }


    public void bind(Continent continent ) {
        binding.tvContinent.setText(continent.getName());
        if (binding != null && binding.tvContinent != null) {
            binding.tvContinent.setText(continent.getName());
        } else {
            Log.e("ContinentHolder", "Binding or TextView is null");
        }
    }
}
