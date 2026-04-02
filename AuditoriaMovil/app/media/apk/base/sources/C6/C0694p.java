package c6;

import a6.AbstractC0478g;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* renamed from: c6.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694p {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f8949c = Logger.getLogger(AbstractC0478g.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final Object f8950a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final a6.H f8951b;

    public C0694p(a6.H h8, long j, String str) {
        G.i.j(str, "description");
        this.f8951b = h8;
        String concat = str.concat(" created");
        a6.C c8 = a6.C.CT_INFO;
        G.i.j(concat, "description");
        G.i.j(c8, "severity");
        b(new a6.D(concat, c8, j, null));
    }

    public static void a(a6.H h8, Level level, String str) {
        Logger logger = f8949c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + h8 + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(a6.D d7) {
        Level level;
        int i7 = AbstractC0691o.f8935a[d7.f7070b.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                level = Level.FINEST;
            } else {
                level = Level.FINER;
            }
        } else {
            level = Level.FINE;
        }
        synchronized (this.f8950a) {
        }
        a(this.f8951b, level, d7.f7069a);
    }
}
