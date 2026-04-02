package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgge {
    private final zzgvc zza;
    private final List zzb;
    private final zzgrs zzc;

    private zzgge(zzgvc zzgvcVar, List list) {
        this.zza = zzgvcVar;
        this.zzb = list;
        this.zzc = zzgrs.zza;
    }

    public /* synthetic */ zzgge(zzgvc zzgvcVar, List list, zzgrs zzgrsVar, zzggd zzggdVar) {
        this.zza = zzgvcVar;
        this.zzb = list;
        this.zzc = zzgrsVar;
    }

    public static final zzgge zza(zzgvc zzgvcVar) throws GeneralSecurityException {
        zzh(zzgvcVar);
        return new zzgge(zzgvcVar, zzg(zzgvcVar));
    }

    public static final zzgge zzb(zzggi zzggiVar) throws GeneralSecurityException {
        zzgga zzggaVar = new zzgga();
        zzgfy zzgfyVar = new zzgfy(zzggiVar, null);
        zzgfyVar.zzd();
        zzgfyVar.zzc();
        zzggaVar.zza(zzgfyVar);
        return zzggaVar.zzb();
    }

    public static /* bridge */ /* synthetic */ void zze(zzgvc zzgvcVar) {
        zzh(zzgvcVar);
    }

    private static zzgot zzf(zzgvb zzgvbVar) {
        try {
            return zzgot.zza(zzgvbVar.zzc().zzg(), zzgvbVar.zzc().zzf(), zzgvbVar.zzc().zzc(), zzgvbVar.zzg(), zzgvbVar.zzg() == zzgvv.RAW ? null : Integer.valueOf(zzgvbVar.zza()));
        } catch (GeneralSecurityException e) {
            throw new zzgph("Creating a protokey serialization failed", e);
        }
    }

    private static List zzg(zzgvc zzgvcVar) {
        zzgft zza;
        zzgfv zzgfvVar;
        ArrayList arrayList = new ArrayList(zzgvcVar.zza());
        for (zzgvb zzgvbVar : zzgvcVar.zzh()) {
            int zza2 = zzgvbVar.zza();
            try {
                zzgot zzf = zzf(zzgvbVar);
                zzgnu zzc = zzgnu.zzc();
                zzggn zza3 = zzggn.zza();
                if (!zzc.zzj(zzf)) {
                    zza = new zzgnd(zzf, zza3);
                } else {
                    zza = zzc.zza(zzf, zza3);
                }
                zzgur zzd = zzgvbVar.zzd();
                zzgur zzgurVar = zzgur.UNKNOWN_STATUS;
                int ordinal = zzd.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            zzgfvVar = zzgfv.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzgfvVar = zzgfv.zzb;
                    }
                } else {
                    zzgfvVar = zzgfv.zza;
                }
                arrayList.add(new zzggc(zza, zzgfvVar, zza2, zza2 == zzgvcVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void zzh(zzgvc zzgvcVar) throws GeneralSecurityException {
        if (zzgvcVar == null || zzgvcVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    @Nullable
    private static final Object zzi(zzgmr zzgmrVar, zzgft zzgftVar, Class cls) throws GeneralSecurityException {
        try {
            return zzgnr.zza().zzc(zzgftVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        Charset charset = zzggq.zza;
        zzgvc zzgvcVar = this.zza;
        zzgve zza = zzgvh.zza();
        zza.zzb(zzgvcVar.zzc());
        for (zzgvb zzgvbVar : zzgvcVar.zzh()) {
            zzgvf zza2 = zzgvg.zza();
            zza2.zzd(zzgvbVar.zzc().zzg());
            zza2.zzc(zzgvbVar.zzd());
            zza2.zzb(zzgvbVar.zzg());
            zza2.zza(zzgvbVar.zza());
            zza.zza((zzgvg) zza2.zzbr());
        }
        return ((zzgvh) zza.zzbr()).toString();
    }

    public final zzgvc zzc() {
        return this.zza;
    }

    public final Object zzd(zzgfn zzgfnVar, Class cls) throws GeneralSecurityException {
        Class zza = zzggm.zza(cls);
        if (zza != null) {
            zzgvc zzgvcVar = this.zza;
            Charset charset = zzggq.zza;
            int zzc = zzgvcVar.zzc();
            int i = 0;
            boolean z = false;
            boolean z2 = true;
            for (zzgvb zzgvbVar : zzgvcVar.zzh()) {
                if (zzgvbVar.zzd() == zzgur.ENABLED) {
                    if (zzgvbVar.zzl()) {
                        if (zzgvbVar.zzg() != zzgvv.UNKNOWN_PREFIX) {
                            if (zzgvbVar.zzd() != zzgur.UNKNOWN_STATUS) {
                                if (zzgvbVar.zza() == zzc) {
                                    if (z) {
                                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                                    }
                                    z = true;
                                }
                                z2 &= zzgvbVar.zzc().zzc() == zzguo.ASYMMETRIC_PUBLIC;
                                i++;
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgvbVar.zza())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgvbVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgvbVar.zza())));
                    }
                }
            }
            if (i != 0) {
                if (z || z2) {
                    zzgoo zza2 = zzgos.zza(zza);
                    zza2.zzc(this.zzc);
                    for (int i2 = 0; i2 < this.zzb.size(); i2++) {
                        zzgvb zze = this.zza.zze(i2);
                        if (zze.zzd().equals(zzgur.ENABLED)) {
                            zzggc zzggcVar = (zzggc) this.zzb.get(i2);
                            if (zzggcVar != null) {
                                zzgft zza3 = zzggcVar.zza();
                                Object zzi = zzi((zzgmr) zzgfnVar, zza3, zza);
                                if (zzi != null) {
                                    if (zze.zza() == this.zza.zzc()) {
                                        zza2.zzb(zzi, zza3, zze);
                                    } else {
                                        zza2.zza(zzi, zza3, zze);
                                    }
                                } else {
                                    String obj = zza.toString();
                                    String zzg = zze.zzc().zzg();
                                    throw new GeneralSecurityException("Unable to get primitive " + obj + " for key of type " + zzg + ", see https://developers.google.com/tink/registration_errors");
                                }
                            } else {
                                String zzg2 = zze.zzc().zzg();
                                throw new GeneralSecurityException("Key parsing of key with index " + i2 + " and type_url " + zzg2 + " failed, unable to get primitive");
                            }
                        }
                    }
                    return zzgnr.zza().zzd(zza2.zzd(), cls);
                }
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }
}
