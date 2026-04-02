package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgdm extends zzgdo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdm(zzfzi zzfziVar, boolean z) {
        super(zzfziVar, z);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzgad.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgdn zzgdnVar = (zzgdn) it.next();
            zza.add(zzgdnVar != null ? zzgdnVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
