package c6;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Logger;
/* renamed from: c6.c1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657c1 extends AbstractC0656c0 {
    public static final ReferenceQueue f = new ReferenceQueue();

    /* renamed from: g  reason: collision with root package name */
    public static final ConcurrentHashMap f8799g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f8800h = Logger.getLogger(C0657c1.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public final C0654b1 f8801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0657c1(Z0 z02) {
        super(z02);
        ReferenceQueue referenceQueue = f;
        ConcurrentHashMap concurrentHashMap = f8799g;
        this.f8801e = new C0654b1(this, z02, referenceQueue, concurrentHashMap);
    }

    @Override // a6.U
    public final a6.U w() {
        C0654b1 c0654b1 = this.f8801e;
        if (!c0654b1.f8790e.getAndSet(true)) {
            c0654b1.clear();
        }
        Z0 z02 = this.f8798d;
        z02.F();
        return z02;
    }

    @Override // a6.U
    public final a6.U x() {
        C0654b1 c0654b1 = this.f8801e;
        if (!c0654b1.f8790e.getAndSet(true)) {
            c0654b1.clear();
        }
        Z0 z02 = this.f8798d;
        z02.x();
        return z02;
    }
}
