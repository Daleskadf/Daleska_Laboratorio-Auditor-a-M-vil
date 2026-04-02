package p3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import n3.c0;
/* loaded from: classes.dex */
public final class y extends X2.a {
    public static final Parcelable.Creator<y> CREATOR = new c0(22);

    /* renamed from: X  reason: collision with root package name */
    public final String f15149X;

    /* renamed from: Y  reason: collision with root package name */
    public final long f15150Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f15151Z;

    /* renamed from: a  reason: collision with root package name */
    public final long f15152a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15153b;

    /* renamed from: c  reason: collision with root package name */
    public final WorkSource f15154c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15155d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f15156e;
    public final boolean f;

    public y(long j, boolean z7, WorkSource workSource, String str, int[] iArr, boolean z8, String str2, long j8, String str3) {
        this.f15152a = j;
        this.f15153b = z7;
        this.f15154c = workSource;
        this.f15155d = str;
        this.f15156e = iArr;
        this.f = z8;
        this.f15149X = str2;
        this.f15150Y = j8;
        this.f15151Z = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        com.google.android.gms.common.internal.I.i(parcel);
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 8);
        parcel.writeLong(this.f15152a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f15153b ? 1 : 0);
        m5.d.A(parcel, 3, this.f15154c, i7, false);
        m5.d.B(parcel, 4, this.f15155d, false);
        m5.d.x(parcel, 5, this.f15156e, false);
        m5.d.K(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        m5.d.B(parcel, 7, this.f15149X, false);
        m5.d.K(parcel, 8, 8);
        parcel.writeLong(this.f15150Y);
        m5.d.B(parcel, 9, this.f15151Z, false);
        m5.d.J(G2, parcel);
    }
}
