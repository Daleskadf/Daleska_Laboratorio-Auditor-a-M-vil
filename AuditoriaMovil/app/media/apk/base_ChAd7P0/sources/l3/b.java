package L3;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* loaded from: classes.dex */
public final class b implements F3.a {

    /* renamed from: a  reason: collision with root package name */
    public final SecretKey f2909a;

    public b(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f2909a = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException(io.flutter.plugins.pathprovider.b.h("Keystore cannot load the key with ID: ", str));
    }

    @Override // F3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e7) {
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e7);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return d(bArr, bArr2);
        }
    }

    @Override // F3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            try {
                return c(bArr, bArr2);
            } catch (ProviderException e7) {
                e = e7;
                Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
                try {
                    Thread.sleep((int) (Math.random() * 100.0d));
                } catch (InterruptedException unused) {
                }
                return c(bArr, bArr2);
            } catch (AEADBadTagException e8) {
                throw e8;
            } catch (GeneralSecurityException e9) {
                e = e9;
                Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
                Thread.sleep((int) (Math.random() * 100.0d));
                return c(bArr, bArr2);
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(RecognitionOptions.ITF, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f2909a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f2909a);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
