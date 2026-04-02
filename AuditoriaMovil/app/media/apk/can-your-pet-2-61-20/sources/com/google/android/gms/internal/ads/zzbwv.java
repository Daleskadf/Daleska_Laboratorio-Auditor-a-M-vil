package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbwv extends zzazp implements zzbww {
    public zzbwv() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzazq.zzc(parcel);
            zzf((ParcelFileDescriptor) zzazq.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i == 2) {
            zzazq.zzc(parcel);
            zze((com.google.android.gms.ads.internal.util.zzbb) zzazq.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            zzazq.zzc(parcel);
            zzg((ParcelFileDescriptor) zzazq.zza(parcel, ParcelFileDescriptor.CREATOR), (zzbxd) zzazq.zza(parcel, zzbxd.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
