
package com.reactlibrary;

import android.app.Activity;
import android.app.Application;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.chartbeat.androidsdk.Tracker;

public class HDSDSReactNativeChartbeatSdkModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public HDSDSReactNativeChartbeatSdkModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "HDSDSReactNativeChartbeatSdk";
  }

  @ReactMethod
  public void setupTracker(int withAccountId, String domain) {
    Application applicationContext = (Application) reactContext.getApplicationContext();
    Log.w("myApp", "no network");
    Tracker.setupTracker("54876", "androidsdktest.chartbeat.com", applicationContext);
  }
  public void trackView(String viewId, String viewTitle) {
    Activity currentActivity = (Activity) reactContext.getCurrentActivity();
    Tracker.trackView(currentActivity, viewId, viewTitle);
    /*
            msv.getScrollPosition(),
            msv.getContentHeight(),
            msv.getViewHeight(),
            msv.getWidth());
            */
  }
  public void setAuthors(String[] authors) {
    Tracker.authors = authors;
  }
  public void setSections(String[] sections) {
    Tracker.sections = sections;
  }

}