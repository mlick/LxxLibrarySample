package com.lxx.testdemo;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class TestToast extends Toast {

	private int duration;

	public TestToast(Context context) {
		super(context);
		this.duration = Toast.LENGTH_SHORT;
	}

	public TestToast(Context context, int duration) {
		super(context);
		this.duration = duration;
		setView(getView());
	}

	@Override
	public void setDuration(int duration) {
		duration = this.duration;
	}
}
