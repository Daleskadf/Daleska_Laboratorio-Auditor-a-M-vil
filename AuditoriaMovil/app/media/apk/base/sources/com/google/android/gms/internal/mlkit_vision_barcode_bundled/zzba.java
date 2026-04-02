package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzba extends a {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
    private final int zza;
    private final boolean zzb;

    public zzba(int i7, boolean z7) {
        this.zza = i7;
        this.zzb = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        boolean z7 = this.zzb;
        d.K(parcel, 2, 4);
        parcel.writeInt(z7 ? 1 : 0);
        d.J(G2, parcel);
    }

    public final int zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzb;
    }
}
