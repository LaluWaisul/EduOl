package com.nongsa.eduol.awal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nongsa.eduol.R;
import com.nongsa.eduol.loreg.LoginActivity;

public class Ob3Activity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ob3);


        button=(Button)findViewById(R.id.btnob3mulai);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ob3Activity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}