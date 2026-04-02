package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlk  reason: invalid package */
/* loaded from: classes.dex */
public final class zzlk {
    private static final byte[] zza = new byte[0];
    private final zzll zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private BigInteger zzf = BigInteger.ZERO;

    private zzlk(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzll zzllVar) {
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzllVar;
    }

    public static zzlk zza(byte[] bArr, zzlr zzlrVar, zzlo zzloVar, zzlp zzlpVar, zzll zzllVar, byte[] bArr2) {
        byte[] zza2 = zzloVar.zza(bArr, zzlrVar);
        byte[] zza3 = zzlu.zza(zzloVar.zza(), zzlpVar.zzb(), zzllVar.zzc());
        byte[] bArr3 = zzlu.zzl;
        byte[] bArr4 = zza;
        byte[] zza4 = zzyc.zza(zzlu.zza, zzlpVar.zza(bArr3, bArr4, "psk_id_hash", zza3), zzlpVar.zza(bArr3, bArr2, "info_hash", zza3));
        byte[] zza5 = zzlpVar.zza(zza2, bArr4, "secret", zza3);
        byte[] zza6 = zzlpVar.zza(zza5, zza4, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, zza3, zzllVar.zza());
        byte[] zza7 = zzlpVar.zza(zza5, zza4, "base_nonce", zza3, zzllVar.zzb());
        zzllVar.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        return new zzlk(bArr, zza6, zza7, bigInteger.shiftLeft(96).subtract(bigInteger), zzllVar);
    }

    private final synchronized byte[] zza() {
        byte[] zza2;
        zza2 = zzyc.zza(this.zze, zzmo.zza(this.zzf, this.zzb.zzb()));
        if (this.zzf.compareTo(this.zzc) < 0) {
            this.zzf = this.zzf.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zza2;
    }

    public final byte[] zza(byte[] bArr, int i7, byte[] bArr2) {
        return this.zzb.zza(this.zzd, zza(), bArr, i7, bArr2);
    }
}
