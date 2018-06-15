package com.example.android.mymusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

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

    //Create a SongAdapter whose data source is the list of Songs.
        SongAdapter adapter = new SongAdapter(this, songs);

     //Find the object in the view hierarchy of the Main Activity.
        //There should be a GridView with the view ID called grid which is declared in the activity_main.xml file
        GridView gridView = (GridView) findViewById(R.id.grid);

     //Make the Grid View use the Song Adapter we created above, so that the GridView will display the song item for each Song in the list.
        gridView.setAdapter(adapter);

    }


}
