package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzkg implements InterfaceC1084d {
    static final zzkg zza = new zzkg();
    private static final C1083c zzb;
    private static final C1083c zzc;
    private static final C1083c zzd;
    private static final C1083c zze;

    static {
        zzfe g3 = Y.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g3.annotationType(), g3);
        zzb = new C1083c("imageFormat", Y.n(hashMap));
        zzfe g4 = Y.g(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g4.annotationType(), g4);
        zzc = new C1083c("originalImageSize", Y.n(hashMap2));
        zzfe g8 = Y.g(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(g8.annotationType(), g8);
        zzd = new C1083c("compressedImageSize", Y.n(hashMap3));
        zzfe g9 = Y.g(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(g9.annotationType(), g9);
        zze = new C1083c("isOdmlImage", Y.n(hashMap4));
    }

    private zzkg() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqk zzqkVar = (zzqk) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        interfaceC1085e.add(zzb, zzqkVar.zza());
        interfaceC1085e.add(zzc, zzqkVar.zzb());
        interfaceC1085e.add(zzd, (Object) null);
        interfaceC1085e.add(zze, (Object) null);
    }
}
