package com.lxx.testdemo;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import mlick.lxxlibrary.fragment.BaseFragment;

public class BaseFragmentSample extends BaseFragment {

	@ViewInject(R.id.textView1)
	TextView textView;

	@Override
	public int getLayoutResID() {
		// TODO Auto-generated method stub
		return R.layout.fragment1;
	}

	@Override
	public void initValue() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initView() {
		textView.setText("Fragment test success!");
	}

	@Override
	public void ViewInJect(Fragment baseFragment, View view) {
		ViewUtils.inject(baseFragment, view);
	}

}
