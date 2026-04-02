package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzyr extends zzyt implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzyr(int i, zzcz zzczVar, int i2, zzyl zzylVar, int i3, String str) {
        super(i, zzczVar, i2);
        zzfzn zzfznVar;
        int i4;
        int i5 = 0;
        this.zzf = zzyx.zzo(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzylVar.zzy;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        if (zzylVar.zzw.isEmpty()) {
            zzfznVar = zzfzn.zzn("");
        } else {
            zzfznVar = zzylVar.zzw;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= zzfznVar.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            boolean z = zzylVar.zzz;
            i4 = zzyx.zzc(this.zzd, (String) zzfznVar.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.zzi = i8;
        this.zzj = i4;
        int zzb = zzyx.zzb(this.zzd.zzf, zzylVar.zzx);
        this.zzk = zzb;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int zzc = zzyx.zzc(this.zzd, str, zzyx.zzh(str) == null);
        this.zzl = zzc;
        boolean z2 = i4 > 0 || (zzylVar.zzw.isEmpty() && zzb > 0) || this.zzg || (this.zzh && zzc > 0);
        if (zzyx.zzo(i3, zzylVar.zzT) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzyr zzyrVar) {
        zzfzc zzb = zzfzc.zzk().zze(this.zzf, zzyrVar.zzf).zzd(Integer.valueOf(this.zzi), Integer.valueOf(zzyrVar.zzi), zzgay.zzc().zza()).zzb(this.zzj, zzyrVar.zzj).zzb(this.zzk, zzyrVar.zzk).zze(this.zzg, zzyrVar.zzg).zzd(Boolean.valueOf(this.zzh), Boolean.valueOf(zzyrVar.zzh), this.zzj == 0 ? zzgay.zzc() : zzgay.zzc().zza()).zzb(this.zzl, zzyrVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zzf(this.zzm, zzyrVar.zzm);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final /* bridge */ /* synthetic */ boolean zzc(zzyt zzytVar) {
        zzyr zzyrVar = (zzyr) zzytVar;
        return false;
    }
}
