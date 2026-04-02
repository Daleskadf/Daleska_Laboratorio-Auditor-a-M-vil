package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzxr extends zzxt {
    private final zzzn zzd;
    private final zzfzn zze;
    private final zzel zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzxr(zzcz zzczVar, int[] iArr, int i, zzzn zzznVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzel zzelVar) {
        super(zzczVar, iArr, 0);
        this.zzd = zzznVar;
        this.zze = zzfzn.zzk(list);
        this.zzf = zzelVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfzn zzf(zzyy[] zzyyVarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            zzyy zzyyVar = zzyyVarArr[i3];
            if (zzyyVar == null || zzyyVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfzk zzfzkVar = new zzfzk();
                zzfzkVar.zzf(new zzxp(0L, 0L));
                arrayList.add(zzfzkVar);
            }
            i3++;
        }
        long[][] jArr = new long[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzyy zzyyVar2 = zzyyVarArr[i4];
            if (zzyyVar2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzyyVar2.zzb.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = zzyyVar2.zzb;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    long j = zzyyVar2.zza.zzb(iArr[i5]).zzi;
                    long[] jArr2 = jArr[i4];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzfzy zza = zzgat.zzc(zzgay.zzc()).zzb(2).zza();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    double d = 0.0d;
                    if (i8 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i8];
                    if (j2 != -1) {
                        d = Math.log(j2);
                    }
                    dArr[i8] = d;
                    i8++;
                }
                int i9 = length - 1;
                double d2 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    double d3 = dArr[i10];
                    i10++;
                    zza.zzq(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i10]) * 0.5d) - dArr[c]) / d2), Integer.valueOf(i7));
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        zzfzn zzk = zzfzn.zzk(zza.zzr());
        for (int i11 = 0; i11 < zzk.size(); i11++) {
            int intValue = ((Integer) zzk.get(i11)).intValue();
            int i12 = iArr2[intValue] + 1;
            iArr2[intValue] = i12;
            jArr3[intValue] = jArr[intValue][i12];
            zzg(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < 2; i13++) {
            if (arrayList.get(i13) != null) {
                long j3 = jArr3[i13];
                jArr3[i13] = j3 + j3;
            }
        }
        zzg(arrayList, jArr3);
        zzfzk zzfzkVar2 = new zzfzk();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            zzfzk zzfzkVar3 = (zzfzk) arrayList.get(i14);
            zzfzkVar2.zzf(zzfzkVar3 == null ? zzfzn.zzm() : zzfzkVar3.zzi());
        }
        return zzfzkVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfzk zzfzkVar = (zzfzk) list.get(i2);
            if (zzfzkVar != null) {
                zzfzkVar.zzf(new zzxp(j, jArr[i2]));
            }
        }
    }
}
