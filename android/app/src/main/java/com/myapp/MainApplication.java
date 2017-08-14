package com.myapp;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.beefe.picker.PickerViewPackage;
import com.keyee.datetime.RCTDateTimePickerPackage;
//import com.microsoft.codepush.react.CodePush;
import com.lwansbrough.RCTCamera.RCTCameraPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {

//    @Override
//    protected String getJSBundleFile() {
//      return CodePush.getJSBundleFile();
//    }

    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new PickerViewPackage(),
//            new CodePush(null, getApplicationContext(), BuildConfig.DEBUG),
            new RCTCameraPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
