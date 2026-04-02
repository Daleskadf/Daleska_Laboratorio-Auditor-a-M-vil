package F6;

import java.util.concurrent.locks.LockSupport;
/* renamed from: F6.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090h extends AbstractC0076a {

    /* renamed from: d  reason: collision with root package name */
    public final Thread f1274d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0077a0 f1275e;

    public C0090h(n6.i iVar, Thread thread, AbstractC0077a0 abstractC0077a0) {
        super(iVar, true);
        this.f1274d = thread;
        this.f1275e = abstractC0077a0;
    }

    @Override // F6.u0
    public final void h(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f1274d;
        if (!kotlin.jvm.internal.j.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
