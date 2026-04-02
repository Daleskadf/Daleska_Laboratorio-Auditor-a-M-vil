package G1;
/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public final int f1375a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1376b;

    /* renamed from: c  reason: collision with root package name */
    public int f1377c;

    /* renamed from: d  reason: collision with root package name */
    public int f1378d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1379e;

    public i(int i7, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f1375a = i8;
        this.f1376b = i9;
        this.f1377c = i10;
        this.f1378d = i11;
        this.f1379e = bArr;
    }

    @Override // G1.f
    public int a() {
        return -1;
    }

    @Override // G1.f
    public int b() {
        return this.f1375a;
    }

    @Override // G1.f
    public int c() {
        K0.q qVar = (K0.q) this.f1379e;
        int i7 = this.f1376b;
        if (i7 == 8) {
            return qVar.u();
        }
        if (i7 == 16) {
            return qVar.A();
        }
        int i8 = this.f1377c;
        this.f1377c = i8 + 1;
        if (i8 % 2 == 0) {
            int u7 = qVar.u();
            this.f1378d = u7;
            return (u7 & 240) >> 4;
        }
        return this.f1378d & 15;
    }

    public i(b bVar) {
        K0.q qVar = bVar.f1352c;
        this.f1379e = qVar;
        qVar.G(12);
        this.f1376b = qVar.y() & 255;
        this.f1375a = qVar.y();
    }
}
