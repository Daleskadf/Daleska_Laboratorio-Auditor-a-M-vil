package D;

import B5.AbstractActivityC0032e;
import a.AbstractC0412a;
import android.os.Handler;
import android.util.SparseArray;
import java.util.concurrent.Executor;
import p.C1608t;
import w.C1893C;
import w.C1926k;
/* renamed from: D.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075z {

    /* renamed from: l  reason: collision with root package name */
    public static final Object f811l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public static final SparseArray f812m = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    public final C f815c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f816d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f817e;
    public C1926k f;

    /* renamed from: g  reason: collision with root package name */
    public C1608t f818g;

    /* renamed from: h  reason: collision with root package name */
    public C1893C f819h;

    /* renamed from: i  reason: collision with root package name */
    public final m0 f820i;
    public final U.l j;

    /* renamed from: a  reason: collision with root package name */
    public final a6.t0 f813a = new a6.t0(1);

    /* renamed from: b  reason: collision with root package name */
    public final Object f814b = new Object();

    /* renamed from: k  reason: collision with root package name */
    public EnumC0074y f821k = EnumC0074y.UNINITIALIZED;

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f7, code lost:
        r3 = r8;
        r8 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0075z(B5.AbstractActivityC0032e r7, R.d r8) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0075z.<init>(B5.e, R.d):void");
    }

    public static void a(Integer num) {
        synchronized (f811l) {
            try {
                if (num == null) {
                    return;
                }
                g0.c.d(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f812m;
                int i7 = 1;
                if (sparseArray.get(num.intValue()) != null) {
                    i7 = 1 + ((Integer) sparseArray.get(num.intValue())).intValue();
                }
                sparseArray.put(num.intValue(), Integer.valueOf(i7));
                if (sparseArray.size() == 0) {
                    org.slf4j.helpers.i.f14637c = 3;
                } else if (sparseArray.get(3) != null) {
                    org.slf4j.helpers.i.f14637c = 3;
                } else if (sparseArray.get(4) != null) {
                    org.slf4j.helpers.i.f14637c = 4;
                } else if (sparseArray.get(5) != null) {
                    org.slf4j.helpers.i.f14637c = 5;
                } else if (sparseArray.get(6) != null) {
                    org.slf4j.helpers.i.f14637c = 6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final U.l b(AbstractActivityC0032e abstractActivityC0032e) {
        boolean z7;
        U.l s7;
        synchronized (this.f814b) {
            if (this.f821k == EnumC0074y.UNINITIALIZED) {
                z7 = true;
            } else {
                z7 = false;
            }
            g0.c.g("CameraX.initInternal() should only be called once per instance", z7);
            this.f821k = EnumC0074y.INITIALIZING;
            s7 = AbstractC0412a.s(new A4.d(2, this, abstractActivityC0032e));
        }
        return s7;
    }

    public final void c() {
        synchronized (this.f814b) {
            this.f821k = EnumC0074y.INITIALIZED;
        }
    }
}
