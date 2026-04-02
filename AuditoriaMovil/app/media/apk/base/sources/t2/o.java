package t2;

import java.util.Map;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final h f15745a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15746b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15747c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15748d;

    public o(h hVar, long j, long j8, boolean z7) {
        this.f15745a = hVar;
        this.f15746b = j;
        this.f15747c = j8;
        this.f15748d = z7;
    }

    public static o a(Map map) {
        long j;
        long j8;
        if (map == null) {
            return new o(h.best, 0L, 5000L, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        h hVar = h.best;
        boolean z7 = true;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue == 5) {
                                hVar = h.bestForNavigation;
                            }
                        } else {
                            hVar = h.high;
                        }
                    } else {
                        hVar = h.medium;
                    }
                } else {
                    hVar = h.low;
                }
            } else {
                hVar = h.lowest;
            }
        }
        h hVar2 = hVar;
        if (num2 != null) {
            j = num2.intValue();
        } else {
            j = 0;
        }
        if (num3 != null) {
            j8 = num3.intValue();
        } else {
            j8 = 5000;
        }
        return new o(hVar2, j, j8, (bool == null || !bool.booleanValue()) ? false : false);
    }
}
