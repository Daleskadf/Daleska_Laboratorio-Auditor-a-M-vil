package c6;

import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.C0487p;
import a6.EnumC0486o;
/* renamed from: c6.x1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719x1 implements a6.P {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC0471A f9033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B1 f9034b;

    public C0719x1(B1 b12, AbstractC0471A abstractC0471A) {
        this.f9034b = b12;
        this.f9033a = abstractC0471A;
    }

    @Override // a6.P
    public final void a(C0487p c0487p) {
        a6.O c0710u1;
        B1 b12 = this.f9034b;
        b12.getClass();
        EnumC0486o enumC0486o = c0487p.f7186a;
        if (enumC0486o != EnumC0486o.SHUTDOWN) {
            EnumC0486o enumC0486o2 = EnumC0486o.TRANSIENT_FAILURE;
            AbstractC0478g abstractC0478g = b12.f;
            if (enumC0486o == enumC0486o2 || enumC0486o == EnumC0486o.IDLE) {
                abstractC0478g.q();
            }
            if (b12.f8431h == enumC0486o2) {
                if (enumC0486o != EnumC0486o.CONNECTING) {
                    if (enumC0486o == EnumC0486o.IDLE) {
                        b12.e();
                        return;
                    }
                } else {
                    return;
                }
            }
            int i7 = AbstractC0722y1.f9057a[enumC0486o.ordinal()];
            AbstractC0471A abstractC0471A = this.f9033a;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            c0710u1 = new A1(a6.M.a(c0487p.f7187b));
                        } else {
                            throw new IllegalArgumentException("Unsupported state:" + enumC0486o);
                        }
                    } else {
                        c0710u1 = new A1(a6.M.b(abstractC0471A, null));
                    }
                } else {
                    c0710u1 = new A1(a6.M.f7091e);
                }
            } else {
                c0710u1 = new C0710u1(b12, abstractC0471A);
            }
            b12.f8431h = enumC0486o;
            abstractC0478g.r(enumC0486o, c0710u1);
        }
    }
}
