package S1;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class x implements I {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0341i f5195a;

    /* renamed from: b  reason: collision with root package name */
    public final K0.p f5196b = new K0.p(new byte[10], 10);

    /* renamed from: c  reason: collision with root package name */
    public int f5197c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f5198d;

    /* renamed from: e  reason: collision with root package name */
    public K0.v f5199e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5200g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5201h;

    /* renamed from: i  reason: collision with root package name */
    public int f5202i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5203k;

    /* renamed from: l  reason: collision with root package name */
    public long f5204l;

    public x(InterfaceC0341i interfaceC0341i) {
        this.f5195a = interfaceC0341i;
    }

    @Override // S1.I
    public final void a() {
        this.f5197c = 0;
        this.f5198d = 0;
        this.f5201h = false;
        this.f5195a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // S1.I
    public final void b(int i7, K0.q qVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z7;
        K0.a.k(this.f5199e);
        int i14 = i7 & 1;
        InterfaceC0341i interfaceC0341i = this.f5195a;
        int i15 = -1;
        int i16 = 3;
        int i17 = 2;
        int i18 = 0;
        if (i14 != 0) {
            int i19 = this.f5197c;
            if (i19 != 0 && i19 != 1) {
                if (i19 != 2) {
                    if (i19 == 3) {
                        if (this.j != -1) {
                            K0.a.A("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                        }
                        if (qVar.f2515c == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        interfaceC0341i.c(z7);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    K0.a.A("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f5197c = 1;
            this.f5198d = 0;
        }
        int i20 = i7;
        while (qVar.a() > 0) {
            int i21 = this.f5197c;
            if (i21 != 0) {
                K0.p pVar = this.f5196b;
                if (i21 != 1) {
                    if (i21 != i17) {
                        if (i21 == i16) {
                            int a7 = qVar.a();
                            int i22 = this.j;
                            if (i22 == i15) {
                                i13 = i18;
                            } else {
                                i13 = a7 - i22;
                            }
                            if (i13 > 0) {
                                a7 -= i13;
                                qVar.F(qVar.f2514b + a7);
                            }
                            interfaceC0341i.b(qVar);
                            int i23 = this.j;
                            if (i23 != i15) {
                                int i24 = i23 - a7;
                                this.j = i24;
                                if (i24 == 0) {
                                    interfaceC0341i.c(i18);
                                    this.f5197c = 1;
                                    this.f5198d = i18;
                                }
                            }
                            int i25 = i16;
                            i8 = i15;
                            i9 = i25;
                            int i26 = i18;
                            i10 = i17;
                            i11 = i26;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(qVar, pVar.f2509d, Math.min(10, this.f5202i)) && d(qVar, null, this.f5202i)) {
                            pVar.q(i18);
                            this.f5204l = -9223372036854775807L;
                            int i27 = 4;
                            if (this.f) {
                                pVar.t(4);
                                pVar.t(1);
                                pVar.t(1);
                                long i28 = (pVar.i(i16) << 30) | (pVar.i(15) << 15) | pVar.i(15);
                                pVar.t(1);
                                if (!this.f5201h && this.f5200g) {
                                    pVar.t(4);
                                    pVar.t(1);
                                    long i29 = pVar.i(15) << 15;
                                    pVar.t(1);
                                    pVar.t(1);
                                    this.f5199e.b(i29 | (pVar.i(i16) << 30) | pVar.i(15));
                                    this.f5201h = true;
                                }
                                this.f5204l = this.f5199e.b(i28);
                            }
                            if (!this.f5203k) {
                                i27 = 0;
                            }
                            i20 |= i27;
                            interfaceC0341i.d(i20, this.f5204l);
                            this.f5197c = 3;
                            this.f5198d = 0;
                            i18 = 0;
                            i17 = 2;
                            i16 = 3;
                            i15 = -1;
                        } else {
                            i9 = i16;
                            i8 = -1;
                            int i30 = i18;
                            i10 = i17;
                            i11 = i30;
                        }
                    }
                } else {
                    i9 = i16;
                    int i31 = i18;
                    if (d(qVar, pVar.f2509d, 9)) {
                        pVar.q(i31);
                        int i32 = pVar.i(24);
                        if (i32 != 1) {
                            AbstractC0059i.J("Unexpected start code prefix: ", i32, "PesReader");
                            this.j = -1;
                            i8 = -1;
                            i12 = 0;
                            i10 = 2;
                        } else {
                            pVar.t(8);
                            int i33 = pVar.i(16);
                            pVar.t(5);
                            this.f5203k = pVar.h();
                            i10 = 2;
                            pVar.t(2);
                            this.f = pVar.h();
                            this.f5200g = pVar.h();
                            pVar.t(6);
                            int i34 = pVar.i(8);
                            this.f5202i = i34;
                            if (i33 == 0) {
                                this.j = -1;
                                i8 = -1;
                            } else {
                                int i35 = (i33 - 3) - i34;
                                this.j = i35;
                                if (i35 < 0) {
                                    K0.a.A("PesReader", "Found negative packet payload size: " + this.j);
                                    i8 = -1;
                                    this.j = -1;
                                } else {
                                    i8 = -1;
                                }
                            }
                            i12 = 2;
                        }
                        this.f5197c = i12;
                        i11 = 0;
                        this.f5198d = 0;
                    } else {
                        i11 = i31;
                        i8 = -1;
                        i10 = 2;
                    }
                }
            } else {
                int i36 = i16;
                i8 = i15;
                i9 = i36;
                int i37 = i18;
                i10 = i17;
                i11 = i37;
                qVar.H(qVar.a());
            }
            int i38 = i8;
            i16 = i9;
            i15 = i38;
            int i39 = i10;
            i18 = i11;
            i17 = i39;
        }
    }

    @Override // S1.I
    public final void c(K0.v vVar, m1.q qVar, H h8) {
        this.f5199e = vVar;
        this.f5195a.e(qVar, h8);
    }

    public final boolean d(K0.q qVar, byte[] bArr, int i7) {
        int min = Math.min(qVar.a(), i7 - this.f5198d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            qVar.H(min);
        } else {
            qVar.f(bArr, this.f5198d, min);
        }
        int i8 = this.f5198d + min;
        this.f5198d = i8;
        if (i8 == i7) {
            return true;
        }
        return false;
    }
}
