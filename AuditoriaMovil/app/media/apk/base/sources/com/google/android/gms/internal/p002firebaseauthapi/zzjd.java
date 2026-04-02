package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzit;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import io.flutter.plugins.pathprovider.b;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjd  reason: invalid package */
/* loaded from: classes.dex */
public final class zzjd {
    private static final zzzn zza;
    private static final zzou<zzit, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzio, zzpn> zzd;
    private static final zznd<zzpn> zze;
    private static final Map<zzit.zza, zzxd> zzf;
    private static final Map<zzxd, zzit.zza> zzg;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zztw) ((zzakg) zztw.zzc().zza(r1.zzb()).zze())).zzj()).zza(zzjd.zza(((zzit) zzcgVar).zzd())).zze()));
                return zzb3;
            }
        }, zzit.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzit zzb3;
                zzb3 = zzjd.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzji
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.AesSivKey", ((zztt) ((zzakg) zztt.zzb().zza(zzaiw.zza(r1.zze().zza(zzcm.zza(zzcmVar)))).zze())).zzj(), zzwb.zza.SYMMETRIC, zzjd.zza(r1.zzc().zzd()), ((zzio) zzboVar).zza());
                return zza2;
            }
        }, zzio.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzio zzb3;
                zzb3 = zzjd.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
        HashMap hashMap = new HashMap();
        zzit.zza zzaVar = zzit.zza.zzc;
        zzxd zzxdVar = zzxd.RAW;
        hashMap.put(zzaVar, zzxdVar);
        zzit.zza zzaVar2 = zzit.zza.zza;
        zzxd zzxdVar2 = zzxd.TINK;
        hashMap.put(zzaVar2, zzxdVar2);
        zzit.zza zzaVar3 = zzit.zza.zzb;
        zzxd zzxdVar3 = zzxd.CRUNCHY;
        hashMap.put(zzaVar3, zzxdVar3);
        zzf = DesugarCollections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzxd.class);
        enumMap.put((EnumMap) zzxdVar, (zzxd) zzaVar);
        enumMap.put((EnumMap) zzxdVar2, (zzxd) zzaVar2);
        enumMap.put((EnumMap) zzxdVar3, (zzxd) zzaVar3);
        enumMap.put((EnumMap) zzxd.LEGACY, (zzxd) zzaVar3);
        zzg = DesugarCollections.unmodifiableMap(enumMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzio zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zztt zza2 = zztt.zza(zzpnVar.zzd(), zzajv.zza());
                if (zza2.zza() == 0) {
                    return zzio.zzb().zza(zzit.zzc().zza(zza2.zzd().zzb()).zza(zza(zzpnVar.zzc())).zza()).zza(zzzo.zza(zza2.zzd().zzd(), zzcm.zza(zzcmVar))).zza(zzpnVar.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzakm unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
    }

    private static zzit.zza zza(zzxd zzxdVar) {
        Map<zzxd, zzit.zza> map = zzg;
        if (map.containsKey(zzxdVar)) {
            return map.get(zzxdVar);
        }
        throw new GeneralSecurityException(b.e(zzxdVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzit zzb(zzpm zzpmVar) {
        if (zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zztw zza2 = zztw.zza(zzpmVar.zza().zze(), zzajv.zza());
                if (zza2.zzb() == 0) {
                    return zzit.zzc().zza(zza2.zza()).zza(zza(zzpmVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzakm e7) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(b.h("Wrong type URL in call to AesSivParameters.parseParameters: ", zzpmVar.zza().zzf()));
    }

    private static zzxd zza(zzit.zza zzaVar) {
        Map<zzit.zza, zzxd> map = zzf;
        if (map.containsKey(zzaVar)) {
            return map.get(zzaVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    public static void zza() {
        zzom zza2 = zzom.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
