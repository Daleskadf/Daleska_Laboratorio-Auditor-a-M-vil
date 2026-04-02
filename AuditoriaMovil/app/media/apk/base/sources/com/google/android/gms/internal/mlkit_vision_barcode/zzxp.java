package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzxp extends X2.a {
    public static final Parcelable.Creator<zzxp> CREATOR = new zzxo();
    private final int zza;
    private final String[] zzb;

    public zzxp(int i7, String[] strArr) {
        this.zza = i7;
        this.zzb = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.C(parcel, 2, this.zzb, false);
        d.J(G2, parcel);
    }

    public final int zza() {
        return this.zza;
    }

    public final String[] zzb() {
        return this.zzb;
    }
}
