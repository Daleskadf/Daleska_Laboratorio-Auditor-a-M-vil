package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzekb implements zzgea {
    final /* synthetic */ long zza;
    final /* synthetic */ zzffq zzb;
    final /* synthetic */ zzffn zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfmp zze;
    final /* synthetic */ zzffz zzf;
    final /* synthetic */ zzekd zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekb(zzekd zzekdVar, long j, zzffq zzffqVar, zzffn zzffnVar, String str, zzfmp zzfmpVar, zzffz zzffzVar) {
        this.zza = j;
        this.zzb = zzffqVar;
        this.zzc = zzffnVar;
        this.zzd = str;
        this.zze = zzfmpVar;
        this.zzf = zzffzVar;
        this.zzg = zzekdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekb.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        boolean z2;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzego zzegoVar;
        LinkedHashMap linkedHashMap2;
        zzekf zzekfVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzekd zzekdVar = this.zzg;
            z = zzekdVar.zze;
            if (z) {
                zzekfVar = zzekdVar.zzb;
                zzekfVar.zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
            }
            zzekd zzekdVar2 = this.zzg;
            z2 = zzekdVar2.zzg;
            if (z2) {
                return;
            }
            zzq = zzekdVar2.zzq(this.zzc);
            if (zzq) {
                linkedHashMap2 = this.zzg.zzd;
                ((zzekc) linkedHashMap2.get(this.zzc)).zzd = elapsedRealtime;
            } else {
                linkedHashMap = this.zzg.zzd;
                zzffn zzffnVar = this.zzc;
                linkedHashMap.put(zzffnVar, new zzekc(this.zzd, zzffnVar.zzag, 0, elapsedRealtime, null));
            }
            zzegoVar = this.zzg.zzf;
            zzegoVar.zzg(this.zzc, elapsedRealtime, null);
        }
    }
}
