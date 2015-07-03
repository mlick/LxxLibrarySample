package com.lxx.testdemo.image;

import mlick.lxxlibrary.activity.BaseActivity;
import mlick.lxxlibrary.adapter.BaseMyBaseAdapter;
import mlick.lxxlibrary.adapter.BaseMyBaseAdapterStr;
import mlick.lxxlibrary.image.custom.SmartImageView;

import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lxx.testdemo.R;
import com.lxx.testdemo.R.layout;
import com.lxx.testdemo.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

public class ImageViewActivity extends BaseActivity {

    @ViewInject(R.id.listView1)
    ListView listView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.image_view, menu);
        return true;
    }

    @Override
    public int getLayoutResID() {
        return R.layout.activity_image_view;
    }

    @Override
    public void ViewInJect(BaseActivity baseActivity) {
        ViewUtils.inject(baseActivity);
    }

    @Override
    public void initValue() {
        String[] picUrls2 = {
                "http://image.tianjimedia.com/uploadImages/2015/134/43/VR8D9G3913M4_1000x500.jpg",
                "http://image.tianjimedia.com/uploadImages/2015/134/42/V3YEA1O64LSG_1000x500.jpg",
                "http://image.tianjimedia.com/uploadImages/2015/134/41/50F8H1LAZB7Y_1000x500.jpg",
                "http://image.tianjimedia.com/uploadImages/2015/134/54/FB68IWS6VWDJ_1000x500.jpg" };
        String[] picUrls = new String[100];
        for (int i = 0; i < 100; i++) {
            picUrls[i] = picUrls2[i%4];
        }
        
        PicAdapter picAdapter = new PicAdapter(this);
        listView.setAdapter(picAdapter);
        picAdapter.setmData(picUrls);
    }

    @Override
    public void initView() {

    }

    class PicAdapter extends BaseMyBaseAdapterStr {

        private SmartImageView iv;
        BitmapUtils bitmapUtils;
        public PicAdapter(Context context) {
            super(context);
            bitmapUtils = new BitmapUtils(context);
        }

        @Override
        public View getMyView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = baseInf.inflate(R.layout.item_image_view, parent, false);
                iv = (SmartImageView) convertView.findViewById(R.id.imageView1);
                convertView.setTag(iv);
            }else {
                iv = (SmartImageView) convertView.getTag();
            }
            iv.setImageUrl(baseData[position]);
//            bitmapUtils.display(iv, baseData[position]);
            return convertView;
        }
    }
}
