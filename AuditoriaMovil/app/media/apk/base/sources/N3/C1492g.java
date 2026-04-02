package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492g extends X2.a {
    public static final Parcelable.Creator<C1492g> CREATOR = new U(16);

    /* renamed from: a  reason: collision with root package name */
    public final C1481N f14217a;

    /* renamed from: b  reason: collision with root package name */
    public final X f14218b;

    /* renamed from: c  reason: collision with root package name */
    public final C1493h f14219c;

    /* renamed from: d  reason: collision with root package name */
    public final Y f14220d;

    public C1492g(C1481N c1481n, X x7, C1493h c1493h, Y y2) {
        this.f14217a = c1481n;
        this.f14218b = x7;
        this.f14219c = c1493h;
        this.f14220d = y2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1492g)) {
            return false;
        }
        C1492g c1492g = (C1492g) obj;
        if (!com.google.android.gms.common.internal.I.m(this.f14217a, c1492g.f14217a) || !com.google.android.gms.common.internal.I.m(this.f14218b, c1492g.f14218b) || !com.google.android.gms.common.internal.I.m(this.f14219c, c1492g.f14219c) || !com.google.android.gms.common.internal.I.m(this.f14220d, c1492g.f14220d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14217a, this.f14218b, this.f14219c, this.f14220d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f14217a, i7, false);
        m5.d.A(parcel, 2, this.f14218b, i7, false);
        m5.d.A(parcel, 3, this.f14219c, i7, false);
        m5.d.A(parcel, 4, this.f14220d, i7, false);
        m5.d.J(G2, parcel);
    }
}
