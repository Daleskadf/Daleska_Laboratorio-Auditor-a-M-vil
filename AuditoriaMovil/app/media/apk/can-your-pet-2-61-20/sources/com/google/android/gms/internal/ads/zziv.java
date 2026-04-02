package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zziv implements zzlc {
    private final zzzo zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private int zzh;
    private boolean zzi;

    public zziv() {
        zzzo zzzoVar = new zzzo(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zzb = zzzoVar;
        this.zzc = zzfx.zzr(50000L);
        this.zzd = zzfx.zzr(50000L);
        this.zze = zzfx.zzr(2500L);
        this.zzf = zzfx.zzr(5000L);
        this.zzh = 13107200;
        this.zzg = zzfx.zzr(0L);
    }

    private static void zzj(int i, int i2, String str, String str2) {
        zzek.zze(i >= i2, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z) {
        this.zzh = 13107200;
        this.zzi = false;
        if (z) {
            this.zzb.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ long zza(zzpb zzpbVar) {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ void zzb(zzpb zzpbVar) {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ void zzc(zzpb zzpbVar) {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ void zzd(zzpb zzpbVar) {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ void zze(zzpb zzpbVar, zzcx zzcxVar, zzvh zzvhVar, zzmf[] zzmfVarArr, zzxk zzxkVar, zzyz[] zzyzVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzmfVarArr.length;
            if (i < 2) {
                if (zzyzVarArr[i] != null) {
                    i2 += zzmfVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.zzh = max;
                this.zzb.zzf(max);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ boolean zzf(zzpb zzpbVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ boolean zzg(zzpb zzpbVar, zzcx zzcxVar, zzvh zzvhVar, long j, long j2, float f) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        int zza = this.zzb.zza();
        int i2 = this.zzh;
        long j3 = this.zzc;
        if (i > 0) {
            j3 = Math.min(zzfx.zzp(j3, f), this.zzd);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = zza < i2;
            this.zzi = z;
            if (!z && j2 < 500000) {
                zzfe.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzd || zza >= i2) {
            this.zzi = false;
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ boolean zzh(zzpb zzpbVar, zzcx zzcxVar, zzvh zzvhVar, long j, float f, boolean z, long j2) {
        long zzq = zzfx.zzq(j, f);
        long j3 = z ? this.zzf : this.zze;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || zzq >= j3 || this.zzb.zza() >= this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final zzzo zzi() {
        return this.zzb;
    }
}
