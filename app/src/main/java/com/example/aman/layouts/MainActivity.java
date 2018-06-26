package com.example.aman.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);
        textView.setText("This is my text");


          text = String.valueOf(textView.getText());
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/


        button.setOnClickListener(this);

    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }

    @Override
    public void onClick(View v) {

       Toast t  = Toast.makeText(this,text,Toast.LENGTH_LONG);
       t.setGravity(Gravity.CENTER,0,0);
       t.show();
    }
}
