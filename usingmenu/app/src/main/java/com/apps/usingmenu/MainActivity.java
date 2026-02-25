package com.apps.usingmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
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

        }
        // 1.inflate the menu
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.options, menu);
            return true;
        }
        //2.Handle menu item click
       @Override
       public boolean onOptionsItemSelected(@NonNull MenuItem item){
           int id = item.getItemId();

           if (id == R.id.options_mca) {
               Toast.makeText(this, "MCA Selected", Toast.LENGTH_SHORT).show();
               return true;

           } else if (id == R.id.options_bca) {
               Toast.makeText(this, "BCA Selected", Toast.LENGTH_SHORT).show();
               return true;

           } else if (id == R.id.options_bba) {
               Toast.makeText(this, "BBA Selected", Toast.LENGTH_SHORT).show();
               return true;
           }
           return super.onOptionsItemSelected(item);

       }



    }
