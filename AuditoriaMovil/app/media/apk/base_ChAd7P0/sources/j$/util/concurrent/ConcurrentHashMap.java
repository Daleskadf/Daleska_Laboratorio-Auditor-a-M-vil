package j$.util.concurrent;

import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {

    /* renamed from: g  reason: collision with root package name */
    static final int f12878g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h  reason: collision with root package name */
    private static final j$.sun.misc.a f12879h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f12880i;
    private static final long j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f12881k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f12882l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f12883m;

    /* renamed from: n  reason: collision with root package name */
    private static final int f12884n;

    /* renamed from: o  reason: collision with root package name */
    private static final int f12885o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    volatile transient l[] f12886a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient l[] f12887b;
    private volatile transient long baseCount;

    /* renamed from: c  reason: collision with root package name */
    private volatile transient c[] f12888c;
    private volatile transient int cellsBusy;

    /* renamed from: d  reason: collision with root package name */
    private transient KeySetView f12889d;

    /* renamed from: e  reason: collision with root package name */
    private transient s f12890e;
    private transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static final int i(int i7) {
        return (i7 ^ (i7 >>> 16)) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", n[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a h8 = j$.sun.misc.a.h();
        f12879h = h8;
        f12880i = h8.j(ConcurrentHashMap.class, "sizeCtl");
        j = h8.j(ConcurrentHashMap.class, "transferIndex");
        f12881k = h8.j(ConcurrentHashMap.class, "baseCount");
        f12882l = h8.j(ConcurrentHashMap.class, "cellsBusy");
        f12883m = h8.j(c.class, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        f12884n = h8.a(l[].class);
        int b5 = h8.b(l[].class);
        if (((b5 - 1) & b5) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f12885o = 31 - Integer.numberOfLeadingZeros(b5);
    }

    private static final int l(int i7) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i7 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final l k(l[] lVarArr, int i7) {
        return (l) f12879h.g(lVarArr, (i7 << f12885o) + f12884n);
    }

    static final boolean b(l[] lVarArr, int i7, l lVar) {
        return f12879h.e(lVarArr, (i7 << f12885o) + f12884n, lVar);
    }

    static final void h(l[] lVarArr, int i7, l lVar) {
        f12879h.l(lVarArr, (i7 << f12885o) + f12884n, lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i7) {
        this(i7, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap(int i7, float f, int i8) {
        if (f <= 0.0f || i7 < 0 || i8 <= 0) {
            throw new IllegalArgumentException();
        }
        long j8 = (long) (((i7 < i8 ? i8 : i7) / f) + 1.0d);
        this.sizeCtl = j8 >= 1073741824 ? 1073741824 : l((int) j8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j8 = j();
        if (j8 < 0) {
            return 0;
        }
        return j8 > 2147483647L ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : (int) j8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return j() <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.f12917c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r4.f12886a
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r1 = k(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.f12915a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.f12916b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.f12917c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.l r5 = r1.a(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.f12917c
        L36:
            return r2
        L37:
            j$.util.concurrent.l r1 = r1.f12918d
            if (r1 == 0) goto L4e
            int r3 = r1.f12915a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.f12916b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.f12917c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f12886a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a7 = pVar.a();
                if (a7 == null) {
                    break;
                }
                Object obj2 = a7.f12917c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v6) {
        return (V) f(k2, v6, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b4, code lost:
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b9, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r12.f12886a
        La:
            r2 = 0
            if (r1 == 0) goto Lc0
            int r3 = r1.length
            if (r3 == 0) goto Lc0
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r4 = k(r1, r3)
            if (r4 != 0) goto L1b
            goto Lc0
        L1b:
            int r5 = r4.f12915a
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.l[] r1 = r12.d(r1, r4)
            goto La
        L25:
            monitor-enter(r4)
            j$.util.concurrent.l r7 = k(r1, r3)     // Catch: java.lang.Throwable -> L42
            if (r7 != r4) goto Laf
            r7 = 1
            if (r5 < 0) goto L6e
            r8 = r2
            r5 = r4
        L31:
            int r9 = r5.f12915a     // Catch: java.lang.Throwable -> L42
            if (r9 != r0) goto L65
            java.lang.Object r9 = r5.f12916b     // Catch: java.lang.Throwable -> L42
            if (r9 == r13) goto L45
            if (r9 == 0) goto L65
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L65
            goto L45
        L42:
            r13 = move-exception
            goto Lbe
        L45:
            java.lang.Object r9 = r5.f12917c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L53
            if (r15 == r9) goto L53
            if (r9 == 0) goto Lb0
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lb0
        L53:
            if (r14 == 0) goto L58
            r5.f12917c = r14     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L58:
            if (r8 == 0) goto L5f
            j$.util.concurrent.l r3 = r5.f12918d     // Catch: java.lang.Throwable -> L42
            r8.f12918d = r3     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L5f:
            j$.util.concurrent.l r5 = r5.f12918d     // Catch: java.lang.Throwable -> L42
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L65:
            j$.util.concurrent.l r8 = r5.f12918d     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L6a
            goto Lb0
        L6a:
            r11 = r8
            r8 = r5
            r5 = r11
            goto L31
        L6e:
            boolean r5 = r4 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto La2
            r5 = r4
            j$.util.concurrent.q r5 = (j$.util.concurrent.q) r5     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.r r8 = r5.f12932e     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lb0
            j$.util.concurrent.r r8 = r8.b(r0, r13, r2)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lb0
            java.lang.Object r9 = r8.f12917c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L8d
            if (r15 == r9) goto L8d
            if (r9 == 0) goto Lb0
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lb0
        L8d:
            if (r14 == 0) goto L92
            r8.f12917c = r14     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L92:
            boolean r8 = r5.f(r8)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lb1
            j$.util.concurrent.r r5 = r5.f     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.l r5 = p(r5)     // Catch: java.lang.Throwable -> L42
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Lb1
        La2:
            boolean r3 = r4 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto La7
            goto Laf
        La7:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L42
            throw r13     // Catch: java.lang.Throwable -> L42
        Laf:
            r7 = 0
        Lb0:
            r9 = r2
        Lb1:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto La
            if (r9 == 0) goto Lc0
            if (r14 != 0) goto Lbd
            r13 = -1
            r12.a(r13, r6)
        Lbd:
            return r9
        Lbe:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r13
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        l k2;
        l lVar;
        l[] lVarArr = this.f12886a;
        long j8 = 0;
        loop0: while (true) {
            int i7 = 0;
            while (lVarArr != null && i7 < lVarArr.length) {
                k2 = k(lVarArr, i7);
                if (k2 == null) {
                    i7++;
                } else {
                    int i8 = k2.f12915a;
                    if (i8 == -1) {
                        break;
                    }
                    synchronized (k2) {
                        try {
                            if (k(lVarArr, i7) == k2) {
                                if (i8 >= 0) {
                                    lVar = k2;
                                } else {
                                    lVar = k2 instanceof q ? ((q) k2).f : null;
                                }
                                while (lVar != null) {
                                    j8--;
                                    lVar = lVar.f12918d;
                                }
                                h(lVarArr, i7, null);
                                i7++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArr = d(lVarArr, k2);
        }
        if (j8 != 0) {
            a(j8, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySetView keySetView = this.f12889d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.f12889d = keySetView2;
        return keySetView2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection<V>, j$.util.concurrent.b, j$.util.concurrent.s] */
    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.f12890e;
        if (sVar != null) {
            return sVar;
        }
        b bVar = new b(this);
        this.f12890e = bVar;
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.concurrent.b, j$.util.concurrent.e, java.util.Set] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        ?? bVar = new b(this);
        this.f = bVar;
        return bVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f12886a;
        int i7 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a7 = pVar.a();
                if (a7 == null) {
                    break;
                }
                i7 += a7.f12917c.hashCode() ^ a7.f12916b.hashCode();
            }
        }
        return i7;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.f12886a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l a7 = pVar.a();
        if (a7 != null) {
            while (true) {
                Object obj = a7.f12916b;
                Object obj2 = a7.f12917c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                a7 = pVar.a();
                if (a7 == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v6;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                l[] lVarArr = this.f12886a;
                int length = lVarArr == null ? 0 : lVarArr.length;
                p pVar = new p(lVarArr, length, 0, length);
                while (true) {
                    l a7 = pVar.a();
                    if (a7 != null) {
                        Object obj2 = a7.f12917c;
                        Object obj3 = map.get(a7.f12916b);
                        if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                            break;
                        }
                    } else {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v6 = get(key)) == null || (value != v6 && !value.equals(v6))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i7 = 0;
        int i8 = 1;
        while (i8 < 16) {
            i7++;
            i8 <<= 1;
        }
        int i9 = 32 - i7;
        int i10 = i8 - 1;
        n[] nVarArr = new n[16];
        for (int i11 = 0; i11 < 16; i11++) {
            nVarArr[i11] = new ReentrantLock();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", nVarArr);
        putFields.put("segmentShift", i9);
        putFields.put("segmentMask", i10);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f12886a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a7 = pVar.a();
                if (a7 == null) {
                    break;
                }
                objectOutputStream.writeObject(a7.f12916b);
                objectOutputStream.writeObject(a7.f12917c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j8;
        boolean z7;
        boolean z8;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j9 = 0;
        long j10 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j8 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j10++;
            lVar = new l(i(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j10 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j11 = (long) ((((float) j10) / 0.75f) + 1.0d);
        int l8 = j11 >= 1073741824 ? 1073741824 : l((int) j11);
        l[] lVarArr = new l[l8];
        int i7 = l8 - 1;
        while (lVar != null) {
            l lVar2 = lVar.f12918d;
            int i8 = lVar.f12915a;
            int i9 = i8 & i7;
            l k2 = k(lVarArr, i9);
            if (k2 == null) {
                z8 = true;
            } else {
                Object obj2 = lVar.f12916b;
                if (k2.f12915a >= 0) {
                    int i10 = 0;
                    for (l lVar3 = k2; lVar3 != null; lVar3 = lVar3.f12918d) {
                        if (lVar3.f12915a == i8 && ((obj = lVar3.f12916b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z7 = false;
                            break;
                        }
                        i10++;
                    }
                    z7 = true;
                    if (!z7 || i10 < 8) {
                        z8 = z7;
                    } else {
                        long j12 = j9 + 1;
                        lVar.f12918d = k2;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            long j13 = j12;
                            r rVar3 = new r(lVar4.f12915a, lVar4.f12916b, lVar4.f12917c, null, null);
                            rVar3.f12936h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f12918d = rVar3;
                            }
                            lVar4 = lVar4.f12918d;
                            rVar2 = rVar3;
                            j12 = j13;
                        }
                        h(lVarArr, i9, new q(rVar));
                        j9 = j12;
                    }
                } else if (((q) k2).e(i8, obj2, lVar.f12917c) == null) {
                    j9 += j8;
                }
                z8 = false;
            }
            if (z8) {
                j9++;
                lVar.f12918d = k2;
                h(lVarArr, i9, lVar);
            }
            j8 = 1;
            lVar = lVar2;
        }
        this.f12886a = lVarArr;
        this.sizeCtl = l8 - (l8 >>> 2);
        this.baseCount = j9;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v6) {
        return (V) f(k2, v6, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v6 = get(obj);
        return v6 == null ? obj2 : v6;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f12886a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a7 = pVar.a();
            if (a7 == null) {
                return;
            }
            biConsumer.accept(a7.f12916b, a7.f12917c);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f12886a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a7 = pVar.a();
            if (a7 == null) {
                return;
            }
            Object obj = a7.f12917c;
            Object obj2 = a7.f12916b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f9, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f2, code lost:
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f4, code lost:
        a(1, r4);
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r13.f12886a
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f12915a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f12915a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f12916b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f12917c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f12917c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.f12918d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f12918d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = r9
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.f12918d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.q r4 = (j$.util.concurrent.q) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.r r8 = r4.f12932e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f12917c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f12917c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.l r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = r9
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.l[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x010e, code lost:
        if (r4 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0110, code lost:
        a(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0114, code lost:
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public static <K> KeySetView<K, Boolean> newKeySet(int i7) {
        return new KeySetView<>(new ConcurrentHashMap(i7), Boolean.TRUE);
    }

    private final l[] e() {
        while (true) {
            l[] lVarArr = this.f12886a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i7 = this.sizeCtl;
            if (i7 < 0) {
                Thread.yield();
            } else if (f12879h.c(this, f12880i, i7, -1)) {
                try {
                    l[] lVarArr2 = this.f12886a;
                    if (lVarArr2 != null) {
                        if (lVarArr2.length == 0) {
                        }
                        this.sizeCtl = i7;
                        return lVarArr2;
                    }
                    int i8 = i7 > 0 ? i7 : 16;
                    l[] lVarArr3 = new l[i8];
                    this.f12886a = lVarArr3;
                    i7 = i8 - (i8 >>> 2);
                    lVarArr2 = lVarArr3;
                    this.sizeCtl = i7;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i7;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.d(r25, r3, r5, r14) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013f, code lost:
        if (r25.f12888c != r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0141, code lost:
        r25.f12888c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(long r26, int r28) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    final l[] d(l[] lVarArr, l lVar) {
        int i7;
        if (lVar instanceof h) {
            l[] lVarArr2 = ((h) lVar).f12909e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | RecognitionOptions.TEZ_CODE;
            while (true) {
                if (lVarArr2 != this.f12887b || this.f12886a != lVarArr || (i7 = this.sizeCtl) >= 0 || (i7 >>> 16) != numberOfLeadingZeros || i7 == numberOfLeadingZeros + 1 || i7 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                    break;
                } else if (f12879h.c(this, f12880i, i7, i7 + 1)) {
                    m(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.f12886a;
    }

    private final void o(int i7) {
        int length;
        int l8 = i7 >= 536870912 ? 1073741824 : l(i7 + (i7 >>> 1) + 1);
        while (true) {
            int i8 = this.sizeCtl;
            if (i8 < 0) {
                return;
            }
            l[] lVarArr = this.f12886a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i9 = i8 > l8 ? i8 : l8;
                if (f12879h.c(this, f12880i, i8, -1)) {
                    try {
                        if (this.f12886a == lVarArr) {
                            this.f12886a = new l[i9];
                            i8 = i9 - (i9 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i8;
                    }
                } else {
                    continue;
                }
            } else if (l8 <= i8 || length >= 1073741824) {
                return;
            } else {
                if (lVarArr == this.f12886a) {
                    if (f12879h.c(this, f12880i, i8, ((Integer.numberOfLeadingZeros(length) | RecognitionOptions.TEZ_CODE) << 16) + 2)) {
                        m(lVarArr, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.l] */
    private final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i7;
        int i8;
        h hVar;
        ConcurrentHashMap<K, V> concurrentHashMap;
        boolean z7;
        char c8;
        int i9;
        l qVar;
        l qVar2;
        r rVar;
        int i10;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int i11 = f12878g;
        boolean z8 = true;
        int i12 = i11 > 1 ? (length >>> 3) / i11 : length;
        char c9 = 16;
        int i13 = i12 < 16 ? 16 : i12;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap2.f12887b = lVarArr5;
                concurrentHashMap2.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        h hVar2 = new h(lVarArr3);
        boolean z9 = true;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (true) {
            if (z9) {
                int i16 = i15 - 1;
                if (i16 >= i14 || z10) {
                    i14 = i14;
                    i15 = i16;
                } else {
                    int i17 = concurrentHashMap2.transferIndex;
                    if (i17 <= 0) {
                        i15 = -1;
                    } else {
                        j$.sun.misc.a aVar = f12879h;
                        long j8 = j;
                        int i18 = i17 > i13 ? i17 - i13 : 0;
                        int i19 = i14;
                        if (aVar.c(this, j8, i17, i18)) {
                            i15 = i17 - 1;
                            i14 = i18;
                        } else {
                            i14 = i19;
                            i15 = i16;
                        }
                    }
                }
                z9 = false;
            } else {
                int i20 = i14;
                r rVar2 = null;
                if (i15 < 0 || i15 >= length || (i9 = i15 + length) >= length2) {
                    i7 = i13;
                    i8 = length2;
                    hVar = hVar2;
                    if (z10) {
                        this.f12887b = null;
                        this.f12886a = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    z7 = true;
                    j$.sun.misc.a aVar2 = f12879h;
                    long j9 = f12880i;
                    int i21 = concurrentHashMap.sizeCtl;
                    int i22 = i15;
                    if (aVar2.c(this, j9, i21, i21 - 1)) {
                        c8 = 16;
                        if (i21 - 2 != ((Integer.numberOfLeadingZeros(length) | RecognitionOptions.TEZ_CODE) << 16)) {
                            return;
                        }
                        i15 = length;
                        z9 = true;
                        z10 = true;
                    } else {
                        c8 = 16;
                        i15 = i22;
                    }
                } else {
                    l k2 = k(lVarArr4, i15);
                    if (k2 == null) {
                        z9 = b(lVarArr4, i15, hVar2);
                        c8 = c9;
                        i7 = i13;
                        i8 = length2;
                        z7 = z8;
                        concurrentHashMap = concurrentHashMap2;
                    } else {
                        int i23 = k2.f12915a;
                        if (i23 == -1) {
                            z9 = z8;
                            c8 = c9;
                            i7 = i13;
                            i8 = length2;
                            concurrentHashMap = concurrentHashMap2;
                            z7 = z9;
                        } else {
                            synchronized (k2) {
                                try {
                                    if (k(lVarArr4, i15) == k2) {
                                        if (i23 >= 0) {
                                            int i24 = i23 & length;
                                            r rVar3 = k2;
                                            for (r rVar4 = k2.f12918d; rVar4 != null; rVar4 = rVar4.f12918d) {
                                                int i25 = rVar4.f12915a & length;
                                                if (i25 != i24) {
                                                    rVar3 = rVar4;
                                                    i24 = i25;
                                                }
                                            }
                                            if (i24 == 0) {
                                                rVar = null;
                                                rVar2 = rVar3;
                                            } else {
                                                rVar = rVar3;
                                            }
                                            l lVar = k2;
                                            while (lVar != rVar3) {
                                                int i26 = lVar.f12915a;
                                                Object obj = lVar.f12916b;
                                                int i27 = i13;
                                                Object obj2 = lVar.f12917c;
                                                if ((i26 & length) == 0) {
                                                    i10 = length2;
                                                    rVar2 = new l(i26, obj, obj2, rVar2);
                                                } else {
                                                    i10 = length2;
                                                    rVar = new l(i26, obj, obj2, rVar);
                                                }
                                                lVar = lVar.f12918d;
                                                i13 = i27;
                                                length2 = i10;
                                            }
                                            i7 = i13;
                                            i8 = length2;
                                            h(lVarArr3, i15, rVar2);
                                            h(lVarArr3, i9, rVar);
                                            h(lVarArr4, i15, hVar2);
                                            hVar = hVar2;
                                        } else {
                                            i7 = i13;
                                            i8 = length2;
                                            if (k2 instanceof q) {
                                                q qVar3 = (q) k2;
                                                r rVar5 = null;
                                                r rVar6 = null;
                                                l lVar2 = qVar3.f;
                                                int i28 = 0;
                                                int i29 = 0;
                                                r rVar7 = null;
                                                while (lVar2 != null) {
                                                    q qVar4 = qVar3;
                                                    int i30 = lVar2.f12915a;
                                                    h hVar3 = hVar2;
                                                    r rVar8 = new r(i30, lVar2.f12916b, lVar2.f12917c, null, null);
                                                    if ((i30 & length) == 0) {
                                                        rVar8.f12936h = rVar6;
                                                        if (rVar6 == null) {
                                                            rVar2 = rVar8;
                                                        } else {
                                                            rVar6.f12918d = rVar8;
                                                        }
                                                        i28++;
                                                        rVar6 = rVar8;
                                                    } else {
                                                        rVar8.f12936h = rVar5;
                                                        if (rVar5 == null) {
                                                            rVar7 = rVar8;
                                                        } else {
                                                            rVar5.f12918d = rVar8;
                                                        }
                                                        i29++;
                                                        rVar5 = rVar8;
                                                    }
                                                    lVar2 = lVar2.f12918d;
                                                    qVar3 = qVar4;
                                                    hVar2 = hVar3;
                                                }
                                                q qVar5 = qVar3;
                                                h hVar4 = hVar2;
                                                if (i28 <= 6) {
                                                    qVar = p(rVar2);
                                                } else {
                                                    qVar = i29 != 0 ? new q(rVar2) : qVar5;
                                                }
                                                if (i29 <= 6) {
                                                    qVar2 = p(rVar7);
                                                } else {
                                                    qVar2 = i28 != 0 ? new q(rVar7) : qVar5;
                                                }
                                                h(lVarArr3, i15, qVar);
                                                h(lVarArr3, i9, qVar2);
                                                lVarArr4 = lVarArr;
                                                hVar = hVar4;
                                                h(lVarArr4, i15, hVar);
                                            }
                                        }
                                        z9 = true;
                                    } else {
                                        i7 = i13;
                                        i8 = length2;
                                    }
                                    hVar = hVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                            c8 = 16;
                            z7 = true;
                        }
                    }
                    hVar = hVar2;
                }
                hVar2 = hVar;
                concurrentHashMap2 = concurrentHashMap;
                z8 = z7;
                i14 = i20;
                i13 = i7;
                length2 = i8;
                c9 = c8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long j() {
        c[] cVarArr = this.f12888c;
        long j8 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j8 += cVar.value;
                }
            }
        }
        return j8;
    }

    private final void n(l[] lVarArr, int i7) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l k2 = k(lVarArr, i7);
        if (k2 == null || k2.f12915a < 0) {
            return;
        }
        synchronized (k2) {
            try {
                if (k(lVarArr, i7) == k2) {
                    r rVar = null;
                    l lVar = k2;
                    r rVar2 = null;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.f12915a, lVar.f12916b, lVar.f12917c, null, null);
                        rVar3.f12936h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f12918d = rVar3;
                        }
                        lVar = lVar.f12918d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i7, new q(rVar));
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.f12918d) {
            l lVar3 = new l(rVar2.f12915a, rVar2.f12916b, rVar2.f12917c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.f12918d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }

    public void forEachValue(long j8, Consumer<? super V> consumer) {
        int i7;
        consumer.getClass();
        if (j8 != Long.MAX_VALUE) {
            long j9 = j();
            if (j9 > 1 && j9 >= j8) {
                i7 = ForkJoinPool.getCommonPoolParallelism() << 2;
                if (j8 > 0) {
                    long j10 = j9 / j8;
                    if (j10 < i7) {
                        i7 = (int) j10;
                    }
                }
                new g(null, i7, 0, 0, this.f12886a, consumer).invoke();
            }
        }
        i7 = 0;
        new g(null, i7, 0, 0, this.f12886a, consumer).invoke();
    }

    /* loaded from: classes2.dex */
    public static class KeySetView<K, V> extends b implements Set<K>, Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f12891b;

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
        }

        @Override // j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }

        KeySetView(ConcurrentHashMap concurrentHashMap, Boolean bool) {
            super(concurrentHashMap);
            this.f12891b = bool;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f12899a.containsKey(obj);
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return this.f12899a.remove(obj) != null;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.f12899a;
            l[] lVarArr = concurrentHashMap.f12886a;
            int length = lVarArr == null ? 0 : lVarArr.length;
            return new i(lVarArr, length, length, concurrentHashMap, 0);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Boolean bool = this.f12891b;
            if (bool != null) {
                return this.f12899a.f(obj, bool, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(java.util.Collection collection) {
            Boolean bool = this.f12891b;
            if (bool == null) {
                throw new UnsupportedOperationException();
            }
            boolean z7 = false;
            for (Object obj : collection) {
                if (this.f12899a.f(obj, bool, true) == null) {
                    z7 = true;
                }
            }
            return z7;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Iterator it = iterator();
            int i7 = 0;
            while (((AbstractC1209a) it).hasNext()) {
                i7 += ((i) it).next().hashCode();
            }
            return i7;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
        public final j$.util.Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.f12899a;
            long j = concurrentHashMap.j();
            l[] lVarArr = concurrentHashMap.f12886a;
            int length = lVarArr == null ? 0 : lVarArr.length;
            return new j(lVarArr, length, 0, length, j < 0 ? 0L : j, 0);
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            l[] lVarArr = this.f12899a.f12886a;
            if (lVarArr == null) {
                return;
            }
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a7 = pVar.a();
                if (a7 == null) {
                    return;
                }
                consumer.accept(a7.f12916b);
            }
        }
    }
}
