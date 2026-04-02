package com.google.android.gms.internal.auth;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgl extends zzgv {
    public zzgl(int i7) {
        super(i7, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgv
    public final void zza() {
        if (!zzj()) {
            for (int i7 = 0; i7 < zzb(); i7++) {
                Map.Entry zzg = zzg(i7);
                if (((zzep) zzg.getKey()).zzc()) {
                    zzg.setValue(DesugarCollections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzep) entry.getKey()).zzc()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
