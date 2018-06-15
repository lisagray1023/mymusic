package com.example.android.mymusic;

/**
 * Created by lisa.gray on 6/15/18.
 * Song object represents a song the user wants to listen to.
 * It contains the song title, artist title, and album title.
 */

public class Song {

    /** Song title */
    private String mSongTitle;

    /** Artist name */
    private String mArtistName;

    /** Album title */
    private String mAlbumTitle;

    /**
     * Create a new Song object.
     * @param songTitle is the song that the user wants to listen to.
     * @param artistName is the name of the artist who sings the song.
     * @param albumTitle is the name of the album the song belongs to.
     */

    public Song(String songTitle, String artistName, String albumTitle) {
        mSongTitle = songTitle;
        mArtistName = artistName;
        mAlbumTitle = albumTitle;
    }

    /**
     * Get the song title of the Song object
     */
    public String getSongTitle() {return mSongTitle;}

    /**
     * Get the artist name who sings the song
     */
    public String getArtistName() {return mArtistName;}

    /**
     * Get the album title that the song belongs to
     */
    public String getAlbumTitle() {return mAlbumTitle;}


}
