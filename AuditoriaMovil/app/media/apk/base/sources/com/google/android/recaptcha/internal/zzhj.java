package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import m6.AbstractC1446g;
/* loaded from: classes.dex */
public final class zzhj implements zzgx {
    public static final zzhj zza = new zzhj();

    private zzhj() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        Constructor<?> constructor;
        int length = zzueVarArr.length;
        if (length != 0) {
            Constructor<?> zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof Constructor) {
                    constructor = zza2;
                } else {
                    constructor = zza2.getClass().getConstructor(null);
                }
                Object[] zzg = zzgdVar.zzc().zzg(AbstractC1446g.R(zzueVarArr).subList(1, length));
                try {
                    zzgdVar.zzc().zze(i7, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
                    return;
                } catch (Exception e7) {
                    throw new zzce(6, 14, e7);
                }
            }
            throw new zzce(4, 5, null);
        }
        throw new zzce(4, 3, null);
    }
}
