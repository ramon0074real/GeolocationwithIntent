package com.example.geolocationwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1= findViewById(R.id.btn1);
        EditText ed1=findViewById(R.id.ed1);

        EditText ed2=findViewById(R.id.ed2);
        Button btn2=findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("geo:0,0?q="+ed1.getText().
                        toString());
                Intent i= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse(ed2.getText().toString());
                Intent i= new Intent(Intent.ACTION_DIAL,uri);
                startActivity(i);
            }
        });

    }
}