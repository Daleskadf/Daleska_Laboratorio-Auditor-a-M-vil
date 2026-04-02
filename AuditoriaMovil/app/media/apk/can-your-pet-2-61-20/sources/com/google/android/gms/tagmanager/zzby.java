package com.google.android.gms.tagmanager;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzby extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzL.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzr.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzh.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.zzbz.toString();

    public zzby() {
        super(zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        byte[] zzb2;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar == null || zzamVar == zzfu.zza()) {
            return zzfu.zza();
        }
        String zzm = zzfu.zzm(zzfu.zzk(zzamVar));
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        String zzm2 = zzamVar2 == null ? "MD5" : zzfu.zzm(zzfu.zzk(zzamVar2));
        com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
        String zzm3 = zzamVar3 == null ? "text" : zzfu.zzm(zzfu.zzk(zzamVar3));
        if ("text".equals(zzm3)) {
            zzb2 = zzm.getBytes();
        } else if ("base16".equals(zzm3)) {
            zzb2 = zzp.zzb(zzm);
        } else {
            Log.e("GoogleTagManager", "Hash: unknown input format: ".concat(String.valueOf(zzm3)));
            return zzfu.zza();
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(zzm2);
            messageDigest.update(zzb2);
            return zzfu.zzb(zzp.zza(messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            Log.e("GoogleTagManager", "Hash: unknown algorithm: ".concat(String.valueOf(zzm2)));
            return zzfu.zza();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
