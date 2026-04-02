package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdjs implements zzbky {
    private final WeakReference zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdjs(zzdjv zzdjvVar, zzdjr zzdjrVar) {
        this.zza = new WeakReference(zzdjvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        zzcyo zzcyoVar;
        zzdgl zzdglVar;
        zzdgl zzdglVar2;
        zzdjv zzdjvVar = (zzdjv) this.zza.get();
        if (zzdjvVar == null) {
            return;
        }
        zzcyoVar = zzdjvVar.zzh;
        zzcyoVar.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
            zzdglVar = zzdjvVar.zzi;
            zzdglVar.zzdG();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdglVar2 = zzdjvVar.zzi;
            zzdglVar2.zzdf();
        }
    }
}
