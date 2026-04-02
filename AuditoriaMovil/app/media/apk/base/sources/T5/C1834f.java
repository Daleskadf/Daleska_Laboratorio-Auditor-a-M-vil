package t5;

import android.os.Handler;
import android.os.HandlerThread;
import t4.RunnableC1822b;
/* renamed from: t5.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1834f {

    /* renamed from: a  reason: collision with root package name */
    public final String f15880a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15881b;

    /* renamed from: c  reason: collision with root package name */
    public HandlerThread f15882c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f15883d;

    /* renamed from: e  reason: collision with root package name */
    public RunnableC1822b f15884e;
    public C1833e f;

    public C1834f(String str, int i7) {
        this.f15880a = str;
        this.f15881b = i7;
    }

    public final synchronized void a() {
        HandlerThread handlerThread = this.f15882c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f15882c = null;
            this.f15883d = null;
        }
    }

    public final synchronized void b(RunnableC1822b runnableC1822b) {
        HandlerThread handlerThread = new HandlerThread(this.f15880a, this.f15881b);
        this.f15882c = handlerThread;
        handlerThread.start();
        this.f15883d = new Handler(this.f15882c.getLooper());
        this.f15884e = runnableC1822b;
    }
}
