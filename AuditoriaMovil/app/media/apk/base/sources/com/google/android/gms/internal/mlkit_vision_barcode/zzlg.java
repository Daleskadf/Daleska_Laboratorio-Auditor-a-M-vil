package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.datastore.preferences.protobuf.Y;
import h4.C1083c;
import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zzlg implements InterfaceC1084d {
    static final zzlg zza = new zzlg();
    private static final C1083c zzb;

    static {
        zzfe g3 = Y.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g3.annotationType(), g3);
        zzb = new C1083c("errorCode", Y.n(hashMap));
    }

    private zzlg() {
    }

    @Override // h4.InterfaceC1081a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((InterfaceC1085e) obj2).add(zzb, ((zzru) obj).zza());
    }
}
