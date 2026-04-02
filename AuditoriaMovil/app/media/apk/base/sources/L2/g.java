package l2;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.s;
import m2.InterfaceC1435a;
import o2.AbstractC1555g;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g f13830a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final l6.g f13831b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1415a f13832c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l2.g] */
    static {
        s.a(h.class).c();
        f13831b = m5.d.m(f.f13829a);
        f13832c = C1415a.f13812a;
    }

    public static b a(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        InterfaceC1435a interfaceC1435a = (InterfaceC1435a) f13831b.a();
        if (interfaceC1435a == null) {
            o2.j jVar = o2.j.f14567c;
            if (o2.j.f14567c == null) {
                ReentrantLock reentrantLock = o2.j.f14568d;
                reentrantLock.lock();
                try {
                    if (o2.j.f14567c == null) {
                        o2.h hVar = null;
                        try {
                            i2.l c8 = AbstractC1555g.c();
                            if (c8 != null) {
                                i2.l other = i2.l.f;
                                kotlin.jvm.internal.j.e(other, "other");
                                Object a7 = c8.f11472e.a();
                                kotlin.jvm.internal.j.d(a7, "<get-bigInteger>(...)");
                                Object a8 = other.f11472e.a();
                                kotlin.jvm.internal.j.d(a8, "<get-bigInteger>(...)");
                                if (((BigInteger) a7).compareTo((BigInteger) a8) >= 0) {
                                    o2.h hVar2 = new o2.h(context);
                                    if (hVar2.i()) {
                                        hVar = hVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        o2.j.f14567c = new o2.j(hVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC1435a = o2.j.f14567c;
            kotlin.jvm.internal.j.b(interfaceC1435a);
        }
        int i7 = o.f13845b;
        b bVar = new b(interfaceC1435a);
        f13832c.getClass();
        return bVar;
    }
}
