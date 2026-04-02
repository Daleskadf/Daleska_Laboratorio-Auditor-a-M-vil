package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1473F extends X2.a {
    public static final Parcelable.Creator<C1473F> CREATOR = new U(7);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14180a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14181b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14182c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14183d;

    public C1473F(String str, String str2, String str3, byte[] bArr) {
        com.google.android.gms.common.internal.I.i(bArr);
        this.f14180a = bArr;
        com.google.android.gms.common.internal.I.i(str);
        this.f14181b = str;
        this.f14182c = str2;
        com.google.android.gms.common.internal.I.i(str3);
        this.f14183d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1473F)) {
            return false;
        }
        C1473F c1473f = (C1473F) obj;
        if (!Arrays.equals(this.f14180a, c1473f.f14180a) || !com.google.android.gms.common.internal.I.m(this.f14181b, c1473f.f14181b) || !com.google.android.gms.common.internal.I.m(this.f14182c, c1473f.f14182c) || !com.google.android.gms.common.internal.I.m(this.f14183d, c1473f.f14183d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14180a, this.f14181b, this.f14182c, this.f14183d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.r(parcel, 2, this.f14180a, false);
        m5.d.B(parcel, 3, this.f14181b, false);
        m5.d.B(parcel, 4, this.f14182c, false);
        m5.d.B(parcel, 5, this.f14183d, false);
        m5.d.J(G2, parcel);
    }
}
