package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbuj extends zzazo implements zzbul {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbul
    public final zzbui zze(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        zzbui zzbugVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbugVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbugVar = queryLocalInterface instanceof zzbui ? (zzbui) queryLocalInterface : new zzbug(readStrongBinder);
        }
        zzdb.recycle();
        return zzbugVar;
    }
}
