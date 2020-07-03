package com.example.animalcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class cat extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        b= (Button)findViewById(R.id.btn_cat);
        b.setOnClickListener(new View.OnClickListener() {


                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(cat.this,MainActivity.class );
                                     startActivity(i);
                                 }
                             }
        );
    }
}
