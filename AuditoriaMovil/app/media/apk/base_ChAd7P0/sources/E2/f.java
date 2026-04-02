package E2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final A.f f1067a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1068b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1069c;

    public f(Context context, e eVar) {
        A.f fVar = new A.f(context, 8);
        this.f1069c = new HashMap();
        this.f1067a = fVar;
        this.f1068b = eVar;
    }

    public final synchronized g a(String str) {
        if (this.f1069c.containsKey(str)) {
            return (g) this.f1069c.get(str);
        }
        CctBackendFactory k2 = this.f1067a.k(str);
        if (k2 == null) {
            return null;
        }
        e eVar = this.f1068b;
        g create = k2.create(new b(eVar.f1064a, eVar.f1065b, eVar.f1066c, str));
        this.f1069c.put(str, create);
        return create;
    }
}
