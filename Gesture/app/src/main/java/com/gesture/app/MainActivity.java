package com.gesture.app;
import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    TextView tvSwipDescription,desc;
    View l;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSwipDescription=(TextView) findViewById(R.id.tvDescription);
        desc=(TextView) findViewById(R.id.txt_description);
        l=(View) findViewById(R.id.lay1);
        getSupportActionBar().hide();

        final VideoView videoView =(VideoView)findViewById(R.id.videoView1);
        final MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        final String path = "android.resource://" + getPackageName() + "/" + R.raw.a;
        Uri uri= Uri.parse(path);


        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        initializeView();
        l.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {

            public void onSwipeTop() {
                desc.setText("");
                if(video_num==0) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.a;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                    video_num++;
                }
                else if(video_num==1) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.b;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                    video_num++;
                }
                else if(video_num==2) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.c;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                    video_num++;
                }
                else if(video_num==3) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.d;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                    video_num++;
                }
                else if(video_num==4) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.e;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                    // video_num++;
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"No More Videos PLus",Toast.LENGTH_LONG).show();
                }


            }
            public void onSwipeRight() {
                if(video_num==0)
                {
                    desc.setText("This is description of video 1");
                }
                else if(video_num==1)
                {
                    desc.setText("Video 2 and its Description");
                }
                else if(video_num==2)
                {
                    desc.setText("Another video and its number is 3");
                }
                else if(video_num==3)
                {
                    desc.setText("Video 4 and its description Here is....");
                }
                else if(video_num==4) {
                    desc.setText("This is the description of video");
                }

            }
            public void onSwipeLeft() {
                Toast toast = Toast.makeText(getApplicationContext(), "Subscribed", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 60);
                toast.show();
            }
            public void onSwipeBottom() {
                desc.setText("");
                if(video_num==0) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.a;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                   // video_num--;
                }
                else if(video_num==1) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.b;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                    video_num--;
                }
                else if(video_num==2) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.c;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                    video_num--;
                }
                else if(video_num==3) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.d;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                    video_num--;
                }
                else if(video_num==4) {
                    String path = "android.resource://" + getPackageName() + "/" + R.raw.d;
                    Uri uri = Uri.parse(path);
                    videoView.setVideoURI(uri);
                    videoView.requestFocus();
                    videoView.start();
                    video_num--;
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"No More Videos Minus",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void initializeView() {

    }
}