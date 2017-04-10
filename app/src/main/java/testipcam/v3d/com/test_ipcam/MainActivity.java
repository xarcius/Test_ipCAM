package testipcam.v3d.com.test_ipcam;


import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

            //WORK

public class MainActivity extends AppCompatActivity{

    WebView browser;
    String url;//s'inserisce l'url

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);//oriento il monitor del cell
        WebView browser = (WebView) findViewById(R.id.id_browser);
        browser.getSettings().setJavaScriptEnabled(true);//attiva JavaScript per la WEBVIEW
        //browser.loadUrl("http://192.168.1.5:8080");
        browser.loadUrl(url);

    }


}


