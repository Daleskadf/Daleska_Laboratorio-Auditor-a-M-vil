package com.google.android.gms.internal.mlkit_common;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzkh implements InterfaceC1084d {
    static final zzkh zza = new zzkh();
    private static final C1083c zzb;
    private static final C1083c zzc;
    private static final C1083c zzd;
    private static final C1083c zze;
    private static final C1083c zzf;
    private static final C1083c zzg;
    private static final C1083c zzh;
    private static final C1083c zzi;
    private static final C1083c zzj;
    private static final C1083c zzk;
    private static final C1083c zzl;
    private static final C1083c zzm;
    private static final C1083c zzn;
    private static final C1083c zzo;

    static {
        zzbc e7 = Y.e(1);
        HashMap hashMap = new HashMap();
        hashMap.put(e7.annotationType(), e7);
        zzb = new C1083c("appId", Y.n(hashMap));
        zzbc e8 = Y.e(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(e8.annotationType(), e8);
        zzc = new C1083c("appVersion", Y.n(hashMap2));
        zzbc e9 = Y.e(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(e9.annotationType(), e9);
        zzd = new C1083c("firebaseProjectId", Y.n(hashMap3));
        zzbc e10 = Y.e(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(e10.annotationType(), e10);
        zze = new C1083c("mlSdkVersion", Y.n(hashMap4));
        zzbc e11 = Y.e(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(e11.annotationType(), e11);
        zzf = new C1083c("tfliteSchemaVersion", Y.n(hashMap5));
        zzbc e12 = Y.e(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(e12.annotationType(), e12);
        zzg = new C1083c("gcmSenderId", Y.n(hashMap6));
        zzbc e13 = Y.e(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(e13.annotationType(), e13);
        zzh = new C1083c("apiKey", Y.n(hashMap7));
        zzbc e14 = Y.e(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(e14.annotationType(), e14);
        zzi = new C1083c("languages", Y.n(hashMap8));
        zzbc e15 = Y.e(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(e15.annotationType(), e15);
        zzj = new C1083c("mlSdkInstanceId", Y.n(hashMap9));
        zzbc e16 = Y.e(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(e16.annotationType(), e16);
        zzk = new C1083c("isClearcutClient", Y.n(hashMap10));
        zzbc e17 = Y.e(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(e17.annotationType(), e17);
        zzl = new C1083c("isStandaloneMlkit", Y.n(hashMap11));
        zzbc e18 = Y.e(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(e18.annotationType(), e18);
        zzm = new C1083c("isJsonLogging", Y.n(hashMap12));
        zzbc e19 = Y.e(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(e19.annotationType(), e19);
        zzn = new C1083c("buildLevel", Y.n(hashMap13));
        zzbc e20 = Y.e(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(e20.annotationType(), e20);
        zzo = new C1083c("optionalModuleVersion", Y.n(hashMap14));
    }

    private zzkh() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqv zzqvVar = (zzqv) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        interfaceC1085e.add(zzb, zzqvVar.zzg());
        interfaceC1085e.add(zzc, zzqvVar.zzh());
        interfaceC1085e.add(zzd, (Object) null);
        interfaceC1085e.add(zze, zzqvVar.zzj());
        interfaceC1085e.add(zzf, zzqvVar.zzk());
        interfaceC1085e.add(zzg, (Object) null);
        interfaceC1085e.add(zzh, (Object) null);
        interfaceC1085e.add(zzi, zzqvVar.zza());
        interfaceC1085e.add(zzj, zzqvVar.zzi());
        interfaceC1085e.add(zzk, zzqvVar.zzb());
        interfaceC1085e.add(zzl, zzqvVar.zzd());
        interfaceC1085e.add(zzm, zzqvVar.zzc());
        interfaceC1085e.add(zzn, zzqvVar.zze());
        interfaceC1085e.add(zzo, zzqvVar.zzf());
    }
}
