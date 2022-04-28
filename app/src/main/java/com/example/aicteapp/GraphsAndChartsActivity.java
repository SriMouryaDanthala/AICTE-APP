package com.example.aicteapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GraphsAndChartsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphsandcharts);
        WebView webView = (WebView) findViewById(R.id.webGraphsView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(
                "https://facilities.aicte-india.org/dashboard/pages/angulardashboard.php#!/graphs");
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });
    }
}
