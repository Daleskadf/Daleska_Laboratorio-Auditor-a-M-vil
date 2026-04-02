package e1;

import android.os.Handler;
import java.util.HashMap;
/* renamed from: e1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0945j extends AbstractC0936a {

    /* renamed from: Y  reason: collision with root package name */
    public final HashMap f10809Y = new HashMap();

    /* renamed from: Z  reason: collision with root package name */
    public Handler f10810Z;

    /* renamed from: e0  reason: collision with root package name */
    public M0.C f10811e0;

    @Override // e1.AbstractC0936a
    public final void d() {
        for (C0944i c0944i : this.f10809Y.values()) {
            c0944i.f10806a.c(c0944i.f10807b);
        }
    }

    @Override // e1.AbstractC0936a
    public final void f() {
        for (C0944i c0944i : this.f10809Y.values()) {
            c0944i.f10806a.e(c0944i.f10807b);
        }
    }

    @Override // e1.AbstractC0936a
    public void k() {
        for (C0944i c0944i : this.f10809Y.values()) {
            c0944i.f10806a.k();
        }
    }

    @Override // e1.AbstractC0936a
    public void q() {
        HashMap hashMap = this.f10809Y;
        for (C0944i c0944i : hashMap.values()) {
            c0944i.f10806a.p(c0944i.f10807b);
            E.e eVar = c0944i.f10808c;
            AbstractC0936a abstractC0936a = c0944i.f10806a;
            abstractC0936a.s(eVar);
            abstractC0936a.r(eVar);
        }
        hashMap.clear();
    }

    public abstract C0960z u(Object obj, C0960z c0960z);

    public abstract void x(Object obj, AbstractC0936a abstractC0936a, H0.V v6);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [e1.A, e1.h] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, e1.C] */
    public final void z(final Object obj, AbstractC0936a abstractC0936a) {
        HashMap hashMap = this.f10809Y;
        K0.a.e(!hashMap.containsKey(obj));
        ?? r12 = new InterfaceC0931A() { // from class: e1.h
            @Override // e1.InterfaceC0931A
            public final void a(AbstractC0936a abstractC0936a2, H0.V v6) {
                AbstractC0945j.this.x(obj, abstractC0936a2, v6);
            }
        };
        E.e eVar = new E.e(this, obj);
        hashMap.put(obj, new C0944i(abstractC0936a, r12, eVar));
        Handler handler = this.f10810Z;
        handler.getClass();
        abstractC0936a.getClass();
        T0.d dVar = abstractC0936a.f10773c;
        dVar.getClass();
        ?? obj2 = new Object();
        obj2.f10620a = handler;
        obj2.f10621b = eVar;
        dVar.f5289c.add(obj2);
        this.f10810Z.getClass();
        T0.d dVar2 = abstractC0936a.f10774d;
        dVar2.getClass();
        ?? obj3 = new Object();
        obj3.f5286a = eVar;
        dVar2.f5289c.add(obj3);
        M0.C c8 = this.f10811e0;
        P0.k kVar = this.f10770X;
        K0.a.k(kVar);
        abstractC0936a.l(r12, c8, kVar);
        if (this.f10772b.isEmpty()) {
            abstractC0936a.c(r12);
        }
    }

    public long v(Object obj, long j) {
        return j;
    }

    public int w(int i7, Object obj) {
        return i7;
    }
}
