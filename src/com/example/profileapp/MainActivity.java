package com.example.profileapp;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
WebView w;
@Override protected void onCreate(Bundle b) {
super.onCreate(b);
w = new WebView(this);
w.getSettings().setJavaScriptEnabled(true);
w.getSettings().setDomStorageEnabled(true);
w.setWebViewClient(new WebViewClient());
setContentView(w);
w.loadUrl("https://thehamzaarshad.github.io");
}
@Override public void onBackPressed() {
if (w.canGoBack()) w.goBack(); else super.onBackPressed();
}
}
