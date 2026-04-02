package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgmi {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zza2 = zzgpi.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgme
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgmi.zzd((zzgkv) zzggiVar);
            }
        }, zzgkv.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgmf
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgmi.zzb((zzgou) zzgoyVar);
            }
        }, zza2, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgmg
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgmi.zzc((zzgkp) zzgftVar, zzggnVar);
            }
        }, zzgkp.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgmi.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zza2, zzgot.class);
    }

    public static /* synthetic */ zzgkp zza(zzgot zzgotVar, zzggn zzggnVar) {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgwb zze2 = zzgwb.zze(zzgotVar.zze(), zzgzf.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzgkp.zza(zzf(zzgotVar.zzc()), zzgxn.zzb(zze2.zzf().zzB(), zzggnVar), zzgotVar.zzf());
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgkv zzb(zzgou zzgouVar) {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            if (zzgwe.zze(zzgouVar.zzc().zzh(), zzgzf.zza()).zza() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            return zzgkv.zzc(zzf(zzgouVar.zzc().zzg()));
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzgkp zzgkpVar, zzggn zzggnVar) {
        zzgwa zzc2 = zzgwb.zzc();
        byte[] zzd2 = zzgkpVar.zzd().zzd(zzggnVar);
        zzc2.zza(zzgyj.zzv(zzd2, 0, zzd2.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgwb) zzc2.zzbr()).zzaN(), zzguo.SYMMETRIC, zzg(zzgkpVar.zzb().zzb()), zzgkpVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzgkv zzgkvVar) {
        zzgut zza2 = zzguu.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza2.zzc(zzgwe.zzd().zzaN());
        zza2.zza(zzg(zzgkvVar.zzb()));
        return zzgou.zzb((zzguu) zza2.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgku zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int ordinal = zzgvvVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzgku.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgvvVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzgku.zzb;
        }
        return zzgku.zza;
    }

    private static zzgvv zzg(zzgku zzgkuVar) throws GeneralSecurityException {
        if (zzgku.zza.equals(zzgkuVar)) {
            return zzgvv.TINK;
        }
        if (zzgku.zzb.equals(zzgkuVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgku.zzc.equals(zzgkuVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgkuVar.toString()));
    }
}
