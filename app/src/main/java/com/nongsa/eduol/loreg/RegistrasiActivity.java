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

public class RegistrasiActivity extends AppCompatActivity {

    Button btnmasuk, btnDaftar;
    EditText emailreg, passReg1, passReg2;
    private FirebaseAuth mAuth;
    String email,pass1,pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        mAuth = FirebaseAuth.getInstance();

        btnmasuk = (Button)findViewById(R.id.btnmsk);
        btnDaftar = (Button)findViewById(R.id.btndaftar);

        emailreg = findViewById(R.id.regEmail);
        passReg1 = findViewById(R.id.regPass1);
        passReg2 = findViewById(R.id.regpass2);

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
                daftar();
            }
        });
    }

    private void daftar() {
        email = emailreg.getText().toString();
        pass1 = passReg1.getText().toString();
        pass2 = passReg2.getText().toString();

        if (pass1.equals(pass2)){
            mAuth.createUserWithEmailAndPassword(email,pass1)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RegistrasiActivity.this,"Registrasi Sukses", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent( RegistrasiActivity.this, LoginActivity.class);
                            startActivity(intent);
                            finish();
                        }else{
                            Toast.makeText(RegistrasiActivity.this,"Registrasi Gagal, Cek Kembali Email dan Password anda", Toast.LENGTH_LONG).show();
                        }
                    }
                });
        }else {
            Toast.makeText(RegistrasiActivity.this,"Registrasi Gagal, Cek Kembali Email dan Password anda", Toast.LENGTH_LONG).show();
        }

    }
}