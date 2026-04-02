package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgjw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zza2 = zzgpi.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zza2;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                int i = zzgjw.zza;
                zzgut zza3 = zzguu.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                zzgvm zza4 = zzgvn.zza();
                zza4.zza(((zzgjr) zzggiVar).zzc());
                zza3.zzc(((zzgvn) zza4.zzbr()).zzaN());
                zza3.zza(zzgvv.RAW);
                return zzgou.zzb((zzguu) zza3.zzbr());
            }
        }, zzgjr.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                int i = zzgjw.zza;
                zzgou zzgouVar = (zzgou) zzgoyVar;
                if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
                }
                try {
                    zzgvn zze2 = zzgvn.zze(((zzgou) zzgoyVar).zzc().zzh(), zzgzf.zza());
                    if (zzgouVar.zzc().zzg() != zzgvv.RAW) {
                        String valueOf = String.valueOf(zzgouVar.zzc().zzg());
                        String valueOf2 = String.valueOf(zze2);
                        throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + valueOf + " with format " + valueOf2);
                    }
                    return zzgjr.zzb(zze2.zzf());
                } catch (zzhak e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            }
        }, zza2, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgju
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                int i = zzgjw.zza;
                zzgvj zzc2 = zzgvk.zzc();
                zzgvm zza3 = zzgvn.zza();
                zza3.zza(((zzgjq) zzgftVar).zzb().zzc());
                zzc2.zza((zzgvn) zza3.zzbr());
                return zzgot.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgvk) zzc2.zzbr()).zzaN(), zzguo.REMOTE, zzgvv.RAW, null);
            }
        }, zzgjq.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgjv
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                int i = zzgjw.zza;
                zzgot zzgotVar = (zzgot) zzgoyVar;
                if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                if (zzgotVar.zzc() != zzgvv.RAW) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got ".concat(String.valueOf(String.valueOf(zzgotVar.zzc()))));
                }
                try {
                    zzgvk zze2 = zzgvk.zze(((zzgot) zzgoyVar).zze(), zzgzf.zza());
                    if (zze2.zza() != 0) {
                        String valueOf = String.valueOf(zze2);
                        throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + valueOf);
                    }
                    return zzgjq.zza(zzgjr.zzb(zze2.zzf().zzf()));
                } catch (zzhak e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            }
        }, zza2, zzgot.class);
    }

    public static void zza(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }
}
