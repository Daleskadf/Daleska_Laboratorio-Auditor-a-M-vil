package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public C1718c f15406a;

    /* renamed from: b  reason: collision with root package name */
    public C1718c f15407b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f15408c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    public int f15409d = 0;

    public C1718c e(Object obj) {
        C1718c c1718c = this.f15406a;
        while (c1718c != null && !c1718c.f15399a.equals(obj)) {
            c1718c = c1718c.f15401c;
        }
        return c1718c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((r.C1717b) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof r.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r.f r7 = (r.f) r7
            int r1 = r6.f15409d
            int r3 = r7.f15409d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            r.b r3 = (r.C1717b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            r.b r4 = (r.C1717b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            r.b r7 = (r.C1717b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f.equals(java.lang.Object):boolean");
    }

    public Object f(Object obj) {
        C1718c e7 = e(obj);
        if (e7 == null) {
            return null;
        }
        this.f15409d--;
        WeakHashMap weakHashMap = this.f15408c;
        if (!weakHashMap.isEmpty()) {
            for (AbstractC1720e abstractC1720e : weakHashMap.keySet()) {
                abstractC1720e.a(e7);
            }
        }
        C1718c c1718c = e7.f15402d;
        if (c1718c != null) {
            c1718c.f15401c = e7.f15401c;
        } else {
            this.f15406a = e7.f15401c;
        }
        C1718c c1718c2 = e7.f15401c;
        if (c1718c2 != null) {
            c1718c2.f15402d = c1718c;
        } else {
            this.f15407b = c1718c;
        }
        e7.f15401c = null;
        e7.f15402d = null;
        return e7.f15400b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (true) {
            C1717b c1717b = (C1717b) it;
            if (c1717b.hasNext()) {
                i7 += ((Map.Entry) c1717b.next()).hashCode();
            } else {
                return i7;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1717b c1717b = new C1717b(this.f15406a, this.f15407b, 0);
        this.f15408c.put(c1717b, Boolean.FALSE);
        return c1717b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1717b c1717b = (C1717b) it;
            if (c1717b.hasNext()) {
                sb.append(((Map.Entry) c1717b.next()).toString());
                if (c1717b.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
