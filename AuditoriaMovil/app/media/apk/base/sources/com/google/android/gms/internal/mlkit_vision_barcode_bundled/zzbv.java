package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzbv extends a {
    public static final Parcelable.Creator<zzbv> CREATOR = new zzbw();
    private final float[] zza;

    public zzbv(float[] fArr) {
        this.zza = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        float[] fArr = this.zza;
        int G2 = d.G(20293, parcel);
        d.t(parcel, 1, fArr, false);
        d.J(G2, parcel);
    }
}
