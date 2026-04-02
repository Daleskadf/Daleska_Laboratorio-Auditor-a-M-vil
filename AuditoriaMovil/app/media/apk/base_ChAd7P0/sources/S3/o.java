package S3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class o implements Q3.a {

    /* renamed from: e  reason: collision with root package name */
    public static final J3.c f5251e = J3.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a  reason: collision with root package name */
    public final n f5252a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5253b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f5254c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5255d;

    public o(String str, SecretKeySpec secretKeySpec) {
        n nVar = new n(this);
        this.f5252a = nVar;
        if (f5251e.a()) {
            this.f5253b = str;
            this.f5254c = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                char c8 = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c8 = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c8 = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c8 = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c8 = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c8 = 4;
                            break;
                        }
                        break;
                }
                switch (c8) {
                    case 0:
                        this.f5255d = 20;
                        break;
                    case 1:
                        this.f5255d = 28;
                        break;
                    case 2:
                        this.f5255d = 32;
                        break;
                    case 3:
                        this.f5255d = 48;
                        break;
                    case 4:
                        this.f5255d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                nVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // Q3.a
    public final byte[] a(byte[] bArr, int i7) {
        if (i7 <= this.f5255d) {
            n nVar = this.f5252a;
            ((Mac) nVar.get()).update(bArr);
            return Arrays.copyOf(((Mac) nVar.get()).doFinal(), i7);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
