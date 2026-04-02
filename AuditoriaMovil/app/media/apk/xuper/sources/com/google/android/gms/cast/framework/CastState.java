package com.google.android.gms.cast.framework;

import androidx.annotation.RecentlyNonNull;
import java.util.Locale;
/* loaded from: classes.dex */
public final class CastState {
    public static final int CONNECTED = 4;
    public static final int CONNECTING = 3;
    public static final int NOT_CONNECTED = 2;
    public static final int NO_DEVICES_AVAILABLE = 1;

    private CastState() {
    }

    @RecentlyNonNull
    public static String toString(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return String.format(Locale.ROOT, "UNKNOWN_STATE(%d)", Integer.valueOf(i10));
                    }
                    return "CONNECTED";
                }
                return "CONNECTING";
            }
            return "NOT_CONNECTED";
        }
        return "NO_DEVICES_AVAILABLE";
    }
}
