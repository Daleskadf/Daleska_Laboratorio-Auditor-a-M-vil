package org.slf4j.helpers;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public final class g implements g7.b {

    /* renamed from: X  reason: collision with root package name */
    public final boolean f14629X;

    /* renamed from: a  reason: collision with root package name */
    public final String f14630a;

    /* renamed from: b  reason: collision with root package name */
    public volatile g7.b f14631b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f14632c;

    /* renamed from: d  reason: collision with root package name */
    public Method f14633d;

    /* renamed from: e  reason: collision with root package name */
    public h7.a f14634e;
    public final LinkedBlockingQueue f;

    public g(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z7) {
        this.f14630a = str;
        this.f = linkedBlockingQueue;
        this.f14629X = z7;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h7.a, java.lang.Object] */
    public final g7.b A() {
        if (this.f14631b != null) {
            return this.f14631b;
        }
        if (this.f14629X) {
            return b.f14624a;
        }
        if (this.f14634e == null) {
            ?? obj = new Object();
            obj.f11346b = this;
            obj.f11345a = this.f14630a;
            obj.f11347c = this.f;
            this.f14634e = obj;
        }
        return this.f14634e;
    }

    public final boolean B() {
        Boolean bool = this.f14632c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f14633d = this.f14631b.getClass().getMethod("log", h7.c.class);
            this.f14632c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f14632c = Boolean.FALSE;
        }
        return this.f14632c.booleanValue();
    }

    @Override // g7.b
    public final void a(String str, Object obj) {
        A().a(str, obj);
    }

    @Override // g7.b
    public final void b(String str, Object... objArr) {
        A().b(str, objArr);
    }

    @Override // g7.b
    public final boolean c() {
        return A().c();
    }

    @Override // g7.b
    public final boolean d() {
        return A().d();
    }

    @Override // g7.b
    public final void e(Object... objArr) {
        A().e(objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass() && this.f14630a.equals(((g) obj).f14630a)) {
            return true;
        }
        return false;
    }

    @Override // g7.b
    public final void f(Integer num, String str) {
        A().f(num, str);
    }

    @Override // g7.b
    public final void g(String str, Throwable th) {
        A().g(str, th);
    }

    @Override // g7.b
    public final String getName() {
        return this.f14630a;
    }

    @Override // g7.b
    public final void h(Object obj, String str) {
        A().h(obj, str);
    }

    public final int hashCode() {
        return this.f14630a.hashCode();
    }

    @Override // g7.b
    public final void i(String str, Throwable th) {
        A().i(str, th);
    }

    @Override // g7.b
    public final void j(String str, Throwable th) {
        A().j(str, th);
    }

    @Override // g7.b
    public final void k(String str) {
        A().k(str);
    }

    @Override // g7.b
    public final void l(String str) {
        A().l(str);
    }

    @Override // g7.b
    public final void m(String str) {
        A().m(str);
    }

    @Override // g7.b
    public final boolean n() {
        return A().n();
    }

    @Override // g7.b
    public final void o(String str, Object... objArr) {
        A().o(str, objArr);
    }

    @Override // g7.b
    public final void p(Object obj, Object obj2, String str) {
        A().p(obj, obj2, str);
    }

    @Override // g7.b
    public final void q(Object obj, String str) {
        A().q(obj, str);
    }

    @Override // g7.b
    public final boolean r() {
        return A().r();
    }

    @Override // g7.b
    public final boolean s(h7.b bVar) {
        return A().s(bVar);
    }

    @Override // g7.b
    public final void t(String str) {
        A().t(str);
    }

    @Override // g7.b
    public final boolean u() {
        return A().u();
    }

    @Override // g7.b
    public final void v(String str, Object obj, Serializable serializable) {
        A().v(str, obj, serializable);
    }

    @Override // g7.b
    public final void w(String str, Object obj, Serializable serializable) {
        A().w(str, obj, serializable);
    }

    @Override // g7.b
    public final void x(Integer num, String str) {
        A().x(num, str);
    }

    @Override // g7.b
    public final void y(String str, Serializable serializable) {
        A().y(str, serializable);
    }

    @Override // g7.b
    public final void z(String str, Object obj, Serializable serializable) {
        A().z(str, obj, serializable);
    }
}
