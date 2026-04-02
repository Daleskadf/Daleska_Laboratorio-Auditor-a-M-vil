package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzi extends X2.a {
    public static final Parcelable.Creator<zzi> CREATOR = new zzh();
    public int zza;
    public String[] zzb;

    public zzi() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 2, 4);
        parcel.writeInt(i8);
        d.C(parcel, 3, this.zzb, false);
        d.J(G2, parcel);
    }

    public zzi(int i7, String[] strArr) {
        this.zza = i7;
        this.zzb = strArr;
    }
}
