package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzon implements InterfaceC1084d {
    static final zzon zza = new zzon();
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
        zzfe g3 = Y.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g3.annotationType(), g3);
        zzb = new C1083c("appId", Y.n(hashMap));
        zzfe g4 = Y.g(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g4.annotationType(), g4);
        zzc = new C1083c("appVersion", Y.n(hashMap2));
        zzfe g8 = Y.g(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(g8.annotationType(), g8);
        zzd = new C1083c("firebaseProjectId", Y.n(hashMap3));
        zzfe g9 = Y.g(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(g9.annotationType(), g9);
        zze = new C1083c("mlSdkVersion", Y.n(hashMap4));
        zzfe g10 = Y.g(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(g10.annotationType(), g10);
        zzf = new C1083c("tfliteSchemaVersion", Y.n(hashMap5));
        zzfe g11 = Y.g(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(g11.annotationType(), g11);
        zzg = new C1083c("gcmSenderId", Y.n(hashMap6));
        zzfe g12 = Y.g(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(g12.annotationType(), g12);
        zzh = new C1083c("apiKey", Y.n(hashMap7));
        zzfe g13 = Y.g(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(g13.annotationType(), g13);
        zzi = new C1083c("languages", Y.n(hashMap8));
        zzfe g14 = Y.g(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(g14.annotationType(), g14);
        zzj = new C1083c("mlSdkInstanceId", Y.n(hashMap9));
        zzfe g15 = Y.g(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(g15.annotationType(), g15);
        zzk = new C1083c("isClearcutClient", Y.n(hashMap10));
        zzfe g16 = Y.g(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(g16.annotationType(), g16);
        zzl = new C1083c("isStandaloneMlkit", Y.n(hashMap11));
        zzfe g17 = Y.g(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(g17.annotationType(), g17);
        zzm = new C1083c("isJsonLogging", Y.n(hashMap12));
        zzfe g18 = Y.g(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(g18.annotationType(), g18);
        zzn = new C1083c("buildLevel", Y.n(hashMap13));
        zzfe g19 = Y.g(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(g19.annotationType(), g19);
        zzo = new C1083c("optionalModuleVersion", Y.n(hashMap14));
    }

    private zzon() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzvd zzvdVar = (zzvd) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        interfaceC1085e.add(zzb, zzvdVar.zzg());
        interfaceC1085e.add(zzc, zzvdVar.zzh());
        interfaceC1085e.add(zzd, (Object) null);
        interfaceC1085e.add(zze, zzvdVar.zzj());
        interfaceC1085e.add(zzf, zzvdVar.zzk());
        interfaceC1085e.add(zzg, (Object) null);
        interfaceC1085e.add(zzh, (Object) null);
        interfaceC1085e.add(zzi, zzvdVar.zza());
        interfaceC1085e.add(zzj, zzvdVar.zzi());
        interfaceC1085e.add(zzk, zzvdVar.zzb());
        interfaceC1085e.add(zzl, zzvdVar.zzd());
        interfaceC1085e.add(zzm, zzvdVar.zzc());
        interfaceC1085e.add(zzn, zzvdVar.zze());
        interfaceC1085e.add(zzo, zzvdVar.zzf());
    }
}
