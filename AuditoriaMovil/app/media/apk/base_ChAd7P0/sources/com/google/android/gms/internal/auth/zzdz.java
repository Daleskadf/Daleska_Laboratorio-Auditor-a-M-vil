package com.google.android.gms.internal.auth;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
/* loaded from: classes.dex */
final class zzdz extends zzec {
    private final int zzc;

    public zzdz(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzef.zzi(0, i8, bArr.length);
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int i7) {
        int i8 = this.zzc;
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException(b.e(i7, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0059i.x("Index > length: ", i7, i8, ", "));
        }
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zzb(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.auth.zzec
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.zzc;
    }
}
