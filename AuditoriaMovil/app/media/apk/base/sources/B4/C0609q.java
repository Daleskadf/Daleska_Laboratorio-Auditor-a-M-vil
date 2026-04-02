package b4;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: b4.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609q implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8283a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8284b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f8285c;

    public /* synthetic */ C0609q(TaskCompletionSource taskCompletionSource, Context context, int i7) {
        this.f8283a = i7;
        this.f8284b = taskCompletionSource;
        this.f8285c = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f8283a) {
            case 0:
                this.f8284b.setException(exc);
                A.l.r(this.f8285c);
                return;
            case 1:
                this.f8284b.setException(exc);
                A.l.r(this.f8285c);
                return;
            default:
                this.f8284b.setException(exc);
                A.l.r(this.f8285c);
                return;
        }
    }
}
