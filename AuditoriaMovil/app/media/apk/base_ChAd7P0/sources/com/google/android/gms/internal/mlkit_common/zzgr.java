package com.google.android.gms.internal.mlkit_common;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
import org.apache.tika.metadata.ClimateForcast;
/* loaded from: classes.dex */
final class zzgr implements InterfaceC1084d {
    static final zzgr zza = new zzgr();
    private static final C1083c zzb;
    private static final C1083c zzc;
    private static final C1083c zzd;
    private static final C1083c zze;
    private static final C1083c zzf;
    private static final C1083c zzg;
    private static final C1083c zzh;
    private static final C1083c zzi;
    private static final C1083c zzj;

    static {
        zzbc e7 = Y.e(1);
        HashMap hashMap = new HashMap();
        hashMap.put(e7.annotationType(), e7);
        zzb = new C1083c("name", Y.n(hashMap));
        zzbc e8 = Y.e(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(e8.annotationType(), e8);
        zzc = new C1083c("version", Y.n(hashMap2));
        zzbc e9 = Y.e(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(e9.annotationType(), e9);
        zzd = new C1083c(ClimateForcast.SOURCE, Y.n(hashMap3));
        zzbc e10 = Y.e(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(e10.annotationType(), e10);
        zze = new C1083c("uri", Y.n(hashMap4));
        zzbc e11 = Y.e(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(e11.annotationType(), e11);
        zzf = new C1083c("hash", Y.n(hashMap5));
        zzbc e12 = Y.e(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(e12.annotationType(), e12);
        zzg = new C1083c("modelType", Y.n(hashMap6));
        zzbc e13 = Y.e(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(e13.annotationType(), e13);
        zzh = new C1083c("size", Y.n(hashMap7));
        zzbc e14 = Y.e(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(e14.annotationType(), e14);
        zzi = new C1083c("hasLabelMap", Y.n(hashMap8));
        zzbc e15 = Y.e(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(e15.annotationType(), e15);
        zzj = new C1083c("isManifestModel", Y.n(hashMap9));
    }

    private zzgr() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznh zznhVar = (zznh) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        interfaceC1085e.add(zzb, zznhVar.zzd());
        interfaceC1085e.add(zzc, (Object) null);
        interfaceC1085e.add(zzd, zznhVar.zzb());
        interfaceC1085e.add(zze, (Object) null);
        interfaceC1085e.add(zzf, zznhVar.zzc());
        interfaceC1085e.add(zzg, zznhVar.zza());
        interfaceC1085e.add(zzh, (Object) null);
        interfaceC1085e.add(zzi, (Object) null);
        interfaceC1085e.add(zzj, (Object) null);
    }
}
