package com.example.hw_3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_3_4.databinding.FragmentCountryBinding;
import com.example.hw_3_4.databinding.ItemCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {

  private FragmentCountryBinding binding;
  private ArrayList<Country> countryArrayList;
  private CountryAdapter adapter;
  private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        adapter = new CountryAdapter(countryArrayList);
        binding.rvCountry.setAdapter(adapter);
    }

    public void checkPosition(int position){
        if (position == 0){
            loadNorthAmerica();
        }else if (position ==1){
            loadSouthAmerica();
        }else if (position ==2){
            loadEurasia();
        }else if (position == 3){
            loadAustralia();
        } else if (position == 4) {
            loadAfrica();

        }
    }

    private void loadAfrica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Flag_of_Algeria.svg/150px-Flag_of_Algeria.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Flag_of_Benin.svg/150px-Flag_of_Benin.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Flag_of_Burundi.svg/150px-Flag_of_Burundi.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Flag_of_Ghana.svg/150px-Flag_of_Ghana.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Zambia.svg/150px-Flag_of_Zambia.svg.png "));
    }

    private void loadAustralia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Flag_of_Australia_%281903%E2%80%931908%29.svg/150px-Flag_of_Australia_%281903%E2%80%931908%29.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Flag_of_Tasmania.svg/150px-Flag_of_Tasmania.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_Western_Australia.svg/150px-Flag_of_Western_Australia.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Flag_of_the_Northern_Territory.svg/150px-Flag_of_the_Northern_Territory.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Flag_of_Queensland.svg/150px-Flag_of_Queensland.svg.png"));
    }

    private void loadEurasia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/188px-Flag_of_Kyrgyzstan.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/203px-Flag_of_Kazakhstan.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_the_United_Kingdom_%283-5%29.svg/150px-Flag_of_the_United_Kingdom_%283-5%29.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Flag_of_Ireland.svg/150px-Flag_of_Ireland.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Flag_of_Italy.svg/150px-Flag_of_Italy.svg.png"));
    }

    private void loadSouthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/150px-Flag_of_Argentina.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/150px-Flag_of_Brazil.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/150px-Flag_of_Colombia.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/150px-Flag_of_Uruguay.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_of_Ecuador.svg/150px-Flag_of_Ecuador.svg.png"));
    }

    private void loadNorthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Canada.svg/150px-Flag_of_Canada.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/150px-Flag_of_Cuba.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Flag_of_the_United_States.svg/150px-Flag_of_the_United_States.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Flag_of_Jamaica.svg/150px-Flag_of_Jamaica.svg.png"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/150px-Flag_of_Mexico.svg.png"));
    }
}