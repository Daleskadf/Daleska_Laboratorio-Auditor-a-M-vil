package androidx.camera.core.impl;

import D.RunnableC0053c;
import a.AbstractC0412a;
import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: k  reason: collision with root package name */
    public static final Size f7544k = new Size(0, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f7545l = org.slf4j.helpers.i.D("DeferrableSurface");

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicInteger f7546m = new AtomicInteger(0);

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicInteger f7547n = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f7548a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int f7549b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7550c = false;

    /* renamed from: d  reason: collision with root package name */
    public U.i f7551d;

    /* renamed from: e  reason: collision with root package name */
    public final U.l f7552e;
    public U.i f;

    /* renamed from: g  reason: collision with root package name */
    public final U.l f7553g;

    /* renamed from: h  reason: collision with root package name */
    public final Size f7554h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7555i;
    public Class j;

    public J(Size size, int i7) {
        this.f7554h = size;
        this.f7555i = i7;
        U.l s7 = AbstractC0412a.s(new U.j(this) { // from class: androidx.camera.core.impl.H

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ J f7542b;

            {
                this.f7542b = this;
            }

            private final Object a(U.i iVar) {
                J j = this.f7542b;
                synchronized (j.f7548a) {
                    j.f7551d = iVar;
                }
                return "DeferrableSurface-termination(" + j + ")";
            }

            @Override // U.j
            public final Object i(U.i iVar) {
                switch (r2) {
                    case 0:
                        return a(iVar);
                    default:
                        J j = this.f7542b;
                        synchronized (j.f7548a) {
                            j.f = iVar;
                        }
                        return "DeferrableSurface-close(" + j + ")";
                }
            }
        });
        this.f7552e = s7;
        this.f7553g = AbstractC0412a.s(new U.j(this) { // from class: androidx.camera.core.impl.H

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ J f7542b;

            {
                this.f7542b = this;
            }

            private final Object a(U.i iVar) {
                J j = this.f7542b;
                synchronized (j.f7548a) {
                    j.f7551d = iVar;
                }
                return "DeferrableSurface-termination(" + j + ")";
            }

            @Override // U.j
            public final Object i(U.i iVar) {
                switch (r2) {
                    case 0:
                        return a(iVar);
                    default:
                        J j = this.f7542b;
                        synchronized (j.f7548a) {
                            j.f = iVar;
                        }
                        return "DeferrableSurface-close(" + j + ")";
                }
            }
        });
        if (org.slf4j.helpers.i.D("DeferrableSurface")) {
            e(f7547n.incrementAndGet(), f7546m.get(), "Surface created");
            s7.f5535b.a(new RunnableC0053c(26, this, Log.getStackTraceString(new Exception())), j3.f.r());
        }
    }

    public void a() {
        U.i iVar;
        synchronized (this.f7548a) {
            try {
                if (!this.f7550c) {
                    this.f7550c = true;
                    this.f.a(null);
                    if (this.f7549b == 0) {
                        iVar = this.f7551d;
                        this.f7551d = null;
                    } else {
                        iVar = null;
                    }
                    if (org.slf4j.helpers.i.D("DeferrableSurface")) {
                        org.slf4j.helpers.i.l("DeferrableSurface", "surface closed,  useCount=" + this.f7549b + " closed=true " + this);
                    }
                } else {
                    iVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVar != null) {
            iVar.a(null);
        }
    }

    public final void b() {
        U.i iVar;
        synchronized (this.f7548a) {
            try {
                int i7 = this.f7549b;
                if (i7 != 0) {
                    int i8 = i7 - 1;
                    this.f7549b = i8;
                    if (i8 == 0 && this.f7550c) {
                        iVar = this.f7551d;
                        this.f7551d = null;
                    } else {
                        iVar = null;
                    }
                    if (org.slf4j.helpers.i.D("DeferrableSurface")) {
                        org.slf4j.helpers.i.l("DeferrableSurface", "use count-1,  useCount=" + this.f7549b + " closed=" + this.f7550c + StringUtils.SPACE + this);
                        if (this.f7549b == 0) {
                            e(f7547n.get(), f7546m.decrementAndGet(), "Surface no longer in use");
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVar != null) {
            iVar.a(null);
        }
    }

    public final E3.b c() {
        synchronized (this.f7548a) {
            try {
                if (this.f7550c) {
                    return new H.k(new I("DeferrableSurface already closed.", this), 1);
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f7548a) {
            try {
                int i7 = this.f7549b;
                if (i7 == 0 && this.f7550c) {
                    throw new I("Cannot begin use on a closed surface.", this);
                }
                this.f7549b = i7 + 1;
                if (org.slf4j.helpers.i.D("DeferrableSurface")) {
                    if (this.f7549b == 1) {
                        e(f7547n.get(), f7546m.incrementAndGet(), "New surface in use");
                    }
                    org.slf4j.helpers.i.l("DeferrableSurface", "use count+1, useCount=" + this.f7549b + StringUtils.SPACE + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i7, int i8, String str) {
        if (!f7545l && org.slf4j.helpers.i.D("DeferrableSurface")) {
            org.slf4j.helpers.i.l("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        org.slf4j.helpers.i.l("DeferrableSurface", str + "[total_surfaces=" + i7 + ", used_surfaces=" + i8 + "](" + this + "}");
    }

    public abstract E3.b f();
}
