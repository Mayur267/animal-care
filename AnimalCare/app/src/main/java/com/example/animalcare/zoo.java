package com.example.animalcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class zoo extends AppCompatActivity {
    private ImageView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoo);

        b = (ImageView) findViewById(R.id.btn_emp);
        b.setOnClickListener(new View.OnClickListener() {


                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(zoo.this,Addemp.class );
                                     startActivity(i);
                                 }
                             }
        );
        b = (ImageView) findViewById(R.id.button7);
        b.setOnClickListener(new View.OnClickListener() {


                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(zoo.this,QrCode.class );
                                     startActivity(i);
                                 }
                             }
        );


    }
}
