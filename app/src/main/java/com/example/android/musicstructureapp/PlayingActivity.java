package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Tom on 01/05/2017.
 */

public class PlayingActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the now_playing.xml layout file
        setContentView(R.layout.now_playing);

        // Find the views for all of the buttons that change the current layout file
        ImageView ButtonAlbumReturn = (ImageView) findViewById(R.id.album_return);

        // Set the listeners for the clickable items
        ButtonAlbumReturn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent nextActivity = null;
        switch (v.getId()) {
            case R.id.album_return:
                nextActivity = new Intent(this, AlbumsActivity.class);
                break;
        }

        if (nextActivity != null) {
            startActivity(nextActivity);
        }

    }
}
