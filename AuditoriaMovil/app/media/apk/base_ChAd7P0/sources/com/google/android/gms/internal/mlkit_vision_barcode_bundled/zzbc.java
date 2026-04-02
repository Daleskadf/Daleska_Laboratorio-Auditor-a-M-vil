package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzbc extends a {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    private final zzbt zza;
    private final zzbv zzb;
    private final boolean zzc = true;
    private final boolean zzd;

    public zzbc(zzbt zzbtVar, zzbv zzbvVar, boolean z7, boolean z8) {
        this.zza = zzbtVar;
        this.zzb = zzbvVar;
        this.zzd = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.A(parcel, 1, this.zza, i7, false);
        d.A(parcel, 2, this.zzb, i7, false);
        boolean z7 = this.zzc;
        d.K(parcel, 3, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzd;
        d.K(parcel, 4, 4);
        parcel.writeInt(z8 ? 1 : 0);
        d.J(G2, parcel);
    }

    public final zzbt zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzd;
    }
}
