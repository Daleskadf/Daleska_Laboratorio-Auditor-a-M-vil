package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgrg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zza2 = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgrc
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgrg.zzb((zzgpv) zzggiVar);
            }
        }, zzgpv.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgrd
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgrg.zzd((zzgou) zzgoyVar);
            }
        }, zza2, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgre
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgrg.zza((zzgpm) zzgftVar, zzggnVar);
            }
        }, zzgpm.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgrf
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgrg.zzc((zzgot) zzgoyVar, zzggnVar);
            }
        }, zza2, zzgot.class);
    }

    public static /* synthetic */ zzgot zza(zzgpm zzgpmVar, zzggn zzggnVar) {
        zzgsc zzc2 = zzgsd.zzc();
        zzc2.zzb(zzg(zzgpmVar.zzb()));
        byte[] zzd2 = zzgpmVar.zzd().zzd(zzggnVar);
        zzc2.zza(zzgyj.zzv(zzd2, 0, zzd2.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgsd) zzc2.zzbr()).zzaN(), zzguo.SYMMETRIC, zzh(zzgpmVar.zzb().zzf()), zzgpmVar.zze());
    }

    public static /* synthetic */ zzgou zzb(zzgpv zzgpvVar) {
        zzgut zza2 = zzguu.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgsf zzc2 = zzgsg.zzc();
        zzc2.zzb(zzg(zzgpvVar));
        zzc2.zza(zzgpvVar.zzc());
        zza2.zzc(((zzgsg) zzc2.zzbr()).zzaN());
        zza2.zza(zzh(zzgpvVar.zzf()));
        return zzgou.zzb((zzguu) zza2.zzbr());
    }

    public static /* synthetic */ zzgpm zzc(zzgot zzgotVar, zzggn zzggnVar) {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgsd zze2 = zzgsd.zze(zzgotVar.zze(), zzgzf.zza());
            if (zze2.zza() == 0) {
                zzgps zze3 = zzgpv.zze();
                zze3.zza(zze2.zzg().zzd());
                zze3.zzb(zze2.zzf().zza());
                zze3.zzc(zzf(zzgotVar.zzc()));
                zzgpv zzd2 = zze3.zzd();
                zzgpk zza2 = zzgpm.zza();
                zza2.zzc(zzd2);
                zza2.zza(zzgxn.zzb(zze2.zzg().zzB(), zzggnVar));
                zza2.zzb(zzgotVar.zzf());
                return zza2.zzd();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhak | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgpv zzd(zzgou zzgouVar) {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgsg zze2 = zzgsg.zze(zzgouVar.zzc().zzh(), zzgzf.zza());
            zzgps zze3 = zzgpv.zze();
            zze3.zza(zze2.zza());
            zze3.zzb(zze2.zzf().zza());
            zze3.zzc(zzf(zzgouVar.zzc().zzg()));
            return zze3.zzd();
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgpt zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int ordinal = zzgvvVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return zzgpt.zzb;
                    }
                    int zza2 = zzgvvVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
                return zzgpt.zzd;
            }
            return zzgpt.zzc;
        }
        return zzgpt.zza;
    }

    private static zzgsj zzg(zzgpv zzgpvVar) {
        zzgsi zzc2 = zzgsj.zzc();
        zzc2.zza(zzgpvVar.zzb());
        return (zzgsj) zzc2.zzbr();
    }

    private static zzgvv zzh(zzgpt zzgptVar) throws GeneralSecurityException {
        if (zzgpt.zza.equals(zzgptVar)) {
            return zzgvv.TINK;
        }
        if (zzgpt.zzb.equals(zzgptVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgpt.zzd.equals(zzgptVar)) {
            return zzgvv.RAW;
        }
        if (zzgpt.zzc.equals(zzgptVar)) {
            return zzgvv.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgptVar))));
    }
}
