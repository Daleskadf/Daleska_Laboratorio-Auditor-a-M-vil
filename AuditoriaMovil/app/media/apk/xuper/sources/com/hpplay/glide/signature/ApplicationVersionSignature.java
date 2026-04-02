package com.hpplay.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.hpplay.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class ApplicationVersionSignature {
    private static final ConcurrentHashMap<String, Key> PACKAGE_NAME_TO_KEY = new ConcurrentHashMap<>();

    private ApplicationVersionSignature() {
    }

    public static Key obtain(Context context) {
        String packageName = context.getPackageName();
        ConcurrentHashMap<String, Key> concurrentHashMap = PACKAGE_NAME_TO_KEY;
        Key key = concurrentHashMap.get(packageName);
        if (key == null) {
            Key obtainVersionSignature = obtainVersionSignature(context);
            Key putIfAbsent = concurrentHashMap.putIfAbsent(packageName, obtainVersionSignature);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return obtainVersionSignature;
        }
        return key;
    }

    private static Key obtainVersionSignature(Context context) {
        PackageInfo packageInfo;
        String uuid;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            uuid = String.valueOf(packageInfo.versionCode);
        } else {
            uuid = UUID.randomUUID().toString();
        }
        return new StringSignature(uuid);
    }

    public static void reset() {
        PACKAGE_NAME_TO_KEY.clear();
    }
}
