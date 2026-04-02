package com.google.android.gms.internal.p000authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzf  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        boolean z7 = false;
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        if (parcel.readInt() != 0) {
            z7 = true;
        }
        zzc.zzb(parcel);
        zzb(status, z7);
        return true;
    }
}
