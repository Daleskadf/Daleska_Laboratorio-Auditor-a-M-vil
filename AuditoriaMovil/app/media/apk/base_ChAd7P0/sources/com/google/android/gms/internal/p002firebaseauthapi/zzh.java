package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzh  reason: invalid package */
/* loaded from: classes.dex */
public final class zzh extends zzi {
    private final char zza;

    public zzh(char c8) {
        this.zza = c8;
    }

    public final String toString() {
        char c8 = this.zza;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c8 & 15);
            c8 = (char) (c8 >> 4);
        }
        return AbstractC0059i.M("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean zza(char c8) {
        if (c8 == this.zza) {
            return true;
        }
        return false;
    }
}
