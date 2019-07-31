package com.example.order;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button button1, button2;
    Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        context=this;


        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
    }
    public void onOrder(View view){
        Toast.makeText(context, "Order", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(context,ThirdActivity.class);
        startActivity(intent);

    }
    public void onTableBooking(View view){
        Toast.makeText(context, "Table bookings", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(context,FourthActivity.class);
        startActivity(intent);


    }

}
