package com.google.android.gms.internal.cast;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzde extends zzdd {
    public static boolean zza(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
