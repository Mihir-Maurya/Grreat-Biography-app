package com.example.greatbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nl = (TextView)findViewById(R.id.nelson);
        nl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,Nelson.class);
                startActivity(s);
            }
        });
        TextView n2 = (TextView)findViewById(R.id.anna);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,Anna.class);
                startActivity(s);
            }
        });
        TextView n3 = (TextView)findViewById(R.id.ratan);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,Ratanji.class);
                startActivity(s);
            }
        });
        TextView n4 = (TextView)findViewById(R.id.apj);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,apj.class);
                startActivity(s);
            }
        });
        TextView n5 = (TextView)findViewById(R.id.bill);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,bill.class);
                startActivity(s);
            }
        });
        TextView n6 = (TextView)findViewById(R.id.mother);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,mother.class);
                startActivity(s);
            }
        });
        TextView n7 = (TextView)findViewById(R.id.swami);
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this,swami.class);
                startActivity(s);
            }
        });
    }

}