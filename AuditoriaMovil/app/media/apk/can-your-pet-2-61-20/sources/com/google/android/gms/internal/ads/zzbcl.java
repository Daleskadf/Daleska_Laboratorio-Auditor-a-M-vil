package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbcl extends zzazo implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbcj zzbcjVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbcjVar);
        Parcel zzdb = zzdb(3, zza);
        long readLong = zzdb.readLong();
        zzdb.recycle();
        return readLong;
    }

    public final zzbcg zzf(zzbcj zzbcjVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbcjVar);
        Parcel zzdb = zzdb(1, zza);
        zzbcg zzbcgVar = (zzbcg) zzazq.zza(zzdb, zzbcg.CREATOR);
        zzdb.recycle();
        return zzbcgVar;
    }

    public final zzbcg zzg(zzbcj zzbcjVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbcjVar);
        Parcel zzdb = zzdb(2, zza);
        zzbcg zzbcgVar = (zzbcg) zzazq.zza(zzdb, zzbcg.CREATOR);
        zzdb.recycle();
        return zzbcgVar;
    }
}
