package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PerhitunganDasarActivity extends AppCompatActivity {
    private EditText edtNumber1, edtNumber2;
    private Button btnTmbh, btnKali, btnBagi;
    private TextView txvHasil;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_perhitungandasar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);
        btnTmbh = findViewById(R.id.btnTmbh);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        txvHasil = findViewById(R.id.txvHasil);

        btnTmbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, tambah;
                a = Integer.parseInt(edtNumber1.getText().toString());
                b = Integer.parseInt(edtNumber2.getText().toString());
                tambah = a + b;
                txvHasil.setText("Hasil: "+ tambah);
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, kali;
                a = Integer.parseInt(edtNumber1.getText().toString());
                b = Integer.parseInt(edtNumber2.getText().toString());
                kali = a * b;
                txvHasil.setText("Hasil: "+ kali);
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, bagi;
                a = Integer.parseInt(edtNumber1.getText().toString());
                b = Integer.parseInt(edtNumber2.getText().toString());
                bagi = a / b;
                txvHasil.setText("Hasil: "+ bagi);
            }
        });
    }
}