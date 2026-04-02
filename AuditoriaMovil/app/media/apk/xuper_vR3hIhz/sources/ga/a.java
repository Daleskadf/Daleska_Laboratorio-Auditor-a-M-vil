package ga;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* loaded from: classes3.dex */
public abstract class a {
    public static boolean a(Context context) {
        boolean c10 = c(context);
        boolean b10 = b(context);
        if (!c10 && !b10) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(0);
        if (networkInfo == null) {
            return false;
        }
        return networkInfo.isConnected();
    }

    public static boolean c(Context context) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
        if (networkInfo != null) {
            return networkInfo.isConnected();
        }
        return false;
    }
}
