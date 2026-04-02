package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzi  reason: invalid package */
/* loaded from: classes.dex */
public final class zzzi {
    public static String zza(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(b.h("key URI must start with ", str));
    }

    public static void zza(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 << 3)));
        }
    }
}
