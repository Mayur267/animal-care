package com.example.animalcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b = (Button)findViewById(R.id.button6);
        b.setOnClickListener(new View.OnClickListener() {


                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(Main2Activity.this,cat.class);
                                     startActivity(i);
                                 }
                             }
        );
    }
}
