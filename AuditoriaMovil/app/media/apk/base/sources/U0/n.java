package U0;

import D.AbstractC0059i;
import M0.x;
import e1.U;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class n implements U {

    /* renamed from: a  reason: collision with root package name */
    public final int f5636a;

    /* renamed from: b  reason: collision with root package name */
    public final r f5637b;

    /* renamed from: c  reason: collision with root package name */
    public int f5638c = -1;

    public n(r rVar, int i7) {
        this.f5637b = rVar;
        this.f5636a = i7;
    }

    @Override // e1.U
    public final void a() {
        int i7 = this.f5638c;
        r rVar = this.f5637b;
        if (i7 != -2) {
            if (i7 == -1) {
                rVar.C();
                return;
            } else if (i7 != -3) {
                rVar.C();
                rVar.q0[i7].y();
                return;
            } else {
                return;
            }
        }
        rVar.a();
        throw new IOException(AbstractC0059i.M("Unable to bind a sample queue to TrackGroup with MIME type ", rVar.f5653D0.a(this.f5636a).f1742d[0].f1886m, "."));
    }

    @Override // e1.U
    public final boolean b() {
        if (this.f5638c != -3) {
            if (d()) {
                int i7 = this.f5638c;
                r rVar = this.f5637b;
                if (rVar.A() || !rVar.q0[i7].w(rVar.f5664O0)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void c() {
        boolean z7;
        if (this.f5638c == -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        r rVar = this.f5637b;
        rVar.a();
        rVar.f5655F0.getClass();
        int[] iArr = rVar.f5655F0;
        int i7 = this.f5636a;
        int i8 = iArr[i7];
        if (i8 == -1) {
            if (rVar.f5654E0.contains(rVar.f5653D0.a(i7))) {
                i8 = -3;
            }
            i8 = -2;
        } else {
            boolean[] zArr = rVar.f5658I0;
            if (!zArr[i8]) {
                zArr[i8] = true;
            }
            i8 = -2;
        }
        this.f5638c = i8;
    }

    public final boolean d() {
        int i7 = this.f5638c;
        if (i7 != -1 && i7 != -3 && i7 != -2) {
            return true;
        }
        return false;
    }

    @Override // e1.U
    public final int g(x xVar, N0.f fVar, int i7) {
        H0.r rVar;
        H0.r rVar2;
        int i8 = -3;
        if (this.f5638c == -3) {
            fVar.a(4);
            return -4;
        }
        if (d()) {
            int i9 = this.f5638c;
            r rVar3 = this.f5637b;
            if (!rVar3.A()) {
                ArrayList arrayList = rVar3.f5681i0;
                int i10 = 0;
                if (!arrayList.isEmpty()) {
                    int i11 = 0;
                    loop0: while (i11 < arrayList.size() - 1) {
                        int i12 = ((k) arrayList.get(i11)).f5583f0;
                        int length = rVar3.q0.length;
                        for (int i13 = 0; i13 < length; i13++) {
                            if (rVar3.f5658I0[i13] && rVar3.q0[i13].A() == i12) {
                                break loop0;
                            }
                        }
                        i11++;
                    }
                    K0.x.R(arrayList, 0, i11);
                    k kVar = (k) arrayList.get(0);
                    H0.r rVar4 = kVar.f11006d;
                    if (!rVar4.equals(rVar3.f5651B0)) {
                        T0.d dVar = rVar3.f5678f0;
                        Object obj = kVar.f;
                        long j = kVar.f11000X;
                        int i14 = rVar3.f5673b;
                        int i15 = kVar.f11007e;
                        rVar2 = rVar4;
                        dVar.a(i14, rVar4, i15, obj, j);
                    } else {
                        rVar2 = rVar4;
                    }
                    rVar3.f5651B0 = rVar2;
                }
                if ((arrayList.isEmpty() || ((k) arrayList.get(0)).f5582F0) && (i8 = rVar3.q0[i9].B(xVar, fVar, i7, rVar3.f5664O0)) == -5) {
                    H0.r rVar5 = (H0.r) xVar.f3211c;
                    rVar5.getClass();
                    if (i9 == rVar3.f5694w0) {
                        int g3 = AbstractC1740d.g(rVar3.q0[i9].A());
                        while (i10 < arrayList.size() && ((k) arrayList.get(i10)).f5583f0 != g3) {
                            i10++;
                        }
                        if (i10 < arrayList.size()) {
                            rVar = ((k) arrayList.get(i10)).f11006d;
                        } else {
                            rVar = rVar3.f5650A0;
                            rVar.getClass();
                        }
                        rVar5 = rVar5.d(rVar);
                    }
                    xVar.f3211c = rVar5;
                }
            }
        }
        return i8;
    }

    @Override // e1.U
    public final int h(long j) {
        if (!d()) {
            return 0;
        }
        int i7 = this.f5638c;
        r rVar = this.f5637b;
        if (rVar.A()) {
            return 0;
        }
        q qVar = rVar.q0[i7];
        int t7 = qVar.t(j, rVar.f5664O0);
        ArrayList arrayList = rVar.f5681i0;
        Object obj = null;
        if (arrayList instanceof Collection) {
            if (!arrayList.isEmpty()) {
                obj = arrayList.get(arrayList.size() - 1);
            }
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    obj = it.next();
                } while (it.hasNext());
            }
        }
        k kVar = (k) obj;
        if (kVar != null && !kVar.f5582F0) {
            t7 = Math.min(t7, kVar.f(i7) - qVar.r());
        }
        qVar.H(t7);
        return t7;
    }
}
