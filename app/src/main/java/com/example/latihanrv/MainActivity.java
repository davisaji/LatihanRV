package com.example.latihanrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterContact.OnContactClickListener{
    public RecyclerView rv;
    public static ArrayList<ModelContact> listContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rvlayout);

        //-----------------------------
        if ( listContact == null ){
            listContact = new ArrayList<>();
            listContact.add(new ModelContact(1,"agus","112","blimbing"));
        }
        //-----------------------------

        AdapterContact AC = new AdapterContact(listContact);
        AC.setListener(this);
        rv.setAdapter(AC);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
    @Override
    public void onClick(View view, int position) {
        ModelContact contact =listContact.get(position);
        Toast.makeText(this,contact.getPhone(), Toast.LENGTH_LONG).show();
    }
    public void tambahData(View view) {
        Intent intent = new Intent(MainActivity.this,TambahData.class);
        startActivity(intent);
        //finish();
    }
}