package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzs extends X2.a {
    public static final Parcelable.Creator<zzs> CREATOR = new zzaf();
    public String zza;
    public String zzb;

    public zzs() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.B(parcel, 2, this.zza, false);
        d.B(parcel, 3, this.zzb, false);
        d.J(G2, parcel);
    }

    public zzs(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
