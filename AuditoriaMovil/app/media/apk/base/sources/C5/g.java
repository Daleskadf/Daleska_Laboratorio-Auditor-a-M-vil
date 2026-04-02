package C5;

import B5.AbstractActivityC0032e;
import H0.L;
import K0.s;
import O0.N;
import O0.S;
import O0.m0;
/* loaded from: classes.dex */
public final class g implements S {

    /* renamed from: a  reason: collision with root package name */
    public boolean f585a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f586b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f587c;

    /* renamed from: d  reason: collision with root package name */
    public Object f588d;

    /* renamed from: e  reason: collision with root package name */
    public Object f589e;
    public Object f;

    public g(N n7, s sVar) {
        this.f588d = n7;
        this.f587c = new m0(sVar);
        this.f585a = true;
    }

    @Override // O0.S
    public boolean a() {
        if (this.f585a) {
            ((m0) this.f587c).getClass();
            return false;
        }
        S s7 = (S) this.f;
        s7.getClass();
        return s7.a();
    }

    @Override // O0.S
    public L c() {
        S s7 = (S) this.f;
        if (s7 != null) {
            return s7.c();
        }
        return ((m0) this.f587c).f3806e;
    }

    @Override // O0.S
    public long d() {
        if (this.f585a) {
            return ((m0) this.f587c).d();
        }
        S s7 = (S) this.f;
        s7.getClass();
        return s7.d();
    }

    @Override // O0.S
    public void e(L l8) {
        S s7 = (S) this.f;
        if (s7 != null) {
            s7.e(l8);
            l8 = ((S) this.f).c();
        }
        ((m0) this.f587c).e(l8);
    }

    public g(AbstractActivityC0032e abstractActivityC0032e) {
        this.f585a = true;
        this.f586b = false;
        this.f587c = abstractActivityC0032e;
    }
}
