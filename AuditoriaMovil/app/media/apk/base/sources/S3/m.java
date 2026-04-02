package S3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class m implements Q3.a {

    /* renamed from: d  reason: collision with root package name */
    public static final J3.c f5246d = J3.c.ALGORITHM_NOT_FIPS;

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f5247a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5248b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5249c;

    public m(byte[] bArr) {
        r.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f5247a = secretKeySpec;
        if (f5246d.a()) {
            Cipher cipher = (Cipher) j.f5243b.f5245a.B("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] l8 = AbstractC1740d.l(cipher.doFinal(new byte[16]));
            this.f5248b = l8;
            this.f5249c = AbstractC1740d.l(l8);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // Q3.a
    public final byte[] a(byte[] bArr, int i7) {
        byte[] c02;
        if (i7 <= 16) {
            if (f5246d.a()) {
                Cipher cipher = (Cipher) j.f5243b.f5245a.B("AES/ECB/NoPadding");
                cipher.init(1, this.f5247a);
                int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
                if (max * 16 == bArr.length) {
                    c02 = j3.f.b0(bArr, (max - 1) * 16, this.f5248b, 0, 16);
                } else {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                    if (copyOfRange.length < 16) {
                        byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                        copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                        c02 = j3.f.c0(copyOf, this.f5249c);
                    } else {
                        throw new IllegalArgumentException("x must be smaller than a block.");
                    }
                }
                byte[] bArr2 = new byte[16];
                for (int i8 = 0; i8 < max - 1; i8++) {
                    bArr2 = cipher.doFinal(j3.f.b0(bArr2, 0, bArr, i8 * 16, 16));
                }
                return Arrays.copyOf(cipher.doFinal(j3.f.c0(c02, bArr2)), i7);
            }
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
