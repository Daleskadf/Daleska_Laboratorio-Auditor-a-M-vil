package W1;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6134a;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6134a) {
            case 0:
                runnable.run();
                return;
            default:
                return;
        }
    }
}
