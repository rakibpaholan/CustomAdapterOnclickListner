package com.example.countryinformationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    private ImageView informationImage;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        informationImage = (ImageView)findViewById(R.id.informationImage);
        textView = (TextView)findViewById(R.id.informationId);

        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();

        if(bundle != null){
            String country_name = bundle.getString("Key");
            showDetails(country_name);
        }
    }
    public void showDetails(String country_name){
        if (country_name.equals("Afghanistan")){
            informationImage.setImageResource(R.drawable.afgan);
            textView.setText(R.string.afghanistan);
        }
        if (country_name.equals("Bangladesh")){
            informationImage.setImageResource(R.drawable.bangladesh);
            textView.setText(R.string.afghanistan);
        }if (country_name.equals("Bhutan")){
            informationImage.setImageResource(R.drawable.bhutan_image);
            textView.setText(R.string.afghanistan);
        }if (country_name.equals("China")){
            informationImage.setImageResource(R.drawable.china);
            textView.setText(R.string.afghanistan);
        }if (country_name.equals("Germany")){
            informationImage.setImageResource(R.drawable.german);
            textView.setText(R.string.afghanistan);
        }if (country_name.equals("India")){
            informationImage.setImageResource(R.drawable.india);
            textView.setText(R.string.afghanistan);
        }if (country_name.equals("Myanmar")){
            informationImage.setImageResource(R.drawable.myanmar);
            textView.setText(R.string.afghanistan);
        }if (country_name.equals("Nepal")){
            informationImage.setImageResource(R.drawable.nepal);
            textView.setText(R.string.afghanistan);
        }if (country_name.equals("Pakistan")){
            informationImage.setImageResource(R.drawable.pakisthan);
            textView.setText(R.string.afghanistan);
        }if (country_name.equals("Russia")){
            informationImage.setImageResource(R.drawable.russia);
            textView.setText(R.string.afghanistan);
        }
    }
}