package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbes extends zzazo implements zzbeu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbes(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zze(zzber zzberVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, zzberVar);
        zzdc(1, zza);
    }
}
