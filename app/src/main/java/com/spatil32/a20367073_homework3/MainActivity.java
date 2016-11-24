package com.spatil32.a20367073_homework3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] listItemNames = new String[]
            {
                    "Chicago, IL", "New Delhi, DL", "Mumbai, MH", "Paris, FR", "Las Vegas, NV",
                    "Bangalore, KN", "Portland, OR", "New York, NY", "San Francisco, CA"
            };

    Integer[] listImageNames =
            {
                    R.drawable.chicago, R.drawable.delhi, R.drawable.mumbai, R.drawable.paris, R.drawable.vegas,
                    R.drawable.bangalore, R.drawable.portland, R.drawable.newyork, R.drawable.sfo
            };

    String[] listCityDesc = new String[]
            {
              "Chicago, on Lake Michigan in Illinois is famed for bold architecture and skyline.",
              "Capital of India, Delhi had served as the political and financial centre of several empires of ancient India.",
              "Mumbai is a densely populated city on India’s west coast. A financial center, it's India's largest city.",
              "Paris, France's capital, is a major European city and a global center for art, fashion, gastronomy and culture.",
              "Las Vegas, in Nevada’s Mojave Desert, is a resort city famed for its vibrant nightlife and casinos.",
              "Capital of Karnataka(IN) State, Bangalore is center of India's high-tech industry. Also known for its parks and nightlife.",
              "Portland known for its parks, bridges and bicycle paths, as well as for eco-friendliness and coffeehouses.",
              "NY is a densely populated borough that’s among the world’s major commercial, financial and cultural centers.",
              "SFO is a hilly city on the tip of a peninsula surrounded by the Pacific Ocean and San Francisco Bay."
            };

    ListView listView;
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.citiesList);
        listAdapter = new CustomListAdapter(MainActivity.this, listItemNames, listImageNames, listCityDesc);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getApplicationContext(), "Selected city " + listItemNames[position], Toast.LENGTH_SHORT).show();
        }
        });
    }
}
