package y;

import android.os.Build;
import f0.AbstractC0978c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.C1894D;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final t f16601a;

    public u(ArrayList arrayList, G.k kVar, C1894D c1894d) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f16601a = new s(arrayList, kVar, c1894d);
        } else {
            this.f16601a = new r(arrayList, kVar, c1894d);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0978c.c(((C2028h) it.next()).f16578a.c()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        return this.f16601a.equals(((u) obj).f16601a);
    }

    public final int hashCode() {
        return this.f16601a.hashCode();
    }
}
