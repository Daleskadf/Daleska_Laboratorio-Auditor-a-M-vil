package com.google.android.gms.internal.cast;
/* loaded from: classes.dex */
public final class zzkd extends zzov<zzke, zzkd> implements zzqf {
    private zzkd() {
        super(zzke.zzc());
    }

    public final zzkd zza(Iterable<? extends zzju> iterable) {
        if (this.zzb) {
            zzt();
            this.zzb = false;
        }
        zzke.zze((zzke) this.zza, iterable);
        return this;
    }

    public final zzkd zzb(zzkk zzkkVar) {
        if (this.zzb) {
            zzt();
            this.zzb = false;
        }
        zzke.zzd((zzke) this.zza, zzkkVar);
        return this;
    }

    public /* synthetic */ zzkd(zzjy zzjyVar) {
        super(zzke.zzc());
    }
}
