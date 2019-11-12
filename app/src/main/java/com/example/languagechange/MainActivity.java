package com.example.languagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void changeE(View view) {

        LanguageHelper.setLanguage(this, "en");
        this.recreate();

    }

    public void changeB(View view) {

        LanguageHelper.setLanguage(this, "bn");
        this.recreate();
    }
}
