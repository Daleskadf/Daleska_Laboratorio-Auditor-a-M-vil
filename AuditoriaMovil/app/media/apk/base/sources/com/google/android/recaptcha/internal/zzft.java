package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l6.j;
import n6.d;
import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class zzft implements zzfo {
    private final D zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(D d7, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = d7;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) {
        zzjh zzb = zzjh.zzb();
        int zza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar != null) {
            int zzg = zzufVar.zzg();
            zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
            zzgxVar.zza(zzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
            if (zza == zzgdVar.zza()) {
                zzgdVar.zzg(zzgdVar.zza() + 1);
            }
            zzb.zzf();
            long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
            int i7 = zzbk.zza;
            int zzk = zzufVar.zzk();
            if (zzk != 1) {
                zzbk.zza(zzk - 2, zza2);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        throw new zzce(5, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, d dVar) {
        Object e7 = H.e(new zzfq(zzgdVar, list, this, null), dVar);
        if (e7 == EnumC1565a.COROUTINE_SUSPENDED) {
            return e7;
        }
        return j.f13876a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, d dVar) {
        Object e7 = H.e(new zzfr(exc, zzgdVar, this, null), dVar);
        if (e7 == EnumC1565a.COROUTINE_SUSPENDED) {
            return e7;
        }
        return j.f13876a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        H.q(this.zza, null, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }
}
