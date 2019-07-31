package com.example.order;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    CheckBox checkBox, checkBox2, checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9;
    Button button3;
    Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        context=this;
     checkBox=findViewById(R.id.checkBox);
     checkBox2=findViewById(R.id.checkBox2);
     checkBox3=findViewById(R.id.checkBox3);
     checkBox4=findViewById(R.id.checkBox4);
     checkBox5=findViewById(R.id.checkBox5);
     checkBox6=findViewById(R.id.checkbox6);
     checkBox7=findViewById(R.id.checkbox7);
     checkBox8=findViewById(R.id.checkBox8);
     checkBox9=findViewById(R.id.checkBox9);
     button3=findViewById(R.id.button3);
    }
    public void onPlacingOrder(View view){
        int total=0;
        StringBuilder result=new StringBuilder();
        result.append("Selected Items:");
        if (checkBox.isChecked()){
            result.append("\n Pizza 100Rs");
            total+=100;
        }
        if (checkBox2.isChecked()){
            result.append("\n Maggie 50Rs");
            total+=50;
        }
        if (checkBox3.isChecked()){
            result.append("\n Pasta 60Rs");
            total+=60;
        }
        if (checkBox4.isChecked()){
            result.append("\n Burger 90Rs");
            total+=90;
        }
        if (checkBox5.isChecked()){
            result.append("\n Matar paneer 150Rs");
            total+=150;
        }
        if (checkBox6.isChecked()){
            result.append("\n Kaju kari 150Rs");
            total+=150;
        }
        if (checkBox7.isChecked()){
            result.append("\n Dal fry 120Rs");
            total+=120;
        }
        if (checkBox8.isChecked()){
            result.append("\n Rice 100Rs");
            total+=100;
        }
        if ((checkBox9.isChecked())){
            result.append("\nTava Roti 30Rs per roti");
        }
        result.append("\nTotal "+total+"Rs");
        Toast.makeText(this, "total "+result.append(total), Toast.LENGTH_SHORT).show();
    }
}
