package p3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n3.c0;
/* loaded from: classes.dex */
public final class w extends X2.a {
    public static final Parcelable.Creator<w> CREATOR = new c0(19);

    /* renamed from: a  reason: collision with root package name */
    public final int f15141a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15142b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15143c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15144d;

    public w(int i7, int i8, long j, long j8) {
        this.f15141a = i7;
        this.f15142b = i8;
        this.f15143c = j;
        this.f15144d = j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f15141a == wVar.f15141a && this.f15142b == wVar.f15142b && this.f15143c == wVar.f15143c && this.f15144d == wVar.f15144d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15142b), Integer.valueOf(this.f15141a), Long.valueOf(this.f15144d), Long.valueOf(this.f15143c)});
    }

    public final String toString() {
        int i7 = this.f15141a;
        int length = String.valueOf(i7).length();
        int i8 = this.f15142b;
        int length2 = String.valueOf(i8).length();
        long j = this.f15144d;
        int length3 = String.valueOf(j).length();
        long j8 = this.f15143c;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j8).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i7);
        sb.append(" Cell status: ");
        sb.append(i8);
        sb.append(" elapsed time NS: ");
        sb.append(j);
        sb.append(" system time ms: ");
        sb.append(j8);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f15141a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15142b);
        m5.d.K(parcel, 3, 8);
        parcel.writeLong(this.f15143c);
        m5.d.K(parcel, 4, 8);
        parcel.writeLong(this.f15144d);
        m5.d.J(G2, parcel);
    }
}
