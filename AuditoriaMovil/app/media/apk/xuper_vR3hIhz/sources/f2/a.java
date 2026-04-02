package f2;

import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.by;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import t9.i;
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b  reason: collision with root package name */
    public String f13023b;

    /* renamed from: c  reason: collision with root package name */
    public String f13024c;

    /* renamed from: e  reason: collision with root package name */
    public b f13026e;

    /* renamed from: k  reason: collision with root package name */
    public Dns f13032k;

    /* renamed from: l  reason: collision with root package name */
    public Interceptor f13033l;

    /* renamed from: a  reason: collision with root package name */
    public String f13022a = a.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public String f13025d = e.GET.b();

    /* renamed from: f  reason: collision with root package name */
    public HashMap f13027f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public HashMap f13028g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public String f13029h = "";

    /* renamed from: i  reason: collision with root package name */
    public int f13030i = by.f10132b;

    /* renamed from: j  reason: collision with root package name */
    public int f13031j = by.f10132b;

    public a() {
        Dns dns = Dns.SYSTEM;
        i.f(dns, "SYSTEM");
        this.f13032k = dns;
    }

    public final a a(b bVar) {
        i.g(bVar, "callback");
        this.f13026e = bVar;
        return this;
    }

    public final a b(Dns dns) {
        i.g(dns, BaseMonitor.COUNT_POINT_DNS);
        this.f13032k = dns;
        return this;
    }

    public final g2.a c(boolean z10) {
        boolean z11;
        Response execute;
        long parseLong;
        g2.a aVar = new g2.a();
        String d10 = d(z10);
        boolean z12 = false;
        if (d10 != null && d10.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            Response response = null;
            String str = null;
            try {
                try {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.proxy(Proxy.NO_PROXY);
                    X509TrustManager a10 = c.a();
                    i.f(a10, "getTrustAllCert()");
                    builder.sslSocketFactory(new f(a10), a10);
                    Interceptor interceptor = this.f13033l;
                    if (interceptor != null) {
                        builder.addInterceptor(interceptor);
                    }
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    OkHttpClient build = builder.readTimeout(this.f13031j, timeUnit).connectTimeout(this.f13030i, timeUnit).dns(this.f13032k).build();
                    Request.Builder addHeader = new Request.Builder().url(d10).addHeader("User-Agent", "BigBee/3.7.0");
                    for (Map.Entry entry : this.f13027f.entrySet()) {
                        addHeader.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (i.b(this.f13025d, e.POST.b())) {
                        RequestBody create = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.f13029h);
                        i.f(create, "create(MediaType.parse(\"…et=utf-8\"), mRequestJson)");
                        addHeader.post(create);
                    }
                    execute = build.newCall(addHeader.build()).execute();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e10) {
                e = e10;
            }
            try {
                aVar.g(execute.code());
                if (execute.code() == 200) {
                    ResponseBody body = execute.body();
                    if (body != null) {
                        str = body.string();
                    }
                    aVar.f(str);
                    String str2 = execute.headers().get("reportClock");
                    if ((str2 == null || str2.length() == 0) ? true : true) {
                        parseLong = i2.a.f14261a.c();
                    } else {
                        parseLong = Long.parseLong(str2);
                    }
                    aVar.e(parseLong);
                }
                execute.close();
                return aVar;
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                throw e;
            } catch (Throwable th2) {
                response = execute;
                th = th2;
                if (response != null) {
                    response.close();
                }
                throw th;
            }
        }
        return aVar;
    }

    public final String d(boolean z10) {
        if (z10) {
            return this.f13023b;
        }
        return this.f13024c;
    }

    public final a e(String str, String str2) {
        i.g(str, "key");
        i.g(str2, "value");
        this.f13027f.put(str, str2);
        return this;
    }

    public final a f(Interceptor interceptor) {
        this.f13033l = interceptor;
        return this;
    }

    public final a g(String str) {
        i.g(str, "json");
        this.f13029h = str;
        return this;
    }

    public final a h(e eVar) {
        i.g(eVar, "requestMethod");
        this.f13025d = eVar.b();
        return this;
    }

    public final a i(String str, String str2) {
        i.g(str, "mainUrl");
        i.g(str2, "reserveUrl");
        this.f13023b = str;
        this.f13024c = str2;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            g2.a c10 = c(true);
            if (c10.d()) {
                b bVar = this.f13026e;
                if (bVar != null) {
                    bVar.a(this, c10);
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        try {
            g2.a c11 = c(false);
            b bVar2 = this.f13026e;
            if (bVar2 != null) {
                bVar2.a(this, c11);
            }
        } catch (Exception e10) {
            b bVar3 = this.f13026e;
            if (bVar3 != null) {
                bVar3.b(this, e10);
            }
        }
    }
}
