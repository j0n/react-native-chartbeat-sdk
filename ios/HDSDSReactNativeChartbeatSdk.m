
#import <React/RCTBridgeModule.h>
// #import "RCTBridge.h"

@interface RCT_EXTERN_MODULE(HDSDSReactNativeChartbeatSdk, NSObject)

RCT_EXTERN_METHOD(setupTracker:(NSNumber *)withAccountId domain:(NSString *)domain)
RCT_EXTERN_METHOD(trackView:(NSString *)view (NSString *)viewId (NSString *)title)

@end
