package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
import j$.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznp  reason: invalid package */
/* loaded from: classes.dex */
public final class zznp extends zzcg {
    private final zzpm zza;

    public zznp(zzpm zzpmVar) {
        this.zza = zzpmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznp)) {
            return false;
        }
        zzpm zzpmVar = ((zznp) obj).zza;
        if (!this.zza.zza().zzd().equals(zzpmVar.zza().zzd()) || !this.zza.zza().zzf().equals(zzpmVar.zza().zzf()) || !this.zza.zza().zze().equals(zzpmVar.zza().zze())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        String str;
        String zzf = this.zza.zza().zzf();
        int i7 = zzno.zza[this.zza.zza().zzd().ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        return b.j("(typeUrl=", zzf, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zza.zza().zzd() != zzxd.RAW) {
            return true;
        }
        return false;
    }

    public final zzpm zzb() {
        return this.zza;
    }
}
