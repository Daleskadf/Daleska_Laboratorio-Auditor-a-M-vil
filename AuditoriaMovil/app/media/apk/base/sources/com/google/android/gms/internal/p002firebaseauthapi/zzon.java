package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzon  reason: invalid package */
/* loaded from: classes.dex */
public final class zzon {
    private static zzon zza = new zzon();
    private final AtomicReference<zzpc> zzb = new AtomicReference<>(zzpc.zza().zza());

    public static zzon zza() {
        return zza;
    }

    public final <WrapperPrimitiveT> Class<?> zza(Class<WrapperPrimitiveT> cls) {
        return this.zzb.get().zza((Class<?>) cls);
    }

    public final <KeyT extends zzbo, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.zzb.get().zza((zzpc) keyt, (Class<Object>) cls);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzpg<InputPrimitiveT> zzpgVar, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.zzb.get().zza(zzpgVar, cls);
    }

    public final synchronized <KeyT extends zzbo, PrimitiveT> void zza(zzoy<KeyT, PrimitiveT> zzoyVar) {
        this.zzb.set(zzpc.zza(this.zzb.get()).zza(zzoyVar).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzpk<InputPrimitiveT, WrapperPrimitiveT> zzpkVar) {
        this.zzb.set(zzpc.zza(this.zzb.get()).zza(zzpkVar).zza());
    }
}
