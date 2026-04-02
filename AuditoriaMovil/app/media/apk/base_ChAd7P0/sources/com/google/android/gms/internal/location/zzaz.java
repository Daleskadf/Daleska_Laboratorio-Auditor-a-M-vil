package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0742p;
/* loaded from: classes.dex */
final class zzaz implements zzdr {
    private C0742p zza;

    public zzaz(C0742p c0742p) {
        this.zza = c0742p;
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final synchronized C0742p zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final synchronized void zzb(C0742p c0742p) {
        C0742p c0742p2 = this.zza;
        if (c0742p2 != c0742p) {
            c0742p2.a();
            this.zza = c0742p;
        }
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final void zzc() {
    }
}
