package com.example.mehmetdiyet;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import  android.widget.ImageView;

import org.w3c.dom.Text;

public class goster extends AppCompatActivity {
   TextView mesaj;
   ImageView resim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goster);
        mesaj=(TextView)findViewById(R.id.textView2);
        resim=(ImageView)findViewById(R.id.imageView) ;
        Bundle gelenVeri=getIntent().getExtras();
        Float gelen=gelenVeri.getFloat("VKİ");
        Toast.makeText(getApplicationContext(), (gelen).toString() , Toast.LENGTH_SHORT).show();
        if(gelen<18.5)
        {
           mesaj.setText("Zayıfsınız.VKİ="+gelen.toString());
           resim.setImageResource(R.drawable.zayif);
        }
        else if(gelen>=18.5 && gelen<=24.5)
        {
            mesaj.setText("Ortalama,İyisin iyi.VKİ="+gelen.toString());
            resim.setImageResource(R.drawable.kilolu);
        }
        else {
            mesaj.setText("Obez, biraz kilo verelim.VKİ="+gelen.toString());
            resim.setImageResource(R.drawable.obez);
        }

    }
}
