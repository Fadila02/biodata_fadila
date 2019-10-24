package com.example.biodata_fadila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtNim = (EditText) findViewById(R.id.edt_nim);
        final EditText edtNama = (EditText) findViewById(R.id.edt_nama);
        final EditText edtKelas = (EditText) findViewById(R.id.edt_kelas);
        final EditText edtTanggal = (EditText) findViewById(R.id.edt_tanggal);

        btSimpan = (Button) findViewById(R.id.btn_simpan);
        btSimpan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_simpan.class);
                intent.putExtra("Nim", edtNim.getText().toString());
                intent.putExtra("Nama", edtNama.getText().toString());
                intent.putExtra("Kelas", edtKelas.getText().toString());
                intent.putExtra("Tanggal Lahir", edtTanggal.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }



}
