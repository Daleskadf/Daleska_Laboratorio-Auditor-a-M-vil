package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.tika.fork.ForkServer;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzxw implements zzbe {
    private static final zzij.zza zza = zzij.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzxz();
    private static final ThreadLocal<Cipher> zzc = new zzxy();
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final SecretKeySpec zzg;
    private final int zzh;

    private zzxw(byte[] bArr, int i7, byte[] bArr2) {
        if (zza.zza()) {
            if (i7 != 12 && i7 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.zzh = i7;
            zzzi.zza(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.zzg = secretKeySpec;
            Cipher cipher = zzb.get();
            cipher.init(1, secretKeySpec);
            byte[] zza2 = zza(cipher.doFinal(new byte[16]));
            this.zzd = zza2;
            this.zze = zza(zza2);
            this.zzf = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static zzbe zza(zzdf zzdfVar) {
        if (zza.zza()) {
            if (zzdfVar.zzc().zzd() == 16) {
                return new zzxw(zzdfVar.zze().zza(zzbl.zza()), zzdfVar.zzc().zzb(), zzdfVar.zzd().zzb());
            }
            throw new GeneralSecurityException(b.e(zzdfVar.zzc().zzd(), "AesEaxJce only supports 16 byte tag size, not "));
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            bArr[i7] = (byte) (bArr[i7] ^ bArr2[i7]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        byte[] bArr4 = this.zzf;
        int length2 = f.API_PRIORITY_OTHER - bArr4.length;
        int i7 = this.zzh;
        if (length <= (length2 - i7) - 16) {
            byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i7 + bArr.length + 16);
            byte[] zza2 = zzpp.zza(this.zzh);
            System.arraycopy(zza2, 0, copyOf, this.zzf.length, this.zzh);
            Cipher cipher = zzb.get();
            cipher.init(1, this.zzg);
            byte[] zza3 = zza(cipher, 0, zza2, 0, zza2.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] zza4 = zza(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = zzc.get();
            cipher2.init(1, this.zzg, new IvParameterSpec(zza3));
            cipher2.doFinal(bArr, 0, bArr.length, copyOf, this.zzf.length + this.zzh);
            byte[] zza5 = zza(cipher, 2, copyOf, this.zzf.length + this.zzh, bArr.length);
            int length3 = this.zzf.length + bArr.length + this.zzh;
            for (int i8 = 0; i8 < 16; i8++) {
                copyOf[length3 + i8] = (byte) ((zza4[i8] ^ zza3[i8]) ^ zza5[i8]);
            }
            return copyOf;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = ((length - bArr3.length) - this.zzh) - 16;
        if (length2 >= 0) {
            if (zzpy.zza(bArr3, bArr)) {
                Cipher cipher = zzb.get();
                cipher.init(1, this.zzg);
                byte[] zza2 = zza(cipher, 0, bArr, this.zzf.length, this.zzh);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = bArr2;
                byte[] zza3 = zza(cipher, 1, bArr4, 0, bArr4.length);
                byte[] zza4 = zza(cipher, 2, bArr, this.zzf.length + this.zzh, length2);
                int length3 = bArr.length - 16;
                byte b5 = 0;
                for (int i7 = 0; i7 < 16; i7++) {
                    b5 = (byte) (b5 | (((bArr[length3 + i7] ^ zza3[i7]) ^ zza2[i7]) ^ zza4[i7]));
                }
                if (b5 == 0) {
                    Cipher cipher2 = zzc.get();
                    cipher2.init(1, this.zzg, new IvParameterSpec(zza2));
                    return cipher2.doFinal(bArr, this.zzf.length + this.zzh, length2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 15) {
            int i8 = i7 + 1;
            bArr2[i7] = (byte) ((bArr[i7] << 1) ^ ((bArr[i8] & ForkServer.ERROR) >>> 7));
            i7 = i8;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private final byte[] zza(Cipher cipher, int i7, byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i7;
        if (i9 == 0) {
            zzc(bArr2, this.zzd);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i10 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i9 - i10 <= 16) {
                break;
            }
            for (int i11 = 0; i11 < 16; i11++) {
                bArr2[i11] = (byte) (bArr2[i11] ^ bArr[(i8 + i10) + i11]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i10 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10 + i8, i8 + i9);
        if (copyOfRange.length == 16) {
            zzc(copyOfRange, this.zzd);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zze, 16);
            for (int i12 = 0; i12 < copyOfRange.length; i12++) {
                copyOf[i12] = (byte) (copyOf[i12] ^ copyOfRange[i12]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            copyOfRange = copyOf;
        }
        zzc(bArr2, copyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }
}
