package com.google.android.gms.internal.location;

import android.os.Parcel;
import p3.r;
/* loaded from: classes.dex */
public abstract class zzaa extends zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzc.zzd(parcel);
            zzb((r) zzc.zza(parcel, r.CREATOR));
            return true;
        }
        return false;
    }
}
