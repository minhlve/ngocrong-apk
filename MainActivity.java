package com.example.app;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView web = new WebView(this);
        setContentView(web);

        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());

        web.loadUrl("https://your-web-link.netlify.app");
    }
}