package com.google.android.gms.internal.mlkit_vision_common;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
import org.apache.tika.metadata.ClimateForcast;
/* loaded from: classes.dex */
final class zzeq implements InterfaceC1084d {
    static final zzeq zza = new zzeq();
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
        zzai i7 = Y.i(1);
        HashMap hashMap = new HashMap();
        hashMap.put(i7.annotationType(), i7);
        zzb = new C1083c("name", Y.n(hashMap));
        zzai i8 = Y.i(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i8.annotationType(), i8);
        zzc = new C1083c("version", Y.n(hashMap2));
        zzai i9 = Y.i(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(i9.annotationType(), i9);
        zzd = new C1083c(ClimateForcast.SOURCE, Y.n(hashMap3));
        zzai i10 = Y.i(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(i10.annotationType(), i10);
        zze = new C1083c("uri", Y.n(hashMap4));
        zzai i11 = Y.i(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(i11.annotationType(), i11);
        zzf = new C1083c("hash", Y.n(hashMap5));
        zzai i12 = Y.i(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(i12.annotationType(), i12);
        zzg = new C1083c("modelType", Y.n(hashMap6));
        zzai i13 = Y.i(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(i13.annotationType(), i13);
        zzh = new C1083c("size", Y.n(hashMap7));
        zzai i14 = Y.i(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(i14.annotationType(), i14);
        zzi = new C1083c("hasLabelMap", Y.n(hashMap8));
        zzai i15 = Y.i(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(i15.annotationType(), i15);
        zzj = new C1083c("isManifestModel", Y.n(hashMap9));
    }

    private zzeq() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzja zzjaVar = (zzja) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        throw null;
    }
}
