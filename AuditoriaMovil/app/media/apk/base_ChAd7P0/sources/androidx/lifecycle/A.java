package androidx.lifecycle;
/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public final D f7872a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7873b;

    /* renamed from: c  reason: collision with root package name */
    public int f7874c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C f7875d;

    public A(C c8, D d7) {
        this.f7875d = c8;
        this.f7872a = d7;
    }

    public final void a(boolean z7) {
        int i7;
        boolean z8;
        boolean z9;
        if (z7 == this.f7873b) {
            return;
        }
        this.f7873b = z7;
        if (z7) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        C c8 = this.f7875d;
        int i8 = c8.f7882c;
        c8.f7882c = i7 + i8;
        if (!c8.f7883d) {
            c8.f7883d = true;
            while (true) {
                try {
                    int i9 = c8.f7882c;
                    if (i8 == i9) {
                        break;
                    }
                    if (i8 == 0 && i9 > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (i8 > 0 && i9 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z8) {
                        c8.g();
                    } else if (z9) {
                        c8.h();
                    }
                    i8 = i9;
                } catch (Throwable th) {
                    c8.f7883d = false;
                    throw th;
                }
            }
            c8.f7883d = false;
        }
        if (this.f7873b) {
            c8.c(this);
        }
    }

    public void b() {
    }

    public boolean c(InterfaceC0568u interfaceC0568u) {
        return false;
    }

    public abstract boolean d();
}
