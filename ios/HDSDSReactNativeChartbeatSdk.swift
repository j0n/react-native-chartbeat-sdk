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
    
    
    @objc func setupTracker(_ withAccountId: Int32,domain: String) -> Void {
        CBTracker.shared().setupTracker(withAccountId: withAccountId, domain: domain);
    }
    @objc func trackView(_ viewId: String, title: String) -> Void {
        DispatchQueue.main.async(execute: {
            // Handle further UI related operations here....
            //let ad = UIApplication.shared.delegate as! AppDelegate
            //let context = ad.persistentContainer.viewContext
            let rootViewController = UIApplication.shared.delegate?.window??.rootViewController
            let view = rootViewController?.view
            CBTracker.shared().trackView(view, viewId: viewId, title: title)
        })
        
    }
    @objc func setAuthors(_ authors: [String]) -> Void {
        CBTracker.shared().authors = authors;
    }
    @objc func setSections(_ sections: [String]) -> Void {
        CBTracker.shared().sections = sections;
    }
}
