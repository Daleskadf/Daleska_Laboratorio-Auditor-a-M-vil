package com.google.android.gms.internal.mlkit_common;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzgk implements InterfaceC1084d {
    static final zzgk zza = new zzgk();
    private static final C1083c zzb;

    static {
        zzbc e7 = Y.e(1);
        HashMap hashMap = new HashMap();
        hashMap.put(e7.annotationType(), e7);
        zzb = new C1083c("api", Y.n(hashMap));
    }

    private zzgk() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((InterfaceC1085e) obj2).add(zzb, ((zzmp) obj).zza());
    }
}
