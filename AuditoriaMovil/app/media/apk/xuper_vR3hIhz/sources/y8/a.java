package y8;

import com.google.common.base.Objects;
import java.util.IdentityHashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final IdentityHashMap f19770b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f19771c;

    /* renamed from: a  reason: collision with root package name */
    public final IdentityHashMap f19772a;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public a f19773a;

        /* renamed from: b  reason: collision with root package name */
        public IdentityHashMap f19774b;

        public a a() {
            if (this.f19774b != null) {
                for (Map.Entry entry : this.f19773a.f19772a.entrySet()) {
                    if (!this.f19774b.containsKey(entry.getKey())) {
                        this.f19774b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f19773a = new a(this.f19774b);
                this.f19774b = null;
            }
            return this.f19773a;
        }

        public final IdentityHashMap b(int i10) {
            if (this.f19774b == null) {
                this.f19774b = new IdentityHashMap(i10);
            }
            return this.f19774b;
        }

        public b c(c cVar) {
            if (this.f19773a.f19772a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f19773a.f19772a);
                identityHashMap.remove(cVar);
                this.f19773a = new a(identityHashMap);
            }
            IdentityHashMap identityHashMap2 = this.f19774b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        public b d(c cVar, Object obj) {
            b(1).put(cVar, obj);
            return this;
        }

        public b(a aVar) {
            this.f19773a = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f19775a;

        public c(String str) {
            this.f19775a = str;
        }

        public static c a(String str) {
            return new c(str);
        }

        public String toString() {
            return this.f19775a;
        }
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f19770b = identityHashMap;
        f19771c = new a(identityHashMap);
    }

    public static b c() {
        return new b();
    }

    public Object b(c cVar) {
        return this.f19772a.get(cVar);
    }

    public b d() {
        return new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L5a
            java.lang.Class<y8.a> r2 = y8.a.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L5a
        L10:
            y8.a r7 = (y8.a) r7
            java.util.IdentityHashMap r2 = r6.f19772a
            int r2 = r2.size()
            java.util.IdentityHashMap r3 = r7.f19772a
            int r3 = r3.size()
            if (r2 == r3) goto L21
            return r1
        L21:
            java.util.IdentityHashMap r2 = r6.f19772a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.IdentityHashMap r4 = r7.f19772a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L44
            return r1
        L44:
            java.lang.Object r4 = r3.getValue()
            java.util.IdentityHashMap r5 = r7.f19772a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = com.google.common.base.Objects.equal(r4, r3)
            if (r3 != 0) goto L2b
            return r1
        L59:
            return r0
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : this.f19772a.entrySet()) {
            i10 += Objects.hashCode(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public String toString() {
        return this.f19772a.toString();
    }

    public a(IdentityHashMap identityHashMap) {
        this.f19772a = identityHashMap;
    }
}
