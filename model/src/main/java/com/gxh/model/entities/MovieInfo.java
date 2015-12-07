package com.gxh.model.entities;/**
 * Created by Administrator on 2015/12/6.
 */

import android.graphics.Bitmap;

import java.io.UnsupportedEncodingException;

/**
 * @author GuanXinHua
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}(影音信息）
 * @email cold279334079@gmail.com
 * @date ${date} ${time}
 */
public class MovieInfo {

    /**
     * play total time
     */
    private int playDuration = 0;

    /**
     * song name
     */
    private String mediaName = "";

    /**
     * album name
     */
    private String mediaAlbum = "";

    /**
     * artist name
     */
    private String mediaArtist = "";

    /**
     * mYear
     */
    private String mediaYear = "";

    /**
     * fileName
     */
    private String mFileName = "";

    /**
     * mFileType
     */
    private String mFileType = "";

    /**
     * mFileSize
     */
    private String mFileSize = "";

    /**
     * mFilePath
     */
    private String mFilePath = "";

    private Bitmap mBitMap = null;

    public Bitmap getmBitMap() {
        return mBitMap;
    }

    public void setmBitMap(Bitmap mBitMap) {
        this.mBitMap = mBitMap;
    }

    public int getPlayDuration() {
        return playDuration;
    }

    public void setPlayDuration(int playDuration) {
        this.playDuration = playDuration;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        try {
            mediaName = new String(mediaName.getBytes("ISO-8859-1"),"GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.mediaName = mediaName;
    }

    public String getMediaAlbum() {
        return mediaAlbum;
    }

    public void setMediaAlbum(String mediaAlbum) {
        try {
            mediaAlbum = new String(mediaAlbum.getBytes("ISO-8859-1"),"GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.mediaAlbum = mediaAlbum;
    }

    public String getMediaArtist() {
        return mediaArtist;
    }

    public void setMediaArtist(String mediaArtist) {
        try {
            mediaArtist = new String(mediaArtist.getBytes("ISO-8859-1"),"GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.mediaArtist = mediaArtist;
    }

    public String getMediaYear() {
        return mediaYear;
    }

    public void setMediaYear(String mediaYear) {
        this.mediaYear = mediaYear;
    }

    public String getmFileName() {
        return mFileName;
    }

    public void setmFileName(String mFileName) {
        this.mFileName = mFileName;
    }

    public String getmFileType() {
        return mFileType;
    }

    public void setmFileType(String mFileType) {
        this.mFileType = mFileType;
    }

    public String getmFileSize() {
        return mFileSize;
    }

    public void setmFileSize(String mFileSize) {
        this.mFileSize = mFileSize;
    }
}
