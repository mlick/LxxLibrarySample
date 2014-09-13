package com.lxx.testdemo;

import mlick.lxxlibrary.activity.BaseActivity;
import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.annotation.view.ViewInject;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity2 extends BaseActivity {

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
		textView.setText("mainactivtiy2 test success!!!");
	}

}
