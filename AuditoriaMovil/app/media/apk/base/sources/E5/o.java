package e5;

import com.google.android.gms.common.internal.I;
import java.util.ArrayDeque;
import java.util.Deque;
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10909a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f10910b;

    public /* synthetic */ o(Runnable runnable, int i7) {
        this.f10909a = i7;
        this.f10910b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10909a) {
            case 0:
                Deque deque = (Deque) h.f10898b.get();
                I.i(deque);
                Runnable runnable = this.f10910b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                    return;
                }
                return;
            default:
                h.f10898b.set(new ArrayDeque());
                this.f10910b.run();
                return;
        }
    }
}
