package N3;

import R3.C0284b;
import R3.C0286c;
import R3.C0290e;
import R3.C0292f;
import R3.C0296h;
import R3.C0298i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class b extends B0.b {
    @Override // B0.b
    public final AbstractC0774a a(AbstractC0774a abstractC0774a) {
        C0292f c0292f = (C0292f) abstractC0774a;
        C0284b E4 = C0286c.E();
        E4.e();
        C0286c.y((C0286c) E4.f9699b);
        byte[] a7 = S3.q.a(c0292f.A());
        C0780g h8 = AbstractC0781h.h(a7, 0, a7.length);
        E4.e();
        C0286c.z((C0286c) E4.f9699b, h8);
        C0298i B7 = c0292f.B();
        E4.e();
        C0286c.A((C0286c) E4.f9699b, B7);
        return (C0286c) E4.b();
    }

    @Override // B0.b
    public final Map o() {
        HashMap hashMap = new HashMap();
        C0290e C7 = C0292f.C();
        C7.e();
        C0292f.y((C0292f) C7.f9699b);
        C0296h B7 = C0298i.B();
        B7.e();
        C0298i.y((C0298i) B7.f9699b);
        C7.e();
        C0292f.z((C0292f) C7.f9699b, (C0298i) B7.b());
        F3.i iVar = F3.i.TINK;
        hashMap.put("AES_CMAC", new M3.c((C0292f) C7.b(), iVar));
        C0290e C8 = C0292f.C();
        C8.e();
        C0292f.y((C0292f) C8.f9699b);
        C0296h B8 = C0298i.B();
        B8.e();
        C0298i.y((C0298i) B8.f9699b);
        C8.e();
        C0292f.z((C0292f) C8.f9699b, (C0298i) B8.b());
        hashMap.put("AES256_CMAC", new M3.c((C0292f) C8.b(), iVar));
        C0290e C9 = C0292f.C();
        C9.e();
        C0292f.y((C0292f) C9.f9699b);
        C0296h B9 = C0298i.B();
        B9.e();
        C0298i.y((C0298i) B9.f9699b);
        C9.e();
        C0292f.z((C0292f) C9.f9699b, (C0298i) B9.b());
        hashMap.put("AES256_CMAC_RAW", new M3.c((C0292f) C9.b(), F3.i.RAW));
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    @Override // B0.b
    public final AbstractC0774a p(AbstractC0781h abstractC0781h) {
        return C0292f.D(abstractC0781h, C0787n.a());
    }

    @Override // B0.b
    public final void v(AbstractC0774a abstractC0774a) {
        C0292f c0292f = (C0292f) abstractC0774a;
        c.j(c0292f.B());
        if (c0292f.A() == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
