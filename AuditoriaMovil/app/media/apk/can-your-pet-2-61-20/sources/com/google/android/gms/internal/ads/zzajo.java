package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajo {
    public final zzaem zza;
    public zzake zzd;
    public zzajk zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzakd zzb = new zzakd();
    public final zzfo zzc = new zzfo();
    private final zzfo zzj = new zzfo(1);
    private final zzfo zzk = new zzfo();

    public zzajo(zzaem zzaemVar, zzake zzakeVar, zzajk zzajkVar) {
        this.zza = zzaemVar;
        this.zzd = zzakeVar;
        this.zze = zzajkVar;
        zzh(zzakeVar, zzajkVar);
    }

    public final int zza() {
        int i;
        if (this.zzl) {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i = this.zzd.zzg[this.zzf];
        }
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzfo zzfoVar;
        zzakc zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i3 = zzf.zzd;
        if (i3 != 0) {
            zzfoVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i4 = zzfx.zza;
            zzfo zzfoVar2 = this.zzk;
            int length = bArr.length;
            zzfoVar2.zzI(bArr, length);
            zzfoVar = this.zzk;
            i3 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        zzfo zzfoVar3 = this.zzj;
        zzfoVar3.zzM()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzfoVar3.zzK(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzfoVar, i3, 1);
        if (z) {
            if (!zzb) {
                this.zzc.zzH(8);
                zzfo zzfoVar4 = this.zzc;
                byte[] zzM = zzfoVar4.zzM();
                zzM[0] = 0;
                zzM[1] = 1;
                zzM[2] = 0;
                zzM[3] = (byte) i2;
                zzM[4] = (byte) ((i >> 24) & 255);
                zzM[5] = (byte) ((i >> 16) & 255);
                zzM[6] = (byte) ((i >> 8) & 255);
                zzM[7] = (byte) (i & 255);
                this.zza.zzr(zzfoVar4, 8, 1);
                return i3 + 9;
            }
            int i5 = i3 + 1;
            zzfo zzfoVar5 = this.zzb.zzn;
            int zzq = zzfoVar5.zzq();
            zzfoVar5.zzL(-2);
            int i6 = (zzq * 6) + 2;
            if (i2 != 0) {
                this.zzc.zzH(i6);
                byte[] zzM2 = this.zzc.zzM();
                zzfoVar5.zzG(zzM2, 0, i6);
                int i7 = (((zzM2[2] & 255) << 8) | (zzM2[3] & 255)) + i2;
                zzM2[2] = (byte) ((i7 >> 8) & 255);
                zzM2[3] = (byte) (i7 & 255);
                zzfoVar5 = this.zzc;
            }
            this.zza.zzr(zzfoVar5, i6, 1);
            return i5 + i6;
        }
        return i3 + 1;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (this.zzl) {
            zzakd zzakdVar = this.zzb;
            return zzakdVar.zzi[this.zzf];
        }
        return this.zzd.zzf[this.zzf];
    }

    public final zzakc zzf() {
        if (this.zzl) {
            zzajk zzajkVar = this.zzb.zza;
            int i = zzfx.zza;
            int i2 = zzajkVar.zza;
            zzakc zzakcVar = this.zzb.zzm;
            if (zzakcVar == null) {
                zzakcVar = this.zzd.zza.zza(i2);
            }
            if (zzakcVar == null || !zzakcVar.zza) {
                return null;
            }
            return zzakcVar;
        }
        return null;
    }

    public final void zzh(zzake zzakeVar, zzajk zzajkVar) {
        this.zzd = zzakeVar;
        this.zze = zzajkVar;
        this.zza.zzl(zzakeVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzakd zzakdVar = this.zzb;
        zzakdVar.zzd = 0;
        zzakdVar.zzp = 0L;
        zzakdVar.zzq = false;
        zzakdVar.zzk = false;
        zzakdVar.zzo = false;
        zzakdVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (this.zzl) {
            int i = this.zzg + 1;
            this.zzg = i;
            int[] iArr = this.zzb.zzg;
            int i2 = this.zzh;
            if (i == iArr[i2]) {
                this.zzh = i2 + 1;
                this.zzg = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}
