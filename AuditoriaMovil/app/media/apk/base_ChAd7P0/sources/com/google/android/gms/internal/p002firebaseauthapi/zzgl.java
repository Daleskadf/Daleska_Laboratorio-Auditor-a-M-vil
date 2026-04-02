package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgl  reason: invalid package */
/* loaded from: classes.dex */
public final class zzgl {
    private static final ThreadLocal<Cipher> zza = new zzgo();

    public static AlgorithmParameterSpec zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static SecretKey zzb(byte[] bArr) {
        zzzi.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec zza(byte[] bArr, int i7, int i8) {
        Integer zzb = zzpy.zzb();
        if (zzb != null && zzb.intValue() <= 19) {
            return new IvParameterSpec(bArr, i7, i8);
        }
        return new GCMParameterSpec(RecognitionOptions.ITF, bArr, i7, i8);
    }

    public static Cipher zza() {
        return zza.get();
    }
}
