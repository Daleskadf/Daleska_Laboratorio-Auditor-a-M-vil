package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzs extends zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return false;
                }
                zzc.zzd(parcel);
                zzd(parcel.readInt(), (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR));
            } else {
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                zzc.zzd(parcel);
                zzc(readInt, createStringArray);
            }
        } else {
            int readInt2 = parcel.readInt();
            String[] createStringArray2 = parcel.createStringArray();
            zzc.zzd(parcel);
            zzb(readInt2, createStringArray2);
        }
        return true;
    }
}
