package c6;

import a6.AbstractC0478g;
import a6.EnumC0477f;
import java.text.MessageFormat;
import java.util.logging.Level;
/* renamed from: c6.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685m extends AbstractC0478g {

    /* renamed from: d  reason: collision with root package name */
    public final C0694p f8907d;

    /* renamed from: e  reason: collision with root package name */
    public final q2 f8908e;

    public C0685m(C0694p c0694p, q2 q2Var) {
        this.f8907d = c0694p;
        G.i.j(q2Var, "time");
        this.f8908e = q2Var;
    }

    public static Level t(EnumC0477f enumC0477f) {
        int i7 = AbstractC0682l.f8881a[enumC0477f.ordinal()];
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return Level.FINEST;
            }
            return Level.FINER;
        }
        return Level.FINE;
    }

    @Override // a6.AbstractC0478g
    public final void l(EnumC0477f enumC0477f, String str) {
        a6.C c8;
        C0694p c0694p = this.f8907d;
        a6.H h8 = c0694p.f8951b;
        Level t7 = t(enumC0477f);
        if (C0694p.f8949c.isLoggable(t7)) {
            C0694p.a(h8, t7, str);
        }
        if (s(enumC0477f) && enumC0477f != EnumC0477f.DEBUG) {
            int i7 = AbstractC0682l.f8881a[enumC0477f.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    c8 = a6.C.CT_INFO;
                } else {
                    c8 = a6.C.CT_WARNING;
                }
            } else {
                c8 = a6.C.CT_ERROR;
            }
            a6.C c9 = c8;
            long c10 = this.f8908e.c();
            G.i.j(str, "description");
            G.i.j(c9, "severity");
            new a6.D(str, c9, c10, null);
            synchronized (c0694p.f8950a) {
            }
        }
    }

    @Override // a6.AbstractC0478g
    public final void m(EnumC0477f enumC0477f, String str, Object... objArr) {
        String format;
        Level t7 = t(enumC0477f);
        if (!s(enumC0477f) && !C0694p.f8949c.isLoggable(t7)) {
            format = null;
        } else {
            format = MessageFormat.format(str, objArr);
        }
        l(enumC0477f, format);
    }

    public final boolean s(EnumC0477f enumC0477f) {
        if (enumC0477f != EnumC0477f.DEBUG) {
            synchronized (this.f8907d.f8950a) {
            }
        }
        return false;
    }
}
