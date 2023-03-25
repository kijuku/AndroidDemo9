package com.main.androiddemo9;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity_spinner extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
        private Spinner spinner;
        private ImageView imageview;

        private String[] photos = { "photo1", "photo2", "photo3", "photo4", "photo5"};
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spinner);

        imageview = (ImageView) findViewById(R.id.imageViewPreview);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);


        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aarray = new ArrayAdapter(this, android.R.layout.simple_spinner_item, photos);
        aarray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(aarray);
        //imageview.setImageResource(MainActivity.);
    }
    private int selectImageId(String spinnerText){
        int ret = 0;
        switch (spinnerText){
            case "photo1":
                ret = R.drawable.photo1;
                break;
            case "photo2":
                ret = R.drawable.photo2;
                break;
            case "photo3":
                ret = R.drawable.photo3;
                break;
            case "photo4":
                ret = R.drawable.photo4;
                break;
            case "photo5":
                ret = R.drawable.photo5;
                break;
            default:
                break;
        }
        return ret;
    }
    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String spinnerText = spinner.getSelectedItem().toString();
        System.out.println("Päivitettävän kuvan nimi: " + spinnerText);
        imageview.setImageResource(selectImageId(spinnerText));
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub
    }
    public void switchMainActivity(View view){
        Intent intent = new Intent(this, MainActivity0.class );
        startActivity(intent);
    }
}