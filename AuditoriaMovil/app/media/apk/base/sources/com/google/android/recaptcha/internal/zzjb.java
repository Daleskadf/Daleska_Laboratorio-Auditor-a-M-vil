package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import l6.d;
import m6.s;
/* loaded from: classes.dex */
public final class zzjb {
    public static final Map zza() {
        LinkedHashMap R7 = s.R(new d(-4, zzba.zzo), new d(-12, zzba.zzp), new d(-6, zzba.zzk), new d(-11, zzba.zzm), new d(-13, zzba.zzq), new d(-14, zzba.zzr), new d(-2, zzba.zzl), new d(-7, zzba.zzs), new d(-5, zzba.zzt), new d(-9, zzba.zzu), new d(-8, zzba.zzE), new d(-15, zzba.zzn), new d(-1, zzba.zzv), new d(-3, zzba.zzx), new d(-10, zzba.zzy));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            R7.put(-16, zzba.zzw);
        }
        if (i7 >= 27) {
            R7.put(1, zzba.zzA);
            R7.put(2, zzba.zzB);
            R7.put(0, zzba.zzC);
            R7.put(3, zzba.zzD);
        }
        if (i7 >= 29) {
            R7.put(4, zzba.zzz);
        }
        return R7;
    }
}
