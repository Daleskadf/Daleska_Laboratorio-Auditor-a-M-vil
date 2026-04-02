package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzan extends X2.a {
    public static final Parcelable.Creator<zzan> CREATOR = new zzao();
    public int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    public int zze;

    public zzan() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 2, 4);
        parcel.writeInt(i8);
        int i9 = this.zzb;
        d.K(parcel, 3, 4);
        parcel.writeInt(i9);
        int i10 = this.zzc;
        d.K(parcel, 4, 4);
        parcel.writeInt(i10);
        long j = this.zzd;
        d.K(parcel, 5, 8);
        parcel.writeLong(j);
        int i11 = this.zze;
        d.K(parcel, 6, 4);
        parcel.writeInt(i11);
        d.J(G2, parcel);
    }

    public zzan(int i7, int i8, int i9, long j, int i10) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = j;
        this.zze = i10;
    }
}
