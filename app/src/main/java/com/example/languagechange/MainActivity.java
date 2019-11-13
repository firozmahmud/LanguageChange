package com.example.languagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void changeE(View view) {

        startActivity(new Intent(this, Main2Activity.class));

    }

    public void changeB(View view) {

        /**
         * If we want to change language by user choice
         */

       /* LanguageHelper.setLanguage(this, "bn");
        this.recreate();*/
    }
}
