package com.google.android.gms.internal.mlkit_vision_common;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzgb implements InterfaceC1084d {
    static final zzgb zza = new zzgb();
    private static final C1083c zzb;
    private static final C1083c zzc;
    private static final C1083c zzd;
    private static final C1083c zze;
    private static final C1083c zzf;

    static {
        zzai i7 = Y.i(1);
        HashMap hashMap = new HashMap();
        hashMap.put(i7.annotationType(), i7);
        zzb = new C1083c("detectorOptions", Y.n(hashMap));
        zzai i8 = Y.i(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i8.annotationType(), i8);
        zzc = new C1083c("errorCode", Y.n(hashMap2));
        zzai i9 = Y.i(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(i9.annotationType(), i9);
        zzd = new C1083c("totalInitializationMs", Y.n(hashMap3));
        zzai i10 = Y.i(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(i10.annotationType(), i10);
        zze = new C1083c("loggingInitializationMs", Y.n(hashMap4));
        zzai i11 = Y.i(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(i11.annotationType(), i11);
        zzf = new C1083c("otherErrors", Y.n(hashMap5));
    }

    private zzgb() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkj zzkjVar = (zzkj) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        throw null;
    }
}
