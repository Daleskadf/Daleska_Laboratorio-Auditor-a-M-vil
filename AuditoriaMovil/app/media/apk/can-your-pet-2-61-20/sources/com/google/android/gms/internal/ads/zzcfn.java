package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcfn implements zzgv {
    private final zzgv zza;
    private final long zzb;
    private final zzgv zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfn(zzgv zzgvVar, int i, zzgv zzgvVar2) {
        this.zza = zzgvVar;
        this.zzb = i;
        this.zzc = zzgvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
            int i4 = i3 + zza2;
            this.zzd += zza2;
            return i4;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final long zzb(zzhb zzhbVar) throws IOException {
        zzhb zzhbVar2;
        this.zze = zzhbVar.zza;
        long j = zzhbVar.zze;
        long j2 = this.zzb;
        zzhb zzhbVar3 = null;
        if (j >= j2) {
            zzhbVar2 = null;
        } else {
            long j3 = zzhbVar.zzf;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            zzhbVar2 = new zzhb(zzhbVar.zza, j, j4, null);
        }
        long j5 = zzhbVar.zzf;
        if (j5 == -1 || zzhbVar.zze + j5 > this.zzb) {
            long max = Math.max(this.zzb, zzhbVar.zze);
            long j6 = zzhbVar.zzf;
            zzhbVar3 = new zzhb(zzhbVar.zza, max, j6 != -1 ? Math.min(j6, (zzhbVar.zze + j6) - this.zzb) : -1L, null);
        }
        long zzb = zzhbVar2 != null ? this.zza.zzb(zzhbVar2) : 0L;
        long zzb2 = zzhbVar3 != null ? this.zzc.zzb(zzhbVar3) : 0L;
        this.zzd = zzhbVar.zze;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final Map zze() {
        return zzfzq.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzf(zzhy zzhyVar) {
    }
}
