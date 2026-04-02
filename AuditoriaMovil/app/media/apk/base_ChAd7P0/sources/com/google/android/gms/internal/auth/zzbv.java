package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.I;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzbv implements t {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        I.i(status);
        this.zza = status;
        this.zzb = StringUtils.EMPTY;
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        I.i(str);
        this.zzb = str;
        this.zza = Status.f9152e;
    }
}
