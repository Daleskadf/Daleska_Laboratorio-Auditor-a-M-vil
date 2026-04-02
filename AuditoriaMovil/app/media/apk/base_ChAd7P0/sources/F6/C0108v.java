package F6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: F6.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0108v {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1315b = AtomicIntegerFieldUpdater.newUpdater(C0108v.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f1316a;

    public C0108v(boolean z7, Throwable th) {
        this.f1316a = th;
        this._handled = z7 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1316a + ']';
    }
}
