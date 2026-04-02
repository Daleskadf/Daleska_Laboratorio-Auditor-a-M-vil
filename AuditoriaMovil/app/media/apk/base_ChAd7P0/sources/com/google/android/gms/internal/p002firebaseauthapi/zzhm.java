package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhm  reason: invalid package */
/* loaded from: classes.dex */
abstract class zzhm {
    int[] zza;
    private final int zzb;

    public zzhm(byte[] bArr, int i7) {
        if (bArr.length == 32) {
            this.zza = zzhh.zza(bArr);
            this.zzb = i7;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int zza();

    public final ByteBuffer zza(byte[] bArr, int i7) {
        int[] zza = zza(zzhh.zza(bArr), i7);
        int[] iArr = (int[]) zza.clone();
        zzhh.zza(iArr);
        for (int i8 = 0; i8 < zza.length; i8++) {
            zza[i8] = zza[i8] + iArr[i8];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza, 0, 16);
        return order;
    }

    public abstract int[] zza(int[] iArr, int i7);

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr2.length) {
            zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == zza()) {
            int remaining = byteBuffer2.remaining();
            int i7 = remaining / 64;
            int i8 = i7 + 1;
            for (int i9 = 0; i9 < i8; i9++) {
                ByteBuffer zza = zza(bArr, this.zzb + i9);
                if (i9 == i7) {
                    zzyc.zza(byteBuffer, byteBuffer2, zza, remaining % 64);
                } else {
                    zzyc.zza(byteBuffer, byteBuffer2, zza, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException(b.e(zza(), "The nonce length (in bytes) must be "));
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
