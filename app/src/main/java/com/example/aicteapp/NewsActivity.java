package com.example.aicteapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {
    private WebView webViewNews;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        webViewNews = (WebView) findViewById(R.id.newsLayout);
        webViewNews.getSettings().setJavaScriptEnabled(true);
        webViewNews.loadUrl(
                "https://www.aicte-india.org/news/news-overview");
        webViewNews.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });
    }
}
