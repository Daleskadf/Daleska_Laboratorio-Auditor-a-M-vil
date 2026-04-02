package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaxj implements zzfrs {
    private final zzfpr zza;
    private final zzfqi zzb;
    private final zzaxw zzc;
    private final zzaxi zzd;
    private final zzaws zze;
    private final zzaxy zzf;
    private final zzaxq zzg;
    private final zzaxh zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxj(zzfpr zzfprVar, zzfqi zzfqiVar, zzaxw zzaxwVar, zzaxi zzaxiVar, zzaws zzawsVar, zzaxy zzaxyVar, zzaxq zzaxqVar, zzaxh zzaxhVar) {
        this.zza = zzfprVar;
        this.zzb = zzfqiVar;
        this.zzc = zzaxwVar;
        this.zzd = zzaxiVar;
        this.zze = zzawsVar;
        this.zzf = zzaxyVar;
        this.zzg = zzaxqVar;
        this.zzh = zzaxhVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfpr zzfprVar = this.zza;
        zzaud zzb = this.zzb.zzb();
        hashMap.put("v", zzfprVar.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzi());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzaxq zzaxqVar = this.zzg;
        if (zzaxqVar != null) {
            hashMap.put("tcq", Long.valueOf(zzaxqVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Map zza() {
        zzaxw zzaxwVar = this.zzc;
        Map zze = zze();
        zze.put("lts", Long.valueOf(zzaxwVar.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Map zzb() {
        zzfpr zzfprVar = this.zza;
        zzfqi zzfqiVar = this.zzb;
        Map zze = zze();
        zzaud zza = zzfqiVar.zza();
        zze.put("gai", Boolean.valueOf(zzfprVar.zzd()));
        zze.put("did", zza.zzh());
        zze.put("dst", Integer.valueOf(zza.zzc().zza()));
        zze.put("doo", Boolean.valueOf(zza.zzaq()));
        zzaws zzawsVar = this.zze;
        if (zzawsVar != null) {
            zze.put("nt", Long.valueOf(zzawsVar.zza()));
        }
        zzaxy zzaxyVar = this.zzf;
        if (zzaxyVar != null) {
            zze.put("vs", Long.valueOf(zzaxyVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Map zzc() {
        zzaxh zzaxhVar = this.zzh;
        Map zze = zze();
        if (zzaxhVar != null) {
            zze.put("vst", zzaxhVar.zza());
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
