package S1;

import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public final class D implements I {

    /* renamed from: a  reason: collision with root package name */
    public final C f4929a;

    /* renamed from: b  reason: collision with root package name */
    public final K0.q f4930b = new K0.q(32);

    /* renamed from: c  reason: collision with root package name */
    public int f4931c;

    /* renamed from: d  reason: collision with root package name */
    public int f4932d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4933e;
    public boolean f;

    public D(C c8) {
        this.f4929a = c8;
    }

    @Override // S1.I
    public final void a() {
        this.f = true;
    }

    @Override // S1.I
    public final void b(int i7, K0.q qVar) {
        boolean z7;
        int i8;
        boolean z8;
        if ((i7 & 1) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            i8 = qVar.f2514b + qVar.u();
        } else {
            i8 = -1;
        }
        if (this.f) {
            if (!z7) {
                return;
            }
            this.f = false;
            qVar.G(i8);
            this.f4932d = 0;
        }
        while (qVar.a() > 0) {
            int i9 = this.f4932d;
            K0.q qVar2 = this.f4930b;
            if (i9 < 3) {
                if (i9 == 0) {
                    int u7 = qVar.u();
                    qVar.G(qVar.f2514b - 1);
                    if (u7 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(qVar.a(), 3 - this.f4932d);
                qVar.f(qVar2.f2513a, this.f4932d, min);
                int i10 = this.f4932d + min;
                this.f4932d = i10;
                if (i10 == 3) {
                    qVar2.G(0);
                    qVar2.F(3);
                    qVar2.H(1);
                    int u8 = qVar2.u();
                    int u9 = qVar2.u();
                    if ((u8 & RecognitionOptions.ITF) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.f4933e = z8;
                    int i11 = (((u8 & 15) << 8) | u9) + 3;
                    this.f4931c = i11;
                    byte[] bArr = qVar2.f2513a;
                    if (bArr.length < i11) {
                        qVar2.b(Math.min(4098, Math.max(i11, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(qVar.a(), this.f4931c - this.f4932d);
                qVar.f(qVar2.f2513a, this.f4932d, min2);
                int i12 = this.f4932d + min2;
                this.f4932d = i12;
                int i13 = this.f4931c;
                if (i12 != i13) {
                    continue;
                } else {
                    if (this.f4933e) {
                        if (K0.x.m(0, qVar2.f2513a, i13, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        qVar2.F(this.f4931c - 4);
                    } else {
                        qVar2.F(i13);
                    }
                    qVar2.G(0);
                    this.f4929a.b(qVar2);
                    this.f4932d = 0;
                }
            }
        }
    }

    @Override // S1.I
    public final void c(K0.v vVar, m1.q qVar, H h8) {
        this.f4929a.c(vVar, qVar, h8);
        this.f = true;
    }
}
