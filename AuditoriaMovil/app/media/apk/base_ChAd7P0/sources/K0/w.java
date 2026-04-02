package K0;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class w implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2527a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f2528b;

    public /* synthetic */ w(String str, int i7) {
        this.f2527a = i7;
        this.f2528b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2527a) {
            case 0:
                return new Thread(runnable, this.f2528b);
            default:
                Thread thread = new Thread(runnable, this.f2528b);
                thread.setPriority(10);
                return thread;
        }
    }
}
