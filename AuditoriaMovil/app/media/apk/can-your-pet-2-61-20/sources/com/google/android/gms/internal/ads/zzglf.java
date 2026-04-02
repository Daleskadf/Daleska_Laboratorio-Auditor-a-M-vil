package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzglf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zza2 = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzglf.zzd((zzghx) zzggiVar);
            }
        }, zzghx.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzglf.zzb((zzgou) zzgoyVar);
            }
        }, zza2, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgld
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzglf.zzc((zzghp) zzgftVar, zzggnVar);
            }
        }, zzghp.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgle
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzglf.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zza2, zzgot.class);
    }

    public static /* synthetic */ zzghp zza(zzgot zzgotVar, zzggn zzggnVar) {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgtb zze2 = zzgtb.zze(zzgotVar.zze(), zzgzf.zza());
            if (zze2.zza() == 0) {
                zzghu zzd2 = zzghx.zzd();
                zzd2.zzb(zze2.zzg().zzd());
                zzd2.zza(zze2.zzf().zza());
                zzd2.zzc(16);
                zzd2.zzd(zzf(zzgotVar.zzc()));
                zzghx zze3 = zzd2.zze();
                zzghn zza2 = zzghp.zza();
                zza2.zzc(zze3);
                zza2.zzb(zzgxn.zzb(zze2.zzg().zzB(), zzggnVar));
                zza2.zza(zzgotVar.zzf());
                return zza2.zzd();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzghx zzb(zzgou zzgouVar) {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgte zze2 = zzgte.zze(zzgouVar.zzc().zzh(), zzgzf.zza());
            zzghu zzd2 = zzghx.zzd();
            zzd2.zzb(zze2.zza());
            zzd2.zza(zze2.zzf().zza());
            zzd2.zzc(16);
            zzd2.zzd(zzf(zzgouVar.zzc().zzg()));
            return zzd2.zze();
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzghp zzghpVar, zzggn zzggnVar) {
        zzgta zzc2 = zzgtb.zzc();
        zzc2.zzb(zzg(zzghpVar.zzb()));
        byte[] zzd2 = zzghpVar.zzd().zzd(zzggnVar);
        zzc2.zza(zzgyj.zzv(zzd2, 0, zzd2.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgtb) zzc2.zzbr()).zzaN(), zzguo.SYMMETRIC, zzh(zzghpVar.zzb().zze()), zzghpVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzghx zzghxVar) {
        zzgut zza2 = zzguu.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgtd zzc2 = zzgte.zzc();
        zzc2.zzb(zzg(zzghxVar));
        zzc2.zza(zzghxVar.zzc());
        zza2.zzc(((zzgte) zzc2.zzbr()).zzaN());
        zza2.zza(zzh(zzghxVar.zze()));
        return zzgou.zzb((zzguu) zza2.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzghv zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int ordinal = zzgvvVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzghv.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgvvVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzghv.zzb;
        }
        return zzghv.zza;
    }

    private static zzgth zzg(zzghx zzghxVar) throws GeneralSecurityException {
        zzgtg zzc2 = zzgth.zzc();
        zzc2.zza(zzghxVar.zzb());
        return (zzgth) zzc2.zzbr();
    }

    private static zzgvv zzh(zzghv zzghvVar) throws GeneralSecurityException {
        if (zzghv.zza.equals(zzghvVar)) {
            return zzgvv.TINK;
        }
        if (zzghv.zzb.equals(zzghvVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzghv.zzc.equals(zzghvVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzghvVar))));
    }
}
