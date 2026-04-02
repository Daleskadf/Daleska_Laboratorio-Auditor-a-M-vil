package com.google.android.gms.internal.mlkit_vision_common;

import h4.InterfaceC1084d;
import h4.InterfaceC1085e;
import h4.InterfaceC1086f;
import i4.InterfaceC1111b;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzam implements InterfaceC1111b {
    public static final /* synthetic */ int zza = 0;
    private static final InterfaceC1084d zzb = new InterfaceC1084d() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzal
        @Override // h4.InterfaceC1081a
        public final void encode(Object obj, Object obj2) {
            InterfaceC1085e interfaceC1085e = (InterfaceC1085e) obj2;
            int i7 = zzam.zza;
            throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final InterfaceC1084d zze = zzb;

    @Override // i4.InterfaceC1111b
    public final /* bridge */ /* synthetic */ InterfaceC1111b registerEncoder(Class cls, InterfaceC1084d interfaceC1084d) {
        this.zzc.put(cls, interfaceC1084d);
        this.zzd.remove(cls);
        return this;
    }

    public final zzan zza() {
        return new zzan(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    public final /* bridge */ /* synthetic */ InterfaceC1111b registerEncoder(Class cls, InterfaceC1086f interfaceC1086f) {
        this.zzd.put(cls, interfaceC1086f);
        this.zzc.remove(cls);
        return this;
    }
}
