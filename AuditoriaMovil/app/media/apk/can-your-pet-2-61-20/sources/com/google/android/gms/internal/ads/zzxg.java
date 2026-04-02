package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzxg implements zzvf, zzve {
    private final zzvf zza;
    private final long zzb;
    private zzve zzc;

    public zzxg(zzvf zzvfVar, long j) {
        this.zza = zzvfVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j, zzmj zzmjVar) {
        long j2 = this.zzb;
        return this.zza.zza(j - j2, zzmjVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j) {
        long j2 = this.zzb;
        return this.zza.zze(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyz[] zzyzVarArr, boolean[] zArr, zzwy[] zzwyVarArr, boolean[] zArr2, long j) {
        zzwy[] zzwyVarArr2 = new zzwy[zzwyVarArr.length];
        int i = 0;
        while (true) {
            zzwy zzwyVar = null;
            if (i >= zzwyVarArr.length) {
                break;
            }
            zzxf zzxfVar = (zzxf) zzwyVarArr[i];
            if (zzxfVar != null) {
                zzwyVar = zzxfVar.zzc();
            }
            zzwyVarArr2[i] = zzwyVar;
            i++;
        }
        long zzf = this.zza.zzf(zzyzVarArr, zArr, zzwyVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzwyVarArr.length; i2++) {
            zzwy zzwyVar2 = zzwyVarArr2[i2];
            if (zzwyVar2 == null) {
                zzwyVarArr[i2] = null;
            } else {
                zzwy zzwyVar3 = zzwyVarArr[i2];
                if (zzwyVar3 == null || ((zzxf) zzwyVar3).zzc() != zzwyVar2) {
                    zzwyVarArr[i2] = new zzxf(zzwyVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ void zzg(zzxa zzxaVar) {
        zzvf zzvfVar = (zzvf) zzxaVar;
        zzve zzveVar = this.zzc;
        zzveVar.getClass();
        zzveVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j) {
        this.zzc = zzveVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final zzvf zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzo(zzlg zzlgVar) {
        long j = zzlgVar.zza;
        long j2 = this.zzb;
        zzle zza = zzlgVar.zza();
        zza.zze(j - j2);
        return this.zza.zzo(zza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzi(zzvf zzvfVar) {
        zzve zzveVar = this.zzc;
        zzveVar.getClass();
        zzveVar.zzi(this);
    }
}
