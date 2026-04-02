package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzgl extends zzgk {
    private boolean zza;

    public zzgl(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzt.zzD();
    }

    public void zzaA() {
    }

    public abstract boolean zzf();

    public final void zzu() {
        if (zzx()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzv() {
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

    public final void zzw() {
        if (!this.zza) {
            zzaA();
            this.zzt.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzx() {
        return this.zza;
    }
}
