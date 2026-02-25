package com.apps.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // binding ui id with java object
        EditText txtname=findViewById(R.id.txtname);
        EditText txtfather=findViewById(R.id.txtfather);
        EditText txtcourse=findViewById(R.id.txtcourse);
        EditText txtEmail=findViewById(R.id.txtemail);
        EditText txtplace=findViewById(R.id.txtplace);

        Button btnfuel;
        btnfuel=findViewById(R.id.btnFuelApp);
        btnfuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,FuelEstimateApp.class);
                startActivity(i);
            }
        });
        //binding objects with UI
        Button btnfragment = findViewById(R.id.btnFragmentApp);
        btnfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent i= new Intent(MainActivity.this,FragementTest.class);
             startActivity(i);
            }
        });

    }
}