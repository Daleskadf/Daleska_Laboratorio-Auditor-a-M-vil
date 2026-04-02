package N3;

import G3.C0119g;
import G3.C0120h;
import R3.C0286c;
import R3.C0292f;
import R3.C0298i;
import R3.C0307m0;
import R3.C0311o0;
import R3.C0313p0;
import R3.C0316r0;
import R3.C0318s0;
import R3.EnumC0301j0;
import R3.EnumC0324v0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class c extends M3.d {

    /* renamed from: e  reason: collision with root package name */
    public static final M3.m f3402e = new M3.m(a.class, new A.i(25));
    public static final M3.m f = new M3.m(k.class, new A.i(27));

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3403d = 1;

    public /* synthetic */ c(Class cls, C0119g[] c0119gArr) {
        super(cls, c0119gArr);
    }

    public static M3.c i(int i7, int i8, EnumC0301j0 enumC0301j0, F3.i iVar) {
        C0311o0 D4 = C0313p0.D();
        C0316r0 D7 = C0318s0.D();
        D7.e();
        C0318s0.y((C0318s0) D7.f9699b, enumC0301j0);
        D7.e();
        C0318s0.z((C0318s0) D7.f9699b, i8);
        D4.e();
        C0313p0.y((C0313p0) D4.f9699b, (C0318s0) D7.b());
        D4.e();
        C0313p0.z((C0313p0) D4.f9699b, i7);
        return new M3.c((C0313p0) D4.b(), iVar);
    }

    public static void j(C0298i c0298i) {
        if (c0298i.A() >= 10) {
            if (c0298i.A() <= 16) {
                return;
            }
            throw new GeneralSecurityException("tag size too long");
        }
        throw new GeneralSecurityException("tag size too short");
    }

    public static void k(C0318s0 c0318s0) {
        if (c0318s0.C() >= 10) {
            int i7 = l.f3428a[c0318s0.B().ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 == 5) {
                                if (c0318s0.C() > 64) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        } else if (c0318s0.C() > 48) {
                            throw new GeneralSecurityException("tag size too big");
                        } else {
                            return;
                        }
                    } else if (c0318s0.C() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    } else {
                        return;
                    }
                } else if (c0318s0.C() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                } else {
                    return;
                }
            } else if (c0318s0.C() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // M3.d
    public J3.c b() {
        switch (this.f3403d) {
            case 1:
                return J3.c.ALGORITHM_REQUIRES_BORINGCRYPTO;
            default:
                return super.b();
        }
    }

    @Override // M3.d
    public final String c() {
        switch (this.f3403d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // M3.d
    public final B0.b e() {
        switch (this.f3403d) {
            case 0:
                return new B0.b(C0292f.class);
            default:
                return new C0120h(this);
        }
    }

    @Override // M3.d
    public final EnumC0324v0 f() {
        switch (this.f3403d) {
            case 0:
                return EnumC0324v0.SYMMETRIC;
            default:
                return EnumC0324v0.SYMMETRIC;
        }
    }

    @Override // M3.d
    public final AbstractC0774a g(AbstractC0781h abstractC0781h) {
        switch (this.f3403d) {
            case 0:
                return C0286c.F(abstractC0781h, C0787n.a());
            default:
                return C0307m0.G(abstractC0781h, C0787n.a());
        }
    }

    @Override // M3.d
    public final void h(AbstractC0774a abstractC0774a) {
        switch (this.f3403d) {
            case 0:
                C0286c c0286c = (C0286c) abstractC0774a;
                S3.r.c(c0286c.D());
                if (c0286c.B().size() == 32) {
                    j(c0286c.C());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                C0307m0 c0307m0 = (C0307m0) abstractC0774a;
                S3.r.c(c0307m0.E());
                if (c0307m0.C().size() >= 16) {
                    k(c0307m0.D());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    public c() {
        super(C0307m0.class, new C0119g(F3.n.class, 11));
    }
}
