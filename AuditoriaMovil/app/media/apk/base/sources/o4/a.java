package O4;

import I4.G;
import I4.H;
import I4.n;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class a extends G {

    /* renamed from: b  reason: collision with root package name */
    public static final C0000a f3852b = new C0000a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f3853a;

    /* renamed from: O4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0000a implements H {
        @Override // I4.H
        public final G create(n nVar, P4.a aVar) {
            if (aVar.f4022a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i7) {
        this();
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        Date date;
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        String B7 = aVar.B();
        synchronized (this) {
            TimeZone timeZone = this.f3853a.getTimeZone();
            try {
                date = new Date(this.f3853a.parse(B7).getTime());
                this.f3853a.setTimeZone(timeZone);
            } catch (ParseException e7) {
                throw new RuntimeException("Failed parsing '" + B7 + "' as SQL Date; at path " + aVar.p(), e7);
            }
        }
        return date;
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.o();
            return;
        }
        synchronized (this) {
            format = this.f3853a.format((java.util.Date) date);
        }
        cVar.x(format);
    }

    private a() {
        this.f3853a = new SimpleDateFormat("MMM d, yyyy");
    }
}
