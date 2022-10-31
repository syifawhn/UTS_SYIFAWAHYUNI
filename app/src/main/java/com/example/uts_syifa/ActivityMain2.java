package com.example.uts_syifa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class ActivityMain2 extends AppCompatActivity {

    TextView tvNama, tvNomor, tvJalur;
    Spinner jalur_sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tvNama = findViewById(R.id.tvNama);
        tvNomor = findViewById(R.id.tvNomor);
        tvJalur = findViewById(R.id.tvJalur);

        Intent intent = getIntent();

        tvNama.setText(intent.getStringExtra("VarNamaPendaftaran"));
        tvNomor.setText(intent.getStringExtra("VarNomorPendaftaran"));
        tvJalur.setText(intent.getStringExtra("VarJalurPendaftaran"));


    }
}