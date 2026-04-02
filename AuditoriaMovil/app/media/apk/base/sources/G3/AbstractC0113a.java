package G3;

import D.AbstractC0059i;
import R3.C0287c0;
import R3.C0304l;
import R3.J;
import R3.P;
import R3.P0;
import R3.U0;
import R3.Z0;
import R3.c1;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* renamed from: G3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0113a {
    static {
        C0119g[] c0119gArr = {new C0119g(F3.a.class, 0)};
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < 1; i7++) {
            C0119g c0119g = c0119gArr[i7];
            boolean containsKey = hashMap.containsKey(c0119g.f1529a);
            Class cls = c0119g.f1529a;
            if (!containsKey) {
                hashMap.put(cls, c0119g);
            } else {
                throw new IllegalArgumentException(AbstractC0059i.w(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        Class cls2 = c0119gArr[0].f1529a;
        DesugarCollections.unmodifiableMap(hashMap);
        C0119g[] c0119gArr2 = {new C0119g(F3.a.class, 3)};
        HashMap hashMap2 = new HashMap();
        C0119g c0119g2 = c0119gArr2[0];
        boolean containsKey2 = hashMap2.containsKey(c0119g2.f1529a);
        Class cls3 = c0119g2.f1529a;
        if (!containsKey2) {
            hashMap2.put(cls3, c0119g2);
            Class cls4 = c0119gArr2[0].f1529a;
            DesugarCollections.unmodifiableMap(hashMap2);
            C0119g[] c0119gArr3 = {new C0119g(F3.a.class, 4)};
            HashMap hashMap3 = new HashMap();
            C0119g c0119g3 = c0119gArr3[0];
            boolean containsKey3 = hashMap3.containsKey(c0119g3.f1529a);
            Class cls5 = c0119g3.f1529a;
            if (!containsKey3) {
                hashMap3.put(cls5, c0119g3);
                Class cls6 = c0119gArr3[0].f1529a;
                DesugarCollections.unmodifiableMap(hashMap3);
                C0119g[] c0119gArr4 = {new C0119g(F3.a.class, 2)};
                HashMap hashMap4 = new HashMap();
                C0119g c0119g4 = c0119gArr4[0];
                boolean containsKey4 = hashMap4.containsKey(c0119g4.f1529a);
                Class cls7 = c0119g4.f1529a;
                if (!containsKey4) {
                    hashMap4.put(cls7, c0119g4);
                    Class cls8 = c0119gArr4[0].f1529a;
                    DesugarCollections.unmodifiableMap(hashMap4);
                    C0119g[] c0119gArr5 = {new C0119g(F3.a.class, 6)};
                    HashMap hashMap5 = new HashMap();
                    C0119g c0119g5 = c0119gArr5[0];
                    boolean containsKey5 = hashMap5.containsKey(c0119g5.f1529a);
                    Class cls9 = c0119g5.f1529a;
                    if (!containsKey5) {
                        hashMap5.put(cls9, c0119g5);
                        Class cls10 = c0119gArr5[0].f1529a;
                        DesugarCollections.unmodifiableMap(hashMap5);
                        C0119g[] c0119gArr6 = {new C0119g(F3.a.class, 7)};
                        HashMap hashMap6 = new HashMap();
                        C0119g c0119g6 = c0119gArr6[0];
                        boolean containsKey6 = hashMap6.containsKey(c0119g6.f1529a);
                        Class cls11 = c0119g6.f1529a;
                        if (!containsKey6) {
                            hashMap6.put(cls11, c0119g6);
                            Class cls12 = c0119gArr6[0].f1529a;
                            DesugarCollections.unmodifiableMap(hashMap6);
                            C0119g[] c0119gArr7 = {new C0119g(F3.a.class, 5)};
                            HashMap hashMap7 = new HashMap();
                            C0119g c0119g7 = c0119gArr7[0];
                            boolean containsKey7 = hashMap7.containsKey(c0119g7.f1529a);
                            Class cls13 = c0119g7.f1529a;
                            if (!containsKey7) {
                                hashMap7.put(cls13, c0119g7);
                                Class cls14 = c0119gArr7[0].f1529a;
                                DesugarCollections.unmodifiableMap(hashMap7);
                                C0119g[] c0119gArr8 = {new C0119g(F3.a.class, 8)};
                                HashMap hashMap8 = new HashMap();
                                C0119g c0119g8 = c0119gArr8[0];
                                boolean containsKey8 = hashMap8.containsKey(c0119g8.f1529a);
                                Class cls15 = c0119g8.f1529a;
                                if (!containsKey8) {
                                    hashMap8.put(cls15, c0119g8);
                                    Class cls16 = c0119gArr8[0].f1529a;
                                    DesugarCollections.unmodifiableMap(hashMap8);
                                    int i8 = Z0.CONFIG_NAME_FIELD_NUMBER;
                                    try {
                                        a();
                                        return;
                                    } catch (GeneralSecurityException e7) {
                                        throw new ExceptionInInitializerError(e7);
                                    }
                                }
                                throw new IllegalArgumentException(AbstractC0059i.w(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                            }
                            throw new IllegalArgumentException(AbstractC0059i.w(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        }
                        throw new IllegalArgumentException(AbstractC0059i.w(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    throw new IllegalArgumentException(AbstractC0059i.w(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                throw new IllegalArgumentException(AbstractC0059i.w(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            throw new IllegalArgumentException(AbstractC0059i.w(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        throw new IllegalArgumentException(AbstractC0059i.w(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }

    public static void a() {
        F3.s.h(C0117e.f1528b);
        N3.p.a();
        F3.s.f(new i(C0304l.class, new C0119g[]{new C0119g(F3.a.class, 0)}, 0), true);
        M3.l lVar = m.f1563a;
        M3.j jVar = M3.j.f3240b;
        jVar.e(m.f1563a);
        jVar.d(m.f1564b);
        jVar.c(m.f1565c);
        jVar.b(m.f1566d);
        F3.s.f(new i(J.class, new C0119g[]{new C0119g(F3.a.class, 3)}, 2), true);
        jVar.e(u.f1581a);
        jVar.d(u.f1582b);
        jVar.c(u.f1583c);
        jVar.b(u.f1584d);
        if (J3.d.f2423b.get()) {
            return;
        }
        F3.s.f(new i(R3.A.class, new C0119g[]{new C0119g(F3.a.class, 2)}, 1), true);
        jVar.e(q.f1572a);
        jVar.d(q.f1573b);
        jVar.c(q.f1574c);
        jVar.b(q.f1575d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            F3.s.f(new i(P.class, new C0119g[]{new C0119g(F3.a.class, 4)}, 3), true);
            jVar.e(y.f1588a);
            jVar.d(y.f1589b);
            jVar.c(y.f1590c);
            jVar.b(y.f1591d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        F3.s.f(new i(C0287c0.class, new C0119g[]{new C0119g(F3.a.class, 5)}, 4), true);
        M3.l lVar2 = C.f1512a;
        M3.j jVar2 = M3.j.f3240b;
        jVar2.e(C.f1512a);
        jVar2.d(C.f1513b);
        jVar2.c(C.f1514c);
        jVar2.b(C.f1515d);
        F3.s.f(new i(P0.class, new C0119g[]{new C0119g(F3.a.class, 6)}, 5), true);
        F3.s.f(new i(U0.class, new C0119g[]{new C0119g(F3.a.class, 7)}, 6), true);
        F3.s.f(new i(c1.class, new C0119g[]{new C0119g(F3.a.class, 8)}, 7), true);
        jVar2.e(H.f1520a);
        jVar2.d(H.f1521b);
        jVar2.c(H.f1522c);
        jVar2.b(H.f1523d);
    }
}
