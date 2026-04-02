package com.adobe.air;

import java.util.TimeZone;
/* loaded from: classes.dex */
public class AndroidTimeUtils {
    private TimeZone timeZone;

    private AndroidTimeUtils() {
    }

    private AndroidTimeUtils(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public static Object[] getAvailableIds() {
        return TimeZone.getAvailableIDs();
    }

    public static AndroidTimeUtils getTimeZoneClass(String str) {
        TimeZone timeZone;
        if (str != null) {
            timeZone = TimeZone.getTimeZone(str);
            if (!timeZone.getID().equals(str)) {
                return null;
            }
        } else {
            timeZone = TimeZone.getDefault();
        }
        return new AndroidTimeUtils(timeZone);
    }

    public int getRawOffset() {
        return this.timeZone.getRawOffset();
    }

    public int getOffset(long j) {
        return this.timeZone.getOffset(j);
    }

    public boolean observesDaylightTime() {
        boolean observesDaylightTime;
        observesDaylightTime = this.timeZone.observesDaylightTime();
        return observesDaylightTime;
    }

    public boolean useDaylightTime() {
        return this.timeZone.useDaylightTime();
    }

    public int getDSTSavings() {
        return this.timeZone.getDSTSavings();
    }

    public Object getTimeZoneInfo() {
        return this.timeZone.getID();
    }
}
