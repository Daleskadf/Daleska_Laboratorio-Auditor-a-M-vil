package com.google.android.gms.internal.common;

import D.AbstractC0059i;
/* loaded from: classes.dex */
final class zzl extends zzk {
    private final char zza;

    public zzl(char c8) {
        this.zza = c8;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i7 = this.zza;
        for (int i8 = 0; i8 < 4; i8++) {
            cArr[5 - i8] = "0123456789ABCDEF".charAt(i7 & 15);
            i7 >>= 4;
        }
        return AbstractC0059i.M("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c8) {
        return c8 == this.zza;
    }
}
