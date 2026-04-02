package com.google.android.gms.internal.auth;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import m5.d;
/* loaded from: classes.dex */
public final class zzax extends a {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();
    final int zza;
    public final String zzb;

    public zzax(int i7, String str) {
        this.zza = 1;
        I.i(str);
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.B(parcel, 2, this.zzb, false);
        d.J(G2, parcel);
    }

    public zzax(String str) {
        this(1, str);
    }
}
