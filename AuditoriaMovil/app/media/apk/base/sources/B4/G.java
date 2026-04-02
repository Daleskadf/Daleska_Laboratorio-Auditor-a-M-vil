package b4;

import com.google.firebase.auth.FirebaseAuth;
import org.apache.tika.metadata.TikaCoreProperties;
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final String f8189a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8190b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8191c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8192d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8193e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final FirebaseAuth f8194g;

    public G(String str, String str2, int i7, int i8, long j, String str3, FirebaseAuth firebaseAuth) {
        com.google.android.gms.common.internal.I.f(str3, "sessionInfo cannot be empty.");
        com.google.android.gms.common.internal.I.f(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f8189a = str;
        com.google.android.gms.common.internal.I.f(str2, "hashAlgorithm cannot be empty.");
        this.f8190b = str2;
        this.f8191c = i7;
        this.f8192d = i8;
        this.f8193e = j;
        this.f = str3;
        this.f8194g = firebaseAuth;
    }

    public final String a(String str, String str2) {
        com.google.android.gms.common.internal.I.f(str, "accountName cannot be empty.");
        com.google.android.gms.common.internal.I.f(str2, "issuer cannot be empty.");
        return "otpauth://totp/" + str2 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str + "?secret=" + this.f8189a + "&issuer=" + str2 + "&algorithm=" + this.f8190b + "&digits=" + this.f8191c;
    }
}
