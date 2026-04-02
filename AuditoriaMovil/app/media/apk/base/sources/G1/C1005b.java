package g1;

import A3.C;
import A3.C0020s;
import A3.H;
import A3.K;
import A3.c0;
import A3.e0;
import A3.l0;
import java.util.ArrayList;
/* renamed from: g1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1005b implements InterfaceC1004a {

    /* renamed from: b  reason: collision with root package name */
    public static final C f11089b;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11090a = new ArrayList();

    static {
        c0 c0Var = c0.f132a;
        com.it_nomads.fluttersecurestorage.ciphers.d dVar = new com.it_nomads.fluttersecurestorage.ciphers.d(9);
        c0Var.getClass();
        C0020s c0020s = new C0020s(dVar, c0Var);
        l0 l0Var = l0.f171a;
        com.it_nomads.fluttersecurestorage.ciphers.d dVar2 = new com.it_nomads.fluttersecurestorage.ciphers.d(10);
        l0Var.getClass();
        f11089b = new C(c0020s, new C0020s(dVar2, l0Var));
    }

    @Override // g1.InterfaceC1004a
    public final K a(long j) {
        ArrayList arrayList = this.f11090a;
        if (!arrayList.isEmpty()) {
            if (j >= ((J1.a) arrayList.get(0)).f2355b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    J1.a aVar = (J1.a) arrayList.get(i7);
                    if (j >= aVar.f2355b && j < aVar.f2357d) {
                        arrayList2.add(aVar);
                    }
                    if (j < aVar.f2355b) {
                        break;
                    }
                }
                e0 x7 = K.x(f11089b, arrayList2);
                H o7 = K.o();
                for (int i8 = 0; i8 < x7.size(); i8++) {
                    o7.d(((J1.a) x7.get(i8)).f2354a);
                }
                return o7.g();
            }
        }
        return K.s();
    }

    @Override // g1.InterfaceC1004a
    public final long b(long j) {
        int i7 = 0;
        long j8 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f11090a;
            if (i7 >= arrayList.size()) {
                break;
            }
            long j9 = ((J1.a) arrayList.get(i7)).f2355b;
            long j10 = ((J1.a) arrayList.get(i7)).f2357d;
            if (j < j9) {
                if (j8 == -9223372036854775807L) {
                    j8 = j9;
                } else {
                    j8 = Math.min(j8, j9);
                }
            } else {
                if (j < j10) {
                    if (j8 == -9223372036854775807L) {
                        j8 = j10;
                    } else {
                        j8 = Math.min(j8, j10);
                    }
                }
                i7++;
            }
        }
        if (j8 == -9223372036854775807L) {
            return Long.MIN_VALUE;
        }
        return j8;
    }

    @Override // g1.InterfaceC1004a
    public final boolean c(J1.a aVar, long j) {
        boolean z7;
        boolean z8;
        boolean z9;
        long j8 = aVar.f2355b;
        if (j8 != -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        if (aVar.f2356c != -9223372036854775807L) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.e(z8);
        if (j8 <= j && j < aVar.f2357d) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList = this.f11090a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j8 >= ((J1.a) arrayList.get(size)).f2355b) {
                arrayList.add(size + 1, aVar);
                return z9;
            }
        }
        arrayList.add(0, aVar);
        return z9;
    }

    @Override // g1.InterfaceC1004a
    public final void clear() {
        this.f11090a.clear();
    }

    @Override // g1.InterfaceC1004a
    public final long d(long j) {
        ArrayList arrayList = this.f11090a;
        if (!arrayList.isEmpty()) {
            if (j >= ((J1.a) arrayList.get(0)).f2355b) {
                long j8 = ((J1.a) arrayList.get(0)).f2355b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    long j9 = ((J1.a) arrayList.get(i7)).f2355b;
                    long j10 = ((J1.a) arrayList.get(i7)).f2357d;
                    if (j10 <= j) {
                        j8 = Math.max(j8, j10);
                    } else if (j9 > j) {
                        break;
                    } else {
                        j8 = Math.max(j8, j9);
                    }
                }
                return j8;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // g1.InterfaceC1004a
    public final void e(long j) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f11090a;
            if (i7 < arrayList.size()) {
                int i8 = (j > ((J1.a) arrayList.get(i7)).f2355b ? 1 : (j == ((J1.a) arrayList.get(i7)).f2355b ? 0 : -1));
                if (i8 > 0 && j > ((J1.a) arrayList.get(i7)).f2357d) {
                    arrayList.remove(i7);
                    i7--;
                } else if (i8 < 0) {
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
