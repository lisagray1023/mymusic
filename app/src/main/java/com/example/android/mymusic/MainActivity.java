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
        songs.add(new Song("Brave","Sara Bareilles","The Blessed Unrest"));
        songs.add(new Song("Love Song","Sara Bareilles","Little Voice"));
        songs.add(new Song("Afterlife","Ingrid Michaelson","Lights Out"));
        songs.add(new Song("The Way I Am","Ingrid Michaelson","Girls and Boys"));
        songs.add(new Song("Bubbly", "Colbie Caillat", "Coco"));
        songs.add(new Song("Fallin' For You", "Colbie Caillat", "Breakthrough"));
        songs.add(new Song("Almost Lover", "A Fine Frenzy", "One Cell in the Sea"));
        songs.add(new Song("What I Wouldn't Do", "A Fine Frenzy", "Bomb in a Birdcage"));
        songs.add(new Song("Breathe", "Anna Nalick", "Wreck of the Day"));
        songs.add(new Song("Slow Down", "Karmina", "Car Train Ship Plane"));

    //Create a SongAdapter whose data source is the list of Songs.
        SongAdapter adapter = new SongAdapter(this, songs);

     //Find the object in the view hierarchy of the Main Activity.
        //There should be a ListView with the view ID called list_view which is declared in the activity_main.xml file
        ListView listView = findViewById(R.id.list_view);

     //Make the List View use the Song Adapter created above, so that the ListView will display the song item for each Song in the list.
        listView.setAdapter(adapter);
    }
}
