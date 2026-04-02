package com.google.android.gms.internal.mlkit_common;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzgs implements InterfaceC1084d {
    static final zzgs zza = new zzgs();
    private static final C1083c zzb;
    private static final C1083c zzc;
    private static final C1083c zzd;
    private static final C1083c zze;

    static {
        zzbc e7 = Y.e(1);
        HashMap hashMap = new HashMap();
        hashMap.put(e7.annotationType(), e7);
        zzb = new C1083c("modelInfo", Y.n(hashMap));
        zzbc e8 = Y.e(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(e8.annotationType(), e8);
        zzc = new C1083c("initialDownloadConditions", Y.n(hashMap2));
        zzbc e9 = Y.e(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(e9.annotationType(), e9);
        zzd = new C1083c("updateDownloadConditions", Y.n(hashMap3));
        zzbc e10 = Y.e(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(e10.annotationType(), e10);
        zze = new C1083c("isModelUpdateEnabled", Y.n(hashMap4));
    }

    private zzgs() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        interfaceC1085e.add(zzb, ((zznl) obj).zza());
        interfaceC1085e.add(zzc, (Object) null);
        interfaceC1085e.add(zzd, (Object) null);
        interfaceC1085e.add(zze, (Object) null);
    }
}
