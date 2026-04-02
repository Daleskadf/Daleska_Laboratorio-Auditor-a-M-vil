package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzyd extends X2.a {
    public static final Parcelable.Creator<zzyd> CREATOR = new zzye();
    private final int zza;
    private final boolean zzb;

    public zzyd(int i7, boolean z7) {
        this.zza = i7;
        this.zzb = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        boolean z7 = this.zzb;
        d.K(parcel, 2, 4);
        parcel.writeInt(z7 ? 1 : 0);
        d.J(G2, parcel);
    }
}
