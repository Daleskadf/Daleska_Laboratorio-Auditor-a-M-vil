package p3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n3.c0;
/* loaded from: classes.dex */
public final class x extends X2.a {
    public static final Parcelable.Creator<x> CREATOR = new c0(21);

    /* renamed from: a  reason: collision with root package name */
    public final int f15145a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15146b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15147c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15148d;

    public x(int i7, int i8, int i9, int i10) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (i7 >= 0 && i7 <= 23) {
            z7 = true;
        } else {
            z7 = false;
        }
        com.google.android.gms.common.internal.I.k("Start hour must be in range [0, 23].", z7);
        if (i8 >= 0 && i8 <= 59) {
            z8 = true;
        } else {
            z8 = false;
        }
        com.google.android.gms.common.internal.I.k("Start minute must be in range [0, 59].", z8);
        if (i9 >= 0 && i9 <= 23) {
            z9 = true;
        } else {
            z9 = false;
        }
        com.google.android.gms.common.internal.I.k("End hour must be in range [0, 23].", z9);
        if (i10 >= 0 && i10 <= 59) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.gms.common.internal.I.k("End minute must be in range [0, 59].", z10);
        com.google.android.gms.common.internal.I.k("Parameters can't be all 0.", ((i7 + i8) + i9) + i10 > 0);
        this.f15145a = i7;
        this.f15146b = i8;
        this.f15147c = i9;
        this.f15148d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f15145a == xVar.f15145a && this.f15146b == xVar.f15146b && this.f15147c == xVar.f15147c && this.f15148d == xVar.f15148d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15145a), Integer.valueOf(this.f15146b), Integer.valueOf(this.f15147c), Integer.valueOf(this.f15148d)});
    }

    public final String toString() {
        int i7 = this.f15145a;
        int length = String.valueOf(i7).length();
        int i8 = this.f15146b;
        int length2 = String.valueOf(i8).length();
        int i9 = this.f15147c;
        int length3 = String.valueOf(i9).length();
        int i10 = this.f15148d;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i10).length() + 1);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i7);
        sb.append(", startMinute=");
        sb.append(i8);
        sb.append(", endHour=");
        sb.append(i9);
        sb.append(", endMinute=");
        sb.append(i10);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        com.google.android.gms.common.internal.I.i(parcel);
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f15145a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15146b);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f15147c);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f15148d);
        m5.d.J(G2, parcel);
    }
}
