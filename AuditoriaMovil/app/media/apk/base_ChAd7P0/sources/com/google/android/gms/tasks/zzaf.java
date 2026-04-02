package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaf<T> implements zzae<T> {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzaf(int i7, zzw zzwVar) {
        this.zzb = i7;
        this.zzc = zzwVar;
    }

    private final void zza() {
        if (this.zzd + this.zze + this.zzf == this.zzb) {
            if (this.zzg != null) {
                zzw zzwVar = this.zzc;
                int i7 = this.zze;
                int i8 = this.zzb;
                zzwVar.zza(new ExecutionException(i7 + " out of " + i8 + " underlying tasks failed", this.zzg));
            } else if (this.zzh) {
                this.zzc.zzc();
            } else {
                this.zzc.zzb(null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t7) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
