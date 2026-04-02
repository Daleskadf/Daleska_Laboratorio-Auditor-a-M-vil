package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgnk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnj zzb = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzgni
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) {
            int i = zzgnk.zza;
            zzguu zzc2 = ((zzgne) zzggiVar).zzb().zzc();
            zzgfu zzb2 = zzgms.zzc().zzb(zzc2.zzi());
            if (!zzgms.zzc().zze(zzc2.zzi())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            zzgup zza2 = zzb2.zza(zzc2.zzh());
            return new zzgnd(zzgot.zza(zza2.zzg(), zza2.zzf(), zza2.zzc(), zzc2.zzg(), num), zzgfs.zza());
        }
    };
    private static final zzgnk zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgnk zzb() {
        return zzc;
    }

    private final synchronized zzgft zzd(zzggi zzggiVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgnj zzgnjVar;
        zzgnjVar = (zzgnj) this.zzd.get(zzggiVar.getClass());
        if (zzgnjVar == null) {
            String obj = zzggiVar.toString();
            throw new GeneralSecurityException("Cannot create a new key for parameters " + obj + ": no key creator for this class was registered.");
        }
        return zzgnjVar.zza(zzggiVar, num);
    }

    private static zzgnk zze() {
        zzgnk zzgnkVar = new zzgnk();
        try {
            zzgnkVar.zzc(zzb, zzgne.class);
            return zzgnkVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final zzgft zza(zzggi zzggiVar, @Nullable Integer num) throws GeneralSecurityException {
        return zzd(zzggiVar, num);
    }

    public final synchronized void zzc(zzgnj zzgnjVar, Class cls) throws GeneralSecurityException {
        zzgnj zzgnjVar2 = (zzgnj) this.zzd.get(cls);
        if (zzgnjVar2 != null && !zzgnjVar2.equals(zzgnjVar)) {
            String obj = cls.toString();
            throw new GeneralSecurityException("Different key creator for parameters class " + obj + " already inserted");
        }
        this.zzd.put(cls, zzgnjVar);
    }
}
