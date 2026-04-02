package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzcb {
    private static final CopyOnWriteArrayList<zzcc> zza = new CopyOnWriteArrayList<>();

    public static zzcc zza(String str) {
        Iterator<zzcc> it = zza.iterator();
        while (it.hasNext()) {
            zzcc next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(b.h("No KMS client does support: ", str));
    }
}
