
#import <React/RCTBridgeModule.h>
// #import "RCTBridge.h"

@interface RCT_EXTERN_MODULE(HDSDSReactNativeChartbeatSdk, NSObject)

RCT_EXTERN_METHOD(setupTracker:(NSNumber *)withAccountId domain:(NSString *))
RCT_EXTERN_METHOD(trackView:(NSString *)viewId title:(NSString *))
RCT_EXTERN_METHOD(setSections:(NSArray *)sections)
RCT_EXTERN_METHOD(setAuthors: (NSArray *)authors)

@end
