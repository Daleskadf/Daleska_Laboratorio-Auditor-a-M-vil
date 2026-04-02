package S3;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final J3.c f5217d = J3.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: e  reason: collision with root package name */
    public static final G.b f5218e = new G.b(3);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f5219a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5220b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5221c;

    public a(byte[] bArr, int i7) {
        if (f5217d.a()) {
            r.a(bArr.length);
            this.f5219a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f5218e.get()).getBlockSize();
            this.f5221c = blockSize;
            if (i7 >= 12 && i7 <= blockSize) {
                this.f5220b = i7;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final void a(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, byte[] bArr3, boolean z7) {
        Cipher cipher = (Cipher) f5218e.get();
        byte[] bArr4 = new byte[this.f5221c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f5220b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f5219a;
        if (z7) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i7, i8, bArr2, i9) == i8) {
            return;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
