package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1509x extends X2.a {
    public static final Parcelable.Creator<C1509x> CREATOR = new U(1);

    /* renamed from: X  reason: collision with root package name */
    public final C1492g f14247X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f14248Y;

    /* renamed from: a  reason: collision with root package name */
    public final String f14249a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14250b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14251c;

    /* renamed from: d  reason: collision with root package name */
    public final C1495j f14252d;

    /* renamed from: e  reason: collision with root package name */
    public final C1494i f14253e;
    public final C1496k f;

    public C1509x(String str, String str2, byte[] bArr, C1495j c1495j, C1494i c1494i, C1496k c1496k, C1492g c1492g, String str3) {
        boolean z7 = true;
        if ((c1495j == null || c1494i != null || c1496k != null) && ((c1495j != null || c1494i == null || c1496k != null) && (c1495j != null || c1494i != null || c1496k == null))) {
            z7 = false;
        }
        com.google.android.gms.common.internal.I.c(z7);
        this.f14249a = str;
        this.f14250b = str2;
        this.f14251c = bArr;
        this.f14252d = c1495j;
        this.f14253e = c1494i;
        this.f = c1496k;
        this.f14247X = c1492g;
        this.f14248Y = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1509x)) {
            return false;
        }
        C1509x c1509x = (C1509x) obj;
        if (!com.google.android.gms.common.internal.I.m(this.f14249a, c1509x.f14249a) || !com.google.android.gms.common.internal.I.m(this.f14250b, c1509x.f14250b) || !Arrays.equals(this.f14251c, c1509x.f14251c) || !com.google.android.gms.common.internal.I.m(this.f14252d, c1509x.f14252d) || !com.google.android.gms.common.internal.I.m(this.f14253e, c1509x.f14253e) || !com.google.android.gms.common.internal.I.m(this.f, c1509x.f) || !com.google.android.gms.common.internal.I.m(this.f14247X, c1509x.f14247X) || !com.google.android.gms.common.internal.I.m(this.f14248Y, c1509x.f14248Y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14249a, this.f14250b, this.f14251c, this.f14253e, this.f14252d, this.f, this.f14247X, this.f14248Y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f14249a, false);
        m5.d.B(parcel, 2, this.f14250b, false);
        m5.d.r(parcel, 3, this.f14251c, false);
        m5.d.A(parcel, 4, this.f14252d, i7, false);
        m5.d.A(parcel, 5, this.f14253e, i7, false);
        m5.d.A(parcel, 6, this.f, i7, false);
        m5.d.A(parcel, 7, this.f14247X, i7, false);
        m5.d.B(parcel, 8, this.f14248Y, false);
        m5.d.J(G2, parcel);
    }
}
