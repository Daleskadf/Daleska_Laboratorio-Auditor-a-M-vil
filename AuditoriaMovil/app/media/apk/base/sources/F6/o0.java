package F6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class o0 implements InterfaceC0085e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1292b = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_isCompleting");

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1293c = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "_rootCause");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1294d = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a  reason: collision with root package name */
    public final y0 f1295a;

    public o0(y0 y0Var, Throwable th) {
        this.f1295a = y0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable b5 = b();
        if (b5 == null) {
            f1293c.set(this, th);
        } else if (th == b5) {
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1294d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
            } else if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final Throwable b() {
        return (Throwable) f1293c.get(this);
    }

    @Override // F6.InterfaceC0085e0
    public final y0 c() {
        return this.f1295a;
    }

    public final boolean d() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f1292b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1294d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable b5 = b();
        if (b5 != null) {
            arrayList.add(0, b5);
        }
        if (th != null && !th.equals(b5)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, H.f1226h);
        return arrayList;
    }

    @Override // F6.InterfaceC0085e0
    public final boolean isActive() {
        if (b() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + f1294d.get(this) + ", list=" + this.f1295a + ']';
    }
}
