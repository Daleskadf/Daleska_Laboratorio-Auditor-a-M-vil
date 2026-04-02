package a4;

import D.AbstractC0059i;
import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import java.util.HashMap;
import java.util.Set;
/* renamed from: a4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455d {

    /* renamed from: d  reason: collision with root package name */
    public static final zzan f7025d;

    /* renamed from: a  reason: collision with root package name */
    public final String f7026a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7027b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7028c;

    static {
        HashMap hashMap = new HashMap();
        AbstractC0059i.G(2, hashMap, "recoverEmail", 0, "resetPassword");
        AbstractC0059i.G(4, hashMap, "signIn", 1, "verifyEmail");
        AbstractC0059i.G(5, hashMap, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        f7025d = zzan.zza(hashMap);
    }

    public C0455d(String str) {
        String a7 = a(str, "apiKey");
        String a8 = a(str, "oobCode");
        String a9 = a(str, "mode");
        if (a7 != null && a8 != null && a9 != null) {
            com.google.android.gms.common.internal.I.e(a7);
            com.google.android.gms.common.internal.I.e(a8);
            this.f7026a = a8;
            com.google.android.gms.common.internal.I.e(a9);
            this.f7027b = a9;
            a(str, "continueUrl");
            a(str, "languageCode");
            this.f7028c = a(str, "tenantId");
            return;
        }
        throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                String queryParameter = parse.getQueryParameter("link");
                com.google.android.gms.common.internal.I.e(queryParameter);
                return Uri.parse(queryParameter).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
