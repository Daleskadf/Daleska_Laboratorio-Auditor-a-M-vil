package s3;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: s3.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1790r extends X2.a {
    public static final Parcelable.Creator<C1790r> CREATOR = new C1770E(15);

    /* renamed from: a  reason: collision with root package name */
    public final int f15650a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15651b;

    /* renamed from: c  reason: collision with root package name */
    public final C1789q f15652c;

    public C1790r(int i7, int i8, C1789q c1789q) {
        this.f15650a = i7;
        this.f15651b = i8;
        this.f15652c = c1789q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15650a);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f15651b);
        m5.d.A(parcel, 4, this.f15652c, i7, false);
        m5.d.J(G2, parcel);
    }
}
