package com.example.week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User User1 = new User("John", "Person", 12, false);
        String Name = User1.getName();
        String Description = User1.getDescription();



        int randInt = getIntent().getIntExtra("randIntKey", 0);
        TextView intText = findViewById(R.id.textView);
        intText.setText("MAD " + randInt);

        Button followButton = findViewById(R.id.button);
        followButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(User1.followed == true){
                    User1.followed = false;
                    followButton.setText("Follow");
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
                else if(User1.followed == false){
                    User1.followed = true;
                    followButton.setText("Unfollow");
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Button messageButton = findViewById(R.id.button2);
        messageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent startMessage = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(startMessage);
            }
        });
    }
}