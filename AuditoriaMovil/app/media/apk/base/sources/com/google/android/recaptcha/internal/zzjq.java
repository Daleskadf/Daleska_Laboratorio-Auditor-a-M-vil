package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class zzjq {
    public static boolean zza(Collection collection, Iterator it) {
        it.getClass();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= collection.add(it.next());
        }
        return z7;
    }
}
