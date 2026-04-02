package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdc;
import com.google.android.gms.internal.p002firebaseauthapi.zzvh;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzga  reason: invalid package */
/* loaded from: classes.dex */
public final class zzga {
    private static final zzzn zza;
    private static final zzou<zzdc, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzcx, zzpn> zzd;
    private static final zznd<zzpn> zze;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zza(((zzsm) ((zzakg) zzsm.zza().zza((zzss) ((zzakg) zzss.zzb().zza((zzsv) ((zzakg) zzsv.zzb().zza(r1.zzd()).zze())).zza(r1.zzb()).zze())).zza((zzve) ((zzakg) zzve.zzc().zza(zzga.zzb(r1)).zza(r1.zzc()).zze())).zze())).zzj()).zza(zzga.zza(((zzdc) zzcgVar).zzh())).zze()));
                return zzb3;
            }
        }, zzdc.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzdc zzb3;
                zzb3 = zzga.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzge
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzsj) ((zzakg) zzsj.zzb().zza((zzsp) ((zzakg) zzsp.zzb().zza((zzsv) ((zzakg) zzsv.zzb().zza(r1.zzc().zzd()).zze())).zza(zzaiw.zza(r1.zze().zza(zzcm.zza(zzcmVar)))).zze())).zza((zzvb) ((zzakg) zzvb.zzb().zza(zzga.zzb(r1.zzc())).zza(zzaiw.zza(r1.zzf().zza(zzcm.zza(zzcmVar)))).zze())).zze())).zzj(), zzwb.zza.SYMMETRIC, zzga.zza(r1.zzc().zzh()), ((zzcx) zzboVar).zza());
                return zza2;
            }
        }, zzcx.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzcx zzb3;
                zzb3 = zzga.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcx zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzsj zza2 = zzsj.zza(zzpnVar.zzd(), zzajv.zza());
                if (zza2.zza() == 0) {
                    if (zza2.zzd().zza() == 0) {
                        if (zza2.zze().zza() == 0) {
                            return zzcx.zzb().zza(zzdc.zzf().zza(zza2.zzd().zzf().zzb()).zzb(zza2.zze().zzf().zzb()).zzc(zza2.zzd().zze().zza()).zzd(zza2.zze().zze().zza()).zza(zza(zza2.zze().zze().zzb())).zza(zza(zzpnVar.zzc())).zza()).zza(zzzo.zza(zza2.zzd().zzf().zzd(), zzcm.zza(zzcmVar))).zzb(zzzo.zza(zza2.zze().zzf().zzd(), zzcm.zza(zzcmVar))).zza(zzpnVar.zze()).zza();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzakm unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    private static zzdc.zza zza(zzvc zzvcVar) {
        int i7 = zzgg.zzb[zzvcVar.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 == 5) {
                            return zzdc.zza.zze;
                        }
                        throw new GeneralSecurityException(b.e(zzvcVar.zza(), "Unable to parse HashType: "));
                    }
                    return zzdc.zza.zzd;
                }
                return zzdc.zza.zzc;
            }
            return zzdc.zza.zzb;
        }
        return zzdc.zza.zza;
    }

    private static zzdc.zzc zza(zzxd zzxdVar) {
        int i7 = zzgg.zza[zzxdVar.ordinal()];
        if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                return zzdc.zzc.zzb;
            }
            if (i7 == 4) {
                return zzdc.zzc.zzc;
            }
            throw new GeneralSecurityException(b.e(zzxdVar.zza(), "Unable to parse OutputPrefixType: "));
        }
        return zzdc.zzc.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdc zzb(zzpm zzpmVar) {
        if (zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzsm zza2 = zzsm.zza(zzpmVar.zza().zze(), zzajv.zza());
                if (zza2.zzd().zzb() == 0) {
                    return zzdc.zzf().zza(zza2.zzc().zza()).zzb(zza2.zzd().zza()).zzc(zza2.zzc().zze().zza()).zzd(zza2.zzd().zzf().zza()).zza(zza(zza2.zzd().zzf().zzb())).zza(zza(zzpmVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzakm e7) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(b.h("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
    }

    private static zzvh zzb(zzdc zzdcVar) {
        zzvc zzvcVar;
        zzvh.zza zza2 = zzvh.zzc().zza(zzdcVar.zze());
        zzdc.zza zzg = zzdcVar.zzg();
        if (zzdc.zza.zza.equals(zzg)) {
            zzvcVar = zzvc.SHA1;
        } else if (zzdc.zza.zzb.equals(zzg)) {
            zzvcVar = zzvc.SHA224;
        } else if (zzdc.zza.zzc.equals(zzg)) {
            zzvcVar = zzvc.SHA256;
        } else if (zzdc.zza.zzd.equals(zzg)) {
            zzvcVar = zzvc.SHA384;
        } else if (zzdc.zza.zze.equals(zzg)) {
            zzvcVar = zzvc.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzg)));
        }
        return (zzvh) ((zzakg) zza2.zza(zzvcVar).zze());
    }

    private static zzxd zza(zzdc.zzc zzcVar) {
        if (zzdc.zzc.zza.equals(zzcVar)) {
            return zzxd.TINK;
        }
        if (zzdc.zzc.zzb.equals(zzcVar)) {
            return zzxd.CRUNCHY;
        }
        if (zzdc.zzc.zzc.equals(zzcVar)) {
            return zzxd.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzcVar)));
    }

    public static void zza() {
        zzom zza2 = zzom.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
