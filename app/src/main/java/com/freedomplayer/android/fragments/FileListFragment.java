package com.freedomplayer.android.fragments;/**
 * Created by Administrator on 2015/12/7.
 */

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * @author GuanXinHua
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}(用LoaderManager实现异步加载历史记录)
 * @email cold279334079@gmail.com
 * @date ${date} ${time}
 */
public class FileListFragment extends Fragment implements LoaderManager.LoaderCallbacks {

    private static final String AGR_PATH = "path";

    private TextView mPathView;
    private ListView mFileListView;
    private String mPath;

    @Override
    public Loader onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader loader, Object data) {

    }

    @Override
    public void onLoaderReset(Loader loader) {

    }

    final class VideoAdapter extends SimpleCursorAdapter {

        final class ViewHolder{
            public ImageView iconImageView;
            public TextView nameTextView;
        }

        public VideoAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
            super(context, android.R.layout.simple_expandable_list_item_2, c, from, to, flags);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return super.getView(position, convertView, parent);
        }
    }


}
