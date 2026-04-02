package la;

import android.os.SystemClock;
import ba.t;
import com.taobao.accs.common.Constants;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import mobile.com.requestframe.utils.bean.ResultException;
import na.e;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.HttpException;
import t9.i;
/* loaded from: classes3.dex */
public final class a implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final String f16437a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16438b;

    public a(String str) {
        i.g(str, "alias");
        this.f16437a = str;
        String simpleName = a.class.getSimpleName();
        i.f(simpleName, "javaClass.simpleName");
        this.f16438b = simpleName;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String str;
        String str2;
        int code;
        i.g(chain, "chain");
        Request request = chain.request();
        URL url = request.url().url();
        String path = url.getPath();
        Request build = request.newBuilder().build();
        String a10 = a3.d.a(url.getHost(), a3.d.f161a);
        url.getProtocol();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        t2.a aVar = t2.a.f18798a;
        i.f(a10, Constants.KEY_HOST);
        aVar.v(a10);
        try {
            Response proceed = chain.proceed(build);
            int code2 = proceed.code();
            if (code2 != 200) {
                c2.d dVar = c2.d.f5311a;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                i.f(path, "path");
                str = a10;
                str2 = path;
                try {
                    c2.d.e(dVar, elapsedRealtime, elapsedRealtime2, path, a10, code2, e.f17345e, null, true, 64, null);
                } catch (Exception e10) {
                    e = e10;
                    if (!(e instanceof ResultException)) {
                        String message = e.getMessage();
                        boolean z10 = false;
                        if (message != null && t.o(message, "Canceled", false, 2, null)) {
                            z10 = true;
                        }
                        if (!z10) {
                            if (!(e instanceof HttpException)) {
                                if (!(e instanceof TimeoutException)) {
                                    if (!(e instanceof ConnectException)) {
                                        if (!(e instanceof SocketTimeoutException)) {
                                            if (!(e instanceof SSLException)) {
                                                if (e instanceof UnknownHostException) {
                                                    code = 50014;
                                                } else {
                                                    code = 50015;
                                                }
                                            } else {
                                                code = 50013;
                                            }
                                        } else {
                                            code = 50012;
                                        }
                                    } else {
                                        code = 50011;
                                    }
                                } else {
                                    code = 50010;
                                }
                            } else {
                                code = ((HttpException) e).code();
                            }
                            c2.d dVar2 = c2.d.f5311a;
                            long elapsedRealtime3 = SystemClock.elapsedRealtime();
                            i.f(str2, "path");
                            c2.d.e(dVar2, elapsedRealtime, elapsedRealtime3, str2, str, code, e.f17345e, null, true, 64, null);
                        }
                    }
                    throw e;
                }
            } else {
                str = a10;
                str2 = path;
            }
            i.f(proceed, "mResponse");
            return proceed;
        } catch (Exception e11) {
            e = e11;
            str = a10;
            str2 = path;
        }
    }
}
