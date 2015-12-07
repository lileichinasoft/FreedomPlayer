package com.freedomplayer.android.content;/**
 * Created by Administrator on 2015/12/7.
 */

import android.database.AbstractCursor;

import java.io.File;

/**
 * @author GuanXinHua
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}()
 * @email cold279334079@gmail.com
 * @date ${date} ${time}
 */
public class PathCursor extends AbstractCursor {

    PathCursor(File parentDirectory,File[] fileList){

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public String[] getColumnNames() {
        return new String[0];
    }

    @Override
    public String getString(int column) {
        return null;
    }

    @Override
    public short getShort(int column) {
        return 0;
    }

    @Override
    public int getInt(int column) {
        return 0;
    }

    @Override
    public long getLong(int column) {
        return 0;
    }

    @Override
    public float getFloat(int column) {
        return 0;
    }

    @Override
    public double getDouble(int column) {
        return 0;
    }

    @Override
    public boolean isNull(int column) {
        return false;
    }


    private class FileItme{

        public File file;
        public boolean isDirectory;
        public boolean isVideo;

        public FileItme(String file) {
            this(new File(file));
        }

        public FileItme(File file) {
            this.file = file;
        }
    }


}
