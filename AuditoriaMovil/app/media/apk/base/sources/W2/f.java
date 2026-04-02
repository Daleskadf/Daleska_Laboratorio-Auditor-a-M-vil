package W2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import e0.C0927b;
import f3.AbstractC0989b;
import h3.C1080b;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6171a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f6172b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, W2.f] */
    static {
        AtomicBoolean atomicBoolean = i.f6175a;
        f6171a = 12451000;
        f6172b = new Object();
    }

    public static int a(Context context) {
        AtomicBoolean atomicBoolean = i.f6175a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(int i7, Context context, String str) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && AbstractC0989b.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb = new StringBuilder("gcore_");
            sb.append(f6171a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    C0927b a7 = C1080b.a(context);
                    sb.append(((Context) a7.f10587a).getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = sb.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    public int c(Context context) {
        return d(context, f6171a);
    }

    public int d(Context context, int i7) {
        int b5 = i.b(context, i7);
        boolean z7 = true;
        if (b5 != 18) {
            if (b5 == 1) {
                z7 = i.c(context);
            } else {
                z7 = false;
            }
        }
        if (z7) {
            return 18;
        }
        return b5;
    }
}
