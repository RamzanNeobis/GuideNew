package ru.startandroid.develop.guide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class ParksFragment  extends Fragment {


    ArrayList<Information> info = new ArrayList<>();

    public TextView textView;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_park, container, false);



    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        info.add(new Information("Панфилова", "Октябрьский Район",R.drawable.panfilova,R.string.panfilova,"Показать на карте","Парк им. И Панфилова"));
        info.add(new Information("Ататюрк", "Ленинский район",R.drawable.ataturk,R.string.atatyrk,"Показать на карте","Парк ататюрк"));
        info.add(new Information("Фламинго", "Ленинский район",R.drawable.flamingo,R.string.flamingo,"Показать на карте","парк Фламинго"));
        info.add(new Information("Дубовый", "Чуйский район",R.drawable.dubovii,R.string.dubovii,"Показать на карте","Парк им. Чингиза Айтматова"));



        InfoAdapter adapter = new InfoAdapter(this.getContext(), info);

        ListView listView = (ListView) view.findViewById(R.id.list);

               listView.setAdapter(adapter);

    }


}