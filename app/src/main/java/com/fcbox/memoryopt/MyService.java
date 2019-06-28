package com.fcbox.memoryopt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * @创建者 000778
 * @创建时间 2019/6/28
 * @描述
 */

public class MyService extends Service {
	@Nullable
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
}
