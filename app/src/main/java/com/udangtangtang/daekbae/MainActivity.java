package com.udangtangtang.daekbae;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signUpButton=(Button)findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}