package com.freedomplayer.android.activities;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


import com.freedomplayer.R;
import com.freedomplayer.android.application.Settings;
import com.freedomplayer.android.widget.media.IjkVideoView;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;


public class PlayActivity extends AppCompatActivity {

//    //手势探测器
//    private GestureDetector mGestureDetector = new GestureDetector(new GestureDetector.SimpleOnGestureListener(){
//
//        @Override
//        public boolean onSingleTapConfirmed(MotionEvent e) {
//            toggleinfo();
//            return super.onSingleTapConfirmed(e);
//        }
//    });
//
//    private void toggleinfo() {
////        findViewById(R.id.)
//    }


    Button playButton ;
    IjkVideoView videoView ;
    EditText rtspUrl ;
    RadioButton radioStream;
    RadioButton radioFile;
    Settings mSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        init();


        playButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(radioStream.isChecked()){
                    playRtspStream(rtspUrl.getEditableText().toString());
                }else if(radioFile.isChecked()){
                    playRtspFile(rtspUrl.getEditableText().toString());
                }
            }
        });


    }


    private void init(){

        mSettings = new Settings(this);

        IjkMediaPlayer.loadLibrariesOnce(null);
        IjkMediaPlayer.native_profileBegin("libijkplayer.so");

        rtspUrl = (EditText)this.findViewById(R.id.url);
        playButton = (Button)this.findViewById(R.id.start_play);
        radioStream = (RadioButton)this.findViewById(R.id.radioButtonStream);
        radioFile = (RadioButton)this.findViewById(R.id.radioButtonFile);
        videoView = (IjkVideoView)this.findViewById(R.id.rtsp_player);




    }



    //play rtsp stream
    private void playRtspStream(String rtspUrl){
        videoView.setVideoURI(Uri.parse(rtspUrl));
        videoView.requestFocus();
        videoView.start();
    }


    private void playRtspFile(String filePath){
        videoView.setVideoPath(Environment.getExternalStorageDirectory() + "/" + filePath);
        videoView.requestFocus();
        videoView.start();
    }

}
