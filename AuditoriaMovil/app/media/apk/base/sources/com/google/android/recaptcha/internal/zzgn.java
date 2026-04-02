package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m6.AbstractC1446g;
import m6.AbstractC1449j;
/* loaded from: classes.dex */
public final class zzgn implements zzgx {
    public static final zzgn zza = new zzgn();

    private zzgn() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(AbstractC1449j.M(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzue) it.next()).zzR()));
        }
        if (!arrayList.contains(Boolean.FALSE)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzb(AbstractC1446g.R(zzueVarArr))) {
            for (zzue zzueVar : zzueVarArr) {
                zzgdVar.zzc().zzb(zzueVar.zzi());
            }
            return;
        }
        throw new zzce(4, 5, null);
    }
}
