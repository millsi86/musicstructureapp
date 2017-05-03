package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Tom on 01/05/2017.
 */

public class SongsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the songs.xml layout file
        setContentView(R.layout.songs);

        // Find the views for all of the buttons that change the current layout file
        Button ButtonAlbums = (Button) findViewById(R.id.albums);
        Button ButtonPlaylists = (Button) findViewById(R.id.playlists);
        Button ButtonArtists = (Button) findViewById(R.id.artists);
        Button ButtonSongs = (Button) findViewById(R.id.songs);
        Button ButtonGenres = (Button) findViewById(R.id.genres);
        ImageView ButtonNowPlaying = (ImageView) findViewById(R.id.playing);

        // Set the listeners for the clickable items
        ButtonAlbums.setOnClickListener(this);
        ButtonPlaylists.setOnClickListener(this);
        ButtonArtists.setOnClickListener(this);
        ButtonSongs.setOnClickListener(this);
        ButtonGenres.setOnClickListener(this);
        ButtonNowPlaying.setOnClickListener(this);

        ButtonSongs.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark));
    }


    @Override
    public void onClick(View v) {
        Intent nextActivity = null;
        switch (v.getId()) {
            case R.id.albums:
                nextActivity = new Intent(this, AlbumsActivity.class);
                break;

            case R.id.playlists:
                nextActivity = new Intent(this, PlaylistsActivity.class);
                break;

            case R.id.artists:
                nextActivity = new Intent(this, ArtistsActivity.class);
                break;

            case R.id.songs:
                nextActivity = new Intent(this, SongsActivity.class);
                break;

            case R.id.genres:
                nextActivity = new Intent(this, GenresActivity.class);
                break;

            case R.id.playing:
                nextActivity = new Intent(this, PlayingActivity.class);
                break;
        }

        if (nextActivity != null) {
            startActivity(nextActivity);
            finish();
        }

    }
}

