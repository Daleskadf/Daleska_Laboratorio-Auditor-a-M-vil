package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzglk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zza2 = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zza2;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzglk.zzd((zzgik) zzggiVar);
            }
        }, zzgik.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzglh
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzglk.zzb((zzgou) zzgoyVar);
            }
        }, zza2, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgli
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzglk.zzc((zzgib) zzgftVar, zzggnVar);
            }
        }, zzgib.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzglj
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzglk.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zza2, zzgot.class);
    }

    public static /* synthetic */ zzgib zza(zzgot zzgotVar, zzggn zzggnVar) {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgtk zze2 = zzgtk.zze(zzgotVar.zze(), zzgzf.zza());
            if (zze2.zza() == 0) {
                zzgih zzc2 = zzgik.zzc();
                zzc2.zzb(zze2.zzf().zzd());
                zzc2.zza(12);
                zzc2.zzc(16);
                zzc2.zzd(zzf(zzgotVar.zzc()));
                zzgik zze3 = zzc2.zze();
                zzghz zza2 = zzgib.zza();
                zza2.zzc(zze3);
                zza2.zzb(zzgxn.zzb(zze2.zzf().zzB(), zzggnVar));
                zza2.zza(zzgotVar.zzf());
                return zza2.zzd();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgik zzb(zzgou zzgouVar) {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgtn zzf2 = zzgtn.zzf(zzgouVar.zzc().zzh(), zzgzf.zza());
            if (zzf2.zzc() == 0) {
                zzgih zzc2 = zzgik.zzc();
                zzc2.zzb(zzf2.zza());
                zzc2.zza(12);
                zzc2.zzc(16);
                zzc2.zzd(zzf(zzgouVar.zzc().zzg()));
                return zzc2.zze();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzgib zzgibVar, zzggn zzggnVar) {
        zzgtj zzc2 = zzgtk.zzc();
        byte[] zzd2 = zzgibVar.zzd().zzd(zzggnVar);
        zzc2.zza(zzgyj.zzv(zzd2, 0, zzd2.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgtk) zzc2.zzbr()).zzaN(), zzguo.SYMMETRIC, zzg(zzgibVar.zzb().zzd()), zzgibVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzgik zzgikVar) {
        zzgut zza2 = zzguu.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgtm zzd2 = zzgtn.zzd();
        zzd2.zza(zzgikVar.zzb());
        zza2.zzc(((zzgtn) zzd2.zzbr()).zzaN());
        zza2.zza(zzg(zzgikVar.zzd()));
        return zzgou.zzb((zzguu) zza2.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgii zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int ordinal = zzgvvVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzgii.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgvvVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzgii.zzb;
        }
        return zzgii.zza;
    }

    private static zzgvv zzg(zzgii zzgiiVar) throws GeneralSecurityException {
        if (zzgii.zza.equals(zzgiiVar)) {
            return zzgvv.TINK;
        }
        if (zzgii.zzb.equals(zzgiiVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgii.zzc.equals(zzgiiVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgiiVar))));
    }
}
