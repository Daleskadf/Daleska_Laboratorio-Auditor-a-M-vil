package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzan extends a {
    public static final Parcelable.Creator<zzan> CREATOR = new zzbg();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final boolean zzg;
    private final String zzh;

    public zzan(int i7, int i8, int i9, int i10, int i11, int i12, boolean z7, String str) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = z7;
        this.zzh = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        int i9 = this.zzb;
        d.K(parcel, 2, 4);
        parcel.writeInt(i9);
        int i10 = this.zzc;
        d.K(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.zzd;
        d.K(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.zze;
        d.K(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.zzf;
        d.K(parcel, 6, 4);
        parcel.writeInt(i13);
        boolean z7 = this.zzg;
        d.K(parcel, 7, 4);
        parcel.writeInt(z7 ? 1 : 0);
        d.B(parcel, 8, this.zzh, false);
        d.J(G2, parcel);
    }
}
