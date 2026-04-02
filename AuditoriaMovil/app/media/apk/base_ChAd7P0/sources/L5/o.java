package L5;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f3038a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3039b;

    public o(String str, Object obj) {
        this.f3038a = str;
        this.f3039b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f3039b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }
}
