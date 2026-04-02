package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1470C extends X2.a {
    public static final Parcelable.Creator<C1470C> CREATOR = new U(5);

    /* renamed from: a  reason: collision with root package name */
    public final String f14177a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14178b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14179c;

    public C1470C(String str, String str2, String str3) {
        com.google.android.gms.common.internal.I.i(str);
        this.f14177a = str;
        com.google.android.gms.common.internal.I.i(str2);
        this.f14178b = str2;
        this.f14179c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1470C)) {
            return false;
        }
        C1470C c1470c = (C1470C) obj;
        if (!com.google.android.gms.common.internal.I.m(this.f14177a, c1470c.f14177a) || !com.google.android.gms.common.internal.I.m(this.f14178b, c1470c.f14178b) || !com.google.android.gms.common.internal.I.m(this.f14179c, c1470c.f14179c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14177a, this.f14178b, this.f14179c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 2, this.f14177a, false);
        m5.d.B(parcel, 3, this.f14178b, false);
        m5.d.B(parcel, 4, this.f14179c, false);
        m5.d.J(G2, parcel);
    }
}
