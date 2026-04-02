package O6;

import F6.C0100m;
import F6.H;
import K6.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o6.EnumC1565a;
import p6.AbstractC1700c;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3872g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z7) {
        super(z7 ? 1 : 0);
        w wVar;
        if (z7) {
            wVar = null;
        } else {
            wVar = e.f3873a;
        }
        this.owner = wVar;
    }

    public final Object c(AbstractC1700c abstractC1700c) {
        boolean d7 = d(null);
        l6.j jVar = l6.j.f13876a;
        if (!d7) {
            C0100m k2 = H.k(AbstractC1740d.q(abstractC1700c));
            try {
                a(new c(this, k2));
                Object r7 = k2.r();
                EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
                if (r7 != enumC1565a) {
                    r7 = jVar;
                }
                if (r7 == enumC1565a) {
                    return r7;
                }
                return jVar;
            } catch (Throwable th) {
                k2.z();
                throw th;
            }
        }
        return jVar;
    }

    public final boolean d(Object obj) {
        int i7;
        boolean z7;
        boolean z8;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3872g;
                if (i8 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) == 0) {
                                Object obj2 = atomicReferenceFieldUpdater.get(this);
                                if (obj2 != e.f3873a) {
                                    if (obj2 == obj) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                }
                            } else {
                                z8 = false;
                                break;
                            }
                        }
                        if (!z8) {
                            if (z8) {
                                break;
                            }
                        } else {
                            z7 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    z7 = false;
                    break;
                }
            }
        }
        z7 = true;
        if (!z7) {
            return true;
        }
        if (z7) {
            return false;
        }
        if (!z7) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3872g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            w wVar = e.f3873a;
            if (obj2 != wVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, wVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(H.j(this));
        sb.append("[isLocked=");
        boolean z7 = false;
        if (Math.max(h.f.get(this), 0) == 0) {
            z7 = true;
        }
        sb.append(z7);
        sb.append(",owner=");
        sb.append(f3872g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
