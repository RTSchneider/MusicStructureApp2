package com.example.musicstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows Song 1
        TextView song_1 = (TextView) findViewById(R.id.Song_1);

        // Set a click listener on that View
        song_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the Song_1Activity
                Intent song_1Intent = new Intent(MainActivity.this, Song1Activity.class);

                // Opens Song 1 to Play
                startActivity(song_1Intent);
            }
        });

        // Find the View that shows Song 2
        TextView song_2 = (TextView) findViewById(R.id.Song_2);

        // Set a click listener on that View
        song_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the Song_2Activity
                Intent song_2Intent = new Intent(MainActivity.this, Song2Activity.class);

                // Opens Song 2 to Play
                startActivity(song_2Intent);
            }
        });

        // Find the View that shows Song 3
        TextView song_3 = (TextView) findViewById(R.id.Song_3);

        // Set a click listener on that View
        song_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the Song_3Activity
                Intent song_3Intent = new Intent(MainActivity.this, Song3Activity.class);

                // Opens Song 3 to Play
                startActivity(song_3Intent);
            }
        });

        // Find the View that shows Song 4
        TextView song_4 = (TextView) findViewById(R.id.Song_4);

        // Set a click listener on that View
        song_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the Song_4Activity
                Intent song_4Intent = new Intent(MainActivity.this, Song4Activity.class);

                // Opens Song 4 to Play
                startActivity(song_4Intent);
            }
        });

        // Find the View that shows Song 5
        TextView song_5 = (TextView) findViewById(R.id.Song_5);

        // Set a click listener on that View
        song_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the Song_5Activity
                Intent song_5Intent = new Intent(MainActivity.this, Song5Activity.class);

                // Opens Song 5 to Play
                startActivity(song_5Intent);
            }
        });

        // Find the View that shows Song 6
        TextView song_6 = (TextView) findViewById(R.id.Song_6);

        // Set a click listener on that View
        song_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the Song_6Activity
                Intent song_6Intent = new Intent(MainActivity.this, Song6Activity.class);

                // Opens Song 6 to Play
                startActivity(song_6Intent);
            }
        });

        // Find the View that shows Song 7
        TextView song_7 = (TextView) findViewById(R.id.Song_7);

        // Set a click listener on that View
        song_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the Song_7Activity
                Intent song_7Intent = new Intent(MainActivity.this, Song7Activity.class);

                // Opens Song 7 to Play
                startActivity(song_7Intent);
            }
        });

        // Find the View that shows Song 8
        TextView song_8 = (TextView) findViewById(R.id.Song_8);

        // Set a click listener on that View
        song_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the Song_8Activity
                Intent song_8Intent = new Intent(MainActivity.this, Song8Activity.class);

                // Opens Song 8 to Play
                startActivity(song_8Intent);
            }
        });

        // Find the View that shows Song 9
        TextView song_9 = (TextView) findViewById(R.id.Song_9);

        // Set a click listener on that View
        song_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the Song_9Activity
                Intent song_9Intent = new Intent(MainActivity.this, Song9Activity.class);

                // Opens Song 9 to Play
                startActivity(song_9Intent);
            }
        });
    }
}
