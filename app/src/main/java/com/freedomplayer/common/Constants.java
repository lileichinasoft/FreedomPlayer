package com.freedomplayer.common;/**
 * Created by Administrator on 2015/12/8.
 */

import android.provider.BaseColumns;

/**
 * @author GuanXinHua
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @email cold279334079@gmail.com
 * @date ${date} ${time}
 */
public class Constants {

    public static final String CN_ID = BaseColumns._ID;
    public static final String CN_FILE_NAME = "file_name";
    public static final String CN_FILE_PATH = "file_path";
    public static final String CN_FILE_DIRECTORY = "file_directory";
    public static final String CN_IS_VIEW = "is_view";
    public static final String[] columnNames = new String[]{CN_ID,CN_FILE_DIRECTORY,CN_FILE_NAME,CN_FILE_PATH,CN_IS_VIEW};
    public static final int CI_ID = 0;
    public static final int CI_FILE_NAME = 1;
    public static final int CI_FILE_PATH = 2;
    public static final int CI_IS_DIRECTORY = 3;
    public static final int CI_IS_VIDEO = 4;


}
