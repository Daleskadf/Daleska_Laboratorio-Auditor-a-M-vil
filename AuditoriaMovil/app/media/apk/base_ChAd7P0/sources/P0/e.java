package P0;

import H0.V;
import e1.C0960z;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f3911a;

    /* renamed from: b  reason: collision with root package name */
    public int f3912b;

    /* renamed from: c  reason: collision with root package name */
    public long f3913c;

    /* renamed from: d  reason: collision with root package name */
    public final C0960z f3914d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3915e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f3916g;

    public e(f fVar, String str, int i7, C0960z c0960z) {
        long j;
        this.f3916g = fVar;
        this.f3911a = str;
        this.f3912b = i7;
        if (c0960z == null) {
            j = -1;
        } else {
            j = c0960z.f10855d;
        }
        this.f3913c = j;
        if (c0960z != null && c0960z.b()) {
            this.f3914d = c0960z;
        }
    }

    public final boolean a(a aVar) {
        C0960z c0960z = aVar.f3896d;
        if (c0960z == null) {
            if (this.f3912b != aVar.f3895c) {
                return true;
            }
            return false;
        }
        long j = this.f3913c;
        if (j == -1) {
            return false;
        }
        if (c0960z.f10855d > j) {
            return true;
        }
        C0960z c0960z2 = this.f3914d;
        if (c0960z2 == null) {
            return false;
        }
        V v6 = aVar.f3894b;
        int b5 = v6.b(c0960z.f10852a);
        int b7 = v6.b(c0960z2.f10852a);
        if (c0960z.f10855d < c0960z2.f10855d || b5 < b7) {
            return false;
        }
        if (b5 > b7) {
            return true;
        }
        boolean b8 = c0960z.b();
        int i7 = c0960z2.f10853b;
        if (b8) {
            int i8 = c0960z.f10853b;
            if (i8 > i7) {
                return true;
            }
            if (i8 == i7) {
                if (c0960z.f10854c > c0960z2.f10854c) {
                    return true;
                }
            }
            return false;
        }
        int i9 = c0960z.f10856e;
        if (i9 == -1 || i9 > i7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.o()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(H0.V r7, H0.V r8) {
        /*
            r6 = this;
            int r0 = r6.f3912b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L11
            int r7 = r8.o()
            if (r0 >= r7) goto L36
            goto L37
        L11:
            P0.f r1 = r6.f3916g
            H0.U r4 = r1.f3919a
            r7.n(r0, r4)
            H0.U r0 = r1.f3919a
            int r4 = r0.f1735n
        L1c:
            int r5 = r0.f1736o
            if (r4 > r5) goto L36
            java.lang.Object r5 = r7.l(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L33
            H0.T r7 = r1.f3920b
            H0.T r7 = r8.f(r5, r7, r2)
            int r0 = r7.f1718c
            goto L37
        L33:
            int r4 = r4 + 1
            goto L1c
        L36:
            r0 = r3
        L37:
            r6.f3912b = r0
            if (r0 != r3) goto L3c
            return r2
        L3c:
            e1.z r7 = r6.f3914d
            r0 = 1
            if (r7 != 0) goto L42
            return r0
        L42:
            java.lang.Object r7 = r7.f10852a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L4b
            r2 = r0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.e.b(H0.V, H0.V):boolean");
    }
}
