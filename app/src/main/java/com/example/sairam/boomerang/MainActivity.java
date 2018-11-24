package com.example.sairam.boomerang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button_capture;
    Button button_video;
    ImageView imageView_preview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_capture = (Button) findViewById(R.id.button_capture);
        button_video = (Button) findViewById(R.id.button_video);
        imageView_preview = (ImageView) findViewById(R.id.imageView_preview);

    }
}
