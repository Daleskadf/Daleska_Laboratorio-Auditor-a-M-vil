package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class X {

    /* renamed from: c  reason: collision with root package name */
    public static final X f7783c = new X();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f7785b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final I f7784a = new I();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.S] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.S] */
    public final b0 a(Class cls) {
        C0537n c0537n;
        Q w2;
        C0537n c0537n2;
        Q q2;
        Class cls2;
        A.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f7785b;
        b0 b0Var = (b0) concurrentHashMap.get(cls);
        if (b0Var == null) {
            I i7 = this.f7784a;
            i7.getClass();
            Class cls3 = c0.f7796a;
            if (!AbstractC0547y.class.isAssignableFrom(cls) && (cls2 = c0.f7796a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            a0 a7 = ((H) i7.f7755a).a(cls);
            if ((a7.f7792d & 2) == 2) {
                boolean isAssignableFrom = AbstractC0547y.class.isAssignableFrom(cls);
                AbstractC0547y abstractC0547y = a7.f7789a;
                if (isAssignableFrom) {
                    q2 = new S(c0.f7798c, AbstractC0538o.f7857a, abstractC0547y);
                } else {
                    i0 i0Var = c0.f7797b;
                    C0537n c0537n3 = AbstractC0538o.f7858b;
                    if (c0537n3 != null) {
                        q2 = new S(i0Var, c0537n3, abstractC0547y);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                w2 = q2;
            } else if (AbstractC0547y.class.isAssignableFrom(cls)) {
                T t7 = U.f7782b;
                E e7 = F.f7751b;
                i0 i0Var2 = c0.f7798c;
                if (G.f7752a[a7.d().ordinal()] != 1) {
                    c0537n2 = AbstractC0538o.f7857a;
                } else {
                    c0537n2 = null;
                }
                M m7 = N.f7763b;
                int[] iArr = Q.f7765n;
                if (a7 instanceof a0) {
                    w2 = Q.w(a7, t7, e7, i0Var2, c0537n2, m7);
                } else {
                    a7.getClass();
                    throw new ClassCastException();
                }
            } else {
                T t8 = U.f7781a;
                E e8 = F.f7750a;
                i0 i0Var3 = c0.f7797b;
                if (G.f7752a[a7.d().ordinal()] != 1) {
                    c0537n = AbstractC0538o.f7858b;
                    if (c0537n == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    c0537n = null;
                }
                M m8 = N.f7762a;
                int[] iArr2 = Q.f7765n;
                if (a7 instanceof a0) {
                    w2 = Q.w(a7, t8, e8, i0Var3, c0537n, m8);
                } else {
                    a7.getClass();
                    throw new ClassCastException();
                }
            }
            b0 b0Var2 = (b0) concurrentHashMap.putIfAbsent(cls, w2);
            if (b0Var2 != null) {
                return b0Var2;
            }
            return w2;
        }
        return b0Var;
    }
}
