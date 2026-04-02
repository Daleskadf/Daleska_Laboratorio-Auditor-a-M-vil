package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzzc extends zzzf {
    private zzzb zza;

    protected abstract Pair zzd(zzzb zzzbVar, int[][][] iArr, int[] iArr2, zzvh zzvhVar, zzcx zzcxVar) throws zziz;

    @Override // com.google.android.gms.internal.ads.zzzf
    public final zzzg zzp(zzmh[] zzmhVarArr, zzxk zzxkVar, zzvh zzvhVar, zzcx zzcxVar) throws zziz {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcz[][] zzczVarArr = new zzcz[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzxkVar.zzc;
            zzczVarArr[i] = new zzcz[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmhVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzxkVar.zzc) {
            zzcz zzb = zzxkVar.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzmh zzmhVar = zzmhVarArr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 < zzb.zzb; i11++) {
                    i10 = Math.max(i10, zzmhVar.zzY(zzb.zzb(i11)) & 7);
                }
                boolean z3 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i10;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[zzb.zzb];
            } else {
                zzmh zzmhVar2 = zzmhVarArr[i8];
                int[] iArr5 = new int[zzb.zzb];
                for (int i12 = 0; i12 < zzb.zzb; i12++) {
                    iArr5[i12] = zzmhVar2.zzY(zzb.zzb(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i8];
            zzczVarArr[i8][i13] = zzb;
            iArr3[i8][i13] = iArr;
            iArr2[i8] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzxk[] zzxkVarArr = new zzxk[2];
        String[] strArr = new String[2];
        int[] iArr6 = new int[2];
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int i16 = iArr2[i14];
            zzxkVarArr[i14] = new zzxk((zzcz[]) zzfx.zzO(zzczVarArr[i14], i16));
            iArr3[i14] = (int[][]) zzfx.zzO(iArr3[i14], i16);
            strArr[i14] = zzmhVarArr[i14].zzU();
            iArr6[i14] = zzmhVarArr[i14].zzb();
            i14++;
        }
        zzzb zzzbVar = new zzzb(strArr, iArr6, zzxkVarArr, iArr4, iArr3, new zzxk((zzcz[]) zzfx.zzO(zzczVarArr[2], iArr2[2])));
        Pair zzd = zzd(zzzbVar, iArr3, iArr4, zzvhVar, zzcxVar);
        zzzd[] zzzdVarArr = (zzzd[]) zzd.second;
        List[] listArr = new List[zzzdVarArr.length];
        for (int i17 = 0; i17 < zzzdVarArr.length; i17++) {
            zzzd zzzdVar = zzzdVarArr[i17];
            listArr[i17] = zzzdVar != null ? zzfzn.zzn(zzzdVar) : zzfzn.zzm();
        }
        zzfzk zzfzkVar = new zzfzk();
        for (int i18 = 0; i18 < 2; i18++) {
            zzxk zzd2 = zzzbVar.zzd(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < zzd2.zzc; i19++) {
                zzcz zzb2 = zzd2.zzb(i19);
                boolean z4 = zzzbVar.zza(i18, i19, false) != 0;
                int i20 = zzb2.zzb;
                int[] iArr7 = new int[i20];
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 < zzb2.zzb; i21++) {
                    iArr7[i21] = zzzbVar.zzb(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzzd zzzdVar2 = (zzzd) list.get(i22);
                        if (zzzdVar2.zze().equals(zzb2) && zzzdVar2.zzb(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzfzkVar.zzf(new zzdj(zzb2, z4, iArr7, zArr));
            }
        }
        zzxk zze = zzzbVar.zze();
        for (int i23 = 0; i23 < zze.zzc; i23++) {
            zzcz zzb3 = zze.zzb(i23);
            int[] iArr8 = new int[zzb3.zzb];
            Arrays.fill(iArr8, 0);
            zzfzkVar.zzf(new zzdj(zzb3, false, iArr8, new boolean[zzb3.zzb]));
        }
        return new zzzg((zzmi[]) zzd.first, (zzyz[]) zzd.second, new zzdk(zzfzkVar.zzi()), zzzbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzq(Object obj) {
        this.zza = (zzzb) obj;
    }
}
