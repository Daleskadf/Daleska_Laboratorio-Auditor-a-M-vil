package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfse extends zzfsk {
    private final String zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfse(String str, boolean z, boolean z2, zzfsa zzfsaVar, zzfsb zzfsbVar, int i, zzfsd zzfsdVar) {
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsk) {
            zzfsk zzfskVar = (zzfsk) obj;
            if (this.zzb.equals(zzfskVar.zzc())) {
                zzfskVar.zzd();
                zzfskVar.zze();
                zzfskVar.zza();
                zzfskVar.zzb();
                int i = this.zzc;
                int zzf = zzfskVar.zzf();
                if (i == 0) {
                    throw null;
                }
                if (zzf == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        if (this.zzc != 0) {
            return (((((hashCode * 1000003) ^ 1237) * 1000003) ^ 1237) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str = this.zzc != 1 ? "null" : "READ_AND_WRITE";
        String str2 = this.zzb;
        return "FileComplianceOptions{fileOwner=" + str2 + ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfsk
    public final zzfsa zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsk
    public final zzfsb zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsk
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsk
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfsk
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfsk
    public final int zzf() {
        return this.zzc;
    }
}
