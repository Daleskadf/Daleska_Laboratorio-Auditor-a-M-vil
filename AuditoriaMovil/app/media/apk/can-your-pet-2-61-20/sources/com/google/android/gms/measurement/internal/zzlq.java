package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzlq implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzld zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlq(zzld zzldVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfs zzfsVar;
        zzfsVar = this.zzb.zzb;
        if (zzfsVar == null) {
            this.zzb.zzj().zzg().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzfsVar.zzc(this.zza);
            this.zzb.zzh().zzac();
            this.zzb.zza(zzfsVar, (AbstractSafeParcelable) null, this.zza);
            this.zzb.zzaq();
        } catch (RemoteException e) {
            this.zzb.zzj().zzg().zza("Failed to send app launch to the service", e);
        }
    }
}
