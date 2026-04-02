package H1;

import K0.q;
import M0.p;
import M0.x;
import java.io.EOFException;
import m1.l;
/* loaded from: classes.dex */
public final class e implements M0.g {

    /* renamed from: a  reason: collision with root package name */
    public int f1936a;

    /* renamed from: b  reason: collision with root package name */
    public int f1937b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1938c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1939d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1940e;

    public e(int i7) {
        switch (i7) {
            case 1:
                this.f1939d = new x(0, (byte) 0);
                this.f1936a = 8000;
                this.f1937b = 8000;
                return;
            default:
                this.f1939d = new f();
                this.f1940e = new q(new byte[65025], 0);
                this.f1936a = -1;
                return;
        }
    }

    @Override // M0.g
    public M0.h a() {
        return new p((String) this.f1940e, this.f1936a, this.f1937b, this.f1938c, (x) this.f1939d);
    }

    public int b(int i7) {
        int i8;
        int i9 = 0;
        this.f1937b = 0;
        do {
            int i10 = this.f1937b;
            int i11 = i7 + i10;
            f fVar = (f) this.f1939d;
            if (i11 >= fVar.f1943c) {
                break;
            }
            int[] iArr = fVar.f;
            this.f1937b = i10 + 1;
            i8 = iArr[i10 + i7];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public boolean c(l lVar) {
        boolean z7;
        boolean z8;
        int i7;
        if (lVar != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        boolean z9 = this.f1938c;
        q qVar = (q) this.f1940e;
        if (z9) {
            this.f1938c = false;
            qVar.D(0);
        }
        while (!this.f1938c) {
            int i8 = this.f1936a;
            f fVar = (f) this.f1939d;
            if (i8 < 0) {
                if (fVar.b(lVar, -1L) && fVar.a(lVar, true)) {
                    int i9 = fVar.f1944d;
                    if ((fVar.f1941a & 1) == 1 && qVar.f2515c == 0) {
                        i9 += b(0);
                        i7 = this.f1937b;
                    } else {
                        i7 = 0;
                    }
                    try {
                        lVar.m(i9);
                        this.f1936a = i7;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int b5 = b(this.f1936a);
            int i10 = this.f1936a + this.f1937b;
            if (b5 > 0) {
                qVar.b(qVar.f2515c + b5);
                try {
                    lVar.f(qVar.f2513a, qVar.f2515c, b5, false);
                    qVar.F(qVar.f2515c + b5);
                    if (fVar.f[i10 - 1] != 255) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.f1938c = z8;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i10 == fVar.f1943c) {
                i10 = -1;
            }
            this.f1936a = i10;
        }
        return true;
    }
}
