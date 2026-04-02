package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhj  reason: invalid package */
/* loaded from: classes.dex */
public final class zzhj extends zzhm {
    public zzhj(byte[] bArr, int i7) {
        super(bArr, i7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.zza(byteBuffer, bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        return super.zza(bArr, byteBuffer);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final int[] zza(int[] iArr, int i7) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            zzhh.zza(iArr2, this.zza);
            iArr2[12] = i7;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
    }
}
