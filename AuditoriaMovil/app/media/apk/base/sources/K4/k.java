package K4;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class k implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2664a;

    public /* synthetic */ k(int i7) {
        this.f2664a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.f2664a
            switch(r0) {
                case 0: goto L79;
                case 1: goto L60;
                case 2: goto L28;
                default: goto L5;
            }
        L5:
            p3.b r7 = (p3.C1662b) r7
            p3.b r8 = (p3.C1662b) r8
            com.google.android.gms.common.internal.I.i(r7)
            com.google.android.gms.common.internal.I.i(r8)
            r0 = -1
            r1 = 1
            int r2 = r7.f15083a
            int r3 = r8.f15083a
            if (r2 == r3) goto L1b
            if (r2 < r3) goto L27
        L19:
            r0 = r1
            goto L27
        L1b:
            int r7 = r7.f15084b
            int r8 = r8.f15084b
            if (r7 != r8) goto L24
            r7 = 0
            r0 = r7
            goto L27
        L24:
            if (r7 < r8) goto L27
            goto L19
        L27:
            return r0
        L28:
            Y1.h r7 = (Y1.C0407h) r7
            Y1.h r8 = (Y1.C0407h) r8
            androidx.recyclerview.widget.RecyclerView r0 = r7.f6665d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L34
            r3 = r2
            goto L35
        L34:
            r3 = r1
        L35:
            androidx.recyclerview.widget.RecyclerView r4 = r8.f6665d
            if (r4 != 0) goto L3b
            r4 = r2
            goto L3c
        L3b:
            r4 = r1
        L3c:
            r5 = -1
            if (r3 == r4) goto L45
            if (r0 != 0) goto L43
        L41:
            r1 = r2
            goto L5f
        L43:
            r1 = r5
            goto L5f
        L45:
            boolean r0 = r7.f6662a
            boolean r3 = r8.f6662a
            if (r0 == r3) goto L4e
            if (r0 == 0) goto L41
            goto L43
        L4e:
            int r0 = r8.f6663b
            int r2 = r7.f6663b
            int r0 = r0 - r2
            if (r0 == 0) goto L57
            r1 = r0
            goto L5f
        L57:
            int r7 = r7.f6664c
            int r8 = r8.f6664c
            int r7 = r7 - r8
            if (r7 == 0) goto L5f
            r1 = r7
        L5f:
            return r1
        L60:
            R6.f r7 = (R6.f) r7
            Q6.o r7 = r7.f4794a
            R6.f r8 = (R6.f) r8
            Q6.o r8 = r8.f4794a
            if (r7 != r8) goto L6c
            r7 = 0
            goto L78
        L6c:
            if (r7 != 0) goto L70
            r7 = -1
            goto L78
        L70:
            if (r8 != 0) goto L74
            r7 = 1
            goto L78
        L74:
            int r7 = r7.compareTo(r8)
        L78:
            return r7
        L79:
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r7 = r7.compareTo(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.k.compare(java.lang.Object, java.lang.Object):int");
    }
}
