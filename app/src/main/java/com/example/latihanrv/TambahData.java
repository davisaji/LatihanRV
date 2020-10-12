package com.example.latihanrv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class TambahData extends AppCompatActivity {

    EditText id,nama,alamat,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);
        id = findViewById(R.id.edtid);
        nama = findViewById(R.id.edtNama);
        alamat = findViewById(R.id.edtalamat);
        phone = findViewById(R.id.edtphone);
    }
    public void kembali(View view) {
        //Intent intent = new Intent(TambahData.this, MainActivity.class);
        //startActivity(intent);
        finish();
    }
    public void simpanData(View view) {
        MainActivity.listContact.add(new ModelContact(
                Integer.parseInt(id.getText().toString()),
                nama.getText().toString(),
                phone.getText().toString(),
                alamat.getText().toString()));
        //Intent intent = new Intent(TambahData.this, MainActivity.class);
        //startActivity(intent);
        finish();
    }
}