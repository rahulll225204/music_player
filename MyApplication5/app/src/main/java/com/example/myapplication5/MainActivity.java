package com.example.myapplication5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity
        extends AppCompatActivity {

    // Instantiating the MediaPlayer class
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adding the music files into music object
        music = MediaPlayer.create(
                this, R.raw.RimJhim);
    }

    // play song
    public void musicplay(View v)
    {
        music.start();
    }

    // Pause song
    public void musicpause(View v)
    {
        music.pause();
    }

    // Stop song
    public void musicstop(View v)
    {
        music.stop();
        music = MediaPlayer.create(
                this, R.raw.RimJhim);
    }
}
