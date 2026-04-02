package com.google.android.gms.internal.mlkit_vision_common;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzgg implements InterfaceC1084d {
    static final zzgg zza = new zzgg();
    private static final C1083c zzb;
    private static final C1083c zzc;
    private static final C1083c zzd;
    private static final C1083c zze;
    private static final C1083c zzf;

    static {
        zzai i7 = Y.i(1);
        HashMap hashMap = new HashMap();
        hashMap.put(i7.annotationType(), i7);
        zzb = new C1083c("inferenceCommonLogEvent", Y.n(hashMap));
        zzai i8 = Y.i(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i8.annotationType(), i8);
        zzc = new C1083c("smartReplies", Y.n(hashMap2));
        zzai i9 = Y.i(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(i9.annotationType(), i9);
        zzd = new C1083c("resultStatus", Y.n(hashMap3));
        zzai i10 = Y.i(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(i10.annotationType(), i10);
        zze = new C1083c("suggestionsCount", Y.n(hashMap4));
        zzai i11 = Y.i(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(i11.annotationType(), i11);
        zzf = new C1083c("blacklistErrorCode", Y.n(hashMap5));
    }

    private zzgg() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkp zzkpVar = (zzkp) obj;
        InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
        throw null;
    }
}
