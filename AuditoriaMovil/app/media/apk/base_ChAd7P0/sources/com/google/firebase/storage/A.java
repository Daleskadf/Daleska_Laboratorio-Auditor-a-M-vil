package com.google.firebase.storage;
/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9857a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B.a f9858b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9859c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u f9860d;

    public /* synthetic */ A(B.a aVar, Object obj, u uVar, int i7) {
        this.f9857a = i7;
        this.f9858b = aVar;
        this.f9859c = obj;
        this.f9860d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9857a) {
            case 0:
                ((B) this.f9858b.f227e).a(this.f9859c, this.f9860d);
                return;
            default:
                ((B) this.f9858b.f227e).a(this.f9859c, this.f9860d);
                return;
        }
    }
}
