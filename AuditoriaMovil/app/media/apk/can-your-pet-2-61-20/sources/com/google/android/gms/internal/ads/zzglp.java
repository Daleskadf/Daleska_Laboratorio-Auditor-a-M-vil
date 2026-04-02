package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzglp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zza2 = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgll
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzglp.zzd((zzgix) zzggiVar);
            }
        }, zzgix.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzglm
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzglp.zzb((zzgou) zzgoyVar);
            }
        }, zza2, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgln
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzglp.zzc((zzgio) zzgftVar, zzggnVar);
            }
        }, zzgio.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzglo
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzglp.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zza2, zzgot.class);
    }

    public static /* synthetic */ zzgio zza(zzgot zzgotVar, zzggn zzggnVar) {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgtq zze2 = zzgtq.zze(zzgotVar.zze(), zzgzf.zza());
            if (zze2.zza() == 0) {
                zzgiu zzc2 = zzgix.zzc();
                zzc2.zza(zze2.zzf().zzd());
                zzc2.zzb(zzf(zzgotVar.zzc()));
                zzgix zzc3 = zzc2.zzc();
                zzgim zza2 = zzgio.zza();
                zza2.zzc(zzc3);
                zza2.zzb(zzgxn.zzb(zze2.zzf().zzB(), zzggnVar));
                zza2.zza(zzgotVar.zzf());
                return zza2.zzd();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzgix zzb(zzgou zzgouVar) {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgtt zzf2 = zzgtt.zzf(zzgouVar.zzc().zzh(), zzgzf.zza());
            if (zzf2.zzc() == 0) {
                zzgiu zzc2 = zzgix.zzc();
                zzc2.zza(zzf2.zza());
                zzc2.zzb(zzf(zzgouVar.zzc().zzg()));
                return zzc2.zzc();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzgio zzgioVar, zzggn zzggnVar) {
        zzgtp zzc2 = zzgtq.zzc();
        byte[] zzd2 = zzgioVar.zzd().zzd(zzggnVar);
        zzc2.zza(zzgyj.zzv(zzd2, 0, zzd2.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgtq) zzc2.zzbr()).zzaN(), zzguo.SYMMETRIC, zzg(zzgioVar.zzb().zzd()), zzgioVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzgix zzgixVar) {
        zzgut zza2 = zzguu.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgts zzd2 = zzgtt.zzd();
        zzd2.zza(zzgixVar.zzb());
        zza2.zzc(((zzgtt) zzd2.zzbr()).zzaN());
        zza2.zza(zzg(zzgixVar.zzd()));
        return zzgou.zzb((zzguu) zza2.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgiv zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int ordinal = zzgvvVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzgiv.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgvvVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzgiv.zzb;
        }
        return zzgiv.zza;
    }

    private static zzgvv zzg(zzgiv zzgivVar) throws GeneralSecurityException {
        if (zzgiv.zza.equals(zzgivVar)) {
            return zzgvv.TINK;
        }
        if (zzgiv.zzb.equals(zzgivVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgiv.zzc.equals(zzgivVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgivVar))));
    }
}
