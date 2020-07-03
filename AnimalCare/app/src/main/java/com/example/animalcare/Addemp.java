package com.example.animalcare;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Addemp extends AppCompatActivity {
    EditText txt_name,txt_email,txt_password;
    RadioButton radioGenderMale,radioGenderFemale;
    String gender = "";
    Button btn_register;
    DatabaseReference databaseReference;
    public FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addemp);
        getSupportActionBar().setTitle("Employ Information");

        txt_name =(EditText)findViewById(R.id.txt_name);
        txt_email=(EditText)findViewById(R.id.txt_email);
        txt_password=(EditText)findViewById(R.id.txt_password);
        btn_register= (Button) findViewById(R.id.btn_reg);
        radioGenderMale= (RadioButton) findViewById(R.id.radio_male);
        radioGenderFemale= (RadioButton) findViewById(R.id.radio_female);

        databaseReference = FirebaseDatabase.getInstance().getReference("empData");
        firebaseAuth=FirebaseAuth.getInstance();
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String name = txt_name.getText().toString();
                final String email = txt_email.getText().toString();
                String password = txt_password.getText().toString();

                if (radioGenderMale.isChecked()) {
                    gender = "Male";
                }
                if (radioGenderFemale.isChecked()) {
                    gender = "Female";
                }
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(Addemp.this, "please enter email", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(Addemp.this, "please enter password", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(Addemp.this, "please enter name", Toast.LENGTH_SHORT).show();
                }


                firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Addemp.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                //checking if success
                                if (task.isSuccessful()) {
                                    //display some message here
                                    employData information = new employData(
                                            name,
                                            email,
                                            gender
                                    );
                                    FirebaseDatabase.getInstance().getReference("empData")
                                            .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                            .setValue(information).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            Toast.makeText(Addemp.this, "Successfully registered", Toast.LENGTH_LONG).show();
                                            startActivity(new Intent(getApplicationContext(), Addemp.class));
                                        }
                                    });

                                }
                            }});
            }
        });
    }
}
