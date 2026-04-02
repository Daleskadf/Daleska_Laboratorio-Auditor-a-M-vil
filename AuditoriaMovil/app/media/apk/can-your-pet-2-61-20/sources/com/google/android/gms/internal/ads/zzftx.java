package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzftx extends zzazo implements zzftz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftx(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final void zze(Bundle bundle, zzfub zzfubVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, bundle);
        zzazq.zzf(zza, zzfubVar);
        zzdd(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final void zzf(String str, Bundle bundle, zzfub zzfubVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzazq.zzd(zza, bundle);
        zzazq.zzf(zza, zzfubVar);
        zzdd(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final void zzg(Bundle bundle, zzfub zzfubVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, bundle);
        zzazq.zzf(zza, zzfubVar);
        zzdd(3, zza);
    }
}
