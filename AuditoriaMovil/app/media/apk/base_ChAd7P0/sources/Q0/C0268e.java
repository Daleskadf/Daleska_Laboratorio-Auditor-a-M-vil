package Q0;

import A3.e0;
import A3.j0;
import H0.C0126f;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import j$.util.Objects;
/* renamed from: Q0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268e {

    /* renamed from: c  reason: collision with root package name */
    public static final C0268e f4271c = new C0268e(A3.K.u(C0267d.f4267d));

    /* renamed from: d  reason: collision with root package name */
    public static final e0 f4272d = A3.K.w(2, 5, 6);

    /* renamed from: e  reason: collision with root package name */
    public static final j0 f4273e;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f4274a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public final int f4275b;

    static {
        A3.N n7 = new A3.N(4, 0);
        n7.m(5, 6);
        n7.m(17, 6);
        n7.m(7, 6);
        n7.m(30, 10);
        n7.m(18, 6);
        n7.m(6, 8);
        n7.m(8, 8);
        n7.m(14, 8);
        f4273e = n7.d();
    }

    public C0268e(e0 e0Var) {
        for (int i7 = 0; i7 < e0Var.f140d; i7++) {
            C0267d c0267d = (C0267d) e0Var.get(i7);
            this.f4274a.put(c0267d.f4268a, c0267d);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f4274a.size(); i9++) {
            i8 = Math.max(i8, ((C0267d) this.f4274a.valueAt(i9)).f4269b);
        }
        this.f4275b = i8;
    }

    public static e0 a(int[] iArr, int i7) {
        A3.H o7 = A3.K.o();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i8 : iArr) {
            o7.a(new C0267d(i8, i7));
        }
        return o7.g();
    }

    public static C0268e b(Context context, C0126f c0126f, C0273j c0273j) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0126f, c0273j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if ("Xiaomi".equals(r3) == false) goto L39;
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [A3.E, A3.O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Q0.C0268e c(android.content.Context r5, android.content.Intent r6, H0.C0126f r7, Q0.C0273j r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0268e.c(android.content.Context, android.content.Intent, H0.f, Q0.j):Q0.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ce, code lost:
        if (r15 != 5) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(H0.C0126f r17, H0.r r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0268e.d(H0.f, H0.r):android.util.Pair");
    }

    public final boolean e(int i7) {
        SparseArray sparseArray = this.f4274a;
        int i8 = K0.x.f2529a;
        if (sparseArray.indexOfKey(i7) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r3 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof Q0.C0268e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Q0.e r9 = (Q0.C0268e) r9
            android.util.SparseArray r1 = r8.f4274a
            android.util.SparseArray r3 = r9.f4274a
            int r4 = K0.x.f2529a
            if (r1 != 0) goto L17
            if (r3 != 0) goto L19
            goto L49
        L17:
            if (r3 != 0) goto L1b
        L19:
            r1 = r2
            goto L4a
        L1b:
            int r4 = K0.x.f2529a
            r5 = 31
            if (r4 < r5) goto L26
            boolean r1 = B5.AbstractC0048v.t(r1, r3)
            goto L4a
        L26:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L31
            goto L19
        L31:
            r5 = r2
        L32:
            if (r5 >= r4) goto L49
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L47
            goto L19
        L47:
            int r5 = r5 + r0
            goto L32
        L49:
            r1 = r0
        L4a:
            if (r1 == 0) goto L53
            int r1 = r8.f4275b
            int r9 = r9.f4275b
            if (r1 != r9) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0268e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i7;
        SparseArray sparseArray = this.f4274a;
        if (K0.x.f2529a >= 31) {
            i7 = sparseArray.contentHashCode();
        } else {
            int i8 = 17;
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                int keyAt = sparseArray.keyAt(i9);
                i8 = Objects.hashCode(sparseArray.valueAt(i9)) + ((keyAt + (i8 * 31)) * 31);
            }
            i7 = i8;
        }
        return (i7 * 31) + this.f4275b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f4275b + ", audioProfiles=" + this.f4274a + "]";
    }
}
