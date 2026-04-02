package F6;

import java.util.concurrent.ScheduledFuture;
/* renamed from: F6.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094j extends AbstractC0096k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1278a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1279b;

    public /* synthetic */ C0094j(Object obj, int i7) {
        this.f1278a = i7;
        this.f1279b = obj;
    }

    @Override // F6.AbstractC0096k
    public final void a(Throwable th) {
        switch (this.f1278a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f1279b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((S) this.f1279b).a();
                return;
            default:
                ((w6.l) this.f1279b).invoke(th);
                return;
        }
    }

    @Override // w6.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1278a) {
            case 0:
                a((Throwable) obj);
                return l6.j.f13876a;
            case 1:
                a((Throwable) obj);
                return l6.j.f13876a;
            default:
                a((Throwable) obj);
                return l6.j.f13876a;
        }
    }

    public final String toString() {
        switch (this.f1278a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f1279b) + ']';
            case 1:
                return "DisposeOnCancel[" + ((S) this.f1279b) + ']';
            default:
                return "InvokeOnCancel[" + ((w6.l) this.f1279b).getClass().getSimpleName() + '@' + H.j(this) + ']';
        }
    }
}
