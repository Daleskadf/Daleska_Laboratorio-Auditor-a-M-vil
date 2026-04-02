package androidx.lifecycle;

import w.C1937v;
/* loaded from: classes.dex */
public final class B implements D {

    /* renamed from: a  reason: collision with root package name */
    public final C f7876a;

    /* renamed from: b  reason: collision with root package name */
    public final C1937v f7877b;

    /* renamed from: c  reason: collision with root package name */
    public int f7878c = -1;

    public B(C c8, C1937v c1937v) {
        this.f7876a = c8;
        this.f7877b = c1937v;
    }

    @Override // androidx.lifecycle.D
    public final void a(Object obj) {
        int i7 = this.f7878c;
        int i8 = this.f7876a.f7885g;
        if (i7 != i8) {
            this.f7878c = i8;
            this.f7877b.a(obj);
        }
    }

    public final void b() {
        this.f7876a.f(this);
    }
}
