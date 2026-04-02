package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbid extends zzazo implements zzbif {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbid(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zze(zzbhv zzbhvVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzbhvVar);
        zzdc(1, zza);
    }
}
