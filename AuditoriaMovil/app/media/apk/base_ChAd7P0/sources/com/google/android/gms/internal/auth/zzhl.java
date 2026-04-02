package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
abstract class zzhl {
    public abstract int zza(int i7, byte[] bArr, int i8, int i9);

    public final boolean zzb(byte[] bArr, int i7, int i8) {
        if (zza(0, bArr, i7, i8) != 0) {
            return false;
        }
        return true;
    }
}
