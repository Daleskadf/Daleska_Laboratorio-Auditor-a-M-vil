package O4;

import L4.AbstractC0215g;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes.dex */
public final class e extends AbstractC0215g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Class cls, int i7) {
        super(cls);
        this.f3858b = i7;
    }

    @Override // L4.AbstractC0215g
    public final Date a(Date date) {
        switch (this.f3858b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
