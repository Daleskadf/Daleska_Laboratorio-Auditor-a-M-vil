package F6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: F6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080c extends AbstractC0099l0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1256Y = AtomicReferenceFieldUpdater.newUpdater(C0080c.class, Object.class, "_disposer");

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C0084e f1257X;
    private volatile Object _disposer;

    /* renamed from: e  reason: collision with root package name */
    public final C0100m f1258e;
    public S f;

    public C0080c(C0084e c0084e, C0100m c0100m) {
        this.f1257X = c0084e;
        this.f1258e = c0100m;
    }

    @Override // w6.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return l6.j.f13876a;
    }

    @Override // F6.AbstractC0099l0
    public final void j(Throwable th) {
        C0100m c0100m = this.f1258e;
        if (th != null) {
            c0100m.getClass();
            K6.w D4 = c0100m.D(new C0108v(false, th), null);
            if (D4 != null) {
                c0100m.f(D4);
                C0082d c0082d = (C0082d) f1256Y.get(this);
                if (c0082d != null) {
                    c0082d.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0084e.f1262b;
        C0084e c0084e = this.f1257X;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0084e) == 0) {
            K[] kArr = c0084e.f1263a;
            ArrayList arrayList = new ArrayList(kArr.length);
            for (K k2 : kArr) {
                arrayList.add(k2.getCompleted());
            }
            c0100m.resumeWith(arrayList);
        }
    }
}
