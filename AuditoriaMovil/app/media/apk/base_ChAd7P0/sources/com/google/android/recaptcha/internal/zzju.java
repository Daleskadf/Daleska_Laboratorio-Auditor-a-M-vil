package com.google.android.recaptcha.internal;

import java.io.Serializable;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
final class zzju extends zzjv implements Serializable {
    final byte[] zza;

    public zzju(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[1] & ForkServer.ERROR) << 8) | (bArr[0] & ForkServer.ERROR) | ((bArr[2] & ForkServer.ERROR) << 16) | ((bArr[3] & ForkServer.ERROR) << 24);
        }
        throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final boolean zzc(zzjv zzjvVar) {
        boolean z7;
        if (this.zza.length != zzjvVar.zze().length) {
            return false;
        }
        boolean z8 = true;
        int i7 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i7 < bArr.length) {
                if (bArr[i7] == zzjvVar.zze()[i7]) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 &= z7;
                i7++;
            } else {
                return z8;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zze() {
        return this.zza;
    }
}
