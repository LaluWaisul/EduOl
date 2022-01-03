package com.nongsa.eduol.core;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Constraints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nongsa.eduol.R;
import com.nongsa.eduol.awal.OB1Activity;
import com.nongsa.eduol.loreg.LoginActivity;

public class HomeActivity extends AppCompatActivity {

    Constraints mCerita,mHome, mFavorite, mGame, mVideo;
    Button btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mCerita = findViewById(R.id.ceritaBtn);
        mHome = findViewById(R.id.homeBtn);
        mFavorite = findViewById(R.id.favoriteBtn);
        mGame =findViewById(R.id.games);
        mVideo = findViewById(R.id.video);
        btnSetting = findViewById(R.id.settingBtn);

        mCerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CeritaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        mGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, GameActivity.class);
                startActivity(intent);
                finish();
            }
        });
        mVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, VideoActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}