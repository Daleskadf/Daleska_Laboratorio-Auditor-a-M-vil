package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import java.util.Locale;
/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes3.dex */
public final class zzbs {
    private final Context zza;

    public zzbs(Context context) {
        this.zza = context;
    }

    private static String zzb(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : "_".concat(String.valueOf(locale.getCountry())));
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zza() {
        /*
            r4 = this;
            android.content.Context r0 = r4.zza
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L33
            android.os.LocaleList r0 = androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0.m13m(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0.m(r0)
            r1.<init>(r2)
            r2 = 0
        L1e:
            int r3 = androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0.m(r0)
            if (r2 >= r3) goto L32
            java.util.Locale r3 = androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0.m(r0, r2)
            java.lang.String r3 = zzb(r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto L1e
        L32:
            return r1
        L33:
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = zzb(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.internal.zzbs.zza():java.util.List");
    }
}
