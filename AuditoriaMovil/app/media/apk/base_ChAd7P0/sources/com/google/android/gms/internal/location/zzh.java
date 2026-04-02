package com.google.android.gms.internal.location;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Collections;
import java.util.List;
import m5.d;
import p3.C1667g;
/* loaded from: classes.dex */
public final class zzh extends a {
    public static final Parcelable.Creator<zzh> CREATOR;
    static final List zza = Collections.emptyList();
    static final C1667g zzb;
    final C1667g zzc;
    final List zzd;
    final String zze;

    static {
        boolean z7;
        if (20000 >= 0 && 20000 < Long.MAX_VALUE) {
            z7 = true;
        } else {
            z7 = false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(20000L).length() + 102);
        sb.append("Invalid interval: ");
        sb.append(20000L);
        sb.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        zzer.zzb(z7, sb.toString());
        zzb = new C1667g(20000L, false);
        CREATOR = new zzi();
    }

    public zzh(C1667g c1667g, List list, String str) {
        this.zzc = c1667g;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (!I.m(this.zzc, zzhVar.zzc) || !I.m(this.zzd, zzhVar.zzd) || !I.m(this.zze, zzhVar.zze)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = this.zze;
        StringBuilder sb = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        sb.append("DeviceOrientationRequestInternal[deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("']");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.A(parcel, 1, this.zzc, i7, false);
        d.F(parcel, 2, this.zzd, false);
        d.B(parcel, 3, this.zze, false);
        d.J(G2, parcel);
    }
}
