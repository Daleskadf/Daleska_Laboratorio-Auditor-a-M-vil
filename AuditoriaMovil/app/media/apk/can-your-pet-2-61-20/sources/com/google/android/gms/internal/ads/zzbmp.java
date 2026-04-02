package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbmp extends zzazo implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbmj zzbmjVar, zzbmo zzbmoVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzd(zza, zzbmjVar);
        zzazq.zzf(zza, zzbmoVar);
        zzdd(2, zza);
    }
}
