package W;

import B5.AbstractActivityC0032e;
import D.AbstractC0059i;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
/* renamed from: W.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0359b extends X.d {
    public static void a(Activity activity, String[] strArr, int i7) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (!TextUtils.isEmpty(strArr[i8])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i8));
                }
            } else {
                throw new IllegalArgumentException(AbstractC0059i.D(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        if (activity instanceof InterfaceC0358a) {
            ((InterfaceC0358a) activity).getClass();
        }
        activity.requestPermissions(strArr, i7);
    }

    public static boolean b(AbstractActivityC0032e abstractActivityC0032e, String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i7 >= 32) {
            return abstractActivityC0032e.shouldShowRequestPermissionRationale(str);
        }
        if (i7 == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(abstractActivityC0032e.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return abstractActivityC0032e.shouldShowRequestPermissionRationale(str);
            }
        }
        return abstractActivityC0032e.shouldShowRequestPermissionRationale(str);
    }
}
