package c6;

import A3.AbstractC0021t;
import g1.InterfaceC1004a;
import java.util.ArrayList;
/* renamed from: c6.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692o0 implements InterfaceC1004a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8936a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8937b;

    public C0692o0(int i7) {
        this.f8936a = i7;
        switch (i7) {
            case 1:
                this.f8937b = new ArrayList();
                return;
            case 2:
                this.f8937b = new ArrayList(20);
                return;
            default:
                this.f8937b = new ArrayList();
                return;
        }
    }

    @Override // g1.InterfaceC1004a
    public A3.K a(long j) {
        int g3 = g(j);
        if (g3 == 0) {
            A3.I i7 = A3.K.f98b;
            return A3.e0.f138e;
        }
        J1.a aVar = (J1.a) this.f8937b.get(g3 - 1);
        long j8 = aVar.f2357d;
        if (j8 != -9223372036854775807L && j >= j8) {
            A3.I i8 = A3.K.f98b;
            return A3.e0.f138e;
        }
        return aVar.f2354a;
    }

    @Override // g1.InterfaceC1004a
    public long b(long j) {
        ArrayList arrayList = this.f8937b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((J1.a) arrayList.get(0)).f2355b) {
            return ((J1.a) arrayList.get(0)).f2355b;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            J1.a aVar = (J1.a) arrayList.get(i7);
            if (j < aVar.f2355b) {
                long j8 = ((J1.a) arrayList.get(i7 - 1)).f2357d;
                int i8 = (j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1));
                long j9 = aVar.f2355b;
                if (i8 == 0 || j8 <= j || j8 >= j9) {
                    return j9;
                }
                return j8;
            }
        }
        long j10 = ((J1.a) AbstractC0021t.l(arrayList)).f2357d;
        if (j10 == -9223372036854775807L || j >= j10) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @Override // g1.InterfaceC1004a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(J1.a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f2355b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            K0.a.e(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f2357d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f8937b
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            J1.a r7 = (J1.a) r7
            long r7 = r7.f2355b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            J1.a r7 = (J1.a) r7
            long r7 = r7.f2355b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.C0692o0.c(J1.a, long):boolean");
    }

    @Override // g1.InterfaceC1004a
    public void clear() {
        this.f8937b.clear();
    }

    @Override // g1.InterfaceC1004a
    public long d(long j) {
        ArrayList arrayList = this.f8937b;
        if (arrayList.isEmpty() || j < ((J1.a) arrayList.get(0)).f2355b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            long j8 = ((J1.a) arrayList.get(i7)).f2355b;
            int i8 = (j > j8 ? 1 : (j == j8 ? 0 : -1));
            if (i8 == 0) {
                return j8;
            }
            if (i8 < 0) {
                J1.a aVar = (J1.a) arrayList.get(i7 - 1);
                long j9 = aVar.f2357d;
                if (j9 == -9223372036854775807L || j9 > j) {
                    return aVar.f2355b;
                }
                return j9;
            }
        }
        J1.a aVar2 = (J1.a) AbstractC0021t.l(arrayList);
        long j10 = aVar2.f2357d;
        if (j10 == -9223372036854775807L || j < j10) {
            return aVar2.f2355b;
        }
        return j10;
    }

    @Override // g1.InterfaceC1004a
    public void e(long j) {
        int g3 = g(j);
        if (g3 > 0) {
            this.f8937b.subList(0, g3).clear();
        }
    }

    public void f(Object obj, String str) {
        ArrayList arrayList = this.f8937b;
        arrayList.add(str + "=" + obj);
    }

    public int g(long j) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f8937b;
            if (i7 < arrayList.size()) {
                if (j < ((J1.a) arrayList.get(i7)).f2355b) {
                    return i7;
                }
                i7++;
            } else {
                return arrayList.size();
            }
        }
    }

    public String toString() {
        switch (this.f8936a) {
            case 0:
                return this.f8937b.toString();
            default:
                return super.toString();
        }
    }
}
