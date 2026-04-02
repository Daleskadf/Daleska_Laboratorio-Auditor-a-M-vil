package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgla {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zza2 = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgkw
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgla.zzd((zzghl) zzggiVar);
            }
        }, zzghl.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgkx
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgla.zzb((zzgou) zzgoyVar);
            }
        }, zza2, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgky
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgla.zzc((zzghb) zzgftVar, zzggnVar);
            }
        }, zzghb.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgkz
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgla.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zza2, zzgot.class);
    }

    public static /* synthetic */ zzghb zza(zzgot zzgotVar, zzggn zzggnVar) {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgsm zze2 = zzgsm.zze(zzgotVar.zze(), zzgzf.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zze2.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zze2.zzg().zza() == 0) {
                zzghh zzf2 = zzghl.zzf();
                zzf2.zza(zze2.zzf().zzg().zzd());
                zzf2.zzc(zze2.zzg().zzh().zzd());
                zzf2.zzd(zze2.zzf().zzf().zza());
                zzf2.zze(zze2.zzg().zzg().zza());
                zzf2.zzb(zzf(zze2.zzg().zzg().zzc()));
                zzf2.zzf(zzg(zzgotVar.zzc()));
                zzghl zzg = zzf2.zzg();
                zzggz zza2 = zzghb.zza();
                zza2.zzd(zzg);
                zza2.zza(zzgxn.zzb(zze2.zzf().zzg().zzB(), zzggnVar));
                zza2.zzb(zzgxn.zzb(zze2.zzg().zzh().zzB(), zzggnVar));
                zza2.zzc(zzgotVar.zzf());
                return zza2.zze();
            }
            throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzghl zzb(zzgou zzgouVar) {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgsp zzd2 = zzgsp.zzd(zzgouVar.zzc().zzh(), zzgzf.zza());
            if (zzd2.zzf().zzc() == 0) {
                zzghh zzf2 = zzghl.zzf();
                zzf2.zza(zzd2.zze().zza());
                zzf2.zzc(zzd2.zzf().zza());
                zzf2.zzd(zzd2.zze().zzf().zza());
                zzf2.zze(zzd2.zzf().zzh().zza());
                zzf2.zzb(zzf(zzd2.zzf().zzh().zzc()));
                zzf2.zzf(zzg(zzgouVar.zzc().zzg()));
                return zzf2.zzg();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzghb zzghbVar, zzggn zzggnVar) {
        zzgsl zzc2 = zzgsm.zzc();
        zzgsr zzc3 = zzgss.zzc();
        zzgsx zzc4 = zzgsy.zzc();
        zzc4.zza(zzghbVar.zzb().zzd());
        zzc3.zzb((zzgsy) zzc4.zzbr());
        byte[] zzd2 = zzghbVar.zzd().zzd(zzggnVar);
        zzc3.zza(zzgyj.zzv(zzd2, 0, zzd2.length));
        zzc2.zza((zzgss) zzc3.zzbr());
        zzgud zzc5 = zzgue.zzc();
        zzc5.zzb(zzh(zzghbVar.zzb()));
        byte[] zzd3 = zzghbVar.zze().zzd(zzggnVar);
        zzc5.zza(zzgyj.zzv(zzd3, 0, zzd3.length));
        zzc2.zzb((zzgue) zzc5.zzbr());
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgsm) zzc2.zzbr()).zzaN(), zzguo.SYMMETRIC, zzi(zzghbVar.zzb().zzh()), zzghbVar.zzf());
    }

    public static /* synthetic */ zzgou zzd(zzghl zzghlVar) {
        zzgut zza2 = zzguu.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgso zza3 = zzgsp.zza();
        zzgsu zzc2 = zzgsv.zzc();
        zzgsx zzc3 = zzgsy.zzc();
        zzc3.zza(zzghlVar.zzd());
        zzc2.zzb((zzgsy) zzc3.zzbr());
        zzc2.zza(zzghlVar.zzb());
        zza3.zza((zzgsv) zzc2.zzbr());
        zzgug zzd2 = zzguh.zzd();
        zzd2.zzb(zzh(zzghlVar));
        zzd2.zza(zzghlVar.zzc());
        zza3.zzb((zzguh) zzd2.zzbr());
        zza2.zzc(((zzgsp) zza3.zzbr()).zzaN());
        zza2.zza(zzi(zzghlVar.zzh()));
        return zzgou.zzb((zzguu) zza2.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzghi zzf(zzgub zzgubVar) throws GeneralSecurityException {
        zzgub zzgubVar2 = zzgub.UNKNOWN_HASH;
        zzgvv zzgvvVar = zzgvv.UNKNOWN_PREFIX;
        int ordinal = zzgubVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return zzghi.zzb;
                        }
                        int zza2 = zzgubVar.zza();
                        throw new GeneralSecurityException("Unable to parse HashType: " + zza2);
                    }
                    return zzghi.zze;
                }
                return zzghi.zzc;
            }
            return zzghi.zzd;
        }
        return zzghi.zza;
    }

    private static zzghj zzg(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgub zzgubVar = zzgub.UNKNOWN_HASH;
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int ordinal = zzgvvVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzghj.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgvvVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzghj.zzb;
        }
        return zzghj.zza;
    }

    private static zzguk zzh(zzghl zzghlVar) throws GeneralSecurityException {
        zzgub zzgubVar;
        zzguj zzd2 = zzguk.zzd();
        zzd2.zzb(zzghlVar.zze());
        zzghi zzg = zzghlVar.zzg();
        if (zzghi.zza.equals(zzg)) {
            zzgubVar = zzgub.SHA1;
        } else if (zzghi.zzb.equals(zzg)) {
            zzgubVar = zzgub.SHA224;
        } else if (zzghi.zzc.equals(zzg)) {
            zzgubVar = zzgub.SHA256;
        } else if (zzghi.zzd.equals(zzg)) {
            zzgubVar = zzgub.SHA384;
        } else if (zzghi.zze.equals(zzg)) {
            zzgubVar = zzgub.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(zzg))));
        }
        zzd2.zza(zzgubVar);
        return (zzguk) zzd2.zzbr();
    }

    private static zzgvv zzi(zzghj zzghjVar) throws GeneralSecurityException {
        if (zzghj.zza.equals(zzghjVar)) {
            return zzgvv.TINK;
        }
        if (zzghj.zzb.equals(zzghjVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzghj.zzc.equals(zzghjVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzghjVar))));
    }
}
