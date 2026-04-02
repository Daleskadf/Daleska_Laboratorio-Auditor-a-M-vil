package A5;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public int f222a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("flutter-worker-");
        int i7 = this.f222a;
        this.f222a = i7 + 1;
        sb.append(i7);
        thread.setName(sb.toString());
        return thread;
    }
}
