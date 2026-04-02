package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class Y extends X2.a {
    public static final Parcelable.Creator<Y> CREATOR = new U(20);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14198a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14199b;

    public Y(boolean z7, byte[] bArr) {
        this.f14198a = z7;
        this.f14199b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y2 = (Y) obj;
        if (this.f14198a != y2.f14198a || !Arrays.equals(this.f14199b, y2.f14199b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14198a), this.f14199b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f14198a ? 1 : 0);
        m5.d.r(parcel, 2, this.f14199b, false);
        m5.d.J(G2, parcel);
    }
}
