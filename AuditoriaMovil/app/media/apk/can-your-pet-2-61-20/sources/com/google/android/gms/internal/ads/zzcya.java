package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcya {
    private final Context zza;
    private final zzfgi zzb;
    private final Bundle zzc;
    private final zzfga zzd;
    private final zzcxs zze;
    private final zzego zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcya(zzcxy zzcxyVar, zzcxz zzcxzVar) {
        this.zza = zzcxy.zza(zzcxyVar);
        this.zzb = zzcxy.zzm(zzcxyVar);
        this.zzc = zzcxy.zzb(zzcxyVar);
        this.zzd = zzcxy.zzl(zzcxyVar);
        this.zze = zzcxy.zzc(zzcxyVar);
        this.zzf = zzcxy.zzk(zzcxyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza(Context context) {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcxs zzc() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcxy zzd() {
        zzcxy zzcxyVar = new zzcxy();
        zzcxyVar.zze(this.zza);
        zzcxyVar.zzi(this.zzb);
        zzcxyVar.zzf(this.zzc);
        zzcxyVar.zzg(this.zze);
        zzcxyVar.zzd(this.zzf);
        return zzcxyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzego zze(String str) {
        zzego zzegoVar = this.zzf;
        return zzegoVar != null ? zzegoVar : new zzego(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfga zzf() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfgi zzg() {
        return this.zzb;
    }
}
