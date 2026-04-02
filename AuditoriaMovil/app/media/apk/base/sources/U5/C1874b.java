package u5;

import F.f;
import L5.o;
import L5.q;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: u5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1874b extends f {

    /* renamed from: Z  reason: collision with root package name */
    public final com.dexterous.flutterlocalnotifications.c f16023Z;

    /* renamed from: e0  reason: collision with root package name */
    public final o f16024e0;

    public C1874b(o oVar, q qVar) {
        this.f16024e0 = oVar;
        this.f16023Z = new com.dexterous.flutterlocalnotifications.c(qVar);
    }

    @Override // F.f
    public final Object p(String str) {
        return this.f16024e0.a(str);
    }

    @Override // F.f
    public final String r() {
        return this.f16024e0.f3038a;
    }

    @Override // F.f
    public final InterfaceC1875c t() {
        return this.f16023Z;
    }

    @Override // F.f
    public final boolean v() {
        Object obj = this.f16024e0.f3039b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey("transactionId");
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has("transactionId");
        }
        throw new ClassCastException();
    }
}
