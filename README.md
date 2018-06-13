
# react-native-chartbeat-sdk

## Getting started

`$ npm install react-native-react-native-chartbeat-sdk --save`
Add `chartbeat.framework` to you xcode project

### Mostly automatic installation

`$ react-native link react-native-react-native-chartbeat-sdk`

### Manual installation


#### iOS
1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-react-native-chartbeat-sdk` and add `HDSDSReactNativeChartbeatSdk.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libHDSDSReactNativeChartbeatSdk.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.HDSDSReactNativeChartbeatSdkPackage;` to the imports at the top of the file
  - Add `new HDSDSReactNativeChartbeatSdkPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-chartbeat-sdk'
  	project(':react-native-react-native-chartbeat-sdk').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-chartbeat-sdk/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-chartbeat-sdk')
  	```


## Usage
```javascript
import HDSDSReactNativeChartbeatSdk from 'react-native-react-native-chartbeat-sdk';

// TODO: What to do with the module?
HDSDSReactNativeChartbeatSdk;
```
  
