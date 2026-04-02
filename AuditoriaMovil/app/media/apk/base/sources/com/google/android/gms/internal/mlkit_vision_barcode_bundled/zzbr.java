package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* loaded from: classes.dex */
public final class zzbr extends a {
    public static final Parcelable.Creator<zzbr> CREATOR = new zzbs();
    private final boolean zza;
    private final byte[] zzb;
    private final boolean zzc;
    private final float zzd;
    private final boolean zze;

    public zzbr(boolean z7, byte[] bArr, boolean z8, float f, boolean z9) {
        this.zza = z7;
        this.zzb = bArr;
        this.zzc = z8;
        this.zzd = f;
        this.zze = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.zza;
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(z7 ? 1 : 0);
        d.r(parcel, 2, this.zzb, false);
        boolean z8 = this.zzc;
        d.K(parcel, 3, 4);
        parcel.writeInt(z8 ? 1 : 0);
        float f = this.zzd;
        d.K(parcel, 4, 4);
        parcel.writeFloat(f);
        boolean z9 = this.zze;
        d.K(parcel, 5, 4);
        parcel.writeInt(z9 ? 1 : 0);
        d.J(G2, parcel);
    }
}
