package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgwn implements zzgfj {
    private final zzgxf zza;
    private final zzggh zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgwn(zzgxf zzgxfVar, zzggh zzgghVar, int i, byte[] bArr) {
        this.zza = zzgxfVar;
        this.zzb = zzgghVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzgfj zzb(zzghb zzghbVar) throws GeneralSecurityException {
        zzgwg zzgwgVar = new zzgwg(zzghbVar.zzd().zzd(zzgfs.zza()), zzghbVar.zzb().zzd());
        String valueOf = String.valueOf(String.valueOf(zzghbVar.zzb().zzg()));
        return new zzgwn(zzgwgVar, new zzgxj(new zzgxi("HMAC".concat(valueOf), new SecretKeySpec(zzghbVar.zze().zzd(zzgfs.zza()), "HMAC")), zzghbVar.zzb().zze()), zzghbVar.zzb().zze(), zzghbVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int i = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgpi.zzb(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, length2 - this.zzc);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzgxj) this.zzb).zzc(zzgwl.zzb(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
