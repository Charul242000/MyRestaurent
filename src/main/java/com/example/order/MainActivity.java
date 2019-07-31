package com.example.order;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private EditText email, password;
    private TextView emailLable, passwordLable;
    Context context;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;

        email=findViewById(R.id.email);
        emailLable=findViewById(R.id.emailLable);
        password=findViewById(R.id.password);
        passwordLable=findViewById(R.id.passwordLable);
    }
      public void onLogin(View view){
    String emailEntered=email.getText().toString();
    String passwordEntered=password.getText().toString();
        Toast.makeText(context, "Email: "+emailEntered+"Password: "+passwordEntered, Toast.LENGTH_SHORT).show();


        Intent intent=new Intent(context, SecondActivity.class);
        startActivity(intent);


    }
}
