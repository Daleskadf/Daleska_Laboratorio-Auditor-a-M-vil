package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaci {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private zzaci(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = f;
        this.zzk = str;
    }

    public static zzaci zza(zzfo zzfoVar) throws zzcc {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        try {
            zzfoVar.zzL(4);
            int zzm = (zzfoVar.zzm() & 3) + 1;
            if (zzm == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzm2 = zzfoVar.zzm() & 31;
            for (int i8 = 0; i8 < zzm2; i8++) {
                arrayList.add(zzb(zzfoVar));
            }
            int zzm3 = zzfoVar.zzm();
            for (int i9 = 0; i9 < zzm3; i9++) {
                arrayList.add(zzb(zzfoVar));
            }
            if (zzm2 > 0) {
                zzgk zze = zzgl.zze((byte[]) arrayList.get(0), zzm + 1, ((byte[]) arrayList.get(0)).length);
                int i10 = zze.zze;
                int i11 = zze.zzf;
                int i12 = zze.zzj;
                int i13 = zze.zzk;
                int i14 = zze.zzl;
                float f2 = zze.zzg;
                str = zzem.zza(zze.zza, zze.zzb, zze.zzc);
                i6 = i13;
                i7 = i14;
                f = f2;
                i3 = zze.zzh + 8;
                i4 = zze.zzi + 8;
                i5 = i12;
                i = i10;
                i2 = i11;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                f = 1.0f;
            }
            return new zzaci(arrayList, zzm, i, i2, i3, i4, i5, i6, i7, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzfo zzfoVar) {
        int zzq = zzfoVar.zzq();
        int zzd = zzfoVar.zzd();
        zzfoVar.zzL(zzq);
        return zzem.zzc(zzfoVar.zzM(), zzd, zzq);
    }
}
