package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbyr extends zzazo implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbyg zzbygVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzbygVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzdc(2, zza);
    }
}
