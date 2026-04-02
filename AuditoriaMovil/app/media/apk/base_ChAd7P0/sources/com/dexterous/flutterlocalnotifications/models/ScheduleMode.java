package com.dexterous.flutterlocalnotifications.models;

import I4.p;
import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    /* loaded from: classes.dex */
    public static class a implements p {
    }

    public boolean useAlarmClock() {
        if (this == alarmClock) {
            return true;
        }
        return false;
    }

    public boolean useAllowWhileIdle() {
        if (this != exactAllowWhileIdle && this != inexactAllowWhileIdle) {
            return false;
        }
        return true;
    }

    public boolean useExactAlarm() {
        if (this != exact && this != exactAllowWhileIdle) {
            return false;
        }
        return true;
    }
}
