package A3;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: A3.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025x extends AbstractMap implements Serializable {

    /* renamed from: e0  reason: collision with root package name */
    public static final Object f202e0 = new Object();

    /* renamed from: X  reason: collision with root package name */
    public transient C0023v f203X;

    /* renamed from: Y  reason: collision with root package name */
    public transient C0023v f204Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient C0018p f205Z;

    /* renamed from: a  reason: collision with root package name */
    public transient Object f206a;

    /* renamed from: b  reason: collision with root package name */
    public transient int[] f207b;

    /* renamed from: c  reason: collision with root package name */
    public transient Object[] f208c;

    /* renamed from: d  reason: collision with root package name */
    public transient Object[] f209d;

    /* renamed from: e  reason: collision with root package name */
    public transient int f210e;
    public transient int f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, A3.x] */
    public static C0025x a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f210e = Math.min(Math.max(3, 1), 1073741823);
        return abstractMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, A3.x] */
    public static C0025x b(int i7) {
        boolean z7;
        ?? abstractMap = new AbstractMap();
        if (i7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.f("Expected size must be >= 0", z7);
        abstractMap.f210e = Math.min(Math.max(i7, 1), 1073741823);
        return abstractMap;
    }

    public final Map c() {
        Object obj = this.f206a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f210e += 32;
        Map c8 = c();
        if (c8 != null) {
            this.f210e = Math.min(Math.max(size(), 3), 1073741823);
            c8.clear();
            this.f206a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f, (Object) null);
        Arrays.fill(k(), 0, this.f, (Object) null);
        Object obj = this.f206a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c8 = c();
        if (c8 != null) {
            return c8.containsKey(obj);
        }
        if (e(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c8 = c();
        if (c8 != null) {
            return c8.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f; i7++) {
            if (F.f.l(obj, k()[i7])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f210e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int t7 = AbstractC0021t.t(obj);
        int d7 = d();
        Object obj2 = this.f206a;
        Objects.requireNonNull(obj2);
        int u7 = AbstractC0021t.u(t7 & d7, obj2);
        if (u7 == 0) {
            return -1;
        }
        int i7 = ~d7;
        int i8 = t7 & i7;
        do {
            int i9 = u7 - 1;
            int i10 = i()[i9];
            if ((i10 & i7) == i8 && F.f.l(obj, j()[i9])) {
                return i9;
            }
            u7 = i10 & d7;
        } while (u7 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0023v c0023v = this.f204Y;
        if (c0023v == null) {
            C0023v c0023v2 = new C0023v(this, 0);
            this.f204Y = c0023v2;
            return c0023v2;
        }
        return c0023v;
    }

    public final void f(int i7, int i8) {
        Object obj = this.f206a;
        Objects.requireNonNull(obj);
        int[] i9 = i();
        Object[] j = j();
        Object[] k2 = k();
        int size = size();
        int i10 = size - 1;
        if (i7 < i10) {
            Object obj2 = j[i10];
            j[i7] = obj2;
            k2[i7] = k2[i10];
            j[i10] = null;
            k2[i10] = null;
            i9[i7] = i9[i10];
            i9[i10] = 0;
            int t7 = AbstractC0021t.t(obj2) & i8;
            int u7 = AbstractC0021t.u(t7, obj);
            if (u7 == size) {
                AbstractC0021t.v(t7, obj, i7 + 1);
                return;
            }
            while (true) {
                int i11 = u7 - 1;
                int i12 = i9[i11];
                int i13 = i12 & i8;
                if (i13 == size) {
                    i9[i11] = AbstractC0021t.o(i12, i7 + 1, i8);
                    return;
                }
                u7 = i13;
            }
        } else {
            j[i7] = null;
            k2[i7] = null;
            i9[i7] = 0;
        }
    }

    public final boolean g() {
        if (this.f206a == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c8 = c();
        if (c8 != null) {
            return c8.get(obj);
        }
        int e7 = e(obj);
        if (e7 == -1) {
            return null;
        }
        return k()[e7];
    }

    public final Object h(Object obj) {
        boolean g3 = g();
        Object obj2 = f202e0;
        if (g3) {
            return obj2;
        }
        int d7 = d();
        Object obj3 = this.f206a;
        Objects.requireNonNull(obj3);
        int q2 = AbstractC0021t.q(obj, null, d7, obj3, i(), j(), null);
        if (q2 == -1) {
            return obj2;
        }
        Object obj4 = k()[q2];
        f(q2, d7);
        this.f--;
        this.f210e += 32;
        return obj4;
    }

    public final int[] i() {
        int[] iArr = this.f207b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f208c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f209d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0023v c0023v = this.f203X;
        if (c0023v == null) {
            C0023v c0023v2 = new C0023v(this, 1);
            this.f203X = c0023v2;
            return c0023v2;
        }
        return c0023v;
    }

    public final int l(int i7, int i8, int i9, int i10) {
        Object g3 = AbstractC0021t.g(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            AbstractC0021t.v(i9 & i11, g3, i10 + 1);
        }
        Object obj = this.f206a;
        Objects.requireNonNull(obj);
        int[] i12 = i();
        for (int i13 = 0; i13 <= i7; i13++) {
            int u7 = AbstractC0021t.u(i13, obj);
            while (u7 != 0) {
                int i14 = u7 - 1;
                int i15 = i12[i14];
                int i16 = ((~i7) & i15) | i13;
                int i17 = i16 & i11;
                int u8 = AbstractC0021t.u(i17, g3);
                AbstractC0021t.v(i17, g3, u7);
                i12[i14] = AbstractC0021t.o(i16, u8, i11);
                u7 = i15 & i7;
            }
        }
        this.f206a = g3;
        this.f210e = AbstractC0021t.o(this.f210e, 32 - Integer.numberOfLeadingZeros(i11), 31);
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fc -> B:36:0x00e2). Please submit an issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.C0025x.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c8 = c();
        if (c8 != null) {
            return c8.remove(obj);
        }
        Object h8 = h(obj);
        if (h8 == f202e0) {
            return null;
        }
        return h8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c8 = c();
        if (c8 != null) {
            return c8.size();
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0018p c0018p = this.f205Z;
        if (c0018p == null) {
            C0018p c0018p2 = new C0018p(1, this);
            this.f205Z = c0018p2;
            return c0018p2;
        }
        return c0018p;
    }
}
