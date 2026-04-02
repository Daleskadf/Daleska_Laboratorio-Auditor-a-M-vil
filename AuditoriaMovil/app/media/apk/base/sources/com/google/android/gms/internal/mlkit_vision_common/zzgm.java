package com.google.android.gms.internal.mlkit_vision_common;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzgm implements InterfaceC1084d {
    static final zzgm zza = new zzgm();
    private static final C1083c zzb;
    private static final C1083c zzc;

    static {
        zzai i7 = Y.i(1);
        HashMap hashMap = new HashMap();
        hashMap.put(i7.annotationType(), i7);
        zzb = new C1083c("errorSpace", Y.n(hashMap));
        zzai i8 = Y.i(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i8.annotationType(), i8);
        zzc = new C1083c("errorCode", Y.n(hashMap2));
    }

    private zzgm() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzku zzkuVar = (zzku) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        throw null;
    }
}
