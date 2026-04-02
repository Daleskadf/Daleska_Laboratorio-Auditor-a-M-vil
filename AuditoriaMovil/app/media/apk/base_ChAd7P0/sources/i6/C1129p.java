package i6;

import a6.AbstractC0482k;
import a6.o0;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: i6.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129p extends AbstractC0482k {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1130q f11550b;

    public C1129p(C1130q c1130q) {
        this.f11550b = c1130q;
    }

    @Override // a6.AbstractC0482k
    public final void m(o0 o0Var) {
        C1124k c1124k = this.f11550b.f11551a;
        boolean e7 = o0Var.e();
        C1127n c1127n = c1124k.f11530a;
        if (c1127n.f11546e != null || c1127n.f != null) {
            if (e7) {
                ((AtomicLong) c1124k.f11531b.f7209b).getAndIncrement();
            } else {
                ((AtomicLong) c1124k.f11531b.f7210c).getAndIncrement();
            }
        }
    }
}
