package Q0;

import D.RunnableC0053c;
import H0.e0;
import O0.C0244f;
import android.os.Handler;
import com.google.firebase.firestore.S;
/* renamed from: Q0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4295a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4296b;

    /* renamed from: c  reason: collision with root package name */
    public final O0.E f4297c;

    public /* synthetic */ C0276m(Handler handler, O0.E e7, int i7) {
        this.f4295a = i7;
        this.f4296b = handler;
        this.f4297c = e7;
    }

    private final void b(C0244f c0244f) {
        synchronized (c0244f) {
        }
        Handler handler = this.f4296b;
        if (handler != null) {
            handler.post(new RunnableC0053c(15, this, c0244f));
        }
    }

    public final void a(C0244f c0244f) {
        switch (this.f4295a) {
            case 0:
                b(c0244f);
                return;
            default:
                synchronized (c0244f) {
                }
                Handler handler = this.f4296b;
                if (handler != null) {
                    handler.post(new S(18, this, c0244f));
                    return;
                }
                return;
        }
    }

    public void c(e0 e0Var) {
        Handler handler = this.f4296b;
        if (handler != null) {
            handler.post(new S(16, this, e0Var));
        }
    }
}
