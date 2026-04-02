package K6;

import F6.X;
import F6.Y;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public class z {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2813b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    public X[] f2814a;

    public final void a(X x7) {
        x7.e((Y) this);
        X[] xArr = this.f2814a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2813b;
        if (xArr == null) {
            xArr = new X[4];
            this.f2814a = xArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= xArr.length) {
            Object[] copyOf = Arrays.copyOf(xArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            xArr = (X[]) copyOf;
            this.f2814a = xArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        xArr[i7] = x7;
        x7.f1246b = i7;
        e(i7);
    }

    public final X b() {
        X x7;
        synchronized (this) {
            X[] xArr = this.f2814a;
            if (xArr != null) {
                x7 = xArr[0];
            } else {
                x7 = null;
            }
        }
        return x7;
    }

    public final void c(X x7) {
        synchronized (this) {
            if (x7.c() != null) {
                d(x7.f1246b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r6.compareTo(r7) < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F6.X d(int r9) {
        /*
            r8 = this;
            F6.X[] r0 = r8.f2814a
            kotlin.jvm.internal.j.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = K6.z.f2813b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.f(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.j.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.j.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.f(r9, r2)
            r8.e(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            F6.X[] r5 = r8.f2814a
            kotlin.jvm.internal.j.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.j.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.j.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.j.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.j.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.f(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.j.b(r9)
            r2 = 0
            r9.e(r2)
            r9.f1246b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.z.d(int):F6.X");
    }

    public final void e(int i7) {
        while (i7 > 0) {
            X[] xArr = this.f2814a;
            kotlin.jvm.internal.j.b(xArr);
            int i8 = (i7 - 1) / 2;
            X x7 = xArr[i8];
            kotlin.jvm.internal.j.b(x7);
            X x8 = xArr[i7];
            kotlin.jvm.internal.j.b(x8);
            if (x7.compareTo(x8) <= 0) {
                return;
            }
            f(i7, i8);
            i7 = i8;
        }
    }

    public final void f(int i7, int i8) {
        X[] xArr = this.f2814a;
        kotlin.jvm.internal.j.b(xArr);
        X x7 = xArr[i8];
        kotlin.jvm.internal.j.b(x7);
        X x8 = xArr[i7];
        kotlin.jvm.internal.j.b(x8);
        xArr[i7] = x7;
        xArr[i8] = x8;
        x7.f1246b = i7;
        x8.f1246b = i8;
    }
}
