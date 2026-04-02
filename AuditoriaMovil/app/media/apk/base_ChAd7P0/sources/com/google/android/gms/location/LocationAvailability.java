package com.google.android.gms.location;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import m5.d;
import n3.c0;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p3.w;
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new c0(12);

    /* renamed from: a  reason: collision with root package name */
    public final int f9421a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9422b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9423c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9424d;

    /* renamed from: e  reason: collision with root package name */
    public final w[] f9425e;

    public LocationAvailability(int i7, int i8, int i9, long j, w[] wVarArr) {
        this.f9424d = i7 < 1000 ? 0 : PipesIterator.DEFAULT_QUEUE_SIZE;
        this.f9421a = i8;
        this.f9422b = i9;
        this.f9423c = j;
        this.f9425e = wVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f9421a == locationAvailability.f9421a && this.f9422b == locationAvailability.f9422b && this.f9423c == locationAvailability.f9423c && this.f9424d == locationAvailability.f9424d && Arrays.equals(this.f9425e, locationAvailability.f9425e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9424d)});
    }

    public final String toString() {
        boolean z7;
        if (this.f9424d < 1000) {
            z7 = true;
        } else {
            z7 = false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(z7).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z7);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        int i8 = 1;
        d.K(parcel, 1, 4);
        parcel.writeInt(this.f9421a);
        d.K(parcel, 2, 4);
        parcel.writeInt(this.f9422b);
        d.K(parcel, 3, 8);
        parcel.writeLong(this.f9423c);
        d.K(parcel, 4, 4);
        int i9 = this.f9424d;
        parcel.writeInt(i9);
        d.E(parcel, 5, this.f9425e, i7);
        if (i9 >= 1000) {
            i8 = 0;
        }
        d.K(parcel, 6, 4);
        parcel.writeInt(i8);
        d.J(G2, parcel);
    }
}
