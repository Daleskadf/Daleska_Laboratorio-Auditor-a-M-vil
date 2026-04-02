package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbxj implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbxl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxj(zzbxl zzbxlVar, Context context) {
        this.zza = context;
        this.zzb = zzbxlVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbxi zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbxk zzbxkVar = (zzbxk) weakHashMap.get(this.zza);
        if (zzbxkVar != null) {
            if (zzbxkVar.zza + ((Long) zzbfj.zza.zze()).longValue() >= com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()) {
                zza = new zzbxh(this.zza, zzbxkVar.zzb).zza();
                zzbxl zzbxlVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbxlVar.zza;
                weakHashMap2.put(context, new zzbxk(zzbxlVar, zza));
                return zza;
            }
        }
        zza = new zzbxh(this.zza).zza();
        zzbxl zzbxlVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbxlVar2.zza;
        weakHashMap2.put(context2, new zzbxk(zzbxlVar2, zza));
        return zza;
    }
}
