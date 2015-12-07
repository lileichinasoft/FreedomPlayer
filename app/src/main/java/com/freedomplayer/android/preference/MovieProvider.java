package com.freedomplayer.android.preference;/**
 * Created by Administrator on 2015/12/6.
 */

import android.content.Context;
import android.provider.MediaStore;

import com.gxh.model.entities.MovieInfo;

import java.io.File;

/**
 * @author GuanXinHua
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @email cold279334079@gmail.com
 * @date ${date} ${time}
 */
public class MovieProvider {

    /**
     * context
     */
    private Context mContext;

    /**
     * data path
     */
    private static final String dataPath = "/mnt";

    /**
     * query column
     */
    private static final String[] mCursorCols = new String[]{
            MediaStore.Audio.Media._ID,MediaStore.Audio.Media.DISPLAY_NAME,
            MediaStore.Audio.Media.TITLE,MediaStore.Audio.Media.DURATION,
            MediaStore.Audio.Media.ARTIST, MediaStore.Audio.Media.ALBUM,
            MediaStore.Audio.Media.YEAR, MediaStore.Audio.Media.MIME_TYPE,
            MediaStore.Audio.Media.SIZE, MediaStore.Audio.Media.DATA
    };



    /**
     * MediaInfoProvider
     * @param context
     */
    public MovieProvider(Context context) {
        this.mContext = context;
    }

    /**
     * get the media file info by path
     * @param filePath
     * @return
     */
    public MovieInfo getMovieInfo(String filePath){
        /* check a exit path */
        File file = new File(filePath);
        if (file.exists()){
            
        }
        return ;
    }



}
