package com.google.android.gms.internal.auth;

import T2.b;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzc.zzb(parcel);
            zzc(readString);
        } else {
            zzc.zzb(parcel);
            zzb((b) zzc.zza(parcel, b.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
