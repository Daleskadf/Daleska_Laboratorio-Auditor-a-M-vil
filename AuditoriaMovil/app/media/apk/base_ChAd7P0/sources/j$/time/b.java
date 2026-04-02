package j$.time;

import j$.util.TimeZoneRetargetClass;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public abstract class b {
    public abstract ZoneId a();

    public static b b() {
        return new C1193a(TimeZoneRetargetClass.toZoneId(TimeZone.getDefault()));
    }
}
