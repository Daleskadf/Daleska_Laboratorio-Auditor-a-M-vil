package t0;

import b3.C0585f;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import m6.AbstractC1447h;
import m6.AbstractC1449j;
import m6.s;
/* renamed from: t0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1803b {

    /* renamed from: a  reason: collision with root package name */
    public final Map f15703a;

    /* renamed from: b  reason: collision with root package name */
    public final C0585f f15704b;

    public C1803b(Map preferencesMap, boolean z7) {
        j.e(preferencesMap, "preferencesMap");
        this.f15703a = preferencesMap;
        this.f15704b = new C0585f(z7);
    }

    public final Map a() {
        l6.d dVar;
        Set<Map.Entry> entrySet = this.f15703a.entrySet();
        int O7 = s.O(AbstractC1449j.M(entrySet));
        if (O7 < 16) {
            O7 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O7);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                j.d(copyOf, "copyOf(this, size)");
                dVar = new l6.d(key, copyOf);
            } else {
                dVar = new l6.d(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(dVar.f13865a, dVar.f13866b);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        j.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (!((AtomicBoolean) this.f15704b.f8171b).get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }

    public final Object c(C1805d key) {
        j.e(key, "key");
        Object obj = this.f15703a.get(key);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            j.d(copyOf, "copyOf(this, size)");
            return copyOf;
        }
        return obj;
    }

    public final void d(C1805d c1805d, Object obj) {
        b();
        Map map = this.f15703a;
        if (obj == null) {
            b();
            map.remove(c1805d);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(AbstractC1447h.b0((Set) obj));
            j.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(c1805d, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            j.d(copyOf, "copyOf(this, size)");
            map.put(c1805d, copyOf);
        } else {
            map.put(c1805d, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof t0.C1803b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            t0.b r7 = (t0.C1803b) r7
            java.util.Map r0 = r7.f15703a
            java.util.Map r2 = r6.f15703a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            return r1
        L1b:
            java.util.Map r7 = r7.f15703a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L25
        L23:
            r1 = r3
            goto L63
        L25:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L60
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L5b
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L60
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L60
            r0 = r3
            goto L61
        L5b:
            boolean r0 = kotlin.jvm.internal.j.a(r0, r4)
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 != 0) goto L2d
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1803b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        for (Map.Entry entry : this.f15703a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i7 += hashCode;
        }
        return i7;
    }

    public final String toString() {
        return AbstractC1447h.R(this.f15703a.entrySet(), ",\n", "{\n", "\n}", C1802a.f15702a, 24);
    }

    public /* synthetic */ C1803b(boolean z7) {
        this(new LinkedHashMap(), z7);
    }
}
