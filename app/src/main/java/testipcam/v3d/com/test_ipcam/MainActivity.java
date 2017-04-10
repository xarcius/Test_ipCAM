package testipcam.v3d.com.test_ipcam;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.StandaloneActionMode;
import android.util.Base64;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;



import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

/*
public class MainActivity extends AppCompatActivity implements MediaPlayer.OnPreparedListener, SurfaceHolder.Callback {

    final static String USERNAME = "admin";
    final static String PASSWORD = "camera";
    final static String RTSP_URL = "http://192.168.1.5:8080/browserfs.html";

    private MediaPlayer _mediaplayer;
    private SurfaceHolder _surfaceHolder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        window.setBackgroundDrawableResource(android.R.color.black);


        setContentView(R.layout.activity_main);

        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.surfaceView);
        _surfaceHolder = surfaceView.getHolder();
        _surfaceHolder.addCallback(this);
        _surfaceHolder.setFixedSize(320,480);
    }

    public void surfaceChanged(SurfaceHolder sh, int f, int w, int h){

    }

    public void surfaceCreated(SurfaceHolder sh){
        _mediaplayer = new MediaPlayer();
        _mediaplayer.setDisplay(_surfaceHolder);

        Context context = getApplicationContext();
        Map<String, String> headers = getRtspHeaders();
        Uri source = Uri.parse(RTSP_URL);


        try{
            _mediaplayer.setDataSource(context, source, headers);
            _mediaplayer.setOnPreparedListener(this);
            _mediaplayer.prepareAsync();
        }catch (Exception e){

        }
    }

    public void surfaceDestroyed(SurfaceHolder sh){
        _mediaplayer.release();
    }

    private Map <String, String> getRtspHeaders(){
        Map<String, String> headers = new HashMap<String, String>();
        String basicAuthValue = getBasicAuthValue(USERNAME, PASSWORD);
        headers.put("Authorization", basicAuthValue);
        return headers;
    }

    private String getBasicAuthValue(String username, String password) {
        String credentials = username + ":" + password;
        int flags = Base64.URL_SAFE | Base64.NO_WRAP;
        byte[] bytes = credentials.getBytes();
        return "Basic " + Base64.encodeToString(bytes, flags);
    }

    public void onPrepared(MediaPlayer mp){
        _mediaplayer.start();
    }

}
*/

public class MainActivity extends AppCompatActivity{


    WebView browser;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);

        WebView browser = (WebView) findViewById(R.id.id_browser);

        browser.loadUrl("http://192.168.1.5:8080");

    }


}


