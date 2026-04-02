package s3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class z extends X2.a {
    public static final Parcelable.Creator<z> CREATOR = new C1770E(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f15684a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15685b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f15686c;

    public z(byte[] bArr, int i7, int i8) {
        this.f15684a = i7;
        this.f15685b = i8;
        this.f15686c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15684a);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f15685b);
        m5.d.r(parcel, 4, this.f15686c, false);
        m5.d.J(G2, parcel);
    }
}
