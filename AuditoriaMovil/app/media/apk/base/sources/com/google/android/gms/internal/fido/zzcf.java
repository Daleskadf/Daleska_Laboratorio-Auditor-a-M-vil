package com.google.android.gms.internal.fido;

import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
final class zzcf extends zzcg {
    private zzcf(zzcd zzcdVar, Character ch) {
        super(zzcdVar, ch);
        zzap.zzc(zzcd.zzd(zzcdVar).length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcf(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void zzb(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        zzap.zze(0, i8, bArr.length);
        for (int i10 = i8; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i9] & ForkServer.ERROR;
            int i12 = ((bArr[i9 + 1] & ForkServer.ERROR) << 8) | (i11 << 16) | (bArr[i9 + 2] & ForkServer.ERROR);
            appendable.append(this.zzb.zza(i12 >>> 18));
            appendable.append(this.zzb.zza((i12 >>> 12) & 63));
            appendable.append(this.zzb.zza((i12 >>> 6) & 63));
            appendable.append(this.zzb.zza(i12 & 63));
            i9 += 3;
        }
        if (i9 < i8) {
            zze(appendable, bArr, i9, i8 - i9);
        }
    }

    public zzcf(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }
}
