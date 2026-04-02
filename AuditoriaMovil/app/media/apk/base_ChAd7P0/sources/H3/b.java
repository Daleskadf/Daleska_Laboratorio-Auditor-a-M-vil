package H3;

import M3.v;
import S3.r;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final J3.c f1976c = J3.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: d  reason: collision with root package name */
    public static final G.b f1977d = new G.b(1);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f1978a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1979b;

    public b(byte[] bArr) {
        if (f1976c.a()) {
            r.a(bArr.length);
            this.f1978a = new SecretKeySpec(bArr, "AES");
            this.f1979b = true;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        Integer valueOf;
        int length = bArr.length;
        int i7 = v.f3266a;
        if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        }
        if (valueOf != null && valueOf.intValue() <= 19) {
            return new IvParameterSpec(bArr, 0, length);
        }
        return new GCMParameterSpec(RecognitionOptions.ITF, bArr, 0, length);
    }
}
