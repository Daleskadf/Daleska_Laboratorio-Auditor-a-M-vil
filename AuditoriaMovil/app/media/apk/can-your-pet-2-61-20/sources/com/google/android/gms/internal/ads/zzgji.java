package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgji {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zza2 = zzgpi.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgje
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgji.zzd((zzgjd) zzggiVar);
            }
        }, zzgjd.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgjf
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgji.zzb((zzgou) zzgoyVar);
            }
        }, zza2, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgjg
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgji.zzc((zzgiy) zzgftVar, zzggnVar);
            }
        }, zzgiy.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgjh
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgji.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zza2, zzgot.class);
    }

    public static /* synthetic */ zzgiy zza(zzgot zzgotVar, zzggn zzggnVar) {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgtw zze2 = zzgtw.zze(zzgotVar.zze(), zzgzf.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzgiy.zza(zzf(zzgotVar.zzc()), zzgxn.zzb(zze2.zzf().zzB(), zzggnVar), zzgotVar.zzf());
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgjd zzb(zzgou zzgouVar) {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgtz.zzd(zzgouVar.zzc().zzh(), zzgzf.zza());
            return zzgjd.zzc(zzf(zzgouVar.zzc().zzg()));
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzgiy zzgiyVar, zzggn zzggnVar) {
        zzgtv zzc2 = zzgtw.zzc();
        byte[] zzd2 = zzgiyVar.zzd().zzd(zzggnVar);
        zzc2.zza(zzgyj.zzv(zzd2, 0, zzd2.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgtw) zzc2.zzbr()).zzaN(), zzguo.SYMMETRIC, zzg(zzgiyVar.zzb().zzb()), zzgiyVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzgjd zzgjdVar) {
        zzgut zza2 = zzguu.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza2.zzc(zzgtz.zzc().zzaN());
        zza2.zza(zzg(zzgjdVar.zzb()));
        return zzgou.zzb((zzguu) zza2.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgjc zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int ordinal = zzgvvVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzgjc.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgvvVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzgjc.zzb;
        }
        return zzgjc.zza;
    }

    private static zzgvv zzg(zzgjc zzgjcVar) throws GeneralSecurityException {
        if (zzgjc.zza.equals(zzgjcVar)) {
            return zzgvv.TINK;
        }
        if (zzgjc.zzb.equals(zzgjcVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgjc.zzc.equals(zzgjcVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjcVar.toString()));
    }
}
