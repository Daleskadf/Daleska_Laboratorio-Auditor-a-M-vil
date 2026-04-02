package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        boolean z7 = false;
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            zzc.zzc(parcel);
            zzc((Status) zzc.zza(parcel, Status.CREATOR));
        } else {
            int i9 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzc(parcel);
            if (readInt != 0) {
                z7 = true;
            }
            zzb(z7);
        }
        parcel2.writeNoException();
        return true;
    }
}
