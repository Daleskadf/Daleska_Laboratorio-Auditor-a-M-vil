package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzew;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import io.flutter.plugins.pathprovider.b;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfa  reason: invalid package */
/* loaded from: classes.dex */
public final class zzfa {
    private static final zzzn zza;
    private static final zzou<zzew, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzex, zzpn> zzd;
    private static final zznd<zzpn> zze;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzez
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zza(zzfa.zzb(r1).zzj()).zza(zzfa.zza(((zzew) zzcgVar).zzc())).zze()));
                return zzb3;
            }
        }, zzew.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzew zzb3;
                zzb3 = zzfa.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzwx) ((zzakg) zzwx.zzb().zza(zzfa.zzb(r1.zzb())).zze())).zzj(), zzwb.zza.REMOTE, zzfa.zza(r1.zzb().zzc()), ((zzex) zzboVar).zza());
                return zza2;
            }
        }, zzex.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfe
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzex zzb3;
                zzb3 = zzfa.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzex zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzwx zza2 = zzwx.zza(zzpnVar.zzd(), zzajv.zza());
                if (zza2.zza() == 0) {
                    return zzex.zza(zza(zza2.zzd(), zzpnVar.zzc()), zzpnVar.zze());
                }
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zza2)));
            } catch (zzakm e7) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    private static zzew zza(zzxa zzxaVar, zzxd zzxdVar) {
        zzew.zza zzaVar;
        zzew.zzc zzcVar;
        zzcg zza2 = zzco.zza(((zzwf) ((zzakg) zzwf.zza().zza(zzxaVar.zza().zzf()).zza(zzxaVar.zza().zze()).zza(zzxd.RAW).zze())).zzk());
        if (zza2 instanceof zzdr) {
            zzaVar = zzew.zza.zza;
        } else if (zza2 instanceof zzeg) {
            zzaVar = zzew.zza.zzc;
        } else if (zza2 instanceof zzfy) {
            zzaVar = zzew.zza.zzb;
        } else if (zza2 instanceof zzdc) {
            zzaVar = zzew.zza.zzd;
        } else if (zza2 instanceof zzdk) {
            zzaVar = zzew.zza.zze;
        } else if (zza2 instanceof zzea) {
            zzaVar = zzew.zza.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(zza2)));
        }
        zzew.zzb zzbVar = new zzew.zzb();
        int i7 = zzfd.zza[zzxdVar.ordinal()];
        if (i7 == 1) {
            zzcVar = zzew.zzc.zza;
        } else if (i7 == 2) {
            zzcVar = zzew.zzc.zzb;
        } else {
            throw new GeneralSecurityException(b.e(zzxdVar.zza(), "Unable to parse OutputPrefixType: "));
        }
        return zzbVar.zza(zzcVar).zza(zzxaVar.zze()).zza((zzcr) zza2).zza(zzaVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzew zzb(zzpm zzpmVar) {
        if (zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zza(zzxa.zza(zzpmVar.zza().zze(), zzajv.zza()), zzpmVar.zza().zzd());
            } catch (zzakm e7) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e7);
            }
        }
        throw new IllegalArgumentException(b.h("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
    }

    private static zzxa zzb(zzew zzewVar) {
        try {
            return (zzxa) ((zzakg) zzxa.zzb().zza(zzewVar.zzd()).zza(zzwf.zza(zzco.zza(zzewVar.zzb()), zzajv.zza())).zze());
        } catch (zzakm e7) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e7);
        }
    }

    private static zzxd zza(zzew.zzc zzcVar) {
        if (zzew.zzc.zza.equals(zzcVar)) {
            return zzxd.TINK;
        }
        if (zzew.zzc.zzb.equals(zzcVar)) {
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
