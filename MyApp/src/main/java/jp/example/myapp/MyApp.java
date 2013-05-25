package jp.example.myapp;

import android.app.Application;
import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

import com.googlecode.androidannotations.annotations.EApplication;

@EApplication
@ReportsCrashes(formKey = "", formUri = "")
public class MyApp extends Application {

	@Override
	public void onCreate() {
		ACRA.init(this);
		super.onCreate();
	}

}
