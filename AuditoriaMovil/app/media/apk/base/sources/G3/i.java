package G3;

import D.AbstractC0059i;
import R3.C0287c0;
import R3.C0304l;
import R3.C0307m0;
import R3.C0308n;
import R3.C0310o;
import R3.C0311o0;
import R3.C0313p0;
import R3.C0316r0;
import R3.C0318s0;
import R3.C0319t;
import R3.C0321u;
import R3.C0325w;
import R3.C0327x;
import R3.EnumC0301j0;
import R3.EnumC0324v0;
import R3.J;
import R3.L;
import R3.M;
import R3.P;
import R3.P0;
import R3.S;
import R3.T;
import R3.U0;
import R3.W;
import R3.c1;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class i extends M3.d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Class cls, C0119g[] c0119gArr, int i7) {
        super(cls, c0119gArr);
        this.f1533d = i7;
    }

    public static M3.c i(int i7, int i8, EnumC0301j0 enumC0301j0, F3.i iVar) {
        C0319t D4 = C0321u.D();
        C0325w B7 = C0327x.B();
        B7.e();
        C0327x.y((C0327x) B7.f9699b);
        D4.e();
        C0321u.y((C0321u) D4.f9699b, (C0327x) B7.b());
        D4.e();
        C0321u.z((C0321u) D4.f9699b, i7);
        C0311o0 D7 = C0313p0.D();
        C0316r0 D8 = C0318s0.D();
        D8.e();
        C0318s0.y((C0318s0) D8.f9699b, enumC0301j0);
        D8.e();
        C0318s0.z((C0318s0) D8.f9699b, i8);
        D7.e();
        C0313p0.y((C0313p0) D7.f9699b, (C0318s0) D8.b());
        D7.e();
        C0313p0.z((C0313p0) D7.f9699b, 32);
        C0308n C7 = C0310o.C();
        C7.e();
        C0310o.y((C0310o) C7.f9699b, (C0321u) D4.b());
        C7.e();
        C0310o.z((C0310o) C7.f9699b, (C0313p0) D7.b());
        return new M3.c((C0310o) C7.b(), iVar);
    }

    public static M3.c j(int i7, F3.i iVar) {
        R3.C C7 = R3.D.C();
        C7.e();
        R3.D.z((R3.D) C7.f9699b, i7);
        R3.F B7 = R3.G.B();
        B7.e();
        R3.G.y((R3.G) B7.f9699b);
        C7.e();
        R3.D.y((R3.D) C7.f9699b, (R3.G) B7.b());
        return new M3.c((R3.D) C7.b(), iVar);
    }

    public static M3.c k(int i7, F3.i iVar) {
        L A7 = M.A();
        A7.e();
        M.y((M) A7.f9699b, i7);
        return new M3.c((M) A7.b(), iVar);
    }

    public static M3.c l(int i7, F3.i iVar) {
        S A7 = T.A();
        A7.e();
        T.y((T) A7.f9699b, i7);
        return new M3.c((T) A7.b(), iVar);
    }

    @Override // M3.d
    public J3.c b() {
        switch (this.f1533d) {
            case 0:
                return J3.c.ALGORITHM_REQUIRES_BORINGCRYPTO;
            case 1:
            default:
                return super.b();
            case 2:
                return J3.c.ALGORITHM_REQUIRES_BORINGCRYPTO;
        }
    }

    @Override // M3.d
    public final String c() {
        switch (this.f1533d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    @Override // M3.d
    public final B0.b e() {
        switch (this.f1533d) {
            case 0:
                return new C0120h(this);
            case 1:
                return new C0120h(this, (byte) 0);
            case 2:
                return new C0120h(this, (char) 0);
            case 3:
                return new C0120h(this, 0);
            case 4:
                return new C0120h(this, (short) 0);
            case 5:
                return new C0120h(this, (byte) 0, false);
            case 6:
                return new C0120h(this, (byte) 0, (byte) 0);
            case 7:
                return new C0120h(this, (byte) 0, (char) 0);
            default:
                return new C0120h(this, (byte) 0, 0);
        }
    }

    @Override // M3.d
    public final EnumC0324v0 f() {
        switch (this.f1533d) {
            case 0:
                return EnumC0324v0.SYMMETRIC;
            case 1:
                return EnumC0324v0.SYMMETRIC;
            case 2:
                return EnumC0324v0.SYMMETRIC;
            case 3:
                return EnumC0324v0.SYMMETRIC;
            case 4:
                return EnumC0324v0.SYMMETRIC;
            case 5:
                return EnumC0324v0.REMOTE;
            case 6:
                return EnumC0324v0.REMOTE;
            case 7:
                return EnumC0324v0.SYMMETRIC;
            default:
                return EnumC0324v0.SYMMETRIC;
        }
    }

    @Override // M3.d
    public final AbstractC0774a g(AbstractC0781h abstractC0781h) {
        switch (this.f1533d) {
            case 0:
                return C0304l.F(abstractC0781h, C0787n.a());
            case 1:
                return R3.A.F(abstractC0781h, C0787n.a());
            case 2:
                return J.D(abstractC0781h, C0787n.a());
            case 3:
                return P.D(abstractC0781h, C0787n.a());
            case 4:
                return C0287c0.D(abstractC0781h, C0787n.a());
            case 5:
                return P0.D(abstractC0781h, C0787n.a());
            case 6:
                return U0.D(abstractC0781h, C0787n.a());
            case 7:
                return c1.D(abstractC0781h, C0787n.a());
            default:
                return W.D(abstractC0781h, C0787n.a());
        }
    }

    @Override // M3.d
    public final void h(AbstractC0774a abstractC0774a) {
        switch (this.f1533d) {
            case 0:
                C0304l c0304l = (C0304l) abstractC0774a;
                S3.r.c(c0304l.D());
                C0119g[] c0119gArr = {new C0119g(S3.l.class, 1)};
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
                R3.r B7 = c0304l.B();
                S3.r.c(B7.E());
                S3.r.a(B7.C().size());
                C0327x D4 = B7.D();
                if (D4.A() >= 12 && D4.A() <= 16) {
                    C0119g[] c0119gArr2 = {new C0119g(F3.n.class, 11)};
                    HashMap hashMap2 = new HashMap();
                    C0119g c0119g2 = c0119gArr2[0];
                    boolean containsKey2 = hashMap2.containsKey(c0119g2.f1529a);
                    Class cls3 = c0119g2.f1529a;
                    if (!containsKey2) {
                        hashMap2.put(cls3, c0119g2);
                        Class cls4 = c0119gArr2[0].f1529a;
                        DesugarCollections.unmodifiableMap(hashMap2);
                        C0307m0 C7 = c0304l.C();
                        S3.r.c(C7.E());
                        if (C7.C().size() >= 16) {
                            N3.c.k(C7.D());
                            return;
                        }
                        throw new GeneralSecurityException("key too short");
                    }
                    throw new IllegalArgumentException(AbstractC0059i.w(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                R3.A a7 = (R3.A) abstractC0774a;
                S3.r.c(a7.D());
                S3.r.a(a7.B().size());
                if (a7.C().A() != 12 && a7.C().A() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                J j = (J) abstractC0774a;
                S3.r.c(j.B());
                S3.r.a(j.A().size());
                return;
            case 3:
                P p7 = (P) abstractC0774a;
                S3.r.c(p7.B());
                S3.r.a(p7.A().size());
                return;
            case 4:
                C0287c0 c0287c0 = (C0287c0) abstractC0774a;
                S3.r.c(c0287c0.B());
                if (c0287c0.A().size() == 32) {
                    return;
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            case 5:
                S3.r.c(((P0) abstractC0774a).B());
                return;
            case 6:
                S3.r.c(((U0) abstractC0774a).B());
                return;
            case 7:
                c1 c1Var = (c1) abstractC0774a;
                S3.r.c(c1Var.B());
                if (c1Var.A().size() == 32) {
                    return;
                }
                throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
            default:
                W w2 = (W) abstractC0774a;
                S3.r.c(w2.B());
                if (w2.A().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + w2.A().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
