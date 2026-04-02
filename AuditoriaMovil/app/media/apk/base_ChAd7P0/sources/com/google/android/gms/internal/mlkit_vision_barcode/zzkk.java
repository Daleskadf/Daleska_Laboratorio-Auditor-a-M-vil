package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzkk implements InterfaceC1084d {
    static final zzkk zza = new zzkk();
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

    static {
        zzfe g3 = Y.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g3.annotationType(), g3);
        zzb = new C1083c("durationMs", Y.n(hashMap));
        zzfe g4 = Y.g(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g4.annotationType(), g4);
        zzc = new C1083c("errorCode", Y.n(hashMap2));
        zzfe g8 = Y.g(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(g8.annotationType(), g8);
        zzd = new C1083c("isColdCall", Y.n(hashMap3));
        zzfe g9 = Y.g(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(g9.annotationType(), g9);
        zze = new C1083c("autoManageModelOnBackground", Y.n(hashMap4));
        zzfe g10 = Y.g(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(g10.annotationType(), g10);
        zzf = new C1083c("autoManageModelOnLowMemory", Y.n(hashMap5));
        zzfe g11 = Y.g(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(g11.annotationType(), g11);
        zzg = new C1083c("isNnApiEnabled", Y.n(hashMap6));
        zzfe g12 = Y.g(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(g12.annotationType(), g12);
        zzh = new C1083c("eventsCount", Y.n(hashMap7));
        zzfe g13 = Y.g(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(g13.annotationType(), g13);
        zzi = new C1083c("otherErrors", Y.n(hashMap8));
        zzfe g14 = Y.g(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(g14.annotationType(), g14);
        zzj = new C1083c("remoteConfigValueForAcceleration", Y.n(hashMap9));
        zzfe g15 = Y.g(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(g15.annotationType(), g15);
        zzk = new C1083c("isAccelerated", Y.n(hashMap10));
    }

    private zzkk() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqq zzqqVar = (zzqq) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        interfaceC1085e.add(zzb, zzqqVar.zze());
        interfaceC1085e.add(zzc, zzqqVar.zza());
        interfaceC1085e.add(zzd, zzqqVar.zzd());
        interfaceC1085e.add(zze, zzqqVar.zzb());
        interfaceC1085e.add(zzf, zzqqVar.zzc());
        interfaceC1085e.add(zzg, (Object) null);
        interfaceC1085e.add(zzh, (Object) null);
        interfaceC1085e.add(zzi, (Object) null);
        interfaceC1085e.add(zzj, (Object) null);
        interfaceC1085e.add(zzk, (Object) null);
    }
}
