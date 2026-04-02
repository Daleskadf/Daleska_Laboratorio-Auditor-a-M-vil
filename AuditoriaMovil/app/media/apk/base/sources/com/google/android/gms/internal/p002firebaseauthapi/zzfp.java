package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfp  reason: invalid package */
/* loaded from: classes.dex */
public final class zzfp {
    private static final zzoe<zzft> zza = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfs
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            zzfq zza2;
            zza2 = zzfq.zza((zzft) zzcgVar, zzzo.zza(32), num);
            return zza2;
        }
    };
    private static final zzoy<zzfq, zzbe> zzb = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzht.zza((zzfq) zzboVar);
        }
    }, zzfq.class, zzbe.class);

    public static void zza(boolean z7) {
        zzhw.zza();
        zzok zza2 = zzok.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzfg.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzfg.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzfg.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzfg.zzj);
        zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
        zzon.zza().zza(zzb);
        zzoc.zza().zza(zza, zzft.class);
    }
}
