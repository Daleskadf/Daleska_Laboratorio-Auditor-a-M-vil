package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzya extends X2.a {
    public static final Parcelable.Creator<zzya> CREATOR = new zzyt();
    private final String zza;
    private final String zzb;
    private final int zzc;

    public zzya(String str, String str2, int i7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int G2 = d.G(20293, parcel);
        d.B(parcel, 1, str, false);
        d.B(parcel, 2, this.zzb, false);
        int i8 = this.zzc;
        d.K(parcel, 3, 4);
        parcel.writeInt(i8);
        d.J(G2, parcel);
    }

    public final int zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
