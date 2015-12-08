package com.freedomplayer.android.content;

import android.database.AbstractCursor;
import android.text.TextUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

    private List<FileItme> mFileList = new ArrayList<>();

    PathCursor(File parentDirectory,File[] fileList){
        if(parentDirectory.getParent()!=null){
            FileItme parentFile = new FileItme(new File(parentDirectory,".."));
            parentFile.isDirectory = true;
        }


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



    private static Set<String> mMediaExtSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

    {
        mMediaExtSet.add("flv");
        mMediaExtSet.add("mp4");
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
            this.isDirectory = file.isDirectory();

            String fileName = file.getName();
            if (!TextUtils.isEmpty(fileName)){
                 int  extPos = fileName.lastIndexOf(".");
                if (extPos >= 0){
                    String ext = fileName.substring(extPos+1);
                    if (!TextUtils.isEmpty(ext) && mMediaExtSet.contains(ext)){
                        this.isVideo = true;
                    }
                }
            }
        }
    }


}
