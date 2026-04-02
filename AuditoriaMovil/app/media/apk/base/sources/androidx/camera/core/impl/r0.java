package androidx.camera.core.impl;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7670a = new ArrayList();

    public static void b(ArrayList arrayList, int i7, int[] iArr, int i8) {
        if (i8 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = 0;
            while (true) {
                if (i10 < i8) {
                    if (i9 == iArr[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    iArr[i8] = i9;
                    b(arrayList, i7, iArr, i8 + 1);
                    break;
                }
            }
        }
    }

    public final void a(C0506h c0506h) {
        this.f7670a.add(c0506h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(java.util.List r14) {
        /*
            r13 = this;
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lc
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            return r14
        Lc:
            int r0 = r14.size()
            java.util.ArrayList r1 = r13.f7670a
            int r2 = r1.size()
            r3 = 0
            if (r0 == r2) goto L1a
            return r3
        L1a:
            int r0 = r1.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int[] r4 = new int[r0]
            r5 = 0
            b(r2, r0, r4, r5)
            int r0 = r14.size()
            androidx.camera.core.impl.h[] r0 = new androidx.camera.core.impl.C0506h[r0]
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L88
            java.lang.Object r4 = r2.next()
            int[] r4 = (int[]) r4
            r6 = 1
            r7 = r5
            r8 = r6
        L42:
            int r9 = r1.size()
            if (r7 >= r9) goto L85
            r9 = r4[r7]
            int r10 = r14.size()
            if (r9 >= r10) goto L82
            java.lang.Object r9 = r1.get(r7)
            androidx.camera.core.impl.h r9 = (androidx.camera.core.impl.C0506h) r9
            r10 = r4[r7]
            java.lang.Object r10 = r14.get(r10)
            androidx.camera.core.impl.h r10 = (androidx.camera.core.impl.C0506h) r10
            r9.getClass()
            androidx.camera.core.impl.t0 r11 = r10.f7627a
            androidx.camera.core.impl.s0 r10 = r10.f7628b
            int r10 = r10.mId
            androidx.camera.core.impl.s0 r12 = r9.f7628b
            int r12 = r12.mId
            if (r10 > r12) goto L73
            androidx.camera.core.impl.t0 r9 = r9.f7627a
            if (r11 != r9) goto L73
            r9 = r6
            goto L74
        L73:
            r9 = r5
        L74:
            r8 = r8 & r9
            if (r8 != 0) goto L78
            goto L85
        L78:
            r9 = r4[r7]
            java.lang.Object r10 = r1.get(r7)
            androidx.camera.core.impl.h r10 = (androidx.camera.core.impl.C0506h) r10
            r0[r9] = r10
        L82:
            int r7 = r7 + 1
            goto L42
        L85:
            if (r8 == 0) goto L33
            r5 = r6
        L88:
            if (r5 == 0) goto L8e
            java.util.List r3 = java.util.Arrays.asList(r0)
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.r0.c(java.util.List):java.util.List");
    }
}
