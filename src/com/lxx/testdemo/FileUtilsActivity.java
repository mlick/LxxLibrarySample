/**
 * 
 */
package com.lxx.testdemo;

import mlick.lxxlibrary.utils.file.FileUtils;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * @author lixx
 *
 */
public class FileUtilsActivity extends Activity {

    private static String tAG = FileUtilsActivity.class.getName();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String path =  FileUtils.getESDir();
        System.out.println("path is " + path);
        Log.d(tAG, path);
    }

    
}
