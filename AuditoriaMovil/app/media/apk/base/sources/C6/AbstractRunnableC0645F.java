package c6;

import a6.C0489s;
import d6.C0906c;
import java.io.IOException;
/* renamed from: c6.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0645F implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8449a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8450b;

    public /* synthetic */ AbstractRunnableC0645F(Object obj, int i7) {
        this.f8449a = i7;
        this.f8450b = obj;
    }

    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8449a) {
            case 0:
                C0489s c0489s = (C0489s) this.f8450b;
                C0489s a7 = c0489s.a();
                try {
                    b();
                    return;
                } finally {
                    c0489s.c(a7);
                }
            default:
                C0906c c0906c = (C0906c) this.f8450b;
                try {
                    if (c0906c.f10361Z != null) {
                        a();
                        return;
                    }
                    throw new IOException("Unable to perform write due to unavailable sink.");
                } catch (Exception e7) {
                    c0906c.f10365d.q(e7);
                    return;
                }
        }
    }
}
