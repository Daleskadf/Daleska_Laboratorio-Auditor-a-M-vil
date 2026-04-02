package S3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
/* loaded from: classes.dex */
public final class c implements F3.a {

    /* renamed from: b  reason: collision with root package name */
    public static final J3.c f5228b = J3.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a  reason: collision with root package name */
    public final H3.b f5229a;

    public c(byte[] bArr) {
        if (f5228b.a()) {
            this.f5229a = new H3.b(bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // F3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length;
        int i7;
        byte[] a7 = q.a(12);
        H3.b bVar = this.f5229a;
        bVar.getClass();
        if (a7.length == 12) {
            if (bArr.length <= 2147483619) {
                boolean z7 = bVar.f1979b;
                if (z7) {
                    length = bArr.length + 28;
                } else {
                    length = bArr.length + 16;
                }
                byte[] bArr3 = new byte[length];
                if (z7) {
                    System.arraycopy(a7, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec a8 = H3.b.a(a7);
                G.b bVar2 = H3.b.f1977d;
                ((Cipher) bVar2.get()).init(1, bVar.f1978a, a8);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) bVar2.get()).updateAAD(bArr2);
                }
                if (z7) {
                    i7 = 12;
                } else {
                    i7 = 0;
                }
                int doFinal = ((Cipher) bVar2.get()).doFinal(bArr, 0, bArr.length, bArr3, i7);
                if (doFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(io.flutter.plugins.pathprovider.b.f("encryption failed; GCM tag must be 16 bytes, but got only ", doFinal - bArr.length, " bytes"));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    @Override // F3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int i7;
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        H3.b bVar = this.f5229a;
        bVar.getClass();
        if (copyOf.length == 12) {
            boolean z7 = bVar.f1979b;
            if (z7) {
                i7 = 28;
            } else {
                i7 = 16;
            }
            if (bArr.length >= i7) {
                int i8 = 0;
                if (z7 && !ByteBuffer.wrap(copyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec a7 = H3.b.a(copyOf);
                G.b bVar2 = H3.b.f1977d;
                ((Cipher) bVar2.get()).init(2, bVar.f1978a, a7);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) bVar2.get()).updateAAD(bArr2);
                }
                if (z7) {
                    i8 = 12;
                }
                int length = bArr.length;
                if (z7) {
                    length -= 12;
                }
                return ((Cipher) bVar2.get()).doFinal(bArr, i8, length);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
