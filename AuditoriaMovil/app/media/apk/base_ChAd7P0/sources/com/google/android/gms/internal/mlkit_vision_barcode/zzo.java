package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzo extends X2.a {
    public static final Parcelable.Creator<zzo> CREATOR = new zzab();
    public double zza;
    public double zzb;

    public zzo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        double d7 = this.zza;
        d.K(parcel, 2, 8);
        parcel.writeDouble(d7);
        double d8 = this.zzb;
        d.K(parcel, 3, 8);
        parcel.writeDouble(d8);
        d.J(G2, parcel);
    }

    public zzo(double d7, double d8) {
        this.zza = d7;
        this.zzb = d8;
    }
}
