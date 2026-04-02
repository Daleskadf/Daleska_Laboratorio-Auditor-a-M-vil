package e;

import z0.AbstractActivityC2064y;
/* renamed from: e.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0923d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10522a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2064y f10523b;

    public /* synthetic */ RunnableC0923d(AbstractActivityC2064y abstractActivityC2064y, int i7) {
        this.f10522a = i7;
        this.f10523b = abstractActivityC2064y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10522a) {
            case 0:
                this.f10523b.invalidateOptionsMenu();
                return;
            default:
                try {
                    n.b(this.f10523b);
                    return;
                } catch (IllegalStateException e7) {
                    if (kotlin.jvm.internal.j.a(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e7;
                } catch (NullPointerException e8) {
                    if (!kotlin.jvm.internal.j.a(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e8;
                    }
                    return;
                }
        }
    }
}
