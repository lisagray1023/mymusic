package com.example.android.mymusic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
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
            final Song currentSong = getItem(position);

            //Find the TextView in the song_item.xml layout with the ID song_title
            TextView songTextView = (TextView) songItemView.findViewById(R.id.song_title);
            //Get the song title from the current Song object and set this text on the Text View
            songTextView.setText(currentSong.getSongTitle());


            //Find the TextView in the song_item.xml layout with the ID artist_name
            TextView artistTextView = (TextView) songItemView.findViewById(R.id.artist_name);
            //Get the artist name from the current Song object and set this text on the Text View
            artistTextView.setText(currentSong.getArtistName());

            //Find the TextView in the song_item.xml layout with the ID album_name
            TextView albumTextView = (TextView) songItemView.findViewById(R.id.album_name);
            //Get the album name from the current Song object and set this text on the Text View
            albumTextView.setText(currentSong.getAlbumTitle());

            //Get the LinearLayout to set the OnClickListener for the song
            LinearLayout songItem = (LinearLayout) songItemView.findViewById(R.id.song_title);
            //Set the OnClick listener for the LinearLayout
            songItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view) {
                    Intent nowPlayingIntent = new Intent(getContext(), NowPlayingActivity.class);
                    //Add the song title, artist name, and album title to the intent sent to NowPlayingActivity
                    nowPlayingIntent.putExtra("SONG_TITLE", currentSong.getSongTitle());
                    nowPlayingIntent.putExtra("ARTIST_NAME", currentSong.getArtistName());
                    nowPlayingIntent.putExtra("ALBUM_TITLE", currentSong.getAlbumTitle());
                    getContext().startActivity(nowPlayingIntent);
                }
            });

            return songItemView;
        }





}
