package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzar extends a {
    public static final Parcelable.Creator<zzar> CREATOR = new zzbk();
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public zzar(int i7, String str, String str2, String str3) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.B(parcel, 2, this.zzb, false);
        d.B(parcel, 3, this.zzc, false);
        d.B(parcel, 4, this.zzd, false);
        d.J(G2, parcel);
    }
}
