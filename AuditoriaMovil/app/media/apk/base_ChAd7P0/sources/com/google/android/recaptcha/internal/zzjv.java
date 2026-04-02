package com.google.android.recaptcha.internal;

import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public abstract class zzjv {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzjv) {
            zzjv zzjvVar = (zzjv) obj;
            if (zzb() == zzjvVar.zzb() && zzc(zzjvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        int i7 = zze[0] & ForkServer.ERROR;
        for (int i8 = 1; i8 < zze.length; i8++) {
            i7 |= (zze[i8] & ForkServer.ERROR) << (i8 * 8);
        }
        return i7;
    }

    public final String toString() {
        byte[] zze = zze();
        int length = zze.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b5 : zze) {
            char[] cArr = zza;
            sb.append(cArr[(b5 >> 4) & 15]);
            sb.append(cArr[b5 & 15]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzjv zzjvVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
