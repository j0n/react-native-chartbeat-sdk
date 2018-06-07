using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Chartbeat.Sdk.HDSDSReactNativeChartbeatSdk
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class HDSDSReactNativeChartbeatSdkModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="HDSDSReactNativeChartbeatSdkModule"/>.
        /// </summary>
        internal HDSDSReactNativeChartbeatSdkModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "HDSDSReactNativeChartbeatSdk";
            }
        }
    }
}
