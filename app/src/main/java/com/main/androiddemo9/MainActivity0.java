package com.main.androiddemo9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity0 extends AppCompatActivity {
    private UserStorage users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        // Luodaan käyttäjäsäilö.
        users = UserStorage.getInstance();

        System.out.println("UserStoragen sisältö:");
        System.out.println("=====================");

        for (User u : users.getUsers()) {
            System.out.println(u);
        }
        System.out.println("");

    }
    public void generateUsers(){
        for (int i = 0; i < 5; i++) {
            String sbname = new String("Kimmo" + i);
            String sbemail = new String("Kimmo" + i + ".Kulmala@gmail.com");

            User user = new User(sbname, "Kulmala", sbemail, "Tietotekniikka");
            users.addUser(user);
        }

        for (User u : users.getUsers()) {
            System.out.println(u);
        }
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
        Intent intent = new Intent(this, MainActivity_spinner.class );
        startActivity(intent);
    }

    public void switchDeleteUserActivity(View view){
        Intent intent = new Intent(this, MainActivity_spinner.class );
        startActivity(intent);
    }
}