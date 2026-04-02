package v4;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f16057b;

    public /* synthetic */ b(c cVar, int i7) {
        this.f16056a = i7;
        this.f16057b = cVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        c cVar = this.f16057b;
        synchronized (cVar) {
            try {
                h hVar = (h) cVar.f16058a.get();
                ArrayList c8 = hVar.c();
                hVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i7 = 0; i7 < c8.size(); i7++) {
                    C1889a c1889a = (C1889a) c8.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c1889a.f16054a);
                    jSONObject.put("dates", new JSONArray((Collection) c1889a.f16055b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16056a) {
            case 0:
                return a();
            default:
                c cVar = this.f16057b;
                synchronized (cVar) {
                    ((h) cVar.f16058a.get()).k(((A4.b) cVar.f16060c.get()).a(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
