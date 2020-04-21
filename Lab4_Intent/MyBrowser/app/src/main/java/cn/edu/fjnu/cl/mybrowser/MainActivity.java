package cn.edu.fjnu.cl.mybrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        URL url=null;
        Uri data=intent.getData();
        try {
            url=new URL(data.getScheme(),data.getHost(),data.getPath());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Mybrowser(url);
    }
    private void Mybrowser(URL url){
        WebView webview=(WebView)findViewById(R.id.wbv);
        webview.loadUrl(url.toString());
        webview.setWebViewClient(new  WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

    }
}
