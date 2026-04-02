package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzas extends a {
    public static final Parcelable.Creator<zzas> CREATOR = new zzbl();
    private final double zza;
    private final double zzb;

    public zzas(double d7, double d8) {
        this.zza = d7;
        this.zzb = d8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        double d7 = this.zza;
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 8);
        parcel.writeDouble(d7);
        double d8 = this.zzb;
        d.K(parcel, 2, 8);
        parcel.writeDouble(d8);
        d.J(G2, parcel);
    }
}
