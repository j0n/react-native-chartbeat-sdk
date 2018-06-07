//
//  HDSDSReactNativeChartbeatSdk.swift
//  HDSDSReactNativeChartbeatSdk
//
//  Created by jon on 2018-06-07.
//  Copyright © 2018 Facebook. All rights reserved.
//

import Foundation

class CBhelper {
    func yo() {
        CBTracker.shared().setupTracker(withAccountId: 1234, domain:"yoursite.com");
    }
}
let test = CBhelper()
// test.yo();

@objc(HDSDSReactNativeChartbeatSdk)
class HDSDSReactNativeChartbeatSdk: NSObject {
    
    
    @objc func setupTracker(withAccountId: Int32,domain: String) -> Void {
        CBTracker.shared().setupTracker(withAccountId: withAccountId, domain: domain);
    }
    @objc func trackView(view: NSString, viewId: String, title: String) -> Void {
        CBTracker.shared().trackView(view, viewId: viewId, title: title)
    }
    
}
