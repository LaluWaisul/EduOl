package com.nongsa.eduol.awal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nongsa.eduol.R;
import com.nongsa.eduol.loreg.LoginActivity;

public class OB1Activity extends AppCompatActivity {

    Button button;
    Button skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ob1);

        button=(Button)findViewById(R.id.btnob1next);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OB1Activity.this, OB2Activity.class);
                startActivity(intent);
                finish();
            }
        });

        skip=(Button)findViewById(R.id.btnskip1);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OB1Activity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}