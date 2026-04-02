package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgf  reason: invalid package */
/* loaded from: classes.dex */
public final class zzgf {
    private static final zzzn zza;
    private static final zzou<zzdk, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzdf, zzpn> zzd;
    private static final zznd<zzpn> zze;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey").zza(((zztb) ((zzakg) zztb.zzb().zza(zzgf.zzb(r1)).zza(r1.zzc()).zze())).zzj()).zza(zzgf.zza(((zzdk) zzcgVar).zzf())).zze()));
                return zzb3;
            }
        }, zzdk.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzdk zzb3;
                zzb3 = zzgf.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzsy) ((zzakg) zzsy.zzb().zza(zzgf.zzb(r1.zzc())).zza(zzaiw.zza(r1.zze().zza(zzcm.zza(zzcmVar)))).zze())).zzj(), zzwb.zza.SYMMETRIC, zzgf.zza(r1.zzc().zzf()), ((zzdf) zzboVar).zza());
                return zza2;
            }
        }, zzdf.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzdf zzb3;
                zzb3 = zzgf.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdf zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzsy zza2 = zzsy.zza(zzpnVar.zzd(), zzajv.zza());
                if (zza2.zza() == 0) {
                    return zzdf.zzb().zza(zzdk.zze().zzb(zza2.zze().zzb()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzpnVar.zzc())).zza()).zza(zzzo.zza(zza2.zze().zzd(), zzcm.zza(zzcmVar))).zza(zzpnVar.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzakm unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    private static zzdk.zzb zza(zzxd zzxdVar) {
        int i7 = zzgm.zza[zzxdVar.ordinal()];
        if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                return zzdk.zzb.zzb;
            }
            if (i7 == 4) {
                return zzdk.zzb.zzc;
            }
            throw new GeneralSecurityException(b.e(zzxdVar.zza(), "Unable to parse OutputPrefixType: "));
        }
        return zzdk.zzb.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdk zzb(zzpm zzpmVar) {
        if (zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zztb zza2 = zztb.zza(zzpmVar.zza().zze(), zzajv.zza());
                return zzdk.zze().zzb(zza2.zza()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzpmVar.zza().zzd())).zza();
            } catch (zzakm e7) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(b.h("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
    }

    private static zzxd zza(zzdk.zzb zzbVar) {
        if (zzdk.zzb.zza.equals(zzbVar)) {
            return zzxd.TINK;
        }
        if (zzdk.zzb.zzb.equals(zzbVar)) {
            return zzxd.CRUNCHY;
        }
        if (zzdk.zzb.zzc.equals(zzbVar)) {
            return zzxd.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    private static zzte zzb(zzdk zzdkVar) {
        if (zzdkVar.zzd() == 16) {
            return (zzte) ((zzakg) zzte.zzb().zza(zzdkVar.zzb()).zze());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzdkVar.zzd())));
    }

    public static void zza() {
        zzom zza2 = zzom.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
