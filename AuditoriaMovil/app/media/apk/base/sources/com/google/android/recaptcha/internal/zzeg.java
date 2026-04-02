package com.google.android.recaptcha.internal;

import E6.m;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class zzeg {
    private zzeg() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        String Z6 = m.Z("18.6.1", ".", StringUtils.EMPTY);
        int R7 = m.R(0, 6, Z6, "-", false);
        if (R7 != -1) {
            Z6 = Z6.substring(0, R7);
            j.d(Z6, "substring(...)");
        }
        return Integer.parseInt(Z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(m.g0("18.6.1", "-", StringUtils.EMPTY));
    }

    public /* synthetic */ zzeg(f fVar) {
    }
}
