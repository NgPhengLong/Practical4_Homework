package com.example.practical4_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkChocoSyrup;
    private CheckBox chkSprinkles;
    private CheckBox chkCrushedNuts;
    private CheckBox chkCherries;
    private CheckBox chkOrioCookieCrumbles;
    private String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkChocoSyrup = (CheckBox) findViewById(R.id.chocolate_syrup);
        chkSprinkles = (CheckBox) findViewById(R.id.sprinkles);
        chkCrushedNuts = (CheckBox) findViewById(R.id.crushed_nuts);
        chkCherries = (CheckBox) findViewById(R.id.cherries);
        chkOrioCookieCrumbles = (CheckBox) findViewById(R.id.orio_cookie_crumbles);
    }

    public void onCheckBoxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){
            case R.id.chocolate_syrup:
                if (checked)
                    message += " Chocolate Syrup ";
                break;
            case R.id.sprinkles:
                if (checked)
                    message += " Sprinkles ";
                break;
            case R.id.crushed_nuts:
                if (checked)
                    message += " Crushed Nuts ";
                break;
            case R.id.cherries:
                if (checked)
                    message += " Cherries ";
                break;
            case R.id.orio_cookie_crumbles:
                if (checked)
                    message += " Orio Cookie Crumbles ";
                break;
        }
    }

    public void onButtonClicked(View view){

        displayToast(message);

    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}