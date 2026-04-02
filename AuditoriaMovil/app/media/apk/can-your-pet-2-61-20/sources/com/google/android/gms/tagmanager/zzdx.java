package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public abstract class zzdx extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zzb.zzr.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzs.toString();

    public zzdx(String str) {
        super(str, zza, zzb);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        Iterator it = map.values().iterator();
        do {
            boolean z = false;
            if (!it.hasNext()) {
                com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zza);
                com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
                if (zzamVar != null && zzamVar2 != null) {
                    z = zzd(zzamVar, zzamVar2, map);
                }
                return zzfu.zzb(Boolean.valueOf(z));
            }
        } while (((com.google.android.gms.internal.gtm.zzam) it.next()) != zzfu.zza());
        return zzfu.zzb(false);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }

    protected abstract boolean zzd(com.google.android.gms.internal.gtm.zzam zzamVar, com.google.android.gms.internal.gtm.zzam zzamVar2, Map map);
}
