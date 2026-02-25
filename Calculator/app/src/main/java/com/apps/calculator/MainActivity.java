package com.apps.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText num1=findViewById(R.id.txt1);
        EditText num2=findViewById(R.id.txt2);
        Button btn=findViewById(R.id.btn);

        TextView txtresult =findViewById(R.id.txtresult);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String s1 = num1.getText().toString();
//                String s2 = num2.getText().toString();
//                if (s1.isEmpty() || s2.isEmpty()) {
//                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                double n1 = Double.parseDouble(s1);
//                double n2 = Double.parseDouble(s2);
//                double res = n1 + n2;
                txtresult.setText("Hi");
                //txtresult.setText("SUM = " + res);


            }


        });

    }
}