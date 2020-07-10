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

public class MonumentsFragment extends Fragment {


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

        info.add(new Information("Памятник Манас", "Октябрьский Район",R.drawable.manas,R.string.manas,"Показать на карте","Памятник Манас"));
        info.add(new Information("Памятник Ленин", "Ленинский район",R.drawable.lenin,R.string.lenin,"Показать на карте","Памятник Ленина"));
        info.add(new Information("Памятник Дружбы", "Ленинский район",R.drawable.drujba,R.string.drujba,"Показать на карте","Памятник дружбы"));
        info.add(new Information("Памятник Эл-куту", "Чуйский район",R.drawable.elkutu,R.string.elkutu,"Показать на карте","Чуй проспект 124"));



        InfoAdapter adapter = new InfoAdapter(this.requireContext(), info);

        ListView listView = (ListView) view.findViewById(R.id.list);

        listView.setAdapter(adapter);


    }


}