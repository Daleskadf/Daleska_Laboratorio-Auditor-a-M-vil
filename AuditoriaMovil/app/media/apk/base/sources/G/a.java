package G;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f1326a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
