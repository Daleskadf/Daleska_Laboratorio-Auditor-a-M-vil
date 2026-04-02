package K3;

import F3.p;
import M3.h;
import M3.r;
import V2.k;
import f5.C0993a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class f implements F3.d {

    /* renamed from: a  reason: collision with root package name */
    public final k f2638a;

    /* renamed from: b  reason: collision with root package name */
    public final C0993a f2639b;

    /* renamed from: c  reason: collision with root package name */
    public final C0993a f2640c;

    public f(k kVar) {
        this.f2638a = kVar;
        boolean isEmpty = ((P3.a) kVar.f5967d).f4017a.isEmpty();
        C0993a c0993a = r.f3257a;
        if (!isEmpty) {
            M3.g gVar = (M3.g) h.f3235b.f3237a.get();
            gVar = gVar == null ? h.f3236c : gVar;
            r.a(kVar);
            gVar.getClass();
            this.f2639b = c0993a;
            this.f2640c = c0993a;
            return;
        }
        this.f2639b = c0993a;
        this.f2640c = c0993a;
    }

    @Override // F3.d
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] copyOf;
        C0993a c0993a = this.f2639b;
        k kVar = this.f2638a;
        try {
            byte[] bArr3 = ((p) kVar.f5966c).f1184c;
            if (bArr3 == null) {
                copyOf = null;
            } else {
                copyOf = Arrays.copyOf(bArr3, bArr3.length);
            }
            byte[] c8 = j3.f.c(copyOf, ((F3.d) ((p) kVar.f5966c).f1183b).a(bArr, bArr2));
            int i7 = ((p) kVar.f5966c).f;
            c0993a.getClass();
            return c8;
        } catch (GeneralSecurityException e7) {
            c0993a.getClass();
            throw e7;
        }
    }

    @Override // F3.d
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        k kVar = this.f2638a;
        C0993a c0993a = this.f2640c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (p pVar : kVar.t(copyOf)) {
                try {
                    byte[] b5 = ((F3.d) pVar.f1183b).b(copyOfRange, bArr2);
                    c0993a.getClass();
                    return b5;
                } catch (GeneralSecurityException e7) {
                    Logger logger = g.f2641a;
                    logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e7);
                }
            }
        }
        for (p pVar2 : kVar.t(F3.c.f1162a)) {
            try {
                byte[] b7 = ((F3.d) pVar2.f1183b).b(bArr, bArr2);
                c0993a.getClass();
                return b7;
            } catch (GeneralSecurityException unused) {
            }
        }
        c0993a.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
