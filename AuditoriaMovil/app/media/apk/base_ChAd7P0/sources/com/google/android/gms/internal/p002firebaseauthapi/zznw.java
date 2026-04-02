package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznw  reason: invalid package */
/* loaded from: classes.dex */
public final class zznw {
    private final zzbq zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznw)) {
            return false;
        }
        zznw zznwVar = (zznw) obj;
        if (this.zza != zznwVar.zza || this.zzb != zznwVar.zzb || !this.zzc.equals(zznwVar.zzc) || !this.zzd.equals(zznwVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzbq zzbqVar = this.zza;
        int i7 = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        return "(status=" + zzbqVar + ", keyId=" + i7 + ", keyType='" + str + "', keyPrefix='" + str2 + "')";
    }

    public final int zza() {
        return this.zzb;
    }

    private zznw(zzbq zzbqVar, int i7, String str, String str2) {
        this.zza = zzbqVar;
        this.zzb = i7;
        this.zzc = str;
        this.zzd = str2;
    }
}
