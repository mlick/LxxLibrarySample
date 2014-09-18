package com.lxx.testdemo;

import mlick.lxxlibrary.activity.BaseActivity;
import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.annotation.view.ViewInject;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class BaseActivitySample extends BaseActivity {

	@ViewInject(id = R.id.textView1)
	TextView textView;

	@Override
	public int getLayoutResID() {
		return R.layout.activity_main2;
	}

	@Override
	public void ViewInJect(BaseActivity baseActivity) {
		FinalActivity.initInjectedView(baseActivity);
	}

	@Override
	public void initValue() {

	}

	@Override
	public void initView() {
		textView.setText("BaseActivitySample test success!!!");
	}

	public void onclick(View view) {
		switch (view.getId()) {
		case R.id.button1:
			startActivity(new Intent(BaseActivitySample.this,
					BaseFragmentActivitySample.class));
			break;

		default:
			break;
		}
	}
}
