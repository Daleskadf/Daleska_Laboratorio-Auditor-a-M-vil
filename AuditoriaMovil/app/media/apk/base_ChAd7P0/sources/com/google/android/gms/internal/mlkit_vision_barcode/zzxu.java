package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzxu extends X2.a {
    public static final Parcelable.Creator<zzxu> CREATOR = new zzyj();
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public zzxu(int i7, String str, String str2, String str3) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.B(parcel, 2, this.zzb, false);
        d.B(parcel, 3, this.zzc, false);
        d.B(parcel, 4, this.zzd, false);
        d.J(G2, parcel);
    }

    public final int zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzc;
    }
}
