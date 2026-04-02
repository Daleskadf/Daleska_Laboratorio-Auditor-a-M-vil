package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzbe extends a {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    private final zzbr zza;

    public zzbe(zzbr zzbrVar) {
        this.zza = zzbrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        zzbr zzbrVar = this.zza;
        int G2 = d.G(20293, parcel);
        d.A(parcel, 1, zzbrVar, i7, false);
        d.J(G2, parcel);
    }
}
