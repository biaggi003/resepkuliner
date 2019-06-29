package com.example.user.resepkuliner;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

public class Menuutama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);


        ImageView menu=(ImageView)findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(Menuutama.this,DaftarMenu.class);
                startActivity(i);
            }});


        ImageView profil=(ImageView)findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(Menuutama.this,profil.class);
                startActivity(i);
            }});

        final ImageView keluar=(ImageView)findViewById(R.id.keluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Ask the user if they want to quit
                new AlertDialog.Builder(Menuutama.this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Keluar")
                        .setMessage("Keluar Aplikasi ?")
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //Stop the activity
                                Menuutama.this.finish();
                            }

                        })
                        .setNegativeButton("Tidak", null)
                        .show();
            }});

    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //Handle the back button
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            //Ask the user if they want to quit
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Keluar")
                    .setMessage("Keluar Aplikasi ?")
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            //Stop the activity
                            Menuutama.this.finish();
                        }

                    })
                    .setNegativeButton("Tidak", null)
                    .show();

            return true;
        }
        else {
            return super.onKeyDown(keyCode, event);
        }

    }
}
