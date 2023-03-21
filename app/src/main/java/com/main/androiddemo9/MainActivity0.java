package com.main.androiddemo9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
    }

    public void switchAddUserActivity(View view){
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
    }
    public void switchListUserActivity(View view){
        Intent intent = new Intent(this, MainActivityListUsers.class );
        startActivity(intent);
    }

    public void switchImageAddActivity(View view){
        Intent intent = new Intent(this, MainActivityListUsers.class );
        startActivity(intent);
    }

    public void switchDeleteUserActivity(View view){
        Intent intent = new Intent(this, MainActivityListUsers.class );
        startActivity(intent);
    }
}