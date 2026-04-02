package la;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import ma.i;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
/* loaded from: classes3.dex */
public abstract class d implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final MediaType f16460a = MediaType.parse("application/json; charset=utf-8");

    public static String b(Request request) {
        RequestBody body = request.body();
        Charset forName = Charset.forName("UTF-8");
        StringBuilder sb = new StringBuilder();
        MediaType contentType = body.contentType();
        if (contentType != null) {
            forName = contentType.charset(Charset.forName("UTF-8"));
        }
        Buffer buffer = new Buffer();
        try {
            body.writeTo(buffer);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        sb.append(buffer.readString(forName));
        buffer.close();
        return sb.toString();
    }

    public abstract Iterable a();

    public abstract boolean c();

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        JsonObject asJsonObject;
        String str;
        String jsonElement;
        Request.Builder put;
        Request request = chain.request();
        if ((!TextUtils.equals(request.method(), "POST") && !TextUtils.equals(request.method(), Request.Method.PUT)) || !request.body().contentType().toString().contains("application/json;")) {
            return chain.proceed(request);
        }
        try {
            String header = request.header("needEncrypt");
            if (request.body().contentLength() <= 0) {
                asJsonObject = new JsonObject();
            } else {
                asJsonObject = new JsonParser().parse(b(request)).getAsJsonObject();
            }
            JsonElement jsonElement2 = asJsonObject.get("columnId");
            if (jsonElement2 != null && jsonElement2.getAsInt() == -1) {
                chain.call().cancel();
            }
            try {
                String path = request.url().url().getPath();
                if (!path.contains("/sendEmailVerifyCode") && !path.contains("/getAreaCode") && !path.contains("/validateVerifyCode") && !path.contains("/resetPwd") && !path.contains("/qr/token") && !path.contains("v3/getProgram") && !path.contains("/feedback/userFeedBack") && !path.contains("/getVerifiCode") && !path.contains("/checkVerifiCode") && asJsonObject.get("userId") != null && asJsonObject.get("userId").getAsString().isEmpty()) {
                    chain.call().cancel();
                }
            } catch (Exception unused) {
            }
            for (Map.Entry entry : a()) {
                asJsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
            }
            if (asJsonObject.get("securityKey") != null) {
                str = asJsonObject.get("securityKey").getAsString();
                asJsonObject.remove("securityKey");
            } else {
                str = null;
            }
            if (c() && !"false".equals(header)) {
                if (!TextUtils.isEmpty(str)) {
                    jsonElement = i.e(asJsonObject.toString(), str);
                } else {
                    jsonElement = i.d(asJsonObject.toString());
                }
            } else {
                jsonElement = asJsonObject.toString();
            }
            RequestBody create = RequestBody.create(this.f16460a, jsonElement);
            if (TextUtils.equals(request.method(), "POST")) {
                put = request.newBuilder().post(create);
            } else {
                put = request.newBuilder().put(create);
            }
            request = put.build();
            b(request);
            return chain.proceed(request);
        } catch (Exception unused2) {
            return chain.proceed(request);
        }
    }
}
