package com.lxx.testdemo;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import mlick.lxxlibrary.activity.BaseFragmentActivity;
import android.view.Menu;
import android.widget.FrameLayout;

public class BaseFragmentActivitySample extends BaseFragmentActivity {

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
		return R.layout.activity_main;
	}

	@Override
	public void ViewInJect(BaseFragmentActivity baseFragmentActivity) {
		ViewUtils.inject(baseFragmentActivity);
	}

	@Override
	public void initValue() {
//		new TestToast(this, 5000).show();
		ReflectToast rt = new ReflectToast(this);
		rt.show();
		
	}
	
	@Override
	public void initView() {
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.main_fragment, new BaseFragmentSample()).commit();
	}
	
}
