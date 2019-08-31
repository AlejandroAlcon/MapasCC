package com.lex.alcon.alejandro.lex.mapascc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void irMapa(View view)
    {
        Intent intent=new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}
