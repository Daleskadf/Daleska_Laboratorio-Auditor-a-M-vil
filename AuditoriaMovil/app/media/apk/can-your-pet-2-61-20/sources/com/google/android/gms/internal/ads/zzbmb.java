package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbmb extends zzazo implements zzbmd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final zzbma zze(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i, zzblx zzblxVar) throws RemoteException {
        zzbma zzblyVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        zzazq.zzf(zza, zzblxVar);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzblyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzblyVar = queryLocalInterface instanceof zzbma ? (zzbma) queryLocalInterface : new zzbly(readStrongBinder);
        }
        zzdb.recycle();
        return zzblyVar;
    }
}
