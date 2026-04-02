package G3;

import D.AbstractC0059i;
import R3.C0285b0;
import R3.C0287c0;
import R3.C0293f0;
import R3.C0302k;
import R3.C0304l;
import R3.C0305l0;
import R3.C0307m0;
import R3.C0310o;
import R3.C0313p0;
import R3.C0314q;
import R3.C0318s0;
import R3.C0321u;
import R3.C0327x;
import R3.C0331z;
import R3.EnumC0301j0;
import R3.I;
import R3.J;
import R3.M;
import R3.O;
import R3.O0;
import R3.P;
import R3.P0;
import R3.R0;
import R3.T;
import R3.T0;
import R3.U0;
import R3.V;
import R3.W;
import R3.W0;
import R3.Y;
import R3.Z;
import R3.b1;
import R3.c1;
import R3.e1;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: G3.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120h extends B0.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1531b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ M3.d f1532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(i iVar, byte b5, boolean z7) {
        super(R0.class);
        this.f1532c = iVar;
    }

    @Override // B0.b
    public final AbstractC0774a a(AbstractC0774a abstractC0774a) {
        M3.d dVar = this.f1532c;
        switch (this.f1531b) {
            case 0:
                C0310o c0310o = (C0310o) abstractC0774a;
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
                DesugarCollections.unmodifiableMap(hashMap);
                C0321u A7 = c0310o.A();
                C0314q F7 = R3.r.F();
                C0327x C7 = A7.C();
                F7.e();
                R3.r.z((R3.r) F7.f9699b, C7);
                byte[] a7 = S3.q.a(A7.B());
                C0780g h8 = AbstractC0781h.h(a7, 0, a7.length);
                F7.e();
                R3.r.A((R3.r) F7.f9699b, h8);
                F7.e();
                R3.r.y((R3.r) F7.f9699b);
                R3.r rVar = (R3.r) F7.b();
                C0119g[] c0119gArr2 = {new C0119g(F3.n.class, 11)};
                HashMap hashMap2 = new HashMap();
                for (C0119g c0119g2 : c0119gArr2) {
                    boolean containsKey2 = hashMap2.containsKey(c0119g2.f1529a);
                    Class cls3 = c0119g2.f1529a;
                    if (!containsKey2) {
                        hashMap2.put(cls3, c0119g2);
                    } else {
                        throw new IllegalArgumentException(AbstractC0059i.w(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                }
                if (c0119gArr2.length > 0) {
                    Class cls4 = c0119gArr2[0].f1529a;
                }
                DesugarCollections.unmodifiableMap(hashMap2);
                C0313p0 B7 = c0310o.B();
                C0305l0 F8 = C0307m0.F();
                F8.e();
                C0307m0.y((C0307m0) F8.f9699b);
                C0318s0 C8 = B7.C();
                F8.e();
                C0307m0.z((C0307m0) F8.f9699b, C8);
                byte[] a8 = S3.q.a(B7.B());
                C0780g h9 = AbstractC0781h.h(a8, 0, a8.length);
                F8.e();
                C0307m0.A((C0307m0) F8.f9699b, h9);
                C0302k E4 = C0304l.E();
                E4.e();
                C0304l.z((C0304l) E4.f9699b, rVar);
                E4.e();
                C0304l.A((C0304l) E4.f9699b, (C0307m0) F8.b());
                ((i) dVar).getClass();
                E4.e();
                C0304l.y((C0304l) E4.f9699b);
                return (C0304l) E4.b();
            case 1:
                R3.D d7 = (R3.D) abstractC0774a;
                C0331z E7 = R3.A.E();
                byte[] a9 = S3.q.a(d7.A());
                C0780g h10 = AbstractC0781h.h(a9, 0, a9.length);
                E7.e();
                R3.A.A((R3.A) E7.f9699b, h10);
                R3.G B8 = d7.B();
                E7.e();
                R3.A.z((R3.A) E7.f9699b, B8);
                ((i) dVar).getClass();
                E7.e();
                R3.A.y((R3.A) E7.f9699b);
                return (R3.A) E7.b();
            case 2:
                I C9 = J.C();
                byte[] a10 = S3.q.a(((M) abstractC0774a).z());
                C0780g h11 = AbstractC0781h.h(a10, 0, a10.length);
                C9.e();
                J.z((J) C9.f9699b, h11);
                ((i) dVar).getClass();
                C9.e();
                J.y((J) C9.f9699b);
                return (J) C9.b();
            case 3:
                O C10 = P.C();
                byte[] a11 = S3.q.a(((T) abstractC0774a).z());
                C0780g h12 = AbstractC0781h.h(a11, 0, a11.length);
                C10.e();
                P.z((P) C10.f9699b, h12);
                ((i) dVar).getClass();
                C10.e();
                P.y((P) C10.f9699b);
                return (P) C10.b();
            case 4:
                C0293f0 c0293f0 = (C0293f0) abstractC0774a;
                C0285b0 C11 = C0287c0.C();
                ((i) dVar).getClass();
                C11.e();
                C0287c0.y((C0287c0) C11.f9699b);
                byte[] a12 = S3.q.a(32);
                C0780g h13 = AbstractC0781h.h(a12, 0, a12.length);
                C11.e();
                C0287c0.z((C0287c0) C11.f9699b, h13);
                return (C0287c0) C11.b();
            case 5:
                O0 C12 = P0.C();
                C12.e();
                P0.z((P0) C12.f9699b, (R0) abstractC0774a);
                ((i) dVar).getClass();
                C12.e();
                P0.y((P0) C12.f9699b);
                return (P0) C12.b();
            case 6:
                T0 C13 = U0.C();
                C13.e();
                U0.z((U0) C13.f9699b, (W0) abstractC0774a);
                ((i) dVar).getClass();
                C13.e();
                U0.y((U0) C13.f9699b);
                return (U0) C13.b();
            case 7:
                e1 e1Var = (e1) abstractC0774a;
                b1 C14 = c1.C();
                ((i) dVar).getClass();
                C14.e();
                c1.y((c1) C14.f9699b);
                byte[] a13 = S3.q.a(32);
                C0780g h14 = AbstractC0781h.h(a13, 0, a13.length);
                C14.e();
                c1.z((c1) C14.f9699b, h14);
                return (c1) C14.b();
            case 8:
                V C15 = W.C();
                byte[] a14 = S3.q.a(((Z) abstractC0774a).z());
                C0780g h15 = AbstractC0781h.h(a14, 0, a14.length);
                C15.e();
                W.z((W) C15.f9699b, h15);
                ((i) dVar).getClass();
                C15.e();
                W.y((W) C15.f9699b);
                return (W) C15.b();
            default:
                C0313p0 c0313p0 = (C0313p0) abstractC0774a;
                C0305l0 F9 = C0307m0.F();
                ((N3.c) dVar).getClass();
                F9.e();
                C0307m0.y((C0307m0) F9.f9699b);
                C0318s0 C16 = c0313p0.C();
                F9.e();
                C0307m0.z((C0307m0) F9.f9699b, C16);
                byte[] a15 = S3.q.a(c0313p0.B());
                C0780g h16 = AbstractC0781h.h(a15, 0, a15.length);
                F9.e();
                C0307m0.A((C0307m0) F9.f9699b, h16);
                return (C0307m0) F9.b();
        }
    }

    @Override // B0.b
    public Map o() {
        switch (this.f1531b) {
            case 0:
                HashMap hashMap = new HashMap();
                EnumC0301j0 enumC0301j0 = EnumC0301j0.SHA256;
                F3.i iVar = F3.i.TINK;
                hashMap.put("AES128_CTR_HMAC_SHA256", i.i(16, 16, enumC0301j0, iVar));
                F3.i iVar2 = F3.i.RAW;
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", i.i(16, 16, enumC0301j0, iVar2));
                hashMap.put("AES256_CTR_HMAC_SHA256", i.i(32, 32, enumC0301j0, iVar));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", i.i(32, 32, enumC0301j0, iVar2));
                return DesugarCollections.unmodifiableMap(hashMap);
            case 1:
                HashMap hashMap2 = new HashMap();
                F3.i iVar3 = F3.i.TINK;
                hashMap2.put("AES128_EAX", i.j(16, iVar3));
                F3.i iVar4 = F3.i.RAW;
                hashMap2.put("AES128_EAX_RAW", i.j(16, iVar4));
                hashMap2.put("AES256_EAX", i.j(32, iVar3));
                hashMap2.put("AES256_EAX_RAW", i.j(32, iVar4));
                return DesugarCollections.unmodifiableMap(hashMap2);
            case 2:
                HashMap hashMap3 = new HashMap();
                F3.i iVar5 = F3.i.TINK;
                hashMap3.put("AES128_GCM", i.k(16, iVar5));
                F3.i iVar6 = F3.i.RAW;
                hashMap3.put("AES128_GCM_RAW", i.k(16, iVar6));
                hashMap3.put("AES256_GCM", i.k(32, iVar5));
                hashMap3.put("AES256_GCM_RAW", i.k(32, iVar6));
                return DesugarCollections.unmodifiableMap(hashMap3);
            case 3:
                HashMap hashMap4 = new HashMap();
                F3.i iVar7 = F3.i.TINK;
                hashMap4.put("AES128_GCM_SIV", i.l(16, iVar7));
                F3.i iVar8 = F3.i.RAW;
                hashMap4.put("AES128_GCM_SIV_RAW", i.l(16, iVar8));
                hashMap4.put("AES256_GCM_SIV", i.l(32, iVar7));
                hashMap4.put("AES256_GCM_SIV_RAW", i.l(32, iVar8));
                return DesugarCollections.unmodifiableMap(hashMap4);
            case 4:
                HashMap hashMap5 = new HashMap();
                hashMap5.put("CHACHA20_POLY1305", new M3.c(C0293f0.y(), F3.i.TINK));
                hashMap5.put("CHACHA20_POLY1305_RAW", new M3.c(C0293f0.y(), F3.i.RAW));
                return DesugarCollections.unmodifiableMap(hashMap5);
            case 5:
            case 6:
            default:
                return super.o();
            case 7:
                HashMap hashMap6 = new HashMap();
                hashMap6.put("XCHACHA20_POLY1305", new M3.c(e1.y(), F3.i.TINK));
                hashMap6.put("XCHACHA20_POLY1305_RAW", new M3.c(e1.y(), F3.i.RAW));
                return DesugarCollections.unmodifiableMap(hashMap6);
            case 8:
                HashMap hashMap7 = new HashMap();
                Y A7 = Z.A();
                A7.e();
                Z.y((Z) A7.f9699b);
                hashMap7.put("AES256_SIV", new M3.c((Z) A7.b(), F3.i.TINK));
                Y A8 = Z.A();
                A8.e();
                Z.y((Z) A8.f9699b);
                hashMap7.put("AES256_SIV_RAW", new M3.c((Z) A8.b(), F3.i.RAW));
                return DesugarCollections.unmodifiableMap(hashMap7);
            case 9:
                HashMap hashMap8 = new HashMap();
                EnumC0301j0 enumC0301j02 = EnumC0301j0.SHA256;
                F3.i iVar9 = F3.i.TINK;
                hashMap8.put("HMAC_SHA256_128BITTAG", N3.c.i(32, 16, enumC0301j02, iVar9));
                F3.i iVar10 = F3.i.RAW;
                hashMap8.put("HMAC_SHA256_128BITTAG_RAW", N3.c.i(32, 16, enumC0301j02, iVar10));
                hashMap8.put("HMAC_SHA256_256BITTAG", N3.c.i(32, 32, enumC0301j02, iVar9));
                hashMap8.put("HMAC_SHA256_256BITTAG_RAW", N3.c.i(32, 32, enumC0301j02, iVar10));
                EnumC0301j0 enumC0301j03 = EnumC0301j0.SHA512;
                hashMap8.put("HMAC_SHA512_128BITTAG", N3.c.i(64, 16, enumC0301j03, iVar9));
                hashMap8.put("HMAC_SHA512_128BITTAG_RAW", N3.c.i(64, 16, enumC0301j03, iVar10));
                hashMap8.put("HMAC_SHA512_256BITTAG", N3.c.i(64, 32, enumC0301j03, iVar9));
                hashMap8.put("HMAC_SHA512_256BITTAG_RAW", N3.c.i(64, 32, enumC0301j03, iVar10));
                hashMap8.put("HMAC_SHA512_512BITTAG", N3.c.i(64, 64, enumC0301j03, iVar9));
                hashMap8.put("HMAC_SHA512_512BITTAG_RAW", N3.c.i(64, 64, enumC0301j03, iVar10));
                return DesugarCollections.unmodifiableMap(hashMap8);
        }
    }

    @Override // B0.b
    public final AbstractC0774a p(AbstractC0781h abstractC0781h) {
        switch (this.f1531b) {
            case 0:
                return C0310o.D(abstractC0781h, C0787n.a());
            case 1:
                return R3.D.D(abstractC0781h, C0787n.a());
            case 2:
                return M.B(abstractC0781h, C0787n.a());
            case 3:
                return T.B(abstractC0781h, C0787n.a());
            case 4:
                return C0293f0.z(abstractC0781h, C0787n.a());
            case 5:
                return R0.A(abstractC0781h, C0787n.a());
            case 6:
                return W0.C(abstractC0781h, C0787n.a());
            case 7:
                return e1.z(abstractC0781h, C0787n.a());
            case 8:
                return Z.B(abstractC0781h, C0787n.a());
            default:
                return C0313p0.E(abstractC0781h, C0787n.a());
        }
    }

    @Override // B0.b
    public final void v(AbstractC0774a abstractC0774a) {
        Z z7;
        switch (this.f1531b) {
            case 0:
                C0310o c0310o = (C0310o) abstractC0774a;
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
                DesugarCollections.unmodifiableMap(hashMap);
                C0321u A7 = c0310o.A();
                S3.r.a(A7.B());
                C0327x C7 = A7.C();
                if (C7.A() >= 12 && C7.A() <= 16) {
                    C0119g[] c0119gArr2 = {new C0119g(F3.n.class, 11)};
                    HashMap hashMap2 = new HashMap();
                    for (C0119g c0119g2 : c0119gArr2) {
                        boolean containsKey2 = hashMap2.containsKey(c0119g2.f1529a);
                        Class cls3 = c0119g2.f1529a;
                        if (!containsKey2) {
                            hashMap2.put(cls3, c0119g2);
                        } else {
                            throw new IllegalArgumentException(AbstractC0059i.w(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        }
                    }
                    if (c0119gArr2.length > 0) {
                        Class cls4 = c0119gArr2[0].f1529a;
                    }
                    DesugarCollections.unmodifiableMap(hashMap2);
                    C0313p0 B7 = c0310o.B();
                    if (B7.B() >= 16) {
                        N3.c.k(B7.C());
                        S3.r.a(c0310o.A().B());
                        return;
                    }
                    throw new GeneralSecurityException("key too short");
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                R3.D d7 = (R3.D) abstractC0774a;
                S3.r.a(d7.A());
                if (d7.B().A() != 12 && d7.B().A() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                S3.r.a(((M) abstractC0774a).z());
                return;
            case 3:
                S3.r.a(((T) abstractC0774a).z());
                return;
            case 4:
                C0293f0 c0293f0 = (C0293f0) abstractC0774a;
                return;
            case 5:
                R0 r02 = (R0) abstractC0774a;
                return;
            case 6:
                W0 w02 = (W0) abstractC0774a;
                if (!w02.A().isEmpty() && w02.B()) {
                    return;
                }
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            case 7:
                e1 e1Var = (e1) abstractC0774a;
                return;
            case 8:
                if (((Z) abstractC0774a).z() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + z7.z() + ". Valid keys must have 64 bytes.");
            default:
                C0313p0 c0313p0 = (C0313p0) abstractC0774a;
                if (c0313p0.B() >= 16) {
                    N3.c.k(c0313p0.C());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(i iVar, byte b5, byte b7) {
        super(W0.class);
        this.f1532c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(i iVar, char c8) {
        super(M.class);
        this.f1532c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(i iVar, byte b5) {
        super(R3.D.class);
        this.f1532c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(i iVar, int i7) {
        super(T.class);
        this.f1532c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(i iVar, short s7) {
        super(C0293f0.class);
        this.f1532c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(i iVar, byte b5, char c8) {
        super(e1.class);
        this.f1532c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(i iVar, byte b5, int i7) {
        super(Z.class);
        this.f1532c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(i iVar) {
        super(C0310o.class);
        this.f1532c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120h(N3.c cVar) {
        super(C0313p0.class);
        this.f1532c = cVar;
    }
}
