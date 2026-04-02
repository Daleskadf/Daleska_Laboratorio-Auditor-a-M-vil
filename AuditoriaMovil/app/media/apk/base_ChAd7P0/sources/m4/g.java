package m4;

import java.util.ArrayList;
import q4.q;
/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final q4.h f14040a;

    /* renamed from: b  reason: collision with root package name */
    public final q f14041b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14042c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f14043d;

    public g(q4.h hVar, q qVar, boolean z7, ArrayList arrayList) {
        this.f14040a = hVar;
        this.f14041b = qVar;
        this.f14042c = z7;
        this.f14043d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f14042c != gVar.f14042c || !this.f14040a.equals(gVar.f14040a) || !this.f14041b.equals(gVar.f14041b)) {
            return false;
        }
        return this.f14043d.equals(gVar.f14043d);
    }

    public final int hashCode() {
        int hashCode = this.f14041b.f15371a.hashCode();
        return this.f14043d.hashCode() + ((((hashCode + (this.f14040a.f15357a.hashCode() * 31)) * 31) + (this.f14042c ? 1 : 0)) * 31);
    }
}
