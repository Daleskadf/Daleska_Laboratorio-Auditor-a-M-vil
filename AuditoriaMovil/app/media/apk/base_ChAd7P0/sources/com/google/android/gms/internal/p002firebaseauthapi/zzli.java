package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzli  reason: invalid package */
/* loaded from: classes.dex */
final class zzli implements zzlp {
    private final String zza;

    public zzli(String str) {
        this.zza = str;
    }

    public final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp
    public final byte[] zzb() {
        String str = this.zza;
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c8 = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c8 = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c8 = 2;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return zzlu.zzf;
            case 1:
                return zzlu.zzg;
            case 2:
                return zzlu.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i7) {
        Mac zza = zzym.zzb.zza(this.zza);
        if (i7 <= zza.getMacLength() * 255) {
            byte[] bArr3 = new byte[i7];
            zza.init(new SecretKeySpec(bArr, this.zza));
            byte[] bArr4 = new byte[0];
            int i8 = 1;
            int i9 = 0;
            while (true) {
                zza.update(bArr4);
                zza.update(bArr2);
                zza.update((byte) i8);
                bArr4 = zza.doFinal();
                if (bArr4.length + i9 < i7) {
                    System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
                    i9 += bArr4.length;
                    i8++;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i9, i7 - i9);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) {
        Mac zza = zzym.zzb.zza(this.zza);
        if (bArr2 != null && bArr2.length != 0) {
            zza.init(new SecretKeySpec(bArr2, this.zza));
        } else {
            zza.init(new SecretKeySpec(new byte[zza.getMacLength()], this.zza));
        }
        return zza.doFinal(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i7) {
        return zza(zza(zzlu.zza(str, bArr2, bArr4), null), zzlu.zza(str2, bArr3, bArr4, i7), i7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i7) {
        return zza(bArr, zzlu.zza(str, bArr2, bArr3, i7), i7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zza(zzlu.zza(str, bArr2, bArr3), bArr);
    }
}
