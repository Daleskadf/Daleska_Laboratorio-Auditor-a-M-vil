package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcaq extends zzazo implements zzcas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcaq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final zzcap zze(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        zzcap zzcanVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcanVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcanVar = queryLocalInterface instanceof zzcap ? (zzcap) queryLocalInterface : new zzcan(readStrongBinder);
        }
        zzdb.recycle();
        return zzcanVar;
    }
}
