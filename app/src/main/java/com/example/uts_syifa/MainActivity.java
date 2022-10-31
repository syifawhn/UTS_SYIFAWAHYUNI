package com.example.uts_syifa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nama_et, nomor_et;
    CheckBox confirm_cb;
    Button daftar_btn;
    Spinner jalur_sp;

    String Namalengkap, Nomorpendaftaran, Jalurpendaftaran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama_et = findViewById(R.id.nama_et);
        nomor_et = findViewById(R.id.nomor_et);
        daftar_btn = findViewById(R.id.daftar_btn);
        confirm_cb = findViewById(R.id.confirm_cb);
        jalur_sp = findViewById(R.id.jalur_sp);

        daftar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Namalengkap = nama_et.getText().toString();
                Nomorpendaftaran = nomor_et.getText().toString();
                Jalurpendaftaran = jalur_sp.getSelectedItem().toString();

                if (Namalengkap.trim().equals("")){
                    nama_et.setError("Nama Tidak Boleh Kosong");
                }
                else if (Nomorpendaftaran.trim().equals("")){
                    nomor_et.setError("Nomor Pendaftaran Tidak boleh kosong");
                } else{
                    Intent intent = new Intent(MainActivity.this, ActivityMain2.class);
                    intent.putExtra("VarNamaPendaftaran", String.valueOf(Namalengkap));
                    intent.putExtra("VarNomorPendaftaran", String.valueOf(Nomorpendaftaran));
                    intent.putExtra("VarJalurPendaftaran", String.valueOf(Jalurpendaftaran));
                    startActivity(intent);
                }

            }
        });

        confirm_cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (confirm_cb.isChecked()) {
                    Toast.makeText(MainActivity.this, "Terkonfirmasi", Toast.LENGTH_SHORT).show();
                } else if (!confirm_cb.isChecked()){
                    Toast.makeText(MainActivity.this, "Silahkan centang", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}