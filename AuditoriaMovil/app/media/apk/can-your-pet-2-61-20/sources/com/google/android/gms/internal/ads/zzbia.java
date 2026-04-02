package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbia extends zzazo implements zzbic {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbia(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zze(zzbht zzbhtVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzbhtVar);
        zzdc(1, zza);
    }
}
