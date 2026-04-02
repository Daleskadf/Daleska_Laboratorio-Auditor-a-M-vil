package com.google.android.recaptcha.internal;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class zzkh {
    private static final zzkh zza = new zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzkh zzb = new zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        char[] cArr;
        boolean z7;
        new zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzkd zzkdVar = new zzkd("base16()", "0123456789ABCDEF".toCharArray());
        new zzkg(zzkdVar, null);
        char[] cArr2 = new char[RecognitionOptions.UPC_A];
        cArr = zzkdVar.zzf;
        if (cArr.length == 16) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzjf.zza(z7);
        for (int i7 = 0; i7 < 256; i7++) {
            cArr2[i7] = zzkdVar.zza(i7 >>> 4);
            cArr2[i7 | RecognitionOptions.QR_CODE] = zzkdVar.zza(i7 & 15);
        }
    }

    public static zzkh zzg() {
        return zza;
    }

    public static zzkh zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i7, int i8);

    public abstract int zzc(int i7);

    public abstract int zzd(int i7);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i7, int i8) {
        zzjf.zzd(0, i8, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i8));
        try {
            zzb(sb, bArr, 0, i8);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze = zze(charSequence);
            int zzc = zzc(zze.length());
            byte[] bArr = new byte[zzc];
            int zza2 = zza(bArr, zze);
            if (zza2 != zzc) {
                byte[] bArr2 = new byte[zza2];
                System.arraycopy(bArr, 0, bArr2, 0, zza2);
                return bArr2;
            }
            return bArr;
        } catch (zzkf e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
