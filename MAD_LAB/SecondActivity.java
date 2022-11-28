package com.example.temparatureconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView cc = findViewById(R.id.cc);
        TextView cf = findViewById(R.id.cf);
        SharedPreferences sp = getSharedPreferences("s",MODE_PRIVATE);
        String s1=sp.getString("c","CtoF");
        String s2=sp.getString("f","FtoC");
        float num1,num2,ctof,ftoc;
        num1=Float.parseFloat(s1);
        num2=Float.parseFloat(s2);
        ctof=(num1*(9/5))+32;
        ftoc=(num2-32)*(5/9);
        cc.setText(String.valueOf(num1)+" C is Converted to "+String.valueOf(ctof)+" F");
        cf.setText(String.valueOf(num2)+" F is Converted to "+String.valueOf(ftoc)+" C");
        //cf.setText(s2);
    }
}