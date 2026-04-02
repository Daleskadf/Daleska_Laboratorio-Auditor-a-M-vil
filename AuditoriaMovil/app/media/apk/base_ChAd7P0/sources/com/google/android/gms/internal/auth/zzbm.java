package com.google.android.gms.internal.auth;

import T2.b;
import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class zzbm extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbm(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(b bVar) {
        a.w(new Status(bVar.f5330a, null, null, null), bVar, this.zza);
    }
}
