package G3;

import D.AbstractC0059i;
import R3.C0286c;
import R3.C0287c0;
import R3.C0304l;
import R3.C0307m0;
import R3.EnumC0301j0;
import R3.J;
import R3.P;
import R3.P0;
import R3.U0;
import R3.W;
import R3.c1;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: G3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119g {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1529a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1530b;

    public C0119g(Class cls, int i7) {
        this.f1530b = i7;
        this.f1529a = cls;
    }

    public final Object a(AbstractC0774a abstractC0774a) {
        switch (this.f1530b) {
            case 0:
                C0304l c0304l = (C0304l) abstractC0774a;
                C0119g[] c0119gArr = {new C0119g(S3.l.class, 1)};
                HashMap hashMap = new HashMap();
                for (C0119g c0119g : c0119gArr) {
                    boolean containsKey = hashMap.containsKey(c0119g.f1529a);
                    Class cls = c0119g.f1529a;
                    if (!containsKey) {
                        hashMap.put(cls, c0119g);
                    } else {
                        throw new IllegalArgumentException(AbstractC0059i.w(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                }
                if (c0119gArr.length > 0) {
                    Class cls2 = c0119gArr[0].f1529a;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
                R3.r B7 = c0304l.B();
                C0119g c0119g2 = (C0119g) unmodifiableMap.get(S3.l.class);
                if (c0119g2 != null) {
                    S3.l lVar = (S3.l) c0119g2.a(B7);
                    C0119g[] c0119gArr2 = {new C0119g(F3.n.class, 11)};
                    HashMap hashMap2 = new HashMap();
                    for (C0119g c0119g3 : c0119gArr2) {
                        boolean containsKey2 = hashMap2.containsKey(c0119g3.f1529a);
                        Class cls3 = c0119g3.f1529a;
                        if (!containsKey2) {
                            hashMap2.put(cls3, c0119g3);
                        } else {
                            throw new IllegalArgumentException(AbstractC0059i.w(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        }
                    }
                    if (c0119gArr2.length > 0) {
                        Class cls4 = c0119gArr2[0].f1529a;
                    }
                    Map unmodifiableMap2 = DesugarCollections.unmodifiableMap(hashMap2);
                    C0307m0 C7 = c0304l.C();
                    C0119g c0119g4 = (C0119g) unmodifiableMap2.get(F3.n.class);
                    if (c0119g4 != null) {
                        return new S3.h(lVar, (F3.n) c0119g4.a(C7), c0304l.C().D().C());
                    }
                    throw new IllegalArgumentException("Requested primitive class " + F3.n.class.getCanonicalName() + " not supported.");
                }
                throw new IllegalArgumentException("Requested primitive class " + S3.l.class.getCanonicalName() + " not supported.");
            case 1:
                R3.r rVar = (R3.r) abstractC0774a;
                return new S3.a(rVar.C().k(), rVar.D().A());
            case 2:
                R3.A a7 = (R3.A) abstractC0774a;
                return new S3.b(a7.B().k(), a7.C().A());
            case 3:
                return new S3.c(((J) abstractC0774a).A().k());
            case 4:
                return new I3.a(((P) abstractC0774a).A().k());
            case 5:
                return new S3.g(((C0287c0) abstractC0774a).A().k(), 0);
            case 6:
                String z7 = ((P0) abstractC0774a).A().z();
                return F3.m.a(z7).c(z7);
            case 7:
                U0 u02 = (U0) abstractC0774a;
                String A7 = u02.A().A();
                return new D(u02.A().z(), F3.m.a(A7).c(A7));
            case 8:
                return new S3.g(((c1) abstractC0774a).A().k(), 1);
            case 9:
                return new S3.d(((W) abstractC0774a).A().k());
            case 10:
                C0286c c0286c = (C0286c) abstractC0774a;
                return new S3.p(new S3.m(c0286c.B().k()), c0286c.C().A());
            default:
                C0307m0 c0307m0 = (C0307m0) abstractC0774a;
                EnumC0301j0 B8 = c0307m0.D().B();
                SecretKeySpec secretKeySpec = new SecretKeySpec(c0307m0.C().k(), "HMAC");
                int C8 = c0307m0.D().C();
                int i7 = N3.l.f3428a[B8.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 == 5) {
                                    return new S3.p(new S3.o("HMACSHA512", secretKeySpec), C8);
                                }
                                throw new GeneralSecurityException("unknown hash");
                            }
                            return new S3.p(new S3.o("HMACSHA384", secretKeySpec), C8);
                        }
                        return new S3.p(new S3.o("HMACSHA256", secretKeySpec), C8);
                    }
                    return new S3.p(new S3.o("HMACSHA224", secretKeySpec), C8);
                }
                return new S3.p(new S3.o("HMACSHA1", secretKeySpec), C8);
        }
    }
}
