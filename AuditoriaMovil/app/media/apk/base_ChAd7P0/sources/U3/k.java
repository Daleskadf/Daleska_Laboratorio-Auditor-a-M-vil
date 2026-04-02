package U3;

import a6.t0;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import f3.AbstractC0991d;
import java.util.Arrays;
import org.apache.tika.metadata.ClimateForcast;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f5757a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5758b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5759c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5760d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5761e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5762g;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z7;
        int i7 = AbstractC0991d.f11059a;
        if (str != null && !str.trim().isEmpty()) {
            z7 = false;
        } else {
            z7 = true;
        }
        I.k("ApplicationId must be set.", true ^ z7);
        this.f5758b = str;
        this.f5757a = str2;
        this.f5759c = str3;
        this.f5760d = str4;
        this.f5761e = str5;
        this.f = str6;
        this.f5762g = str7;
    }

    public static k a(Context context) {
        t0 t0Var = new t0(context, 7);
        String H7 = t0Var.H("google_app_id");
        if (TextUtils.isEmpty(H7)) {
            return null;
        }
        return new k(H7, t0Var.H("google_api_key"), t0Var.H("firebase_database_url"), t0Var.H("ga_trackingId"), t0Var.H("gcm_defaultSenderId"), t0Var.H("google_storage_bucket"), t0Var.H(ClimateForcast.PROJECT_ID));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!I.m(this.f5758b, kVar.f5758b) || !I.m(this.f5757a, kVar.f5757a) || !I.m(this.f5759c, kVar.f5759c) || !I.m(this.f5760d, kVar.f5760d) || !I.m(this.f5761e, kVar.f5761e) || !I.m(this.f, kVar.f) || !I.m(this.f5762g, kVar.f5762g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5758b, this.f5757a, this.f5759c, this.f5760d, this.f5761e, this.f, this.f5762g});
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(this.f5758b, "applicationId");
        t0Var.m(this.f5757a, "apiKey");
        t0Var.m(this.f5759c, "databaseUrl");
        t0Var.m(this.f5761e, "gcmSenderId");
        t0Var.m(this.f, "storageBucket");
        t0Var.m(this.f5762g, "projectId");
        return t0Var.toString();
    }
}
