package O4;

import I4.G;
import I4.H;
import I4.n;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class b extends G {

    /* renamed from: b  reason: collision with root package name */
    public static final a f3854b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f3855a;

    /* loaded from: classes.dex */
    public class a implements H {
        @Override // I4.H
        public final G create(n nVar, P4.a aVar) {
            if (aVar.f4022a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i7) {
        this();
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        Time time;
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        String B7 = aVar.B();
        synchronized (this) {
            TimeZone timeZone = this.f3855a.getTimeZone();
            try {
                time = new Time(this.f3855a.parse(B7).getTime());
                this.f3855a.setTimeZone(timeZone);
            } catch (ParseException e7) {
                throw new RuntimeException("Failed parsing '" + B7 + "' as SQL Time; at path " + aVar.p(), e7);
            }
        }
        return time;
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            cVar.o();
            return;
        }
        synchronized (this) {
            format = this.f3855a.format((Date) time);
        }
        cVar.x(format);
    }

    private b() {
        this.f3855a = new SimpleDateFormat("hh:mm:ss a");
    }
}
