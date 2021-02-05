package com.example.countryinformationproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String [] country_resource;
    private int [] flags = {R.drawable.afgan_flag,R.drawable.bangladesh_flag,
    R.drawable.bhuta_flag,R.drawable.chinaflag_here,R.drawable.germany_flag,
    R.drawable.india_flag,R.drawable.meyanmar_flag,R.drawable.nepal_flag,
    R.drawable.pakflag_flag,R.drawable.russia_flag};
    private SearchView searchView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listViewId);
        searchView = (SearchView)findViewById(R.id.searchViewId);
        country_resource = getResources().getStringArray(R.array.country_list);

        CustomAdapter customAdapter = new CustomAdapter(this,country_resource,flags);
        listView.setAdapter(customAdapter);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent ;
                intent = new Intent(MainActivity.this,Profile.class);
                intent.putExtra("Key",country_resource[position]);
                startActivity(intent);
                Toast.makeText(MainActivity.this,country_resource[position],Toast.LENGTH_SHORT).show();

            }
        });



    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.icon_country);
        builder.setTitle("Alert Dialog !");
        builder.setMessage("Are You Sure to Exit ?");

      
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }





}