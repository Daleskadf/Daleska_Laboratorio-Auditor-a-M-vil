package N3;

import R3.X0;
import f5.C0993a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class r implements F3.n {

    /* renamed from: a  reason: collision with root package name */
    public final V2.k f3439a;

    /* renamed from: b  reason: collision with root package name */
    public final C0993a f3440b;

    /* renamed from: c  reason: collision with root package name */
    public final C0993a f3441c;

    public r(V2.k kVar) {
        this.f3439a = kVar;
        boolean isEmpty = ((P3.a) kVar.f5967d).f4017a.isEmpty();
        C0993a c0993a = M3.r.f3257a;
        if (!isEmpty) {
            M3.g gVar = (M3.g) M3.h.f3235b.f3237a.get();
            gVar = gVar == null ? M3.h.f3236c : gVar;
            M3.r.a(kVar);
            gVar.getClass();
            this.f3440b = c0993a;
            this.f3441c = c0993a;
            return;
        }
        this.f3440b = c0993a;
        this.f3441c = c0993a;
    }

    @Override // F3.n
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        C0993a c0993a = this.f3441c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            V2.k kVar = this.f3439a;
            for (F3.p pVar : kVar.t(copyOf)) {
                if (pVar.f1186e.equals(X0.LEGACY)) {
                    bArr3 = j3.f.c(bArr2, s.f3443b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((F3.n) pVar.f1183b).a(copyOfRange, bArr3);
                    int length2 = bArr3.length;
                    c0993a.getClass();
                    return;
                } catch (GeneralSecurityException e7) {
                    Logger logger = s.f3442a;
                    logger.info("tag prefix matches a key, but cannot verify: " + e7);
                }
            }
            for (F3.p pVar2 : kVar.t(F3.c.f1162a)) {
                try {
                    ((F3.n) pVar2.f1183b).a(bArr, bArr2);
                    int length3 = bArr2.length;
                    c0993a.getClass();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            c0993a.getClass();
            throw new GeneralSecurityException("invalid MAC");
        }
        c0993a.getClass();
        throw new GeneralSecurityException("tag too short");
    }

    @Override // F3.n
    public final byte[] b(byte[] bArr) {
        byte[] copyOf;
        C0993a c0993a = this.f3440b;
        V2.k kVar = this.f3439a;
        if (((F3.p) kVar.f5966c).f1186e.equals(X0.LEGACY)) {
            bArr = j3.f.c(bArr, s.f3443b);
        }
        try {
            byte[] bArr2 = ((F3.p) kVar.f5966c).f1184c;
            if (bArr2 == null) {
                copyOf = null;
            } else {
                copyOf = Arrays.copyOf(bArr2, bArr2.length);
            }
            byte[] c8 = j3.f.c(copyOf, ((F3.n) ((F3.p) kVar.f5966c).f1183b).b(bArr));
            int i7 = ((F3.p) kVar.f5966c).f;
            int length = bArr.length;
            c0993a.getClass();
            return c8;
        } catch (GeneralSecurityException e7) {
            c0993a.getClass();
            throw e7;
        }
    }
}
