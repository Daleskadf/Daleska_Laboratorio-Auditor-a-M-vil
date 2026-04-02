package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import m6.AbstractC1447h;
/* loaded from: classes.dex */
public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) {
        zzhu zzhuVar;
        if (str.length() != 0) {
            try {
                long zza = this.zza.zza(AbstractC1447h.Z(list));
                zzhuVar = zzhv.zza;
                zzhv zzhvVar = new zzhv(zza, 255L, zzhuVar);
                StringBuilder sb = new StringBuilder(str.length());
                for (int i7 = 0; i7 < str.length(); i7++) {
                    sb.append((char) (str.charAt(i7) ^ ((int) zzhvVar.zza())));
                }
                return zztz.zzg(zzkh.zzh().zzj(sb.toString()));
            } catch (Exception e7) {
                throw new zzce(3, 18, e7);
            }
        }
        throw new zzce(3, 17, null);
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    public final zztz zza(zzub zzubVar) {
        zzjh zzb = zzjh.zzb();
        zztz zzb2 = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), zza);
        return zzb2;
    }
}
