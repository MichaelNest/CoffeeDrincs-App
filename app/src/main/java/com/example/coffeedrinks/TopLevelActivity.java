package com.example.coffeedrinks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_top);

       AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               switch (position) {
                   case 0 :
                   Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                   startActivity(intent);
                   break;
               }
           }
       };

       ListView listView = (ListView)findViewById(R.id.list_options);
       listView.setOnItemClickListener(itemClickListener);
    }
}


