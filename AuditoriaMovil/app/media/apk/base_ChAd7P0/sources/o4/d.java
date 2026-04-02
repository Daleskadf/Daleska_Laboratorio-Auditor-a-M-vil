package O4;

import I4.G;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes.dex */
public final class d extends G {

    /* renamed from: b  reason: collision with root package name */
    public static final c f3856b = new c();

    /* renamed from: a  reason: collision with root package name */
    public final G f3857a;

    public d(G g3) {
        this.f3857a = g3;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        Date date = (Date) this.f3857a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        this.f3857a.c(cVar, (Timestamp) obj);
    }
}
