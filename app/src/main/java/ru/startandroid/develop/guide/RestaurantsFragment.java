package ru.startandroid.develop.guide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {


    ArrayList<Information> info = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_park, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        info.clear();

        info.add(new Information("Ресторан Арзу", "Аламедин Район",R.drawable.arzu,"0777445565",R.string.arzu, "Показать на карте","Проспект победы 311"));
        info.add(new Information("Ресторан Фрунзе", "Чуйский район",R.drawable.frunze,"0777445565",R.string.frunze,"","Абдумомунова 205"));
        info.add(new Information("Ресторан Нават", "Ленинский район",R.drawable.navat,"0777445565",R.string.navat,"БИШКЕК","Тоголов молдо 114/1"));
        info.add(new Information("Ресторан Барашек", "Октябрьский район",R.drawable.barashek,"0777445565",R.string.barashek,"БИШКЕК","Аалы Токомбаева 78Б"));



        InfoAdapterTwo adapter = new InfoAdapterTwo(this.requireContext(), info);

        ListView listView = (ListView) view.findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}