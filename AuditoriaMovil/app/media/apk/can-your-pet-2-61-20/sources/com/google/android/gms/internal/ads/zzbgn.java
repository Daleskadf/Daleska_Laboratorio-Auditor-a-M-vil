package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbgn extends zzazo implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbvz zzbvzVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzbvzVar);
        zzdc(1, zza);
    }
}
