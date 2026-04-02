package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzip extends zzim {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzip(zzhm zzhmVar) {
        super(zzhmVar);
        this.zzu.zzaa();
    }

    protected void zzaa() {
    }

    protected abstract boolean zzo();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzac() {
        if (!zzaf()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzad() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzo()) {
            return;
        }
        this.zzu.zzz();
        this.zza = true;
    }

    public final void zzae() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzaa();
        this.zzu.zzz();
        this.zza = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzaf() {
        return this.zza;
    }
}
