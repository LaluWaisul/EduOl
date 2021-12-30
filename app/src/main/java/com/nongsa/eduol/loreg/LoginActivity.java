package com.nongsa.eduol.loreg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.nongsa.eduol.MainActivity;
import com.nongsa.eduol.R;

public class LoginActivity extends AppCompatActivity {

    Button btnmasuk, btnDaftar;
    EditText inpEmail,inpPass;
    String email,pass;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        inpEmail = findViewById(R.id.inpEmail);
        inpPass = findViewById(R.id.InpPass);
        btnmasuk = (Button)findViewById(R.id.btnMasuk);
        btnDaftar = (Button)findViewById(R.id.btndfr);

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekLogin();
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

    private void cekLogin() {
        email = inpEmail.getText().toString();
        pass =inpPass.getText().toString();

        mAuth.signInWithEmailAndPassword(email,pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(LoginActivity.this,"Login Sukses", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent( LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }else{
                            Toast.makeText(LoginActivity.this,"Login Gagal, Email atau Password Salah", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}