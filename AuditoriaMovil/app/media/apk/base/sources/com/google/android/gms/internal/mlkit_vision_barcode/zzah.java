package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import m5.d;
/* loaded from: classes.dex */
public final class zzah extends X2.a {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    public int zza;
    public boolean zzb;

    public zzah() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        if (this.zza == zzahVar.zza && I.m(Boolean.valueOf(this.zzb), Boolean.valueOf(zzahVar.zzb))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Boolean.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 2, 4);
        parcel.writeInt(i8);
        boolean z7 = this.zzb;
        d.K(parcel, 3, 4);
        parcel.writeInt(z7 ? 1 : 0);
        d.J(G2, parcel);
    }

    public zzah(int i7, boolean z7) {
        this.zza = i7;
        this.zzb = z7;
    }
}
