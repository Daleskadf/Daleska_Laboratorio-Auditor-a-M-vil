package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzou {
    final /* synthetic */ zzov zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzvh zze;
    private boolean zzf;
    private boolean zzg;

    public zzou(zzov zzovVar, String str, int i, zzvh zzvhVar) {
        this.zza = zzovVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzvhVar == null ? -1L : zzvhVar.zzd;
        if (zzvhVar == null || !zzvhVar.zzb()) {
            return;
        }
        this.zze = zzvhVar;
    }

    public final void zzg(int i, zzvh zzvhVar) {
        if (this.zzd == -1 && i == this.zzc && zzvhVar != null) {
            zzov zzovVar = this.zza;
            long j = zzvhVar.zzd;
            if (j >= zzov.zza(zzovVar)) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zzvh zzvhVar) {
        if (zzvhVar == null) {
            return i == this.zzc;
        }
        zzvh zzvhVar2 = this.zze;
        return zzvhVar2 == null ? !zzvhVar.zzb() && zzvhVar.zzd == this.zzd : zzvhVar.zzd == zzvhVar2.zzd && zzvhVar.zzb == zzvhVar2.zzb && zzvhVar.zzc == zzvhVar2.zzc;
    }

    public final boolean zzk(zzmq zzmqVar) {
        zzvh zzvhVar = zzmqVar.zzd;
        if (zzvhVar == null) {
            return this.zzc != zzmqVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzvhVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzcx zzcxVar = zzmqVar.zzb;
        int zza = zzcxVar.zza(zzvhVar.zza);
        int zza2 = zzcxVar.zza(this.zze.zza);
        zzvh zzvhVar2 = zzmqVar.zzd;
        if (zzvhVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (zzvhVar2.zzb()) {
            zzvh zzvhVar3 = zzmqVar.zzd;
            int i = zzvhVar3.zzb;
            int i2 = zzvhVar3.zzc;
            zzvh zzvhVar4 = this.zze;
            int i3 = zzvhVar4.zzb;
            if (i <= i3) {
                return i == i3 && i2 > zzvhVar4.zzc;
            }
            return true;
        }
        int i4 = zzmqVar.zzd.zze;
        return i4 == -1 || i4 > this.zze.zzb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.zzc()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcx r7, com.google.android.gms.internal.ads.zzcx r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = -1
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zzov r1 = r6.zza
            com.google.android.gms.internal.ads.zzcw r1 = com.google.android.gms.internal.ads.zzov.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzov r0 = r6.zza
            com.google.android.gms.internal.ads.zzcw r0 = com.google.android.gms.internal.ads.zzov.zzc(r0)
            int r0 = r0.zzp
        L26:
            com.google.android.gms.internal.ads.zzov r1 = r6.zza
            com.google.android.gms.internal.ads.zzcw r1 = com.google.android.gms.internal.ads.zzov.zzc(r1)
            int r1 = r1.zzq
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzov r7 = r6.zza
            com.google.android.gms.internal.ads.zzcu r7 = com.google.android.gms.internal.ads.zzov.zzb(r7)
            com.google.android.gms.internal.ads.zzcu r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzvh r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzou.zzl(com.google.android.gms.internal.ads.zzcx, com.google.android.gms.internal.ads.zzcx):boolean");
    }
}
