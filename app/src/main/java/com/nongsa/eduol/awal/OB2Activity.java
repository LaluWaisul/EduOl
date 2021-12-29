package com.nongsa.eduol.awal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nongsa.eduol.R;
import com.nongsa.eduol.loreg.LoginActivity;

public class OB2Activity extends AppCompatActivity {

    Button btn;
    Button skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ob2);


        btn=(Button)findViewById(R.id.btnob1next2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OB2Activity.this, Ob3Activity.class);
                startActivity(intent);
                finish();
            }
        });

        skip=(Button)findViewById(R.id.btnskip2);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OB2Activity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}