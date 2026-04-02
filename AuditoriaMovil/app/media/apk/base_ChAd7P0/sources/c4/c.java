package C4;

import U3.h;
import V2.k;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import c5.C0639a;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.i;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: k  reason: collision with root package name */
    public static final Uri f536k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: l  reason: collision with root package name */
    public static final C0639a f537l = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Exception f538a;

    /* renamed from: b  reason: collision with root package name */
    public final k f539b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f540c;

    /* renamed from: d  reason: collision with root package name */
    public Map f541d;

    /* renamed from: e  reason: collision with root package name */
    public int f542e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public int f543g;

    /* renamed from: h  reason: collision with root package name */
    public InputStream f544h;

    /* renamed from: i  reason: collision with root package name */
    public HttpURLConnection f545i;
    public final HashMap j = new HashMap();

    public c(k kVar, h hVar) {
        I.i(hVar);
        this.f539b = kVar;
        hVar.a();
        this.f540c = hVar.f5749a;
        hVar.a();
        q("x-firebase-gmpid", hVar.f5751c.f5758b);
    }

    public final void a(Object obj, TaskCompletionSource taskCompletionSource) {
        Exception exc = this.f538a;
        if (l() && exc == null) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(i.b(this.f542e, exc));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] f;
        int g3;
        I.i(httpURLConnection);
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        } else {
            Log.w("NetworkRequest", "no auth token for request");
        }
        if (!TextUtils.isEmpty(str2)) {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        } else {
            Log.w("NetworkRequest", "No App Check token for request.");
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/21.0.1");
        for (Map.Entry entry : this.j.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject e7 = e();
        if (e7 != null) {
            f = e7.toString().getBytes("UTF-8");
            g3 = f.length;
        } else {
            f = f();
            g3 = g();
            if (g3 == 0 && f != null) {
                g3 = f.length;
            }
        }
        if (f != null && f.length > 0) {
            if (e7 != null) {
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, Integer.toString(g3));
        } else {
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, "0");
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (f != null && f.length > 0) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (outputStream != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    bufferedOutputStream.write(f, 0, g3);
                    return;
                } finally {
                    bufferedOutputStream.close();
                }
            }
            Log.e("NetworkRequest", "Unable to write to the http request!");
        }
    }

    public final HttpURLConnection c() {
        Uri k2 = k();
        Map h8 = h();
        if (h8 != null) {
            Uri.Builder buildUpon = k2.buildUpon();
            for (Map.Entry entry : h8.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            k2 = buildUpon.build();
        }
        URL url = new URL(k2.toString());
        f537l.getClass();
        return (HttpURLConnection) url.openConnection();
    }

    public abstract String d();

    public JSONObject e() {
        return null;
    }

    public byte[] f() {
        return null;
    }

    public int g() {
        return 0;
    }

    public Map h() {
        return null;
    }

    public final JSONObject i() {
        if (!TextUtils.isEmpty(this.f)) {
            try {
                return new JSONObject(this.f);
            } catch (JSONException e7) {
                Log.e("NetworkRequest", "error parsing result into JSON:" + this.f, e7);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public final String j(String str) {
        List list;
        Map map = this.f541d;
        if (map != null && (list = (List) map.get(str)) != null && list.size() > 0) {
            return (String) list.get(0);
        }
        return null;
    }

    public Uri k() {
        return (Uri) this.f539b.f5966c;
    }

    public final boolean l() {
        int i7 = this.f542e;
        if (i7 >= 200 && i7 < 300) {
            return true;
        }
        return false;
    }

    public final void m(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f = sb.toString();
        if (!l()) {
            this.f538a = new IOException(this.f);
        }
    }

    public final void n(Context context, String str, String str2) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            p(str, str2);
            try {
                if (l()) {
                    m(this.f544h);
                } else {
                    m(this.f544h);
                }
            } catch (IOException e7) {
                Log.w("NetworkRequest", "error sending network request " + d() + StringUtils.SPACE + k(), e7);
                this.f538a = e7;
                this.f542e = -2;
            }
            o();
            return;
        }
        this.f538a = new SocketException("Network subsystem is unavailable");
        this.f542e = -2;
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.f545i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final void p(String str, String str2) {
        if (this.f538a != null) {
            this.f542e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + d() + StringUtils.SPACE + k());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f540c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            try {
                HttpURLConnection c8 = c();
                this.f545i = c8;
                c8.setRequestMethod(d());
                b(this.f545i, str, str2);
                HttpURLConnection httpURLConnection = this.f545i;
                I.i(httpURLConnection);
                this.f542e = httpURLConnection.getResponseCode();
                this.f541d = httpURLConnection.getHeaderFields();
                this.f543g = httpURLConnection.getContentLength();
                if (l()) {
                    this.f544h = httpURLConnection.getInputStream();
                } else {
                    this.f544h = httpURLConnection.getErrorStream();
                }
                if (Log.isLoggable("NetworkRequest", 3)) {
                    Log.d("NetworkRequest", "network request result " + this.f542e);
                    return;
                }
                return;
            } catch (IOException e7) {
                Log.w("NetworkRequest", "error sending network request " + d() + StringUtils.SPACE + k(), e7);
                this.f538a = e7;
                this.f542e = -2;
                return;
            }
        }
        this.f542e = -2;
        this.f538a = new SocketException("Network subsystem is unavailable");
    }

    public final void q(String str, String str2) {
        this.j.put(str, str2);
    }
}
