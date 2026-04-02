package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzo extends zzfs {
    static final String zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;
    private static final Set zzf;
    private final zzn zzg;
    private final Context zzh;

    static {
        String zzaVar = com.google.android.gms.internal.gtm.zza.zzau.toString();
        zzb = zzaVar;
        zzc = com.google.android.gms.internal.gtm.zzb.zzdU.toString();
        zzd = com.google.android.gms.internal.gtm.zzb.zze.toString();
        zze = com.google.android.gms.internal.gtm.zzb.zzdT.toString();
        zza = "gtm_" + zzaVar + "_unrepeatable";
        zzf = new HashSet();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(Context context) {
        super(zzb, zzc);
        zzm zzmVar = new zzm(context);
        this.zzg = zzmVar;
        this.zzh = context;
    }

    private final synchronized boolean zzd(String str) {
        Set set = zzf;
        if (set.contains(str)) {
            return true;
        }
        if (this.zzh.getSharedPreferences(zza, 0).contains(str)) {
            set.add(str);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.tagmanager.zzfs
    public final void zzc(Map map) {
        String str = zze;
        String zzm = map.get(str) != null ? zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(str))) : null;
        if (zzm == null || !zzd(zzm)) {
            Uri.Builder buildUpon = Uri.parse(zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(zzc)))).buildUpon();
            com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
            if (zzamVar != null) {
                Object zzk = zzfu.zzk(zzamVar);
                if (!(zzk instanceof List)) {
                    Log.e("GoogleTagManager", "ArbitraryPixel: additional params not a list: not sending partial hit: ".concat(String.valueOf(buildUpon.build().toString())));
                    return;
                }
                for (Object obj : (List) zzk) {
                    if (obj instanceof Map) {
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                        }
                    } else {
                        Log.e("GoogleTagManager", "ArbitraryPixel: additional params contains non-map: not sending partial hit: ".concat(String.valueOf(buildUpon.build().toString())));
                        return;
                    }
                }
            }
            String uri = buildUpon.build().toString();
            zzbg.zzb(((zzm) this.zzg).zza).zza(uri);
            zzdg.zzb.zzd("ArbitraryPixel: url = ".concat(String.valueOf(uri)));
            if (zzm != null) {
                synchronized (zzo.class) {
                    zzf.add(zzm);
                    zzff.zza(this.zzh, zza, zzm, "true");
                }
            }
        }
    }
}
