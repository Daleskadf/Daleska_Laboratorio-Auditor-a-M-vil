package p3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n3.c0;
import org.apache.tika.utils.StringUtils;
/* renamed from: p3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1667g extends X2.a {
    public static final Parcelable.Creator<C1667g> CREATOR = new c0(27);

    /* renamed from: a  reason: collision with root package name */
    public final long f15103a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15104b;

    public C1667g(long j, boolean z7) {
        this.f15103a = j;
        this.f15104b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1667g)) {
            return false;
        }
        C1667g c1667g = (C1667g) obj;
        if (this.f15103a == c1667g.f15103a && this.f15104b == c1667g.f15104b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15103a), Boolean.valueOf(this.f15104b)});
    }

    public final String toString() {
        String str;
        long j = this.f15103a;
        int length = String.valueOf(j).length();
        if (true != this.f15104b) {
            str = StringUtils.EMPTY;
        } else {
            str = ", withVelocity";
        }
        StringBuilder sb = new StringBuilder(str.length() + length + 46 + 1);
        sb.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb.append(j);
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 2, 8);
        parcel.writeLong(this.f15103a);
        m5.d.K(parcel, 6, 4);
        parcel.writeInt(this.f15104b ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
