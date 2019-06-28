package com.fcbox.memoryopt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	private String TAG = this.getClass().getSimpleName();

	/*Handler mHandler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
		}
	};*/
	MyReceiver mMyReceiver ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/**
		 * 广播内存泄露
		 */
	/*	mMyReceiver = new MyReceiver();
		IntentFilter intentFilter = new IntentFilter();
		intentFilter.addAction("fcbox://test");
		registerReceiver(mMyReceiver,intentFilter);

		Intent intent = new Intent("fcbox://test");
		sendBroadcast(intent);*/


		/**
		 *  leakCanary原理
		 */
		//1.弱引用对饮用对象的校验
	/*	String name = "xl";
		WeakReference<String> weakReference = new WeakReference<String>(name);
		String weakResult = weakReference.get();
		Log.d(TAG,"weakResult:"+weakResult);
*/

	}
}
