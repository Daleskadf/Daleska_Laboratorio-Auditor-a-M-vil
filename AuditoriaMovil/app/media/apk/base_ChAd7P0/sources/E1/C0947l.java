package e1;

import A3.e0;
import java.util.List;
/* renamed from: e1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947l implements W {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f10814a;

    /* renamed from: b  reason: collision with root package name */
    public long f10815b;

    public C0947l(List list, List list2) {
        boolean z7;
        A3.H o7 = A3.K.o();
        if (list.size() == list2.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        for (int i7 = 0; i7 < list.size(); i7++) {
            o7.a(new C0946k((W) list.get(i7), (List) list2.get(i7)));
        }
        this.f10814a = o7.g();
        this.f10815b = -9223372036854775807L;
    }

    @Override // e1.W
    public final boolean d() {
        int i7 = 0;
        while (true) {
            e0 e0Var = this.f10814a;
            if (i7 >= e0Var.size()) {
                return false;
            }
            if (((C0946k) e0Var.get(i7)).d()) {
                return true;
            }
            i7++;
        }
    }

    @Override // e1.W
    public final long k() {
        int i7 = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            e0 e0Var = this.f10814a;
            if (i7 >= e0Var.size()) {
                break;
            }
            long k2 = ((C0946k) e0Var.get(i7)).k();
            if (k2 != Long.MIN_VALUE) {
                j = Math.min(j, k2);
            }
            i7++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // e1.W
    public final boolean n(O0.Q q2) {
        boolean z7;
        boolean z8;
        boolean z9 = false;
        do {
            long k2 = k();
            if (k2 == Long.MIN_VALUE) {
                break;
            }
            int i7 = 0;
            z7 = false;
            while (true) {
                e0 e0Var = this.f10814a;
                if (i7 >= e0Var.size()) {
                    break;
                }
                long k8 = ((C0946k) e0Var.get(i7)).k();
                if (k8 != Long.MIN_VALUE && k8 <= q2.f3610a) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (k8 == k2 || z8) {
                    z7 |= ((C0946k) e0Var.get(i7)).n(q2);
                }
                i7++;
            }
            z9 |= z7;
        } while (z7);
        return z9;
    }

    @Override // e1.W
    public final long o() {
        int i7 = 0;
        long j = Long.MAX_VALUE;
        long j8 = Long.MAX_VALUE;
        while (true) {
            e0 e0Var = this.f10814a;
            if (i7 >= e0Var.size()) {
                break;
            }
            C0946k c0946k = (C0946k) e0Var.get(i7);
            long o7 = c0946k.o();
            if ((c0946k.a().contains(1) || c0946k.a().contains(2) || c0946k.a().contains(4)) && o7 != Long.MIN_VALUE) {
                j = Math.min(j, o7);
            }
            if (o7 != Long.MIN_VALUE) {
                j8 = Math.min(j8, o7);
            }
            i7++;
        }
        if (j != Long.MAX_VALUE) {
            this.f10815b = j;
            return j;
        } else if (j8 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j9 = this.f10815b;
            if (j9 != -9223372036854775807L) {
                return j9;
            }
            return j8;
        }
    }

    @Override // e1.W
    public final void t(long j) {
        int i7 = 0;
        while (true) {
            e0 e0Var = this.f10814a;
            if (i7 < e0Var.size()) {
                ((C0946k) e0Var.get(i7)).t(j);
                i7++;
            } else {
                return;
            }
        }
    }
}
