package com.lxx.testdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;

public class SwitchButtonActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_swich_buttom);

		((CompoundButton) findViewById(R.id.switch_main_1))
				.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						findViewById(R.id.switch_main_2).setEnabled(isChecked);
						findViewById(R.id.switch_main_3).setEnabled(isChecked);
						findViewById(R.id.switch_main_4).setEnabled(isChecked);
						findViewById(R.id.switch_main_5).setEnabled(isChecked);
						findViewById(R.id.switch_main_6).setEnabled(isChecked);
						findViewById(R.id.switch_main_7).setEnabled(isChecked);
						findViewById(R.id.switch_main_8).setEnabled(isChecked);
					}
				});
	}
}
