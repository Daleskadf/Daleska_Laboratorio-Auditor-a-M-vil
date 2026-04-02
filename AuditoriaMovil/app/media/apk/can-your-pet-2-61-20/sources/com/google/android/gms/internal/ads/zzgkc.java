package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgkc extends zzggt {
    private final String zza;
    private final zzgka zzb;
    private final zzggt zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgkc(String str, zzgka zzgkaVar, zzggt zzggtVar, zzgkb zzgkbVar) {
        this.zza = str;
        this.zzb = zzgkaVar;
        this.zzc = zzggtVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgkc) {
            zzgkc zzgkcVar = (zzgkc) obj;
            return zzgkcVar.zzb.equals(this.zzb) && zzgkcVar.zzc.equals(this.zzc) && zzgkcVar.zza.equals(this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgkc.class, this.zza, this.zzb, this.zzc);
    }

    public final String toString() {
        zzggt zzggtVar = this.zzc;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(zzggtVar);
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zza + ", dekParsingStrategy: " + valueOf + ", dekParametersForNewKeys: " + valueOf2 + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return false;
    }

    public final zzggt zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }
}
