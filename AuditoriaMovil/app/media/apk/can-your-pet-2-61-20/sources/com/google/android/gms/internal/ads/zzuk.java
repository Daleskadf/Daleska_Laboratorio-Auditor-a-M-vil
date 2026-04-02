package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzuk implements zzwy {
    public final zzwy zza;
    final /* synthetic */ zzul zzb;
    private boolean zzc;

    public zzuk(zzul zzulVar, zzwy zzwyVar) {
        this.zzb = zzulVar;
        this.zza = zzwyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final int zza(zzlb zzlbVar, zzih zzihVar, int i) {
        zzul zzulVar = this.zzb;
        if (zzulVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzihVar.zzc(4);
            return -4;
        }
        long zzb = zzulVar.zzb();
        int zza = this.zza.zza(zzlbVar, zzihVar, i);
        if (zza != -5) {
            long j = this.zzb.zzb;
            if (j == Long.MIN_VALUE || ((zza != -4 || zzihVar.zze < j) && !(zza == -3 && zzb == Long.MIN_VALUE && !zzihVar.zzd))) {
                return zza;
            }
            zzihVar.zzb();
            zzihVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzam zzamVar = zzlbVar.zza;
        zzamVar.getClass();
        int i2 = zzamVar.zzC;
        if (i2 == 0) {
            if (zzamVar.zzD != 0) {
                i2 = 0;
            }
            return -5;
        }
        int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzamVar.zzD : 0;
        zzak zzb2 = zzamVar.zzb();
        zzb2.zzF(i2);
        zzb2.zzG(i3);
        zzlbVar.zza = zzb2.zzac();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
