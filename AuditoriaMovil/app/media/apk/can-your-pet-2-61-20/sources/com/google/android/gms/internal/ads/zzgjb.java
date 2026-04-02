package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgjb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgiz
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            zzgiy zzgiyVar = (zzgiy) zzgftVar;
            int i = zzgjb.zza;
            if (zzglr.zze()) {
                return zzglr.zzb(zzgiyVar);
            }
            return zzgwm.zzb(zzgiyVar);
        }
    }, zzgiy.class, zzgfj.class);
    private static final zzgnj zzc = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzgja
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) {
            int i = zzgjb.zza;
            return zzgiy.zza(((zzgjd) zzggiVar).zzb(), zzgxn.zzc(32), num);
        }
    };
    private static final zzgfu zzd = zzgnb.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgfj.class, zzguo.SYMMETRIC, zzgtw.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgml.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzgji.zza;
        zzgji.zze(zzgnu.zzc());
        zzgnr.zza().zze(zzb);
        zzgnk.zzb().zzc(zzc, zzgjd.class);
        zzgnq zzb2 = zzgnq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", zzgjd.zzc(zzgjc.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", zzgjd.zzc(zzgjc.zzc));
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgms.zzc().zzd(zzd, true);
    }
}
