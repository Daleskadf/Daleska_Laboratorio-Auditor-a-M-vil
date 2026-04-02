package F3;

import R3.A0;
import R3.C0326w0;
import R3.C0332z0;
import R3.X0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.F;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f1190a;

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f1191b;

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f1192c;

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f1193d;

    static {
        Logger.getLogger(s.class.getName());
        f1190a = new AtomicReference(new f());
        f1191b = new ConcurrentHashMap();
        f1192c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f1193d = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (((F3.f) F3.s.f1190a.get()).f1165a.containsKey(r4) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        r5 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r5.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        r6 = (java.util.Map.Entry) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (F3.s.f1193d.containsKey(r6.getKey()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r6.getKey()) + " from an existing key manager of type " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        r4 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r4.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        r5 = (java.util.Map.Entry) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
        if (F3.s.f1193d.containsKey(r5.getKey()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) r5.getKey()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(java.lang.String r4, java.util.Map r5, boolean r6) {
        /*
            java.lang.String r0 = "New keys are already disallowed for key type "
            java.lang.Class<F3.s> r1 = F3.s.class
            monitor-enter(r1)
            if (r6 == 0) goto L31
            j$.util.concurrent.ConcurrentHashMap r2 = F3.s.f1192c     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L31
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L1c
            goto L31
        L1c:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r6.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L2e:
            r4 = move-exception
            goto Lc7
        L31:
            if (r6 == 0) goto Lc9
            java.util.concurrent.atomic.AtomicReference r6 = F3.s.f1190a     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L2e
            F3.f r6 = (F3.f) r6     // Catch: java.lang.Throwable -> L2e
            j$.util.concurrent.ConcurrentHashMap r6 = r6.f1165a     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r6.containsKey(r4)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L89
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2e
        L4b:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto Lc9
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L2e
            j$.util.concurrent.ConcurrentHashMap r0 = F3.s.f1193d     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r6.getKey()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L64
            goto L4b
        L64:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Attempted to register a new key template "
            r0.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2e
            r0.append(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = " from an existing key manager of type "
            r0.append(r6)     // Catch: java.lang.Throwable -> L2e
            r0.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L89:
            java.util.Set r4 = r5.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        L91:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto Lc9
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L2e
            j$.util.concurrent.ConcurrentHashMap r6 = F3.s.f1193d     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r5.getKey()     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r6.containsKey(r0)     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto Laa
            goto L91
        Laa:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "Attempted overwrite of a registered key template "
            r6.append(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2e
            r6.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        Lc7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r4
        Lc9:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.s.a(java.lang.String, java.util.Map, boolean):void");
    }

    public static Object b(c cVar, Class cls) {
        Object obj;
        M3.p pVar = (M3.p) M3.i.f3238b.f3239a.get();
        pVar.getClass();
        M3.o oVar = new M3.o(cVar.getClass(), cls);
        HashMap hashMap = pVar.f3250a;
        if (hashMap.containsKey(oVar)) {
            switch (((M3.m) hashMap.get(oVar)).f3245b.f17a) {
                case 25:
                    N3.a aVar = (N3.a) cVar;
                    obj = new Object();
                    if (!O3.a.f3850a.a()) {
                        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                    }
                    break;
                default:
                    N3.k kVar = (N3.k) cVar;
                    obj = new Object();
                    if (!O3.b.f3851a.a()) {
                        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                    }
                    break;
            }
            return obj;
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + oVar + " available");
    }

    public static Object c(String str, AbstractC0781h abstractC0781h, Class cls) {
        f fVar = (f) f1190a.get();
        fVar.getClass();
        e a7 = fVar.a(str);
        boolean contains = ((Map) a7.f1163a.f3231c).keySet().contains(cls);
        M3.d dVar = a7.f1163a;
        if (contains) {
            try {
                if (!((Map) dVar.f3231c).keySet().contains(cls) && !Void.class.equals(cls)) {
                    String obj = dVar.toString();
                    String name = cls.getName();
                    throw new IllegalArgumentException("Given internalKeyMananger " + obj + " does not support primitive class " + name);
                }
                try {
                    AbstractC0774a g3 = dVar.g(abstractC0781h);
                    if (!Void.class.equals(cls)) {
                        dVar.h(g3);
                        return dVar.d(g3, cls);
                    }
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                } catch (F e7) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) dVar.f3229a).getName()), e7);
                }
            } catch (IllegalArgumentException e8) {
                throw new GeneralSecurityException("Primitive type not supported", e8);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(dVar.getClass());
        sb.append(", supported primitives: ");
        Set<Class> keySet = ((Map) dVar.f3231c).keySet();
        StringBuilder sb2 = new StringBuilder();
        boolean z7 = true;
        for (Class cls2 : keySet) {
            if (!z7) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z7 = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static Object d(String str, byte[] bArr) {
        C0780g c0780g = AbstractC0781h.f9648b;
        return c(str, AbstractC0781h.h(bArr, 0, bArr.length), a.class);
    }

    public static synchronized C0326w0 e(A0 a02) {
        C0326w0 f;
        synchronized (s.class) {
            M3.d dVar = ((f) f1190a.get()).a(a02.D()).f1163a;
            g gVar = new g(dVar, (Class) dVar.f3230b);
            if (((Boolean) f1192c.get(a02.D())).booleanValue()) {
                f = gVar.f(a02.E());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a02.D());
            }
        }
        return f;
    }

    public static synchronized void f(M3.d dVar, boolean z7) {
        Map emptyMap;
        synchronized (s.class) {
            try {
                AtomicReference atomicReference = f1190a;
                f fVar = new f((f) atomicReference.get());
                fVar.b(dVar);
                String c8 = dVar.c();
                if (z7) {
                    emptyMap = dVar.e().o();
                } else {
                    emptyMap = Collections.emptyMap();
                }
                a(c8, emptyMap, z7);
                if (!((f) atomicReference.get()).f1165a.containsKey(c8)) {
                    f1191b.put(c8, new Object());
                    if (z7) {
                        g(c8, dVar.e().o());
                    }
                }
                f1192c.put(c8, Boolean.valueOf(z7));
                atomicReference.set(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(String str, Map map) {
        X0 x02;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = f1193d;
            String str2 = (String) entry.getKey();
            byte[] e7 = ((M3.c) entry.getValue()).f3227a.e();
            i iVar = ((M3.c) entry.getValue()).f3228b;
            C0332z0 F7 = A0.F();
            F7.e();
            A0.y((A0) F7.f9699b, str);
            C0780g h8 = AbstractC0781h.h(e7, 0, e7.length);
            F7.e();
            A0.z((A0) F7.f9699b, h8);
            int i7 = h.f1172b[iVar.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            x02 = X0.CRUNCHY;
                        } else {
                            throw new IllegalArgumentException("Unknown output prefix type");
                        }
                    } else {
                        x02 = X0.RAW;
                    }
                } else {
                    x02 = X0.LEGACY;
                }
            } else {
                x02 = X0.TINK;
            }
            F7.e();
            A0.A((A0) F7.f9699b, x02);
            concurrentHashMap.put(str2, new j((A0) F7.b()));
        }
    }

    public static synchronized void h(r rVar) {
        synchronized (s.class) {
            M3.i.f3238b.c(rVar);
        }
    }
}
