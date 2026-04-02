package i6;

import a6.C0487p;
import a6.EnumC0477f;
import a6.t0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: i6.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1124k {

    /* renamed from: a  reason: collision with root package name */
    public C1127n f11530a;

    /* renamed from: d  reason: collision with root package name */
    public Long f11533d;

    /* renamed from: e  reason: collision with root package name */
    public int f11534e;

    /* renamed from: b  reason: collision with root package name */
    public volatile t0 f11531b = new t0(19);

    /* renamed from: c  reason: collision with root package name */
    public t0 f11532c = new t0(19);
    public final HashSet f = new HashSet();

    public C1124k(C1127n c1127n) {
        this.f11530a = c1127n;
    }

    public final void a(C1131r c1131r) {
        if (d() && !c1131r.f11555c) {
            c1131r.r();
        } else if (!d() && c1131r.f11555c) {
            c1131r.f11555c = false;
            C0487p c0487p = c1131r.f11556d;
            if (c0487p != null) {
                c1131r.f11557e.a(c0487p);
                c1131r.f.m(EnumC0477f.INFO, "Subchannel unejected: {0}", c1131r);
            }
        }
        c1131r.f11554b = this;
        this.f.add(c1131r);
    }

    public final void b(long j) {
        this.f11533d = Long.valueOf(j);
        this.f11534e++;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((C1131r) it.next()).r();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f11532c.f7210c).get() + ((AtomicLong) this.f11532c.f7209b).get();
    }

    public final boolean d() {
        if (this.f11533d != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        boolean z7;
        if (this.f11533d != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("not currently ejected", z7);
        this.f11533d = null;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            C1131r c1131r = (C1131r) it.next();
            c1131r.f11555c = false;
            C0487p c0487p = c1131r.f11556d;
            if (c0487p != null) {
                c1131r.f11557e.a(c0487p);
                c1131r.f.m(EnumC0477f.INFO, "Subchannel unejected: {0}", c1131r);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f + '}';
    }
}
