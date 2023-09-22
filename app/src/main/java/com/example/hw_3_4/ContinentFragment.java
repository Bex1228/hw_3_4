package com.example.hw_3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_3_4.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnClick {
    private FragmentContinentBinding binding;
    private ArrayList<Continent>listContinent;
    private ContinentAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(listContinent,this);
        binding.rvContinents.setAdapter(adapter);
    }

    private void loadData() {
        Log.d("america", "loadData: ");
        listContinent = new ArrayList<>();
        listContinent.add(new Continent("Северная Америка"));
        listContinent.add(new Continent("Южная Америка"));
        listContinent.add(new Continent("Евразия"));
        listContinent.add(new Continent("Астралия"));
        listContinent.add(new Continent("Африка"));
    }



    @Override
    public void onClick(Integer position) {
        Log.d("clikc", "OnClick: ");
        Bundle bundle = new Bundle();
        bundle.putInt("key", position);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();
    }


}