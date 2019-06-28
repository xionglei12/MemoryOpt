package com.fcbox.memoryopt;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * @创建者 000778
 * @创建时间 2019/6/28
 * @描述
 */

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		if(LeakCanary.isInAnalyzerProcess(this)){
			return;
		}
		LeakCanary.install(this);
	}
}
