package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Base64;
import com.google.android.gms.common.internal.I;
import io.flutter.plugins.pathprovider.b;
import java.io.UnsupportedEncodingException;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagy  reason: invalid package */
/* loaded from: classes.dex */
public final class zzagy {
    public static long zza(String str) {
        zzagx zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzagx zzb(String str) {
        byte[] decode;
        I.e(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            String str2 = zza.get(1);
            try {
                if (str2 == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(str2, 11);
                }
                return zzagx.zza(new String(decode, "UTF-8"));
            } catch (UnsupportedEncodingException e7) {
                throw new RuntimeException("Unable to decode token", e7);
            }
        }
        throw new RuntimeException(b.h("Invalid idToken ", str));
    }
}
