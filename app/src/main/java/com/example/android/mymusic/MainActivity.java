package com.example.android.mymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //Create an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.song1),getString(R.string.artist1),getString(R.string.album1)));
        songs.add(new Song(getString(R.string.song2),getString(R.string.artist2),getString(R.string.album2)));
        songs.add(new Song(getString(R.string.song3),getString(R.string.artist3),getString(R.string.album3)));
        songs.add(new Song(getString(R.string.song4),getString(R.string.artist4),getString(R.string.album4)));
        songs.add(new Song(getString(R.string.song5), getString(R.string.artist5), getString(R.string.album5)));
        songs.add(new Song(getString(R.string.song6), getString(R.string.artist6), getString(R.string.album6)));
        songs.add(new Song(getString(R.string.song7), getString(R.string.artist7), getString(R.string.album7)));
        songs.add(new Song(getString(R.string.song8), getString(R.string.artist8), getString(R.string.album8)));
        songs.add(new Song(getString(R.string.song9), getString(R.string.artist9), getString(R.string.album9)));
        songs.add(new Song(getString(R.string.song10), getString(R.string.artist10), getString(R.string.album10)));

    //Create a SongAdapter whose data source is the list of Songs.
        SongAdapter adapter = new SongAdapter(this, songs);

     //Find the object in the view hierarchy of the Main Activity.
        //There should be a ListView with the view ID called list_view which is declared in the activity_main.xml file
        ListView listView = findViewById(R.id.list_view);

     //Make the List View use the Song Adapter created above, so that the ListView will display the song item for each Song in the list.
        listView.setAdapter(adapter);
    }
}
