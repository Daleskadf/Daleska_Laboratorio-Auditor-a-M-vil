package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzn  reason: invalid package */
/* loaded from: classes.dex */
public final class zzzn {
    private final byte[] zza;

    private zzzn(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzzn)) {
            return false;
        }
        return Arrays.equals(((zzzn) obj).zza, this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return AbstractC0059i.M("Bytes(", zzza.zza(this.zza), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static zzzn zza(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length > bArr.length) {
                length = bArr.length;
            }
            return new zzzn(bArr, 0, length);
        }
        throw new NullPointerException("data must be non-null");
    }
}
