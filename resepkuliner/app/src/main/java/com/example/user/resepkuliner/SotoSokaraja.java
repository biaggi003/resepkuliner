package com.example.user.resepkuliner;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class SotoSokaraja extends Activity {
    WebView webView;
    String	myLati="-7.419065";
    String	myLongi="109.221911";
    String myPosisi="Stasiun Purwokerto";


    String	myLati2="-7.427037";
    String	myLongi2="109.226304";
    String myPosisi2="Raja Soto Lama Sokaraja";

    String gambar="";

    Button rute;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.sotosokaraja);


       Button button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?saddr="+myLati+","+myLongi+"&daddr="+myLati2+","+myLongi2));
                // intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);

            }});



        webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/sotosokaraja.html");
        return;
    }

    @Override public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0, 1, 1, "Refresh")
            .setIcon(android.R.drawable.ic_menu_revert);
        menu.add(0, 2, 2, "Exit")
            .setIcon(android.R.drawable.ic_menu_close_clear_cancel);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()) {
        case 1: /* refresh */
            webView.loadUrl("file:///android_asset/sotosokaraja.html");
            break;
    	case 2: /* exit */
            this.finish();
            break;
        }
        return true;
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
        }
        return true;
    }
}
