package L4;

import D.AbstractC0059i;
import j$.util.Objects;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.tika.utils.StringUtils;
/* renamed from: L4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216h extends I4.G {

    /* renamed from: c  reason: collision with root package name */
    public static final C0213e f2954c = new C0213e();

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0215g f2955a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2956b;

    public C0216h(AbstractC0215g abstractC0215g) {
        ArrayList arrayList = new ArrayList();
        this.f2956b = arrayList;
        Objects.requireNonNull(abstractC0215g);
        this.f2955a = abstractC0215g;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (K4.i.f2662a >= 9) {
            arrayList.add(new SimpleDateFormat(AbstractC0059i.A("MMM d, yyyy", StringUtils.SPACE, "h:mm:ss a"), locale));
        }
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        Date b5;
        DateFormat dateFormat;
        TimeZone timeZone;
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        String B7 = aVar.B();
        synchronized (this.f2956b) {
            try {
                Iterator it = this.f2956b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        dateFormat = (DateFormat) it.next();
                        timeZone = dateFormat.getTimeZone();
                        b5 = dateFormat.parse(B7);
                        dateFormat.setTimeZone(timeZone);
                    } else {
                        try {
                            b5 = M4.a.b(B7, new ParsePosition(0));
                            break;
                        } catch (ParseException e7) {
                            StringBuilder m7 = androidx.datastore.preferences.protobuf.Y.m("Failed parsing '", B7, "' as Date; at path ");
                            m7.append(aVar.p());
                            throw new RuntimeException(m7.toString(), e7);
                        }
                    }
                }
            } catch (ParseException unused) {
                dateFormat.setTimeZone(timeZone);
            } finally {
            }
        }
        return this.f2955a.a(b5);
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.o();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f2956b.get(0);
        synchronized (this.f2956b) {
            format = dateFormat.format(date);
        }
        cVar.x(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f2956b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
