package com.apps.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FuelEstimateApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fuel_estimate_app);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        //1. Create object
        Button btnCost;
        EditText txtDist;
        EditText txtEffic;
        EditText txtPrice;
        TextView txtfuel;

        //2.Bind UI with java code
        btnCost=findViewById(R.id.btncost);
        txtfuel=findViewById(R.id.textfuelcost);//to show final result
        txtDist=findViewById(R.id.txtDist);
        txtEffic=findViewById(R.id.txtEffic);
        txtPrice=findViewById(R.id.txtPrice);

        btnCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dist=txtDist.getText().toString();
                String effic=txtEffic.getText().toString();
                String price=txtPrice.getText().toString();

                int d=Integer.parseInt(dist);
                int e=Integer.parseInt(price);
                int f=Integer.parseInt(effic);

                //cost=(distance/efficiency)*price
                int ans=(d/f)*e;

                txtfuel.setText(""+ans+"PRK");



            }


        });
        Button btnfuel=findViewById(R.id.btnbackApp);
        btnfuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FuelEstimateApp.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}