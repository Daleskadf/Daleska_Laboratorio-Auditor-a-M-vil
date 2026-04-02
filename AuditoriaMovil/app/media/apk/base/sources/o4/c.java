package O4;

import I4.G;
import I4.H;
import I4.n;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes.dex */
public class c implements H {
    @Override // I4.H
    public final G create(n nVar, P4.a aVar) {
        if (aVar.f4022a == Timestamp.class) {
            nVar.getClass();
            return new d(nVar.c(new P4.a(Date.class)));
        }
        return null;
    }
}
