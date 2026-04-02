package e5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C0765n;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0765n f10890a = new C0765n("CommonUtils", StringUtils.EMPTY);

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e7) {
            String concat = "Exception thrown when trying to get app version ".concat(e7.toString());
            C0765n c0765n = f10890a;
            if (Log.isLoggable(c0765n.f9383a, 6)) {
                Log.e("CommonUtils", c0765n.c(concat));
            }
            return StringUtils.EMPTY;
        }
    }
}
