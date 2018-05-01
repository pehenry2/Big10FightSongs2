package com.example.philiphenry.big10fightsongs;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer illinoisFS = MediaPlayer.create(this, R.raw.illinois);
        ImageButton playIllinois = (ImageButton) this.findViewById(R.id.play_illinois);
        playIllinois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (illinoisFS.isPlaying()) {
                    illinoisFS.pause();
                } else {
                    illinoisFS.start();
                }
            }
        });
        final MediaPlayer indianaFS = MediaPlayer.create(this, R.raw.indianauniv);
        ImageButton playIndiana = (ImageButton) this.findViewById(R.id.play_indiana);
        playIndiana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (indianaFS.isPlaying()) {
                    indianaFS.pause();
                } else {
                    indianaFS.start();
                }
            }
        });
        final MediaPlayer purdueFS = MediaPlayer.create(this, R.raw.purdue);
        ImageButton playPurdue = (ImageButton) this.findViewById(R.id.play_purdue);
        playPurdue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (purdueFS.isPlaying()) {
                    purdueFS.pause();
                } else {
                    purdueFS.start();
                }
            }
        });
        final MediaPlayer iowaFS = MediaPlayer.create(this, R.raw.iowauniv);
        ImageButton playIowa = (ImageButton) this.findViewById(R.id.play_iowa);
        playIowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iowaFS.isPlaying()) {
                    iowaFS.pause();
                } else {
                    iowaFS.start();
                }
            }
        });
        final MediaPlayer WisFS = MediaPlayer.create(this, R.raw.wisconsin);
        ImageButton playWis = (ImageButton) this.findViewById(R.id.play_wis);
        playWis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (WisFS.isPlaying()) {
                    WisFS.pause();
                } else {
                    WisFS.start();
                }
            }
        });
        final MediaPlayer NWUFS = MediaPlayer.create(this, R.raw.northwesternuniv);
        ImageButton playNWU = (ImageButton) this.findViewById(R.id.play_nwu);
        playNWU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (NWUFS.isPlaying()) {
                    NWUFS.pause();
                } else {
                    NWUFS.start();
                }
            }
        });
        final MediaPlayer msuFS = MediaPlayer.create(this, R.raw.michiganstate);
        ImageButton playMSU = (ImageButton) this.findViewById(R.id.play_msu);
        playMSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (msuFS.isPlaying()) {
                    msuFS.pause();
                } else {
                    msuFS.start();
                }
            }
        });
    }
}
