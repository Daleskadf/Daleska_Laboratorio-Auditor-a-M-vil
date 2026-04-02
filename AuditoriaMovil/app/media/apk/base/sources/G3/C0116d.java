package G3;

import f5.C0993a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* renamed from: G3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116d implements F3.a {

    /* renamed from: a  reason: collision with root package name */
    public final V2.k f1524a;

    /* renamed from: b  reason: collision with root package name */
    public final C0993a f1525b;

    /* renamed from: c  reason: collision with root package name */
    public final C0993a f1526c;

    public C0116d(V2.k kVar) {
        this.f1524a = kVar;
        boolean isEmpty = ((P3.a) kVar.f5967d).f4017a.isEmpty();
        C0993a c0993a = M3.r.f3257a;
        if (!isEmpty) {
            M3.g gVar = (M3.g) M3.h.f3235b.f3237a.get();
            gVar = gVar == null ? M3.h.f3236c : gVar;
            M3.r.a(kVar);
            gVar.getClass();
            this.f1525b = c0993a;
            this.f1526c = c0993a;
            return;
        }
        this.f1525b = c0993a;
        this.f1526c = c0993a;
    }

    @Override // F3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] copyOf;
        C0993a c0993a = this.f1525b;
        V2.k kVar = this.f1524a;
        try {
            byte[] bArr3 = ((F3.p) kVar.f5966c).f1184c;
            if (bArr3 == null) {
                copyOf = null;
            } else {
                copyOf = Arrays.copyOf(bArr3, bArr3.length);
            }
            byte[] c8 = j3.f.c(copyOf, ((F3.a) ((F3.p) kVar.f5966c).f1183b).a(bArr, bArr2));
            int i7 = ((F3.p) kVar.f5966c).f;
            int length = bArr.length;
            c0993a.getClass();
            return c8;
        } catch (GeneralSecurityException e7) {
            c0993a.getClass();
            throw e7;
        }
    }

    @Override // F3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        V2.k kVar = this.f1524a;
        C0993a c0993a = this.f1526c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (F3.p pVar : kVar.t(copyOf)) {
                try {
                    byte[] b5 = ((F3.a) pVar.f1183b).b(copyOfRange, bArr2);
                    c0993a.getClass();
                    return b5;
                } catch (GeneralSecurityException e7) {
                    Logger logger = C0117e.f1527a;
                    logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e7);
                }
            }
        }
        for (F3.p pVar2 : kVar.t(F3.c.f1162a)) {
            try {
                byte[] b7 = ((F3.a) pVar2.f1183b).b(bArr, bArr2);
                c0993a.getClass();
                return b7;
            } catch (GeneralSecurityException unused) {
            }
        }
        c0993a.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
