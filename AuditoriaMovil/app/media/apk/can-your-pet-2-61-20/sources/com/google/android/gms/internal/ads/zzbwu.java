package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbwu extends zzazo implements zzbww {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbbVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, parcelFileDescriptor);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxd zzbxdVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, parcelFileDescriptor);
        zzazq.zzd(zza, zzbxdVar);
        zzdc(3, zza);
    }
}
