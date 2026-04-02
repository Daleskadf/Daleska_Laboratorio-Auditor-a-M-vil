package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;
/* loaded from: classes.dex */
final class zzdo implements zzhh {
    private final zzdn zza;

    private zzdo(zzdn zzdnVar) {
        byte[] bArr = zzep.zzb;
        this.zza = zzdnVar;
        zzdnVar.zza = this;
    }

    public static zzdo zza(zzdn zzdnVar) {
        zzdo zzdoVar = zzdnVar.zza;
        if (zzdoVar != null) {
            return zzdoVar;
        }
        return new zzdo(zzdnVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzA(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzfb) {
            zzfb zzfbVar = (zzfb) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzfbVar.size(); i10++) {
                    zzfbVar.zze(i10);
                    i9 += 8;
                }
                this.zza.zzt(i9);
                while (i8 < zzfbVar.size()) {
                    this.zza.zzi(zzfbVar.zze(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzfbVar.size()) {
                this.zza.zzh(i7, zzfbVar.zze(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzB(int i7, int i8) {
        this.zza.zzs(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzC(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
                    int zze = zzeiVar.zze(i10);
                    i9 += zzdn.zzA((zze >> 31) ^ (zze + zze));
                }
                this.zza.zzt(i9);
                while (i8 < zzeiVar.size()) {
                    zzdn zzdnVar = this.zza;
                    int zze2 = zzeiVar.zze(i8);
                    zzdnVar.zzt((zze2 >> 31) ^ (zze2 + zze2));
                    i8++;
                }
                return;
            }
            while (i8 < zzeiVar.size()) {
                zzdn zzdnVar2 = this.zza;
                int zze3 = zzeiVar.zze(i8);
                zzdnVar2.zzs(i7, (zze3 >> 31) ^ (zze3 + zze3));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                i11 += zzdn.zzA((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                zzdn zzdnVar3 = this.zza;
                int intValue2 = ((Integer) list.get(i8)).intValue();
                zzdnVar3.zzt((intValue2 >> 31) ^ (intValue2 + intValue2));
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                zzdn zzdnVar4 = this.zza;
                int intValue3 = ((Integer) list.get(i8)).intValue();
                zzdnVar4.zzs(i7, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzD(int i7, long j) {
        this.zza.zzu(i7, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzE(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzfb) {
            zzfb zzfbVar = (zzfb) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzfbVar.size(); i10++) {
                    long zze = zzfbVar.zze(i10);
                    i9 += zzdn.zzB((zze >> 63) ^ (zze + zze));
                }
                this.zza.zzt(i9);
                while (i8 < zzfbVar.size()) {
                    zzdn zzdnVar = this.zza;
                    long zze2 = zzfbVar.zze(i8);
                    zzdnVar.zzv((zze2 >> 63) ^ (zze2 + zze2));
                    i8++;
                }
                return;
            }
            while (i8 < zzfbVar.size()) {
                zzdn zzdnVar2 = this.zza;
                long zze3 = zzfbVar.zze(i8);
                zzdnVar2.zzu(i7, (zze3 >> 63) ^ (zze3 + zze3));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long longValue = ((Long) list.get(i12)).longValue();
                i11 += zzdn.zzB((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                zzdn zzdnVar3 = this.zza;
                long longValue2 = ((Long) list.get(i8)).longValue();
                zzdnVar3.zzv((longValue2 >> 63) ^ (longValue2 + longValue2));
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                zzdn zzdnVar4 = this.zza;
                long longValue3 = ((Long) list.get(i8)).longValue();
                zzdnVar4.zzu(i7, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    @Deprecated
    public final void zzF(int i7) {
        this.zza.zzr(i7, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzG(int i7, String str) {
        this.zza.zzp(i7, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzH(int i7, List list) {
        int i8 = 0;
        if (list instanceof zzey) {
            zzey zzeyVar = (zzey) list;
            while (i8 < list.size()) {
                Object zza = zzeyVar.zza();
                if (zza instanceof String) {
                    this.zza.zzp(i7, (String) zza);
                } else {
                    this.zza.zze(i7, (zzdf) zza);
                }
                i8++;
            }
            return;
        }
        while (i8 < list.size()) {
            this.zza.zzp(i7, (String) list.get(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzI(int i7, int i8) {
        this.zza.zzs(i7, i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzJ(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
                    i9 += zzdn.zzA(zzeiVar.zze(i10));
                }
                this.zza.zzt(i9);
                while (i8 < zzeiVar.size()) {
                    this.zza.zzt(zzeiVar.zze(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzeiVar.size()) {
                this.zza.zzs(i7, zzeiVar.zze(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzdn.zzA(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzt(((Integer) list.get(i8)).intValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzs(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzK(int i7, long j) {
        this.zza.zzu(i7, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzL(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzfb) {
            zzfb zzfbVar = (zzfb) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzfbVar.size(); i10++) {
                    i9 += zzdn.zzB(zzfbVar.zze(i10));
                }
                this.zza.zzt(i9);
                while (i8 < zzfbVar.size()) {
                    this.zza.zzv(zzfbVar.zze(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzfbVar.size()) {
                this.zza.zzu(i7, zzfbVar.zze(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzdn.zzB(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzu(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzb(int i7, boolean z7) {
        this.zza.zzd(i7, z7);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzc(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzcw) {
            zzcw zzcwVar = (zzcw) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzcwVar.size(); i10++) {
                    zzcwVar.zzf(i10);
                    i9++;
                }
                this.zza.zzt(i9);
                while (i8 < zzcwVar.size()) {
                    this.zza.zzb(zzcwVar.zzf(i8) ? (byte) 1 : (byte) 0);
                    i8++;
                }
                return;
            }
            while (i8 < zzcwVar.size()) {
                this.zza.zzd(i7, zzcwVar.zzf(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzd(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzd(int i7, zzdf zzdfVar) {
        this.zza.zze(i7, zzdfVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zze(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zze(i7, (zzdf) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzf(int i7, double d7) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzg(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzdp) {
            zzdp zzdpVar = (zzdp) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzdpVar.size(); i10++) {
                    zzdpVar.zze(i10);
                    i9 += 8;
                }
                this.zza.zzt(i9);
                while (i8 < zzdpVar.size()) {
                    this.zza.zzi(Double.doubleToRawLongBits(zzdpVar.zze(i8)));
                    i8++;
                }
                return;
            }
            while (i8 < zzdpVar.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(zzdpVar.zze(i8)));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzr(i7, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzi(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzj(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
                    i9 += zzdn.zzB(zzeiVar.zze(i10));
                }
                this.zza.zzt(i9);
                while (i8 < zzeiVar.size()) {
                    this.zza.zzk(zzeiVar.zze(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzeiVar.size()) {
                this.zza.zzj(i7, zzeiVar.zze(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzdn.zzB(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzk(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzl(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
                    zzeiVar.zze(i10);
                    i9 += 4;
                }
                this.zza.zzt(i9);
                while (i8 < zzeiVar.size()) {
                    this.zza.zzg(zzeiVar.zze(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzeiVar.size()) {
                this.zza.zzf(i7, zzeiVar.zze(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzm(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzn(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzfb) {
            zzfb zzfbVar = (zzfb) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzfbVar.size(); i10++) {
                    zzfbVar.zze(i10);
                    i9 += 8;
                }
                this.zza.zzt(i9);
                while (i8 < zzfbVar.size()) {
                    this.zza.zzi(zzfbVar.zze(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzfbVar.size()) {
                this.zza.zzh(i7, zzfbVar.zze(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzo(int i7, float f) {
        this.zza.zzf(i7, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzp(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzdz) {
            zzdz zzdzVar = (zzdz) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzdzVar.size(); i10++) {
                    zzdzVar.zze(i10);
                    i9 += 4;
                }
                this.zza.zzt(i9);
                while (i8 < zzdzVar.size()) {
                    this.zza.zzg(Float.floatToRawIntBits(zzdzVar.zze(i8)));
                    i8++;
                }
                return;
            }
            while (i8 < zzdzVar.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(zzdzVar.zze(i8)));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzq(int i7, Object obj, zzge zzgeVar) {
        zzdn zzdnVar = this.zza;
        zzdnVar.zzr(i7, 3);
        zzgeVar.zzi((zzfm) obj, zzdnVar.zza);
        zzdnVar.zzr(i7, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzr(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzs(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
                    i9 += zzdn.zzB(zzeiVar.zze(i10));
                }
                this.zza.zzt(i9);
                while (i8 < zzeiVar.size()) {
                    this.zza.zzk(zzeiVar.zze(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzeiVar.size()) {
                this.zza.zzj(i7, zzeiVar.zze(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzdn.zzB(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzt(int i7, long j) {
        this.zza.zzu(i7, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzu(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzfb) {
            zzfb zzfbVar = (zzfb) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzfbVar.size(); i10++) {
                    i9 += zzdn.zzB(zzfbVar.zze(i10));
                }
                this.zza.zzt(i9);
                while (i8 < zzfbVar.size()) {
                    this.zza.zzv(zzfbVar.zze(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzfbVar.size()) {
                this.zza.zzu(i7, zzfbVar.zze(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzdn.zzB(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzu(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzv(int i7, Object obj, zzge zzgeVar) {
        this.zza.zzm(i7, (zzfm) obj, zzgeVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzw(int i7, Object obj) {
        if (obj instanceof zzdf) {
            this.zza.zzo(i7, (zzdf) obj);
        } else {
            this.zza.zzn(i7, (zzfm) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzx(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzy(int i7, List list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzei) {
            zzei zzeiVar = (zzei) list;
            if (z7) {
                this.zza.zzr(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzeiVar.size(); i10++) {
                    zzeiVar.zze(i10);
                    i9 += 4;
                }
                this.zza.zzt(i9);
                while (i8 < zzeiVar.size()) {
                    this.zza.zzg(zzeiVar.zze(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzeiVar.size()) {
                this.zza.zzf(i7, zzeiVar.zze(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzt(i11);
            while (i8 < list.size()) {
                this.zza.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzz(int i7, long j) {
        this.zza.zzh(i7, j);
    }
}
