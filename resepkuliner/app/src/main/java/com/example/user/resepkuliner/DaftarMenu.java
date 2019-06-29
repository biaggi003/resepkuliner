package com.example.user.resepkuliner;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

public class DaftarMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftarmenu);




        ImageView soto=(ImageView)findViewById(R.id.soto);
        soto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(DaftarMenu.this,SotoSokaraja.class);
                startActivity(i);
            }});


        ImageView btngetuk=(ImageView)findViewById(R.id.getuk);
        btngetuk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(DaftarMenu.this,GetukGoreng.class);
                startActivity(i);
            }});

        ImageView lumpia=(ImageView)findViewById(R.id.lumpia);
        lumpia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(DaftarMenu.this,Lumpia.class);
                startActivity(i);
            }});
    }





    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
        }
        return true;
    }
}