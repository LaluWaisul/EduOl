package com.nongsa.eduol.loreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nongsa.eduol.MainActivity;
import com.nongsa.eduol.R;

public class LoginActivity extends AppCompatActivity {

    Button btnmasuk;
    Button btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnmasuk = (Button)findViewById(R.id.btnMasuk);
        btnDaftar = (Button)findViewById(R.id.btndfr);

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( LoginActivity.this, RegistrasiActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}