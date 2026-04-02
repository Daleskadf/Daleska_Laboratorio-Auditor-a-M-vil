package V2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0750y;
import com.google.android.gms.common.internal.I;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.tika.metadata.HttpHeaders;
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public static final Z2.a f5945c = new Z2.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a  reason: collision with root package name */
    public final String f5946a;

    /* renamed from: b  reason: collision with root package name */
    public final C0750y f5947b;

    public c(String str) {
        I.e(str);
        this.f5946a = str;
        this.f5947b = new C0750y(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z2.a aVar = f5945c;
        Status status = Status.f9149X;
        try {
            String str = this.f5946a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f9152e;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]);
        } catch (Exception e8) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        }
        this.f5947b.setResult((C0750y) status);
    }
}
