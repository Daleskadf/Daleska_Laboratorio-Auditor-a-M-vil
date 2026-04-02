package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import j$.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpu  reason: invalid package */
/* loaded from: classes.dex */
public final class zzpu {
    private final Class<?> zza;
    private final Class<? extends zzpq> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpu)) {
            return false;
        }
        zzpu zzpuVar = (zzpu) obj;
        if (!zzpuVar.zza.equals(this.zza) || !zzpuVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC0059i.A(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }

    private zzpu(Class<?> cls, Class<? extends zzpq> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
