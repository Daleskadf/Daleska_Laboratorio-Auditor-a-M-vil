package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.Objects;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznu  reason: invalid package */
/* loaded from: classes.dex */
public final class zznu {
    private final zznr zza;
    private final List<zznw> zzb;
    private final Integer zzc;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznu)) {
            return false;
        }
        zznu zznuVar = (zznu) obj;
        if (!this.zza.equals(zznuVar.zza) || !this.zzb.equals(zznuVar.zzb) || !Objects.equals(this.zzc, zznuVar.zzc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }

    private zznu(zznr zznrVar, List<zznw> list, Integer num) {
        this.zza = zznrVar;
        this.zzb = list;
        this.zzc = num;
    }
}
