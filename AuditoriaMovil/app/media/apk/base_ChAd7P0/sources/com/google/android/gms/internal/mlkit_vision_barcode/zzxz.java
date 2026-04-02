package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzxz extends X2.a {
    public static final Parcelable.Creator<zzxz> CREATOR = new zzys();
    private final String zza;
    private final String zzb;

    public zzxz(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int G2 = d.G(20293, parcel);
        d.B(parcel, 1, str, false);
        d.B(parcel, 2, this.zzb, false);
        d.J(G2, parcel);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
