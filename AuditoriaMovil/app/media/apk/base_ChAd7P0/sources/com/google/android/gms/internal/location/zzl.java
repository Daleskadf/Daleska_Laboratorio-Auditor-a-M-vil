package com.google.android.gms.internal.location;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import m5.d;
/* loaded from: classes.dex */
public final class zzl extends a implements t {
    private final Status zzb;
    public static final zzl zza = new zzl(Status.f9152e);
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    public zzl(Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.A(parcel, 1, this.zzb, i7, false);
        d.J(G2, parcel);
    }
}
