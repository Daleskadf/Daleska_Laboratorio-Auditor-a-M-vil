package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1491f extends X2.a {
    public static final Parcelable.Creator<C1491f> CREATOR = new U(17);

    /* renamed from: X  reason: collision with root package name */
    public final b0 f14208X;

    /* renamed from: Y  reason: collision with root package name */
    public final C1485S f14209Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1508w f14210Z;

    /* renamed from: a  reason: collision with root package name */
    public final C1507v f14211a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f14212b;

    /* renamed from: c  reason: collision with root package name */
    public final C1480M f14213c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f14214d;

    /* renamed from: e  reason: collision with root package name */
    public final C1483P f14215e;

    /* renamed from: e0  reason: collision with root package name */
    public final T f14216e0;
    public final C1484Q f;

    public C1491f(C1507v c1507v, a0 a0Var, C1480M c1480m, d0 d0Var, C1483P c1483p, C1484Q c1484q, b0 b0Var, C1485S c1485s, C1508w c1508w, T t7) {
        this.f14211a = c1507v;
        this.f14213c = c1480m;
        this.f14212b = a0Var;
        this.f14214d = d0Var;
        this.f14215e = c1483p;
        this.f = c1484q;
        this.f14208X = b0Var;
        this.f14209Y = c1485s;
        this.f14210Z = c1508w;
        this.f14216e0 = t7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1491f)) {
            return false;
        }
        C1491f c1491f = (C1491f) obj;
        if (!com.google.android.gms.common.internal.I.m(this.f14211a, c1491f.f14211a) || !com.google.android.gms.common.internal.I.m(this.f14212b, c1491f.f14212b) || !com.google.android.gms.common.internal.I.m(this.f14213c, c1491f.f14213c) || !com.google.android.gms.common.internal.I.m(this.f14214d, c1491f.f14214d) || !com.google.android.gms.common.internal.I.m(this.f14215e, c1491f.f14215e) || !com.google.android.gms.common.internal.I.m(this.f, c1491f.f) || !com.google.android.gms.common.internal.I.m(this.f14208X, c1491f.f14208X) || !com.google.android.gms.common.internal.I.m(this.f14209Y, c1491f.f14209Y) || !com.google.android.gms.common.internal.I.m(this.f14210Z, c1491f.f14210Z) || !com.google.android.gms.common.internal.I.m(this.f14216e0, c1491f.f14216e0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14211a, this.f14212b, this.f14213c, this.f14214d, this.f14215e, this.f, this.f14208X, this.f14209Y, this.f14210Z, this.f14216e0});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 2, this.f14211a, i7, false);
        m5.d.A(parcel, 3, this.f14212b, i7, false);
        m5.d.A(parcel, 4, this.f14213c, i7, false);
        m5.d.A(parcel, 5, this.f14214d, i7, false);
        m5.d.A(parcel, 6, this.f14215e, i7, false);
        m5.d.A(parcel, 7, this.f, i7, false);
        m5.d.A(parcel, 8, this.f14208X, i7, false);
        m5.d.A(parcel, 9, this.f14209Y, i7, false);
        m5.d.A(parcel, 10, this.f14210Z, i7, false);
        m5.d.A(parcel, 11, this.f14216e0, i7, false);
        m5.d.J(G2, parcel);
    }
}
