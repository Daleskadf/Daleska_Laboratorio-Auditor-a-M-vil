package e;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import c1.RunnableC0626c;
import java.util.concurrent.Executor;
import z0.AbstractActivityC2064y;
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a  reason: collision with root package name */
    public final long f10534a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f10535b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10536c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2064y f10537d;

    public k(AbstractActivityC2064y abstractActivityC2064y) {
        this.f10537d = abstractActivityC2064y;
    }

    public final void a(View view) {
        if (!this.f10536c) {
            this.f10536c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.j.e(runnable, "runnable");
        this.f10535b = runnable;
        View decorView = this.f10537d.getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (this.f10536c) {
            if (kotlin.jvm.internal.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new RunnableC0626c(this, 6));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z7;
        Runnable runnable = this.f10535b;
        if (runnable != null) {
            runnable.run();
            this.f10535b = null;
            p pVar = (p) this.f10537d.f10548X.a();
            synchronized (pVar.f10567b) {
                z7 = pVar.f10568c;
            }
            if (z7) {
                this.f10536c = false;
                this.f10537d.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.f10534a) {
            this.f10536c = false;
            this.f10537d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10537d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
