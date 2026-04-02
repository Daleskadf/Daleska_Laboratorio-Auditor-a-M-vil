package com.google.android.gms.internal.auth;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import m5.d;
/* loaded from: classes.dex */
public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i7, String str, int i8) {
        this.zza = 1;
        I.i(str);
        this.zzb = str;
        this.zzc = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.B(parcel, 2, this.zzb, false);
        int i9 = this.zzc;
        d.K(parcel, 3, 4);
        parcel.writeInt(i9);
        d.J(G2, parcel);
    }

    public zzav(String str, int i7) {
        this(1, str, i7);
    }
}
