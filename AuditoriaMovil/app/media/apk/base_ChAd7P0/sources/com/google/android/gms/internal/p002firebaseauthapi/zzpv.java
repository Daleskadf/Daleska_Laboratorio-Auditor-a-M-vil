package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import j$.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzpv {
    private final Class<? extends zzpq> zza;
    private final zzzn zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpv)) {
            return false;
        }
        zzpv zzpvVar = (zzpv) obj;
        if (!zzpvVar.zza.equals(this.zza) || !zzpvVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC0059i.A(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }

    private zzpv(Class<? extends zzpq> cls, zzzn zzznVar) {
        this.zza = cls;
        this.zzb = zzznVar;
    }
}
