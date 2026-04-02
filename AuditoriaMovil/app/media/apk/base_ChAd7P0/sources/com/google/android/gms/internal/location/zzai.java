package com.google.android.gms.internal.location;

import android.support.v4.media.session.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0732f;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class zzai implements InterfaceC0732f {
    private final TaskCompletionSource zza;

    public zzai(TaskCompletionSource taskCompletionSource) {
        I.i(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0732f
    public final void setFailedResult(Status status) {
        if (status == null) {
            return;
        }
        this.zza.setException(new j(status));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0732f
    public final /* synthetic */ void setResult(Object obj) {
        a.w((Status) obj, null, this.zza);
    }
}
