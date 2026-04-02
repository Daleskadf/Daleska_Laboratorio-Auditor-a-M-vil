package K5;

import android.os.Bundle;
import androidx.lifecycle.C0558j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r.C1717b;
import r.C1718c;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2735a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2736b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2737c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2738d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2739e;
    public Object f;

    public static HashMap c(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public Bundle a(String str) {
        if (this.f2736b) {
            Bundle bundle = (Bundle) this.f2739e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f2739e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f2739e;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f2739e = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public Z1.d b() {
        Map.Entry components;
        Z1.d dVar;
        Iterator it = ((r.f) this.f2738d).iterator();
        do {
            C1717b c1717b = (C1717b) it;
            if (c1717b.hasNext()) {
                components = (Map.Entry) c1717b.next();
                kotlin.jvm.internal.j.d(components, "components");
                dVar = (Z1.d) components.getValue();
            } else {
                return null;
            }
        } while (!kotlin.jvm.internal.j.a((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void d(String str, Z1.d provider) {
        Object obj;
        kotlin.jvm.internal.j.e(provider, "provider");
        r.f fVar = (r.f) this.f2738d;
        C1718c e7 = fVar.e(str);
        if (e7 != null) {
            obj = e7.f15400b;
        } else {
            C1718c c1718c = new C1718c(str, provider);
            fVar.f15409d++;
            C1718c c1718c2 = fVar.f15407b;
            if (c1718c2 == null) {
                fVar.f15406a = c1718c;
                fVar.f15407b = c1718c;
            } else {
                c1718c2.f15401c = c1718c;
                c1718c.f15402d = c1718c2;
                fVar.f15407b = c1718c;
            }
            obj = null;
        }
        if (((Z1.d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void e() {
        if (this.f2737c) {
            Z1.a aVar = (Z1.a) this.f;
            if (aVar == null) {
                aVar = new Z1.a(this);
            }
            this.f = aVar;
            try {
                C0558j.class.getDeclaredConstructor(null);
                Z1.a aVar2 = (Z1.a) this.f;
                if (aVar2 != null) {
                    aVar2.f6731a.add(C0558j.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e7) {
                throw new IllegalArgumentException("Class " + C0558j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
