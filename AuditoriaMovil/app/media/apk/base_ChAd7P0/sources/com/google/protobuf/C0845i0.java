package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
/* renamed from: com.google.protobuf.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final F f10073b = new F(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f10074a;

    public C0845i0(AbstractC0865t abstractC0865t) {
        V.a(abstractC0865t, "output");
        this.f10074a = abstractC0865t;
        abstractC0865t.f10138c = this;
    }

    public void a(AbstractC0852m abstractC0852m) {
        if (abstractC0852m.p()) {
            int binarySearch = Arrays.binarySearch(D0.f9995Z, abstractC0852m.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int y2 = D0.y(binarySearch + 1);
            ArrayDeque arrayDeque = (ArrayDeque) this.f10074a;
            if (!arrayDeque.isEmpty() && ((AbstractC0852m) arrayDeque.peek()).size() < y2) {
                int y3 = D0.y(binarySearch);
                AbstractC0852m abstractC0852m2 = (AbstractC0852m) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((AbstractC0852m) arrayDeque.peek()).size() < y3) {
                    abstractC0852m2 = new D0((AbstractC0852m) arrayDeque.pop(), abstractC0852m2);
                }
                D0 d02 = new D0(abstractC0852m2, abstractC0852m);
                while (!arrayDeque.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(D0.f9995Z, d02.f9998d);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((AbstractC0852m) arrayDeque.peek()).size() >= D0.y(binarySearch2 + 1)) {
                        break;
                    }
                    d02 = new D0((AbstractC0852m) arrayDeque.pop(), d02);
                }
                arrayDeque.push(d02);
                return;
            }
            arrayDeque.push(abstractC0852m);
        } else if (abstractC0852m instanceof D0) {
            D0 d03 = (D0) abstractC0852m;
            a(d03.f9999e);
            a(d03.f);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC0852m.getClass());
        }
    }

    public void b(int i7, boolean z7) {
        ((AbstractC0865t) this.f10074a).w0(i7, z7);
    }

    public void c(int i7, AbstractC0852m abstractC0852m) {
        ((AbstractC0865t) this.f10074a).y0(i7, abstractC0852m);
    }

    public void d(int i7, double d7) {
        AbstractC0865t abstractC0865t = (AbstractC0865t) this.f10074a;
        abstractC0865t.getClass();
        abstractC0865t.C0(i7, Double.doubleToRawLongBits(d7));
    }

    public void e(int i7, int i8) {
        ((AbstractC0865t) this.f10074a).E0(i7, i8);
    }

    public void f(int i7, int i8) {
        ((AbstractC0865t) this.f10074a).A0(i7, i8);
    }

    public void g(int i7, long j) {
        ((AbstractC0865t) this.f10074a).C0(i7, j);
    }

    public void h(float f, int i7) {
        AbstractC0865t abstractC0865t = (AbstractC0865t) this.f10074a;
        abstractC0865t.getClass();
        abstractC0865t.A0(i7, Float.floatToRawIntBits(f));
    }

    public void i(int i7, Object obj, E0 e02) {
        AbstractC0865t abstractC0865t = (AbstractC0865t) this.f10074a;
        abstractC0865t.K0(i7, 3);
        e02.e((AbstractC0828a) obj, abstractC0865t.f10138c);
        abstractC0865t.K0(i7, 4);
    }

    public void j(int i7, int i8) {
        ((AbstractC0865t) this.f10074a).E0(i7, i8);
    }

    public void k(int i7, long j) {
        ((AbstractC0865t) this.f10074a).N0(i7, j);
    }

    public void l(int i7, Object obj, E0 e02) {
        ((AbstractC0865t) this.f10074a).G0(i7, (AbstractC0828a) obj, e02);
    }

    public void m(int i7, int i8) {
        ((AbstractC0865t) this.f10074a).A0(i7, i8);
    }

    public void n(int i7, long j) {
        ((AbstractC0865t) this.f10074a).C0(i7, j);
    }

    public void o(int i7, int i8) {
        ((AbstractC0865t) this.f10074a).L0(i7, (i8 >> 31) ^ (i8 << 1));
    }

    public void p(int i7, long j) {
        ((AbstractC0865t) this.f10074a).N0(i7, (j >> 63) ^ (j << 1));
    }

    public void q(int i7, int i8) {
        ((AbstractC0865t) this.f10074a).L0(i7, i8);
    }

    public void r(int i7, long j) {
        ((AbstractC0865t) this.f10074a).N0(i7, j);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.protobuf.h0, java.lang.Object] */
    public C0845i0(int i7) {
        InterfaceC0857o0 interfaceC0857o0;
        switch (i7) {
            case 2:
                this.f10074a = new ArrayDeque();
                return;
            default:
                try {
                    interfaceC0857o0 = (InterfaceC0857o0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC0857o0 = f10073b;
                }
                InterfaceC0857o0[] interfaceC0857o0Arr = {F.f10000b, interfaceC0857o0};
                ?? obj = new Object();
                obj.f10072a = interfaceC0857o0Arr;
                Charset charset = V.f10033a;
                this.f10074a = obj;
                return;
        }
    }
}
