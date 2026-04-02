package C4;

import U3.h;
import V2.k;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: m  reason: collision with root package name */
    public final JSONObject f551m;

    public g(k kVar, h hVar, JSONObject jSONObject) {
        super(kVar, hVar);
        this.f551m = jSONObject;
        q("X-HTTP-Method-Override", "PATCH");
    }

    @Override // C4.c
    public final String d() {
        return "PUT";
    }

    @Override // C4.c
    public final JSONObject e() {
        return this.f551m;
    }
}
