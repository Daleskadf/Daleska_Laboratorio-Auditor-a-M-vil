package com.google.android.gms.internal.location;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.location.LocationRequest;
import m5.d;
@Deprecated
/* loaded from: classes.dex */
public final class zzeg extends a {
    public static final Parcelable.Creator<zzeg> CREATOR = new zzeh();
    LocationRequest zza;

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzeg(com.google.android.gms.location.LocationRequest r15, java.util.List r16, boolean r17, boolean r18, boolean r19, boolean r20, java.lang.String r21, long r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzeg.<init>(com.google.android.gms.location.LocationRequest, java.util.List, boolean, boolean, boolean, boolean, java.lang.String, long):void");
    }

    @Deprecated
    public static zzeg zza(String str, LocationRequest locationRequest) {
        return new zzeg(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzeg) {
            return I.m(this.zza, ((zzeg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.A(parcel, 1, this.zza, i7, false);
        d.J(G2, parcel);
    }
}
