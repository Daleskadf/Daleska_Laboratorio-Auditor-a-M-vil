package com.google.android.gms.tagmanager;

import android.util.Base64;
import android.util.Log;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzbp extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzJ.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzr.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzch.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.zzbz.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.zzcu.toString();

    public zzbp() {
        super(zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        byte[] decode;
        String encodeToString;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar == null || zzamVar == zzfu.zza()) {
            return zzfu.zza();
        }
        String zzm = zzfu.zzm(zzfu.zzk(zzamVar));
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
        String zzm2 = zzamVar2 == null ? "text" : zzfu.zzm(zzfu.zzk(zzamVar2));
        com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
        String zzm3 = zzamVar3 == null ? "base16" : zzfu.zzm(zzfu.zzk(zzamVar3));
        com.google.android.gms.internal.gtm.zzam zzamVar4 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        int i = 2;
        if (zzamVar4 != null && zzfu.zzf(zzfu.zzk(zzamVar4)).booleanValue()) {
            i = 3;
        }
        try {
            if ("text".equals(zzm2)) {
                decode = zzm.getBytes();
            } else if ("base16".equals(zzm2)) {
                decode = zzp.zzb(zzm);
            } else if ("base64".equals(zzm2)) {
                decode = Base64.decode(zzm, i);
            } else if ("base64url".equals(zzm2)) {
                decode = Base64.decode(zzm, i | 8);
            } else {
                Log.e("GoogleTagManager", "Encode: unknown input format: " + zzm2);
                return zzfu.zza();
            }
            if ("base16".equals(zzm3)) {
                encodeToString = zzp.zza(decode);
            } else if ("base64".equals(zzm3)) {
                encodeToString = Base64.encodeToString(decode, i);
            } else if ("base64url".equals(zzm3)) {
                encodeToString = Base64.encodeToString(decode, i | 8);
            } else {
                Log.e("GoogleTagManager", "Encode: unknown output format: ".concat(String.valueOf(zzm3)));
                return zzfu.zza();
            }
            return zzfu.zzb(encodeToString);
        } catch (IllegalArgumentException unused) {
            Log.e("GoogleTagManager", "Encode: invalid input:");
            return zzfu.zza();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
