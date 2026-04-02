package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzhl implements InterfaceC1084d {
    static final zzhl zza = new zzhl();
    private static final C1083c zzb;
    private static final C1083c zzc;
    private static final C1083c zzd;
    private static final C1083c zze;
    private static final C1083c zzf;
    private static final C1083c zzg;
    private static final C1083c zzh;

    static {
        zzfe g3 = Y.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g3.annotationType(), g3);
        zzb = new C1083c("errorCode", Y.n(hashMap));
        zzfe g4 = Y.g(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g4.annotationType(), g4);
        zzc = new C1083c("hasResult", Y.n(hashMap2));
        zzfe g8 = Y.g(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(g8.annotationType(), g8);
        zzd = new C1083c("isColdCall", Y.n(hashMap3));
        zzfe g9 = Y.g(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(g9.annotationType(), g9);
        zze = new C1083c("imageInfo", Y.n(hashMap4));
        zzfe g10 = Y.g(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(g10.annotationType(), g10);
        zzf = new C1083c("options", Y.n(hashMap5));
        zzfe g11 = Y.g(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(g11.annotationType(), g11);
        zzg = new C1083c("detectedBarcodeFormats", Y.n(hashMap6));
        zzfe g12 = Y.g(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(g12.annotationType(), g12);
        zzh = new C1083c("detectedBarcodeValueTypes", Y.n(hashMap7));
    }

    private zzhl() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzft zzftVar = (zzft) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        interfaceC1085e.add(zzb, zzftVar.zzc());
        interfaceC1085e.add(zzc, (Object) null);
        interfaceC1085e.add(zzd, zzftVar.zze());
        interfaceC1085e.add(zze, (Object) null);
        interfaceC1085e.add(zzf, zzftVar.zzd());
        interfaceC1085e.add(zzg, zzftVar.zza());
        interfaceC1085e.add(zzh, zzftVar.zzb());
    }
}
