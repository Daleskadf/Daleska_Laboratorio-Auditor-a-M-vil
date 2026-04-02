package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbnm extends zzazo implements zzbno {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final void zzf() throws RemoteException {
        zzdc(1, zza());
    }
}
