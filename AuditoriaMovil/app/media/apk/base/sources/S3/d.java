package S3;

import D.AbstractC0059i;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class d implements F3.d {

    /* renamed from: c  reason: collision with root package name */
    public static final J3.c f5230c = J3.c.ALGORITHM_NOT_FIPS;

    /* renamed from: d  reason: collision with root package name */
    public static final List f5231d = Arrays.asList(64);

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f5232e = new byte[16];
    public static final byte[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public final m f5233a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5234b;

    public d(byte[] bArr) {
        if (f5230c.a()) {
            if (f5231d.contains(Integer.valueOf(bArr.length))) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
                this.f5234b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
                this.f5233a = new m(copyOfRange);
                return;
            }
            throw new InvalidKeyException(AbstractC0059i.B(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // F3.d
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) j.f5243b.f5245a.B("AES/CTR/NoPadding");
            byte[] c8 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c8.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f5234b, "AES"), new IvParameterSpec(bArr3));
            return j3.f.c(c8, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // F3.d
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher cipher = (Cipher) j.f5243b.f5245a.B("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f5234b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                doFinal = new byte[0];
            }
            if (MessageDigest.isEqual(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] c02;
        int length = bArr.length;
        m mVar = this.f5233a;
        if (length == 0) {
            return mVar.a(f, 16);
        }
        byte[] a7 = mVar.a(f5232e, 16);
        for (int i7 = 0; i7 < bArr.length - 1; i7++) {
            byte[] bArr2 = bArr[i7];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a7 = j3.f.c0(AbstractC1740d.l(a7), mVar.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length >= a7.length) {
                int length2 = bArr3.length - a7.length;
                c02 = Arrays.copyOf(bArr3, bArr3.length);
                for (int i8 = 0; i8 < a7.length; i8++) {
                    int i9 = length2 + i8;
                    c02[i9] = (byte) (c02[i9] ^ a7[i8]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr3.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            c02 = j3.f.c0(copyOf, AbstractC1740d.l(a7));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return mVar.a(c02, 16);
    }
}
