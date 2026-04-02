package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import com.umeng.commonsdk.internal.utils.e;
import java.io.File;
/* loaded from: classes3.dex */
public class h {
    public static boolean a() {
        if (b() || c() || d() || e()) {
            return true;
        }
        return false;
    }

    private static boolean b() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        return false;
    }

    private static boolean c() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        try {
            if (new File("/system/app/Kinguser.apk").exists()) {
                return true;
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    private static boolean d() {
        if (new e().a(e.a.check_su_binary) != null) {
            return true;
        }
        return false;
    }

    private static boolean e() {
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i10 = 0; i10 < 12; i10++) {
            String str = strArr[i10];
            if (new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
