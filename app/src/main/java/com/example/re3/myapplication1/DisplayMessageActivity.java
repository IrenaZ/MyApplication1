package com.example.re3.myapplication1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Получаем сообщение из объекта intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        setContentView(R.layout.activity_display_message);

        // Создаем текстовое поле
        TextView textView = (TextView) findViewById(R.id.edit_message) ;
        textView.setTextSize(40);
        textView.setText(message);

        Button back = (Button) findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                finish();
            }



        });



    }


}
