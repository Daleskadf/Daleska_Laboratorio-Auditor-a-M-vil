package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
/* loaded from: classes.dex */
public abstract class zzw extends zzb implements zzx {
    public zzw() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzc.zzd(parcel);
            zzb((Status) zzc.zza(parcel, Status.CREATOR), (LocationAvailability) zzc.zza(parcel, LocationAvailability.CREATOR));
            return true;
        }
        return false;
    }
}
