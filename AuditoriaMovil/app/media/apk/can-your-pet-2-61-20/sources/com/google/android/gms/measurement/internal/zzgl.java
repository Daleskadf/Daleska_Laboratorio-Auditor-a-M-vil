package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzgl {
    private final zzit zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgl zza(String str) {
        zzit zzitVar;
        if (TextUtils.isEmpty(str) || str.length() > 1) {
            zzitVar = zzit.UNINITIALIZED;
        } else {
            zzitVar = zziq.zza(str.charAt(0));
        }
        return new zzgl(zzitVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzit zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        return String.valueOf(zziq.zza(this.zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgl(zzit zzitVar) {
        this.zza = zzitVar;
    }
}
