package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgro {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgmq zzc;
    private static final zzgmq zzd;
    private static final zzgoc zze;
    private static final zzgny zzf;
    private static final zzgna zzg;
    private static final zzgmw zzh;

    static {
        zzgxm zza2 = zzgpi.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        zzgmo zza3 = zzgmq.zza();
        zza3.zza(zzgvv.RAW, zzgqm.zzd);
        zza3.zza(zzgvv.TINK, zzgqm.zza);
        zza3.zza(zzgvv.LEGACY, zzgqm.zzc);
        zza3.zza(zzgvv.CRUNCHY, zzgqm.zzb);
        zzc = zza3.zzb();
        zzgmo zza4 = zzgmq.zza();
        zza4.zza(zzgub.SHA1, zzgql.zza);
        zza4.zza(zzgub.SHA224, zzgql.zzb);
        zza4.zza(zzgub.SHA256, zzgql.zzc);
        zza4.zza(zzgub.SHA384, zzgql.zzd);
        zza4.zza(zzgub.SHA512, zzgql.zze);
        zzd = zza4.zzb();
        zze = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgrk
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgro.zzb((zzgqo) zzggiVar);
            }
        }, zzgqo.class, zzgou.class);
        zzf = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgrl
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgro.zzd((zzgou) zzgoyVar);
            }
        }, zza2, zzgou.class);
        zzg = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgrm
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgro.zza((zzgqd) zzgftVar, zzggnVar);
            }
        }, zzgqd.class, zzgot.class);
        zzh = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgrn
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgro.zzc((zzgot) zzgoyVar, zzggnVar);
            }
        }, zza2, zzgot.class);
    }

    public static /* synthetic */ zzgot zza(zzgqd zzgqdVar, zzggn zzggnVar) {
        zzgud zzc2 = zzgue.zzc();
        zzc2.zzb(zzf(zzgqdVar.zzb()));
        byte[] zzd2 = zzgqdVar.zzd().zzd(zzggnVar);
        zzc2.zza(zzgyj.zzv(zzd2, 0, zzd2.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgue) zzc2.zzbr()).zzaN(), zzguo.SYMMETRIC, (zzgvv) zzc.zzb(zzgqdVar.zzb().zzg()), zzgqdVar.zze());
    }

    public static /* synthetic */ zzgou zzb(zzgqo zzgqoVar) {
        zzgut zza2 = zzguu.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgug zzd2 = zzguh.zzd();
        zzd2.zzb(zzf(zzgqoVar));
        zzd2.zza(zzgqoVar.zzc());
        zza2.zzc(((zzguh) zzd2.zzbr()).zzaN());
        zza2.zza((zzgvv) zzc.zzb(zzgqoVar.zzg()));
        return zzgou.zzb((zzguu) zza2.zzbr());
    }

    public static /* synthetic */ zzgqd zzc(zzgot zzgotVar, zzggn zzggnVar) {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgue zzf2 = zzgue.zzf(zzgotVar.zze(), zzgzf.zza());
            if (zzf2.zza() == 0) {
                zzgqk zze2 = zzgqo.zze();
                zze2.zzb(zzf2.zzh().zzd());
                zze2.zzc(zzf2.zzg().zza());
                zze2.zza((zzgql) zzd.zzc(zzf2.zzg().zzc()));
                zze2.zzd((zzgqm) zzc.zzc(zzgotVar.zzc()));
                zzgqo zze3 = zze2.zze();
                zzgqb zza2 = zzgqd.zza();
                zza2.zzc(zze3);
                zza2.zzb(zzgxn.zzb(zzf2.zzh().zzB(), zzggnVar));
                zza2.zza(zzgotVar.zzf());
                return zza2.zzd();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhak | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgqo zzd(zzgou zzgouVar) {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzguh zzg2 = zzguh.zzg(zzgouVar.zzc().zzh(), zzgzf.zza());
            if (zzg2.zzc() == 0) {
                zzgqk zze2 = zzgqo.zze();
                zze2.zzb(zzg2.zza());
                zze2.zzc(zzg2.zzh().zza());
                zze2.zza((zzgql) zzd.zzc(zzg2.zzh().zzc()));
                zze2.zzd((zzgqm) zzc.zzc(zzgouVar.zzc().zzg()));
                return zze2.zze();
            }
            int zzc2 = zzg2.zzc();
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzc2);
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zze);
        zzgnuVar.zzh(zzf);
        zzgnuVar.zzg(zzg);
        zzgnuVar.zzf(zzh);
    }

    private static zzguk zzf(zzgqo zzgqoVar) throws GeneralSecurityException {
        zzguj zzd2 = zzguk.zzd();
        zzd2.zzb(zzgqoVar.zzb());
        zzd2.zza((zzgub) zzd.zzb(zzgqoVar.zzf()));
        return (zzguk) zzd2.zzbr();
    }
}
