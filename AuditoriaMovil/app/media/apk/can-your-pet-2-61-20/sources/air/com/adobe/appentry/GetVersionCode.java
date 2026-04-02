package air.com.adobe.appentry;

import android.os.Build;
/* loaded from: classes.dex */
public class GetVersionCode {
    public static String AIR_BUILD_VERSION = "51.0.1.2";

    public static void main(String[] strArr) {
        System.out.println("51.0.1.2");
    }

    public static String getAbi() {
        return Build.SUPPORTED_ABIS[0];
    }
}
