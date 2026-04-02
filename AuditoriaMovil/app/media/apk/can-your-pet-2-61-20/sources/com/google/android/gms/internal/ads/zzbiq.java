package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbiq extends zzazo implements zzbis {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbiq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbis
    public final void zze(zzbjb zzbjbVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzbjbVar);
        zzdc(1, zza);
    }
}
