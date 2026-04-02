package com.google.android.gms.internal.mlkit_common;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzgq implements InterfaceC1084d {
    static final zzgq zza = new zzgq();
    private static final C1083c zzb;
    private static final C1083c zzc;
    private static final C1083c zzd;
    private static final C1083c zze;
    private static final C1083c zzf;
    private static final C1083c zzg;
    private static final C1083c zzh;

    static {
        zzbc e7 = Y.e(1);
        HashMap hashMap = new HashMap();
        hashMap.put(e7.annotationType(), e7);
        zzb = new C1083c("options", Y.n(hashMap));
        zzbc e8 = Y.e(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(e8.annotationType(), e8);
        zzc = new C1083c("roughDownloadDurationMs", Y.n(hashMap2));
        zzbc e9 = Y.e(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(e9.annotationType(), e9);
        zzd = new C1083c("errorCode", Y.n(hashMap3));
        zzbc e10 = Y.e(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(e10.annotationType(), e10);
        zze = new C1083c("exactDownloadDurationMs", Y.n(hashMap4));
        zzbc e11 = Y.e(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(e11.annotationType(), e11);
        zzf = new C1083c("downloadStatus", Y.n(hashMap5));
        zzbc e12 = Y.e(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(e12.annotationType(), e12);
        zzg = new C1083c("downloadFailureStatus", Y.n(hashMap6));
        zzbc e13 = Y.e(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(e13.annotationType(), e13);
        zzh = new C1083c("mddDownloadErrorCodes", Y.n(hashMap7));
    }

    private zzgq() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznc zzncVar = (zznc) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        interfaceC1085e.add(zzb, zzncVar.zzc());
        interfaceC1085e.add(zzc, zzncVar.zzf());
        interfaceC1085e.add(zzd, zzncVar.zza());
        interfaceC1085e.add(zze, zzncVar.zze());
        interfaceC1085e.add(zzf, zzncVar.zzb());
        interfaceC1085e.add(zzg, zzncVar.zzd());
        interfaceC1085e.add(zzh, (Object) null);
    }
}
