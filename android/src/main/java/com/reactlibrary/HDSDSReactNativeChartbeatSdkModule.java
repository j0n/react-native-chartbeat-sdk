
package com.reactlibrary;

import android.app.Activity;
import android.app.Application;

import java.util.*;
import java.util.Collection;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
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
  public void setupTracker(String withAccountId, String domain) {
    Tracker.DEBUG_MODE = true;
    Application applicationContext = (Application) reactContext.getApplicationContext();
    Tracker.setupTracker(withAccountId, domain, applicationContext);
  }
  @ReactMethod
  public void trackView(String viewId, String viewTitle) {
    Activity currentActivity = (Activity) reactContext.getCurrentActivity();
    Tracker.trackView(currentActivity, viewId, viewTitle);

  }
  @ReactMethod
  public void setAuthors(ReadableArray authors) {
    ArrayList<Object> arrayListOfAuthors = authors.toArrayList();

    List<String> strings = new ArrayList<>(arrayListOfAuthors.size());
    for (Object object : arrayListOfAuthors) {
      strings.add(object.toString());
    }
    Tracker.setAuthors(strings);
  }
  @ReactMethod
  public void setSections(ReadableArray sections) {
    ArrayList<Object> arrayListOfAuthors = sections.toArrayList();

    List<String> strings = new ArrayList<>(arrayListOfAuthors.size());
    for (Object object : arrayListOfAuthors) {
      strings.add(object.toString());
    }
    Tracker.setSections(strings);
  }

}
