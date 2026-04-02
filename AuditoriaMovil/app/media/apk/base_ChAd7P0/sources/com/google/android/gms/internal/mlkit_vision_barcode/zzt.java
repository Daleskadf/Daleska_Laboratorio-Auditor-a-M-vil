package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzt extends X2.a {
    public static final Parcelable.Creator<zzt> CREATOR = new zzag();
    public String zza;
    public String zzb;
    public int zzc;

    public zzt() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.B(parcel, 2, this.zza, false);
        d.B(parcel, 3, this.zzb, false);
        int i8 = this.zzc;
        d.K(parcel, 4, 4);
        parcel.writeInt(i8);
        d.J(G2, parcel);
    }

    public zzt(String str, String str2, int i7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i7;
    }
}
