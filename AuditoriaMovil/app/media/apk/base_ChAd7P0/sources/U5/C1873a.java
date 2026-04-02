package u5;

import E.e;
import F.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* renamed from: u5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873a extends f {

    /* renamed from: Z  reason: collision with root package name */
    public final Map f16020Z;

    /* renamed from: e0  reason: collision with root package name */
    public final e f16021e0 = new e(27, false);

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f16022f0;

    public C1873a(Map map, boolean z7) {
        this.f16020Z = map;
        this.f16022f0 = z7;
    }

    public final void H(ArrayList arrayList) {
        if (!this.f16022f0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            e eVar = this.f16021e0;
            hashMap2.put("code", (String) eVar.f921c);
            hashMap2.put("message", (String) eVar.f922d);
            hashMap2.put("data", (HashMap) eVar.f923e);
            hashMap.put("error", hashMap2);
            arrayList.add(hashMap);
        }
    }

    public final void I(ArrayList arrayList) {
        if (!this.f16022f0) {
            HashMap hashMap = new HashMap();
            hashMap.put("result", (Serializable) this.f16021e0.f920b);
            arrayList.add(hashMap);
        }
    }

    @Override // F.f
    public final Object p(String str) {
        return this.f16020Z.get(str);
    }

    @Override // F.f
    public final String r() {
        return (String) this.f16020Z.get("method");
    }

    @Override // F.f
    public final boolean s() {
        return this.f16022f0;
    }

    @Override // F.f
    public final InterfaceC1875c t() {
        return this.f16021e0;
    }

    @Override // F.f
    public final boolean v() {
        return this.f16020Z.containsKey("transactionId");
    }
}
