package com.google.android.recaptcha.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzoz extends zzpe {
    public zzoz() {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final void zza() {
        if (!zzj()) {
            for (int i7 = 0; i7 < zzc(); i7++) {
                ((zzms) ((zzpa) zzg(i7)).zza()).zzg();
            }
            for (Map.Entry entry : zzd()) {
                ((zzms) entry.getKey()).zzg();
            }
        }
        super.zza();
    }
}
