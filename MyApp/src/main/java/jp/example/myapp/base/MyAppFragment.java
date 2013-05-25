package jp.example.myapp.base;

import jp.example.myapp.MyApp;

import com.actionbarsherlock.app.SherlockFragment;
import com.googlecode.androidannotations.annotations.App;
import com.googlecode.androidannotations.annotations.EFragment;

@EFragment
public class MyAppFragment extends SherlockFragment {
	
	@App
	protected MyApp app;
	
}
