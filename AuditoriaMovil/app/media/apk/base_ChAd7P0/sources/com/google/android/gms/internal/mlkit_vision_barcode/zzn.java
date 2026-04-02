package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzn extends X2.a {
    public static final Parcelable.Creator<zzn> CREATOR = new zzaa();
    public int zza;
    public String zzb;
    public String zzc;
    public String zzd;

    public zzn() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 2, 4);
        parcel.writeInt(i8);
        d.B(parcel, 3, this.zzb, false);
        d.B(parcel, 4, this.zzc, false);
        d.B(parcel, 5, this.zzd, false);
        d.J(G2, parcel);
    }

    public zzn(int i7, String str, String str2, String str3) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }
}
