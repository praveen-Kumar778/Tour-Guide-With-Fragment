package com.example.tourguidewithnavigation.adaptor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tourguidewithnavigation.R;
import com.example.tourguidewithnavigation.model.TourModel;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<TourModel> {

    public TourAdapter(Activity activity, ArrayList<TourModel> model) {
        super(activity,0,model);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitem = convertView ;
        // check if existing view is being reused , otherwise inflate the views
        if(listitem == null){
            listitem = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view,parent,false);
        }
        // get the object located at this position on the list
        TourModel tourModel = getItem(position);
        ImageView imageView = listitem.findViewById(R.id.image);
        imageView.setImageResource(tourModel.getImageId());

        TextView textTitle = listitem.findViewById(R.id.imageText);
        textTitle.setText(tourModel.getTitle());

        TextView bodyText = listitem.findViewById(R.id.body);
        bodyText.setText(tourModel.getBody());

        return listitem ;
    }
}
