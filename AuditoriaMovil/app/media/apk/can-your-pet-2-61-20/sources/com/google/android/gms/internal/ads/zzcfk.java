package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcfk implements zzlc {
    private final zzzo zzb = new zzzo(true, 65536);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    @Override // com.google.android.gms.internal.ads.zzlc
    public final long zza(zzpb zzpbVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzb(zzpb zzpbVar) {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzc(zzpb zzpbVar) {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzd(zzpb zzpbVar) {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zze(zzpb zzpbVar, zzcx zzcxVar, zzvh zzvhVar, zzmf[] zzmfVarArr, zzxk zzxkVar, zzyz[] zzyzVarArr) {
        int i = 0;
        this.zzg = 0;
        while (true) {
            int length = zzmfVarArr.length;
            if (i < 2) {
                if (zzyzVarArr[i] != null) {
                    this.zzg += zzmfVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            } else {
                this.zzb.zzf(this.zzg);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final boolean zzf(zzpb zzpbVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final boolean zzg(zzpb zzpbVar, zzcx zzcxVar, zzvh zzvhVar, long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.zzd ? (char) 0 : j2 < this.zzc ? (char) 2 : (char) 1;
        int zza = this.zzb.zza();
        int i = this.zzg;
        if (c != 2 && (c != 1 || !this.zzh || zza >= i)) {
            z = false;
        }
        this.zzh = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final boolean zzh(zzpb zzpbVar, zzcx zzcxVar, zzvh zzvhVar, long j, float f, boolean z, long j2) {
        long j3 = z ? this.zzf : this.zze;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final zzzo zzi() {
        return this.zzb;
    }

    final void zzj(boolean z) {
        this.zzg = 0;
        this.zzh = false;
        if (z) {
            this.zzb.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzf = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = i * 1000;
    }
}
