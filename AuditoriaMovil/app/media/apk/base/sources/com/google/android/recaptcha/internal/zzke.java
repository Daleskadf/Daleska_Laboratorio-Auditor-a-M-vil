package com.google.android.recaptcha.internal;

import io.flutter.plugins.pathprovider.b;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
final class zzke extends zzkg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzke(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzkd r0 = new com.google.android.recaptcha.internal.zzkd
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = com.google.android.recaptcha.internal.zzkd.zze(r0)
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.recaptcha.internal.zzjf.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzke.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        if (this.zza.zzc(zze.length())) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < zze.length()) {
                int i9 = i8 + 1;
                int zzb = (this.zza.zzb(zze.charAt(i7)) << 18) | (this.zza.zzb(zze.charAt(i7 + 1)) << 12);
                bArr[i8] = (byte) (zzb >>> 16);
                int i10 = i7 + 2;
                if (i10 < zze.length()) {
                    int i11 = i7 + 3;
                    int zzb2 = zzb | (this.zza.zzb(zze.charAt(i10)) << 6);
                    int i12 = i8 + 2;
                    bArr[i9] = (byte) ((zzb2 >>> 8) & 255);
                    if (i11 < zze.length()) {
                        i7 += 4;
                        i8 += 3;
                        bArr[i12] = (byte) ((zzb2 | this.zza.zzb(zze.charAt(i11))) & 255);
                    } else {
                        i8 = i12;
                        i7 = i11;
                    }
                } else {
                    i7 = i10;
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new zzkf(b.e(zze.length(), "Invalid input length "));
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final void zzb(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        zzjf.zzd(0, i8, bArr.length);
        for (int i10 = i8; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i9] & ForkServer.ERROR;
            int i12 = ((bArr[i9 + 1] & ForkServer.ERROR) << 8) | (i11 << 16) | (bArr[i9 + 2] & ForkServer.ERROR);
            appendable.append(this.zza.zza(i12 >>> 18));
            appendable.append(this.zza.zza((i12 >>> 12) & 63));
            appendable.append(this.zza.zza((i12 >>> 6) & 63));
            appendable.append(this.zza.zza(i12 & 63));
            i9 += 3;
        }
        if (i9 < i8) {
            zzf(appendable, bArr, i9, i8 - i9);
        }
    }
}
