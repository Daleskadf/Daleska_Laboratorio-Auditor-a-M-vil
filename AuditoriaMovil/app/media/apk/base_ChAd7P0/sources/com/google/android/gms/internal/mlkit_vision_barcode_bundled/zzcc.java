package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzcc extends a {
    public static final Parcelable.Creator<zzcc> CREATOR = new zzcd();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    public zzcc(int i7, int i8, int i9, int i10, long j) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
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
        long j = this.zze;
        d.K(parcel, 5, 8);
        parcel.writeLong(j);
        d.J(G2, parcel);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final int zzd() {
        return this.zzb;
    }
}
