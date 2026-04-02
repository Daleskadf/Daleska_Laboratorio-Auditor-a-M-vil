package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbwr extends zzazo implements zzbwt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbbVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, parcelFileDescriptor);
        zzdc(1, zza);
    }
}
