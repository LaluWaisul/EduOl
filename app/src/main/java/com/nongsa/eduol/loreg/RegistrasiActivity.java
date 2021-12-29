package com.nongsa.eduol.loreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nongsa.eduol.MainActivity;
import com.nongsa.eduol.R;

public class RegistrasiActivity extends AppCompatActivity {

    Button btnmasuk, btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        btnmasuk = (Button)findViewById(R.id.btnmsk);
        btnDaftar = (Button)findViewById(R.id.btndaftar);

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( RegistrasiActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( RegistrasiActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}