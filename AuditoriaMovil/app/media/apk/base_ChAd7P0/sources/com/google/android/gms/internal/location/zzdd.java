package com.google.android.gms.internal.location;

import android.support.v4.media.session.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.F;
/* loaded from: classes.dex */
final class zzdd extends zzq {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ F zzb;

    public zzdd(TaskCompletionSource taskCompletionSource, F f) {
        this.zza = taskCompletionSource;
        this.zzb = f;
    }

    @Override // com.google.android.gms.internal.location.zzr
    public final void zzd(zzl zzlVar) {
        a.w(zzlVar.getStatus(), null, this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzr
    public final void zze() {
        this.zzb.zzf();
    }
}
