package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzea;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgt  reason: invalid package */
/* loaded from: classes.dex */
public final class zzgt {
    private static final zzzn zza;
    private static final zzou<zzea, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzdt, zzpn> zzd;
    private static final zznd<zzpn> zze;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((zztq) ((zzakg) zztq.zzc().zza(r1.zzb()).zze())).zzj()).zza(zzgt.zza(((zzea) zzcgVar).zzd())).zze()));
                return zzb3;
            }
        }, zzea.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzea zzb3;
                zzb3 = zzgt.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zztn) ((zzakg) zztn.zzb().zza(zzaiw.zza(r1.zze().zza(zzcm.zza(zzcmVar)))).zze())).zzj(), zzwb.zza.SYMMETRIC, zzgt.zza(r1.zzc().zzd()), ((zzdt) zzboVar).zza());
                return zza2;
            }
        }, zzdt.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzdt zzb3;
                zzb3 = zzgt.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdt zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zztn zza2 = zztn.zza(zzpnVar.zzd(), zzajv.zza());
                if (zza2.zza() == 0) {
                    return zzdt.zzb().zza(zzea.zzc().zza(zza2.zzd().zzb()).zza(zza(zzpnVar.zzc())).zza()).zza(zzzo.zza(zza2.zzd().zzd(), zzcm.zza(zzcmVar))).zza(zzpnVar.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzakm unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
    }

    private static zzea.zzb zza(zzxd zzxdVar) {
        int i7 = zzha.zza[zzxdVar.ordinal()];
        if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                return zzea.zzb.zzb;
            }
            if (i7 == 4) {
                return zzea.zzb.zzc;
            }
            throw new GeneralSecurityException(b.e(zzxdVar.zza(), "Unable to parse OutputPrefixType: "));
        }
        return zzea.zzb.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzea zzb(zzpm zzpmVar) {
        if (zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zztq zza2 = zztq.zza(zzpmVar.zza().zze(), zzajv.zza());
                if (zza2.zzb() == 0) {
                    return zzea.zzc().zza(zza2.zza()).zza(zza(zzpmVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzakm e7) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(b.h("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
    }

    private static zzxd zza(zzea.zzb zzbVar) {
        if (zzea.zzb.zza.equals(zzbVar)) {
            return zzxd.TINK;
        }
        if (zzea.zzb.zzb.equals(zzbVar)) {
            return zzxd.CRUNCHY;
        }
        if (zzea.zzb.zzc.equals(zzbVar)) {
            return zzxd.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static void zza() {
        zzom zza2 = zzom.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
