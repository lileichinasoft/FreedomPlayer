package com.freedomplayer.android.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import com.freedomplayer.android.application.Settings;

import java.io.File;

public class FileExplorerActivity extends AppCompatActivity {

    private Settings mSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (mSetting == null){
            mSetting = new Settings(this);
        }

        String lastDirectory = mSetting.getLastDirectory();
        if(!TextUtils.isEmpty(lastDirectory) && new File(lastDirectory).isDirectory()){

        }
    }

    @Override
    protected void onResume() {
        super.onResume();

    }


    private void doOpenDirectory(String path,boolean addToBackStack){

    }


}
