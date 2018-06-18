package com.example.android.mymusic;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lisa.gray on 6/15/18.
 */

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View songItemView = convertView;
            if (songItemView == null) {
                songItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
            }


            //Get the Song object located at this position in the list
            Song currentSong = getItem(position);

            //Find the TextView in the song_item.xml layout with the ID song_title
            TextView songTextView = (TextView) songItemView.findViewById(R.id.song_title);
            //Get the song title from the current Song object and set this text on the Text View


            //Find the TextView in the song_item.xml layout with the ID artist_name
            TextView artistTextView = (TextView) songItemView.findViewById(R.id.artist_name);
            //Get the artist name from the current Song object and set this text on the Text View

            //Find the TextView in the song_item.xml layout with the ID album_name
            TextView albumTextView = (TextView) songItemView.findViewById(R.id.album_name);
            //Get the album name from the current Song object and set this text on the Text View

            return songItemView;
        }
}
