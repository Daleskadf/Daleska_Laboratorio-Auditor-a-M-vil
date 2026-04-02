package L5;

import a.AbstractC0412a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* loaded from: classes.dex */
public final class m implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final m f3037a = new Object();

    @Override // L5.s
    public ByteBuffer a(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC0412a.h0(obj));
        if (put == null) {
            return null;
        }
        Object h02 = AbstractC0412a.h0(put);
        if (h02 instanceof String) {
            z zVar = z.f3050b;
            String quote = JSONObject.quote((String) h02);
            zVar.getClass();
            return z.d(quote);
        }
        z zVar2 = z.f3050b;
        String obj2 = h02.toString();
        zVar2.getClass();
        return z.d(obj2);
    }

    @Override // L5.s
    public ByteBuffer b(o oVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", oVar.f3038a);
            jSONObject.put("args", AbstractC0412a.h0(oVar.f3039b));
            Object h02 = AbstractC0412a.h0(jSONObject);
            if (h02 instanceof String) {
                z zVar = z.f3050b;
                String quote = JSONObject.quote((String) h02);
                zVar.getClass();
                return z.d(quote);
            }
            z zVar2 = z.f3050b;
            String obj = h02.toString();
            zVar2.getClass();
            return z.d(obj);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // L5.s
    public ByteBuffer c(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(AbstractC0412a.h0(str)).put(JSONObject.NULL).put(AbstractC0412a.h0(str2));
        if (put == null) {
            return null;
        }
        Object h02 = AbstractC0412a.h0(put);
        if (h02 instanceof String) {
            z zVar = z.f3050b;
            String quote = JSONObject.quote((String) h02);
            zVar.getClass();
            return z.d(quote);
        }
        z zVar2 = z.f3050b;
        String obj = h02.toString();
        zVar2.getClass();
        return z.d(obj);
    }

    @Override // L5.s
    public ByteBuffer d(Object obj, String str, String str2) {
        JSONArray put = new JSONArray().put(str).put(AbstractC0412a.h0(str2)).put(AbstractC0412a.h0(obj));
        if (put == null) {
            return null;
        }
        Object h02 = AbstractC0412a.h0(put);
        if (h02 instanceof String) {
            z zVar = z.f3050b;
            String quote = JSONObject.quote((String) h02);
            zVar.getClass();
            return z.d(quote);
        }
        z zVar2 = z.f3050b;
        String obj2 = h02.toString();
        zVar2.getClass();
        return z.d(obj2);
    }

    @Override // L5.s
    public o e(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    z.f3050b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(z.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e7) {
                    throw new IllegalArgumentException("Invalid JSON", e7);
                }
            }
            if (nextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) nextValue;
                Object obj2 = jSONObject.get("method");
                Object opt = jSONObject.opt("args");
                if (opt != JSONObject.NULL) {
                    obj = opt;
                }
                if (obj2 instanceof String) {
                    return new o((String) obj2, obj);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e8) {
            throw new IllegalArgumentException("Invalid JSON", e8);
        }
    }

    @Override // L5.s
    public Object f(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    z.f3050b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(z.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e7) {
                    throw new IllegalArgumentException("Invalid JSON", e7);
                }
            } catch (JSONException e8) {
                throw new IllegalArgumentException("Invalid JSON", e8);
            }
        }
        if (nextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) nextValue;
            if (jSONArray.length() == 1) {
                Object opt = jSONArray.opt(0);
                if (opt == JSONObject.NULL) {
                    return null;
                }
                return opt;
            } else if (jSONArray.length() == 3) {
                Object obj2 = jSONArray.get(0);
                Object opt2 = jSONArray.opt(1);
                Object obj3 = JSONObject.NULL;
                if (opt2 == obj3) {
                    opt2 = null;
                }
                Object opt3 = jSONArray.opt(2);
                if (opt3 != obj3) {
                    obj = opt3;
                }
                if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                    throw new k(obj, (String) obj2, (String) opt2);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }
}
