package com.google.android.gms.internal.location;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzq extends zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            zze();
        } else {
            zzc.zzd(parcel);
            zzd((zzl) zzc.zza(parcel, zzl.CREATOR));
        }
        return true;
    }
}
