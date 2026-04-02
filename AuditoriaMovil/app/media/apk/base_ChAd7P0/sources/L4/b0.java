package L4;

import java.util.Calendar;
import java.util.GregorianCalendar;
/* loaded from: classes.dex */
public class b0 extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        aVar.b();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (aVar.D() != Q4.b.END_OBJECT) {
            String x7 = aVar.x();
            int v6 = aVar.v();
            x7.getClass();
            char c8 = 65535;
            switch (x7.hashCode()) {
                case -1181204563:
                    if (x7.equals("dayOfMonth")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1074026988:
                    if (x7.equals("minute")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -906279820:
                    if (x7.equals("second")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 3704893:
                    if (x7.equals("year")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 104080000:
                    if (x7.equals("month")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 985252545:
                    if (x7.equals("hourOfDay")) {
                        c8 = 5;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    i9 = v6;
                    break;
                case 1:
                    i11 = v6;
                    break;
                case 2:
                    i12 = v6;
                    break;
                case 3:
                    i7 = v6;
                    break;
                case 4:
                    i8 = v6;
                    break;
                case 5:
                    i10 = v6;
                    break;
            }
        }
        aVar.j();
        return new GregorianCalendar(i7, i8, i9, i10, i11, i12);
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            cVar.o();
            return;
        }
        cVar.c();
        cVar.m("year");
        cVar.u(calendar.get(1));
        cVar.m("month");
        cVar.u(calendar.get(2));
        cVar.m("dayOfMonth");
        cVar.u(calendar.get(5));
        cVar.m("hourOfDay");
        cVar.u(calendar.get(11));
        cVar.m("minute");
        cVar.u(calendar.get(12));
        cVar.m("second");
        cVar.u(calendar.get(13));
        cVar.j();
    }
}
