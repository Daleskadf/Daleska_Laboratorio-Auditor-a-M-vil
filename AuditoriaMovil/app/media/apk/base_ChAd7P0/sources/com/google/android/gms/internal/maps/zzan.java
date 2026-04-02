package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import s3.z;
/* loaded from: classes.dex */
public final class zzan extends zza implements zzap {
    public zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final z zzb(int i7, int i8, int i9) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zza.writeInt(i8);
        zza.writeInt(i9);
        Parcel zzJ = zzJ(1, zza);
        z zVar = (z) zzc.zza(zzJ, z.CREATOR);
        zzJ.recycle();
        return zVar;
    }
}
