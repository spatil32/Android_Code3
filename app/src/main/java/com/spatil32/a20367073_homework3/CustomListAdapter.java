package com.spatil32.a20367073_homework3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shreyas on 10/2/2016.
 */
public class CustomListAdapter extends ArrayAdapter<String>
{
    //private data members
    private final Activity Context;
    private final String[] CityName;
    private final Integer[] ImageName;
    private final String[] CityDescription;

    //parameterized constructor
    public CustomListAdapter(Activity context, String[] cityName, Integer[] imageName, String[] cityDescription )
    {
        super(context, R.layout.city_list, cityName);
        this.Context = context;
        this.CityName = cityName;
        this.ImageName = imageName;
        this.CityDescription = cityDescription;
    }

    //Get view with LayoutInflator, set the contents and return
    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = Context.getLayoutInflater();
        View listViewSingle = inflater.inflate(R.layout.city_list, null, true);
        ImageView listViewImage = (ImageView) listViewSingle.findViewById(R.id.cityImage);
        TextView listViewCityName = (TextView)listViewSingle.findViewById(R.id.cityName);
        TextView listViewCityDesc = (TextView)listViewSingle.findViewById(R.id.cityDesc);

        listViewImage.setImageResource(ImageName[position]);
        listViewCityName.setText(CityName[position]);
        listViewCityDesc.setText(CityDescription[position]);

        return listViewSingle;
    }
}
