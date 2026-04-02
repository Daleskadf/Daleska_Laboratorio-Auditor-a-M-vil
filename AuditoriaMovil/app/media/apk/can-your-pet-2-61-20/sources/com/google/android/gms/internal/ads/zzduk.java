package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzduk implements zzfko {
    private final zzduc zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzduk(zzduc zzducVar, Set set, Clock clock) {
        zzfkh zzfkhVar;
        this.zzb = zzducVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzduj zzdujVar = (zzduj) it.next();
            Map map = this.zzd;
            zzfkhVar = zzdujVar.zzc;
            map.put(zzfkhVar, zzdujVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfkh zzfkhVar, boolean z) {
        zzfkh zzfkhVar2;
        String str;
        zzfkhVar2 = ((zzduj) this.zzd.get(zzfkhVar)).zzb;
        if (this.zza.containsKey(zzfkhVar2)) {
            String str2 = true != z ? "f." : "s.";
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfkhVar2)).longValue();
            zzduc zzducVar = this.zzb;
            Map map = this.zzd;
            Map zzb = zzducVar.zzb();
            str = ((zzduj) map.get(zzfkhVar)).zza;
            zzb.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzd(zzfkh zzfkhVar, String str) {
        if (this.zza.containsKey(zzfkhVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfkhVar)).longValue();
            zzduc zzducVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzducVar.zzb().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfkhVar)) {
            zze(zzfkhVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdC(zzfkh zzfkhVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdD(zzfkh zzfkhVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfkhVar)) {
            Clock clock = this.zzc;
            Map map = this.zza;
            zzduc zzducVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzducVar.zzb().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(clock.elapsedRealtime() - ((Long) map.get(zzfkhVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzfkhVar)) {
            zze(zzfkhVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdE(zzfkh zzfkhVar, String str) {
        this.zza.put(zzfkhVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }
}
