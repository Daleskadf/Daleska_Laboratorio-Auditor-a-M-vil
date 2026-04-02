package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzf extends zze {
    private boolean zza;

    public zzf(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzt.zzD();
    }

    public final void zza() {
        if (zze()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzb() {
        if (!this.zza) {
            if (!zzf()) {
                this.zzt.zzB();
                this.zza = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzc() {
        if (!this.zza) {
            zzd();
            this.zzt.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public void zzd() {
    }

    public final boolean zze() {
        return this.zza;
    }

    public abstract boolean zzf();
}
