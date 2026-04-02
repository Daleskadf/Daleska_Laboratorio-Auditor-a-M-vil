package G;

import android.os.Handler;
import android.os.Looper;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;
/* loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1327a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1327a) {
            case 0:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return j3.f.C();
                }
                if (Looper.myLooper() != null) {
                    return new e(new Handler(Looper.myLooper()));
                }
                return null;
            case 1:
                try {
                    return (Cipher) S3.j.f5243b.f5245a.B("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            case 2:
                try {
                    return (Cipher) S3.j.f5243b.f5245a.B("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            case 3:
                try {
                    return (Cipher) S3.j.f5243b.f5245a.B("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 4:
                try {
                    return (Cipher) S3.j.f5243b.f5245a.B("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 5:
                try {
                    return (Cipher) S3.j.f5243b.f5245a.B("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 6:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 7:
                return Boolean.FALSE;
            case 8:
                return 0L;
            default:
                return new Random();
        }
    }
}
