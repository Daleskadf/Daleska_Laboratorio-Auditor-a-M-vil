package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class Z extends K {

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f9219b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9220c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f9221d;

    public Z(int i7, TaskCompletionSource taskCompletionSource) {
        super(i7);
        this.f9219b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void a(Status status) {
        this.f9219b.trySetException(new com.google.android.gms.common.api.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void b(RuntimeException runtimeException) {
        this.f9219b.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void c(G g3) {
        try {
            h(g3);
        } catch (DeadObjectException e7) {
            a(b0.e(e7));
            throw e7;
        } catch (RemoteException e8) {
            a(b0.e(e8));
        } catch (RuntimeException e9) {
            this.f9219b.trySetException(e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final /* bridge */ /* synthetic */ void d(D d7, boolean z7) {
        int i7 = this.f9220c;
    }

    @Override // com.google.android.gms.common.api.internal.K
    public final boolean f(G g3) {
        switch (this.f9220c) {
            case 0:
                return ((O) this.f9221d).f9201a.f9274b;
            default:
                O o7 = (O) g3.f.get((C0740n) this.f9221d);
                if (o7 != null && o7.f9201a.f9274b) {
                    return true;
                }
                return false;
        }
    }

    @Override // com.google.android.gms.common.api.internal.K
    public final W2.d[] g(G g3) {
        switch (this.f9220c) {
            case 0:
                ((O) this.f9221d).f9201a.getClass();
                return null;
            default:
                O o7 = (O) g3.f.get((C0740n) this.f9221d);
                if (o7 != null) {
                    o7.f9201a.getClass();
                }
                return null;
        }
    }

    public final void h(G g3) {
        switch (this.f9220c) {
            case 0:
                AbstractC0745t abstractC0745t = ((O) this.f9221d).f9201a;
                ((InterfaceC0747v) ((Q) abstractC0745t).f9205d.f6249c).accept(g3.f9176b, this.f9219b);
                C0740n c0740n = ((O) this.f9221d).f9201a.f9273a.f9271c;
                if (c0740n != null) {
                    g3.f.put(c0740n, (O) this.f9221d);
                    return;
                }
                return;
            default:
                O o7 = (O) g3.f.remove((C0740n) this.f9221d);
                TaskCompletionSource taskCompletionSource = this.f9219b;
                if (o7 != null) {
                    ((InterfaceC0747v) ((S) o7.f9202b).f9206b.f6250d).accept(g3.f9176b, taskCompletionSource);
                    o7.f9201a.f9273a.a();
                    return;
                }
                taskCompletionSource.trySetResult(Boolean.FALSE);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z(C0740n c0740n, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.f9220c = 1;
        this.f9221d = c0740n;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z(O o7, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.f9220c = 0;
        this.f9221d = o7;
    }

    private final /* bridge */ /* synthetic */ void i(D d7, boolean z7) {
    }

    private final /* bridge */ /* synthetic */ void j(D d7, boolean z7) {
    }
}
