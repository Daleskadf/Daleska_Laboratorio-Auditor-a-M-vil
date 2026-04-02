package com.google.android.gms.internal.mlkit_vision_common;

import java.io.OutputStream;
/* loaded from: classes.dex */
final class zzaf extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i7) {
        this.zza++;
    }

    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        int length;
        int i9;
        if (i7 >= 0 && i7 <= (length = bArr.length) && i8 >= 0 && (i9 = i7 + i8) <= length && i9 >= 0) {
            this.zza += i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
