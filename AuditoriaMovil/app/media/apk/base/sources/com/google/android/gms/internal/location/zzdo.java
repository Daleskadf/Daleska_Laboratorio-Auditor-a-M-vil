package com.google.android.gms.internal.location;

import android.support.v4.media.session.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.I;
/* loaded from: classes.dex */
final class zzdo extends zzq {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ I zzb;

    public zzdo(TaskCompletionSource taskCompletionSource, I i7) {
        this.zza = taskCompletionSource;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.location.zzr
    public final void zzd(zzl zzlVar) {
        a.w(zzlVar.getStatus(), null, this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzr
    public final void zze() {
        this.zzb.zze();
    }
}
