package com.example.animalcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (ImageView) findViewById(R.id.animal);
        b.setOnClickListener(new View.OnClickListener() {


                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(MainActivity.this,Main2Activity.class );
                                     startActivity(i);
                                 }
                             }
        );
        b = (ImageView) findViewById(R.id.donate);
        b.setOnClickListener(new View.OnClickListener() {


                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(MainActivity.this,Main3Activity.class );
                                     startActivity(i);
                                 }
                             }
        );
        b = (ImageView) findViewById(R.id.about1);
        b.setOnClickListener(new View.OnClickListener() {


                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(MainActivity.this,ContactUs.class );
                                     startActivity(i);
                                 }
                             }
        );
        b = (ImageView) findViewById(R.id.hosp1);
        b.setOnClickListener(new View.OnClickListener() {


                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(MainActivity.this,MapsActivity.class );
                                     startActivity(i);
                                 }
                             }
        );
        b = (ImageView) findViewById(R.id.regis1);
        b.setOnClickListener(new View.OnClickListener() {


                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(MainActivity.this,Registration.class );
                                     startActivity(i);
                                 }
                             }
        );

        b = (ImageView) findViewById(R.id.logout);
        b.setOnClickListener(new View.OnClickListener() {



                                 @Override
                                 public void onClick(View view) {
                                     moveTaskToBack(true);
                                     android.os.Process.killProcess(android.os.Process.myPid());
                                     System.exit(1);
                                 }
                             }
        );

    }
}




