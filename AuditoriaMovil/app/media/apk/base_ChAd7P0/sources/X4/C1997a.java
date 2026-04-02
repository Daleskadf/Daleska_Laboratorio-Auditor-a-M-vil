package x4;

import X.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.libraries.barhopper.RecognitionOptions;
import k4.C1395a;
import k4.InterfaceC1396b;
/* renamed from: x4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1997a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16501a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f16502b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1396b f16503c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16504d;

    public C1997a(Context context, String str, InterfaceC1396b interfaceC1396b) {
        boolean a7;
        context = Build.VERSION.SDK_INT >= 24 ? d.createDeviceProtectedStorageContext(context) : context;
        this.f16501a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f16502b = sharedPreferences;
        this.f16503c = interfaceC1396b;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            a7 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            a7 = a();
        }
        this.f16504d = a7;
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f16501a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z7) {
        if (this.f16504d != z7) {
            this.f16504d = z7;
            this.f16503c.a(new C1395a(new U3.b(0)));
        }
    }
}
