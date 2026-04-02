package m3;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: m3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1437b extends zzq {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f14022a;

    public BinderC1437b(TaskCompletionSource taskCompletionSource) {
        this.f14022a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        android.support.v4.media.session.a.w(status, pendingIntent, this.f14022a);
    }
}
