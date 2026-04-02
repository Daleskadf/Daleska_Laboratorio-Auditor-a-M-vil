package I3;

import G.b;
import S3.q;
import S3.r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class a implements F3.a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f2197b = new b(2);

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f2198c;

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f2199a;

    static {
        boolean z7;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z7 = true;
        } catch (ClassNotFoundException unused) {
            z7 = false;
        }
        f2198c = z7;
    }

    public a(byte[] bArr) {
        r.a(bArr.length);
        this.f2199a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i7) {
        if (f2198c) {
            return new GCMParameterSpec(RecognitionOptions.ITF, bArr, 0, i7);
        }
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            return new IvParameterSpec(bArr, 0, i7);
        }
        throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
    }

    @Override // F3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            byte[] a7 = q.a(12);
            System.arraycopy(a7, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c8 = c(a7, a7.length);
            b bVar = f2197b;
            ((Cipher) bVar.get()).init(1, this.f2199a, c8);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) bVar.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) bVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(io.flutter.plugins.pathprovider.b.f("encryption failed; GCM tag must be 16 bytes, but got only ", doFinal - bArr.length, " bytes"));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // F3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec c8 = c(bArr, 12);
            b bVar = f2197b;
            ((Cipher) bVar.get()).init(2, this.f2199a, c8);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) bVar.get()).updateAAD(bArr2);
            }
            return ((Cipher) bVar.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
