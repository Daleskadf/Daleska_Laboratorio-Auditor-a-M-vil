package com.google.android.gms.internal.auth;

import T2.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
/* loaded from: classes.dex */
final class zzbu implements t {
    private final Status zza;
    private b zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final b getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(b bVar) {
        this.zzb = bVar;
        this.zza = Status.f9152e;
    }
}
