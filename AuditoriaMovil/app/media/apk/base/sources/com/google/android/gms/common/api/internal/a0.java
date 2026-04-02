package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
/* loaded from: classes.dex */
public final class a0 extends K {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0751z f9222b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f9223c;

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0749x f9224d;

    public a0(int i7, AbstractC0751z abstractC0751z, TaskCompletionSource taskCompletionSource, InterfaceC0749x interfaceC0749x) {
        super(i7);
        this.f9223c = taskCompletionSource;
        this.f9222b = abstractC0751z;
        this.f9224d = interfaceC0749x;
        if (i7 == 2 && abstractC0751z.f9281b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void a(Status status) {
        ((C0727a) this.f9224d).getClass();
        this.f9223c.trySetException(com.google.android.gms.common.internal.I.n(status));
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void b(RuntimeException runtimeException) {
        this.f9223c.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void c(G g3) {
        TaskCompletionSource taskCompletionSource = this.f9223c;
        try {
            AbstractC0751z abstractC0751z = this.f9222b;
            ((InterfaceC0747v) ((U) abstractC0751z).f9213d.f330c).accept(g3.f9176b, taskCompletionSource);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            a(b0.e(e8));
        } catch (RuntimeException e9) {
            taskCompletionSource.trySetException(e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void d(D d7, boolean z7) {
        Boolean valueOf = Boolean.valueOf(z7);
        TaskCompletionSource taskCompletionSource = this.f9223c;
        ((Map) d7.f9167b).put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new C(d7, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.K
    public final boolean f(G g3) {
        return this.f9222b.f9281b;
    }

    @Override // com.google.android.gms.common.api.internal.K
    public final W2.d[] g(G g3) {
        return this.f9222b.f9280a;
    }
}
