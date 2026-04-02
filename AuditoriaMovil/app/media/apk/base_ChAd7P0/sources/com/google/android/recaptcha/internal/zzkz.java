package com.google.android.recaptcha.internal;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
/* loaded from: classes.dex */
final class zzkz extends zzlc {
    private final int zzc;

    public zzkz(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzle.zzi(0, i8, bArr.length);
        this.zzc = i8;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i7) {
        int i8 = this.zzc;
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(b.e(i7, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0059i.x("Index > length: ", i7, i8, ", "));
        }
        return ((zzlc) this).zza[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zzb(int i7) {
        return ((zzlc) this).zza[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzlc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i9);
    }
}
