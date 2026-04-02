package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzgdo extends zzgdd {
    @CheckForNull
    private List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdo(zzfzi zzfziVar, boolean z) {
        super(zzfziVar, z, true);
        List zza;
        if (zzfziVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzgad.zza(zzfziVar.size());
        }
        for (int i = 0; i < zzfziVar.size(); i++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgdd
    final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgdn(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgdd
    public final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
