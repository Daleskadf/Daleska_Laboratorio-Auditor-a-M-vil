package oa;

import com.dcs.bean.DomainInfo;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f17670a = 10;

    /* renamed from: b  reason: collision with root package name */
    public qa.a f17671b;

    /* renamed from: c  reason: collision with root package name */
    public qa.a f17672c;

    /* renamed from: d  reason: collision with root package name */
    public DomainInfo f17673d;

    /* loaded from: classes3.dex */
    public class a extends fa.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17674b;

        public a(String str) {
            this.f17674b = str;
        }

        @Override // fa.a
        /* renamed from: c */
        public Observable a(Throwable th) {
            if (b.this.f17672c != null) {
                return b.this.f17672c.b(this.f17674b);
            }
            return Observable.error(th);
        }
    }

    public b(DomainInfo domainInfo) {
        this.f17673d = domainInfo;
        this.f17671b = e("http://" + this.f17673d.getFirst());
        this.f17672c = e("http://" + this.f17673d.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Throwable th) {
        t2.a.f18798a.q(this.f17673d, "key_epg");
    }

    public Observable c(String str) {
        String str2 = "/epg/live/app/" + str;
        return this.f17671b.b(str2).onErrorResumeNext(new a(str2)).observeOn(Schedulers.computation()).doOnError(new Consumer() { // from class: oa.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                b.this.d((Throwable) obj);
            }
        });
    }

    public final qa.a e(String str) {
        new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.proxy(Proxy.NO_PROXY);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (qa.a) new Retrofit.Builder().client(builder.retryOnConnectionFailure(true).connectTimeout(this.f17670a, timeUnit).readTimeout(this.f17670a, timeUnit).writeTimeout(this.f17670a, timeUnit).dispatcher(new Dispatcher(na.a.f())).addInterceptor(new la.b()).dns(new ja.c(".epg")).build()).baseUrl(str).addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync()).addConverterFactory(GsonConverterFactory.create()).build().create(qa.a.class);
    }
}
