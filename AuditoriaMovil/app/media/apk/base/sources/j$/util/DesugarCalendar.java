package j$.util;

import j$.time.Instant;
import java.util.Calendar;
/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarCalendar {
    public static final Instant toInstant(Calendar calendar) {
        return Instant.V(calendar.getTimeInMillis());
    }
}
