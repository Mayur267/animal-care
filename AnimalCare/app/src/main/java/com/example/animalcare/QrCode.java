package com.example.animalcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QrCode extends AppCompatActivity {
    public static TextView resultTextView;
    Button scan_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);

        resultTextView= (TextView)findViewById(R.id.txt_result);
        scan_btn=(Button)findViewById(R.id.btn_qr);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Scanner1.class));
            }
        });
    }
}
