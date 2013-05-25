package jp.example.myapp.base;

import jp.example.myapp.MyApp;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.googlecode.androidannotations.annotations.App;
import com.googlecode.androidannotations.annotations.EActivity;

@EActivity
public class MyAppActivity extends SherlockFragmentActivity {
	
	@App
	protected MyApp app;
	
}
