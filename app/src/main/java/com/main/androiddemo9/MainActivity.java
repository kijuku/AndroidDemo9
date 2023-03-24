package com.main.androiddemo9;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_firstName;
    private TextView tv_lastName;
    private TextView tv_email;
    private RadioGroup rg_LineOfStydy;

    private Spinner spinner;

    private UserStorage users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Luodaan käyttäjäsäilö.
        users = UserStorage.getInstance();
        spinner = (Spinner) findViewById(R.id.imageSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.photoValues, R.layout.activity_main);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(R.layout.activity_main);
        tv_firstName = findViewById(R.id.viewFirstName);
        tv_lastName = findViewById(R.id.viewLastName);
        tv_email = findViewById(R.id.viewEmail);
        rg_LineOfStydy= findViewById(R.id.radioGroup);

    }

    public void addNewUserToStorage(View view){
        StringBuilder sb = new StringBuilder();
        String fName, lName, email;
        String lineOfStudy = "";
        int spinnerId;

        if (!tv_firstName.getText().toString().isEmpty() && !tv_lastName.getText().toString().isEmpty() && !tv_email.getText().toString().isEmpty()){
            fName = tv_firstName.getText().toString();
            lName = tv_lastName.getText().toString();
            email = tv_email.getText().toString();
            switch (rg_LineOfStydy.getCheckedRadioButtonId()){
                case R.id.radioButton1:
                    lineOfStudy += "Tietotekniikka";
                    break;
                case R.id.radioButton2:
                    lineOfStudy += "Tuotantotalous";
                    break;
                case R.id.radioButton3:
                    lineOfStudy += "Laskennallinen tekniikka";
                    break;
                case R.id.radioButton4:
                    lineOfStudy += "Sähkötekniikka";
                    break;
            }
            spinnerId = spinner.getId();
            User newUser = new User(fName, lName,email,lineOfStudy);
            newUser.setImageId(spinnerId);
            users.addUser(newUser);
            System.out.println(newUser);
            for (User u : users.getUsers()){
                System.out.println(u.toString());
            }

        }

    }
    public void switchMainActivity(View view){
        Intent intent = new Intent(this, MainActivity0.class );
        startActivity(intent);
    }
}