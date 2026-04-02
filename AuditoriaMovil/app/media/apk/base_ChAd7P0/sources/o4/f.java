package O4;

import O4.a;
import O4.b;
import java.sql.Date;
import java.sql.Timestamp;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f3859a;

    /* renamed from: b  reason: collision with root package name */
    public static final a.C0000a f3860b;

    /* renamed from: c  reason: collision with root package name */
    public static final b.a f3861c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f3862d;

    static {
        boolean z7;
        try {
            Class.forName("java.sql.Date");
            z7 = true;
        } catch (ClassNotFoundException unused) {
            z7 = false;
        }
        f3859a = z7;
        if (z7) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f3860b = a.f3852b;
            f3861c = b.f3854b;
            f3862d = d.f3856b;
            return;
        }
        f3860b = null;
        f3861c = null;
        f3862d = null;
    }
}
