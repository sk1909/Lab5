package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button b;
    Intent i;
    int REQUEST_CODE_FOR_THIS_ACTIVITY=001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name=getIntent().getStringExtra("msg");
        b=findViewById(R.id.button);
        i=new Intent(MainActivity2.this,MainActivity.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              i.putExtra( "msg1","Welcome "+name);
              setResult(RESULT_OK,i);
              finish();
            }
        });

    }
}