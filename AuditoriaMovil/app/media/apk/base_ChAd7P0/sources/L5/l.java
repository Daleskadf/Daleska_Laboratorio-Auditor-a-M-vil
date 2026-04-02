package L5;

import a.AbstractC0412a;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final l f3036a = new Object();

    @Override // L5.n
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object h02 = AbstractC0412a.h0(obj);
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

    @Override // L5.n
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            z.f3050b.getClass();
            JSONTokener jSONTokener = new JSONTokener(z.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }
}
