package com.lxx.testdemo;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import mlick.lxxlibrary.activity.BaseFragmentActivity;
import android.view.Menu;
import android.widget.FrameLayout;

public class MainActivity extends BaseFragmentActivity {

	@ViewInject(R.id.main_fragment)
	FrameLayout f;

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public int getLayoutResID() {
		// TODO Auto-generated method stub
		return R.layout.activity_main;
	}

	@Override
	public void ViewInJect(BaseFragmentActivity baseFragmentActivity) {
		ViewUtils.inject(baseFragmentActivity);
	}

	@Override
	public void initValue() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initView() {
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.main_fragment, new Fragment1()).commit();
	}

}
