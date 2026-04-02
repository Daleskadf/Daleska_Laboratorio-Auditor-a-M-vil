package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzyw extends zzyt {
    private final boolean zze;
    private final zzyl zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final int zzr;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0031, code lost:
        if (r2 <= 2.14748365E9f) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0048, code lost:
        if (r1 >= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0050, code lost:
        if (r1 >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x005d, code lost:
        if (r1 >= 0.0f) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0065, code lost:
        if (r11 >= 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzyw(int r5, com.google.android.gms.internal.ads.zzcz r6, int r7, com.google.android.gms.internal.ads.zzyl r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyw.<init>(int, com.google.android.gms.internal.ads.zzcz, int, com.google.android.gms.internal.ads.zzyl, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzyw zzywVar, zzyw zzywVar2) {
        zzgay zzgayVar;
        zzgay zza;
        if (zzywVar.zze && zzywVar.zzh) {
            zza = zzyx.zzb;
        } else {
            zzgayVar = zzyx.zzb;
            zza = zzgayVar.zza();
        }
        zzfzc zzk = zzfzc.zzk();
        boolean z = zzywVar.zzf.zzB;
        return zzk.zzd(Integer.valueOf(zzywVar.zzk), Integer.valueOf(zzywVar2.zzk), zza).zzd(Integer.valueOf(zzywVar.zzj), Integer.valueOf(zzywVar2.zzj), zza).zza();
    }

    public static /* synthetic */ int zzd(zzyw zzywVar, zzyw zzywVar2) {
        zzfzc zzd = zzfzc.zzk().zze(zzywVar.zzh, zzywVar2.zzh).zzb(zzywVar.zzm, zzywVar2.zzm).zze(zzywVar.zzn, zzywVar2.zzn).zze(zzywVar.zzi, zzywVar2.zzi).zze(zzywVar.zze, zzywVar2.zze).zze(zzywVar.zzg, zzywVar2.zzg).zzd(Integer.valueOf(zzywVar.zzl), Integer.valueOf(zzywVar2.zzl), zzgay.zzc().zza());
        boolean z = zzywVar.zzp;
        zzfzc zze = zzd.zze(z, zzywVar2.zzp);
        boolean z2 = zzywVar.zzq;
        zzfzc zze2 = zze.zze(z2, zzywVar2.zzq);
        if (z && z2) {
            zze2 = zze2.zzb(zzywVar.zzr, zzywVar2.zzr);
        }
        return zze2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final int zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final /* bridge */ /* synthetic */ boolean zzc(zzyt zzytVar) {
        zzyw zzywVar = (zzyw) zzytVar;
        if (zzfx.zzG(this.zzd.zzm, zzywVar.zzd.zzm)) {
            boolean z = this.zzf.zzL;
            return this.zzp == zzywVar.zzp && this.zzq == zzywVar.zzq;
        }
        return false;
    }
}
