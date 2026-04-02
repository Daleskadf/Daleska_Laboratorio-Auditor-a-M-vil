package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzc.zzc(parcel);
            zzb((Status) zzc.zza(parcel, Status.CREATOR), (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR));
            return true;
        }
        return false;
    }
}
