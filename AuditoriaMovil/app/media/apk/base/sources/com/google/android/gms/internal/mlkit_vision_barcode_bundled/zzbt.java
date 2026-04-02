package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzbt extends a {
    public static final Parcelable.Creator<zzbt> CREATOR = new zzbu();
    private final float[] zza;
    private final int zzb;
    private final boolean zzc;

    public zzbt(float[] fArr, int i7, boolean z7) {
        this.zza = fArr;
        this.zzb = i7;
        this.zzc = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        float[] fArr = this.zza;
        int G2 = d.G(20293, parcel);
        d.t(parcel, 1, fArr, false);
        int i8 = this.zzb;
        d.K(parcel, 2, 4);
        parcel.writeInt(i8);
        boolean z7 = this.zzc;
        d.K(parcel, 3, 4);
        parcel.writeInt(z7 ? 1 : 0);
        d.J(G2, parcel);
    }

    public final int zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final float[] zzc() {
        return this.zza;
    }
}
