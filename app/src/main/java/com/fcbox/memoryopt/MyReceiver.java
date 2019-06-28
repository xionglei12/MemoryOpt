package com.fcbox.memoryopt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * @创建者 000778
 * @创建时间 2019/6/28
 * @描述   BroadcastReceiver不进行取消注册引起内存泄露的实战
 */

public class MyReceiver extends BroadcastReceiver{
	static String TAG = "MyReceiver";
	@Override
	public void onReceive(Context context, Intent intent) {
		//大量的大佬说：这个Context是通过AMS进行的强引用，让我们来look，look!
		if(context instanceof MainActivity){
			Log.d(TAG,"雷哥呀，我就是Activity");
		}else{
			Log.d(TAG,"雷哥呀，我不是Activity,你上当受骗了！");
		}
	}
}
