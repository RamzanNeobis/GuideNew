package ru.startandroid.develop.guide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Information> {
    public InfoAdapter(Context context, ArrayList<Information> information) {
        super(context, 0, information);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_park, parent, false);
        }
        Button rootView = listItemView.findViewById(R.id.bottomOne);
        TextView rootViewTwo = listItemView.findViewById(R.id.location);

        final Information currentInformation = getItem(position);


        TextView namePark = (TextView) listItemView.findViewById(R.id.parkName);
        namePark.setText(currentInformation.getParkName());

        TextView nameDistrict = (TextView) listItemView.findViewById(R.id.districtName);
        nameDistrict.setText(currentInformation.getDistrictName());

        ImageView imagePark = (ImageView) listItemView.findViewById(R.id.imagePark);
        Glide.with(imagePark).load(currentInformation.getImageResourceId()).into(imagePark);

        TextView info = (TextView) listItemView.findViewById(R.id.info);
        info.setText(currentInformation.getInformation());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentInformation.getShow());

        //Button button = listItemView.findViewById(R.id.bottomOne);
        //boolean isPressed = button.isPressed();
        final LinearLayout desc = listItemView.findViewById(R.id.lineOne);
        rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (desc.getVisibility() == View.VISIBLE) {
                    desc.setVisibility(View.GONE);
                } else {
                    desc.setVisibility(View.VISIBLE);
                }
            }
        });

        final TextView numberCall = listItemView.findViewById(R.id.phone);

        rootViewTwo.setText(currentInformation.getAddress());
        rootViewTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setData(Uri.parse("geo:0,0?q=" + currentInformation.getAddress()));
                getContext().startActivity(mapIntent);
            }
        });


        return listItemView;
}



}
