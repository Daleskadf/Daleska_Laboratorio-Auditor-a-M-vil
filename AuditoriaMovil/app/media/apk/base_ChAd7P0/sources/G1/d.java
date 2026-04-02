package G1;

import m1.AbstractC1428b;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f1355a;

    /* renamed from: b  reason: collision with root package name */
    public int f1356b;

    /* renamed from: c  reason: collision with root package name */
    public int f1357c;

    /* renamed from: d  reason: collision with root package name */
    public long f1358d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1359e;
    public final K0.q f;

    /* renamed from: g  reason: collision with root package name */
    public final K0.q f1360g;

    /* renamed from: h  reason: collision with root package name */
    public int f1361h;

    /* renamed from: i  reason: collision with root package name */
    public int f1362i;

    public d(K0.q qVar, K0.q qVar2, boolean z7) {
        this.f1360g = qVar;
        this.f = qVar2;
        this.f1359e = z7;
        qVar2.G(12);
        this.f1355a = qVar2.y();
        qVar.G(12);
        this.f1362i = qVar.y();
        AbstractC1428b.e("first_chunk must be 1", qVar.h() == 1);
        this.f1356b = -1;
    }

    public final boolean a() {
        long w2;
        int i7;
        int i8 = this.f1356b + 1;
        this.f1356b = i8;
        if (i8 == this.f1355a) {
            return false;
        }
        boolean z7 = this.f1359e;
        K0.q qVar = this.f;
        if (z7) {
            w2 = qVar.z();
        } else {
            w2 = qVar.w();
        }
        this.f1358d = w2;
        if (this.f1356b == this.f1361h) {
            K0.q qVar2 = this.f1360g;
            this.f1357c = qVar2.y();
            qVar2.H(4);
            int i9 = this.f1362i - 1;
            this.f1362i = i9;
            if (i9 > 0) {
                i7 = qVar2.y() - 1;
            } else {
                i7 = -1;
            }
            this.f1361h = i7;
        }
        return true;
    }
}
