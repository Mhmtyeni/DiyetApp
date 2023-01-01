package com.example.mehmetdiyet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button hesapla;
    Button oyunagit;
    EditText boy;
    EditText kilo;
    float vki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hesapla=findViewById(R.id.button);
        oyunagit=findViewById(R.id.button2);
        boy=findViewById(R.id.editText2);
        kilo=findViewById(R.id.editText);
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float b=Float.parseFloat(boy.getText().toString());
                float k=Float.parseFloat(kilo.getText().toString());
                vki=k / ((b / 100) * (b / 100));
               // Toast.makeText(getApplicationContext(), Float.toString(vki) , Toast.LENGTH_SHORT).show();
                    Intent goster=new Intent(getApplicationContext(), com.example.mehmetdiyet.goster.class);
                    goster.putExtra("VKİ",vki);
                    startActivity(goster);
            }
        });
        oyunagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oyunagit=new Intent(getApplicationContext(), oyun.class);
                startActivity(oyunagit);
            }
        });


    }
}
