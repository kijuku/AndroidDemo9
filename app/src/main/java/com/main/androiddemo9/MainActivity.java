package com.main.androiddemo9;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_firstName;
    private TextView tv_lastName;
    private TextView tv_email;
    private RadioGroup rg_LineOfStydy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Luodaan käyttäjäsäilö.
        UserStorage users = UserStorage.getInstance();
        tv_firstName = findViewById(R.id.viewFirstName);
        tv_lastName = findViewById(R.id.viewLastName);
        tv_email = findViewById(R.id.viewEmail);
        rg_LineOfStydy= findViewById(R.id.radioGroup);

    }

    public void addNewUserToStorage(View view){

    }
}