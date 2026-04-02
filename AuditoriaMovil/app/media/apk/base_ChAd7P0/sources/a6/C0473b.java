package a6;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
/* renamed from: a6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473b {

    /* renamed from: b  reason: collision with root package name */
    public static final C0473b f7115b = new C0473b(new IdentityHashMap());

    /* renamed from: a  reason: collision with root package name */
    public final IdentityHashMap f7116a;

    public C0473b(IdentityHashMap identityHashMap) {
        this.f7116a = identityHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L54
            java.lang.Class r2 = r6.getClass()
            java.lang.Class<a6.b> r3 = a6.C0473b.class
            if (r3 == r2) goto L10
            goto L54
        L10:
            a6.b r6 = (a6.C0473b) r6
            java.util.IdentityHashMap r2 = r5.f7116a
            int r3 = r2.size()
            java.util.IdentityHashMap r6 = r6.f7116a
            int r4 = r6.size()
            if (r3 == r4) goto L21
            return r1
        L21:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r6.containsKey(r4)
            if (r4 != 0) goto L40
            return r1
        L40:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r6.get(r3)
            boolean r3 = F.f.l(r4, r3)
            if (r3 != 0) goto L29
            return r1
        L53:
            return r0
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.C0473b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i7 = 0;
        for (Map.Entry entry : this.f7116a.entrySet()) {
            i7 += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i7;
    }

    public final String toString() {
        return this.f7116a.toString();
    }
}
