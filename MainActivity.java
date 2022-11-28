package com.example.temparatureconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText c = findViewById(R.id.celcius);
        EditText f = findViewById(R.id.farenheat);
        Button b = findViewById(R.id.convert);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if(c.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter the Temperature in C", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(f.getText().toString().isEmpty())
                    {
                        Toast.makeText(MainActivity.this, "Enter the Temperature in F", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        SharedPreferences sp = getSharedPreferences("s",MODE_PRIVATE);
                        SharedPreferences.Editor e = sp.edit();
                        e.putString("c", c.getText().toString());
                        e.putString("f",f.getText().toString());
                        e.commit();
                        Intent in = new Intent(MainActivity.this,SecondActivity.class);
                        startActivity(in);
                    }
                }
                    }
                });
            }

}