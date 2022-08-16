package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//aa aapde khali video ne goti ne eno path didho che...
        VideoView clgfrnd = findViewById(R.id.clgfrnd);
        clgfrnd.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.fy);

//Aa video ne control karava nu kam kare .. exp niche stop/start nu button aave and aagal/pachal karva nu button aave
       MediaController control = new MediaController(this);
       clgfrnd.setMediaController(control);
       control.setAnchorView(clgfrnd);
//and aa video ne start kare .
        clgfrnd.start();
    }
}