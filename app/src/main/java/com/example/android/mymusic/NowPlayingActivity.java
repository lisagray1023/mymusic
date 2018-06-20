package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by lisa.gray on 6/18/18.
 */

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // Get the intent that was used to start this activity
        Intent nowPlayingIntent = getIntent();

        // Get TextViews and store in a variable
        TextView songName = (TextView) findViewById(R.id.song_title);
        TextView artistName = (TextView) findViewById(R.id.artist_name);
        TextView albumTitle = (TextView) findViewById(R.id.album_title);

        // Set the TextViews to the values pulled from the intent
        songName.setText(nowPlayingIntent.getStringExtra("SONG_TITLE"));
        artistName.setText(nowPlayingIntent.getStringExtra("ARTIST_NAME"));
        albumTitle.setText(nowPlayingIntent.getStringExtra("ALBUM_TITLE"));


    }


}

