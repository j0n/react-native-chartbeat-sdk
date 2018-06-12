import { NativeModules, Platform } from 'react-native';

const { HDSDSReactNativeChartbeatSdk } = NativeModules;

const setupTracker = function (accountId, domain) {
  if (Platform.OS === 'android') {
    // accountId need to be an string
    if (typeof accountId === 'string') {
      HDSDSReactNativeChartbeatSdk.setupTracker(accountId, domain);
    }
  } else {
    // accountId need to be an number
    if (typeof accountId === 'number') {
      HDSDSReactNativeChartbeatSdk.setupTracker(accountId, domain);
    } else {
      try {
        const parsedNumber = Number.parseInd(accountId)
        if (Number.isNaN(parsedNumber)) {
          throw new Error('invalid account id');
        }
        HDSDSReactNativeChartbeatSdk.setupTracker(parsedNumber, domain);
      } catch (error) {
        console.error(error);
      }
    }
  }
}

export default {
  setupTracker,
  trackView: HDSDSReactNativeChartbeatSdk.trackView,
  setAuthors: HDSDSReactNativeChartbeatSdk.setAuthors,
  setSections: HDSDSReactNativeChartbeatSdk.setSections,
}
