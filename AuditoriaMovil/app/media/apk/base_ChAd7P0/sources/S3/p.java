package S3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class p implements F3.n {

    /* renamed from: a  reason: collision with root package name */
    public final Q3.a f5256a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5257b;

    public p(Q3.a aVar, int i7) {
        this.f5256a = aVar;
        this.f5257b = i7;
        if (i7 >= 10) {
            aVar.a(new byte[0], i7);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // F3.n
    public final void a(byte[] bArr, byte[] bArr2) {
        if (MessageDigest.isEqual(b(bArr2), bArr)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // F3.n
    public final byte[] b(byte[] bArr) {
        return this.f5256a.a(bArr, this.f5257b);
    }
}
