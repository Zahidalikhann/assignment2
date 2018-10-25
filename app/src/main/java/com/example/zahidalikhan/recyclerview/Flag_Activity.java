package com.example.zahidalikhan.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Flag_Activity extends AppCompatActivity {
    private TextView FnameR;
    private ImageView imgR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_);

        FnameR = (TextView) findViewById(R.id.flagnm);
        imgR = (ImageView) findViewById(R.id.flagThumbnail);

        Intent i = getIntent();
        String Fname= i.getExtras().getString("FlagName");
        int image = i.getExtras().getInt("Thumbnail");

        FnameR.setText(Fname);
        imgR.setImageResource(image);
    }
}

