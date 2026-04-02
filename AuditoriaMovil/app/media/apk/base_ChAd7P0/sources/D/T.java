package D;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class T extends G {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f661d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final Object f662e;

    public T(b0 b0Var) {
        super(b0Var);
        this.f662e = new AtomicBoolean(false);
    }

    @Override // D.G, java.lang.AutoCloseable
    public void close() {
        switch (this.f661d) {
            case 1:
                if (!((AtomicBoolean) this.f662e).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public T(b0 b0Var, U u7) {
        super(b0Var);
        this.f662e = new WeakReference(u7);
        a(new S(this, 0));
    }
}
