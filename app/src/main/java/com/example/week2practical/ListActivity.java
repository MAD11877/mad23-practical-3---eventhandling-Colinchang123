package com.example.week2practical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView imgButton = findViewById(R.id.imageView2);

        imgButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                new AlertDialog.Builder(ListActivity.this)
                        .setTitle("Profile")
                        .setMessage("MADness")
                        .setPositiveButton("VIEW", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                Random random = new Random();
                                int randInt = random.nextInt();

                                Intent startMain = new Intent(ListActivity.this, MainActivity.class);
                                startMain.putExtra("randIntKey", randInt);
                                startActivity(startMain);
                            }
                        })
                        .setNegativeButton("CLOSE", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){

                            }
                        })
                        .show();
            }
        });
    }
}