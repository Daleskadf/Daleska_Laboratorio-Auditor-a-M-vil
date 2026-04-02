package n3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1499n extends AbstractC1501p {
    public static final Parcelable.Creator<C1499n> CREATOR = new U(25);

    /* renamed from: a  reason: collision with root package name */
    public final C1510y f14238a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f14239b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14240c;

    public C1499n(C1510y c1510y, Uri uri, byte[] bArr) {
        boolean z7;
        boolean z8;
        com.google.android.gms.common.internal.I.i(c1510y);
        this.f14238a = c1510y;
        com.google.android.gms.common.internal.I.i(uri);
        boolean z9 = true;
        if (uri.getScheme() != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        com.google.android.gms.common.internal.I.a("origin scheme must be non-empty", z7);
        if (uri.getAuthority() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        com.google.android.gms.common.internal.I.a("origin authority must be non-empty", z8);
        this.f14239b = uri;
        if (bArr != null && bArr.length != 32) {
            z9 = false;
        }
        com.google.android.gms.common.internal.I.a("clientDataHash must be 32 bytes long", z9);
        this.f14240c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1499n)) {
            return false;
        }
        C1499n c1499n = (C1499n) obj;
        if (!com.google.android.gms.common.internal.I.m(this.f14238a, c1499n.f14238a) || !com.google.android.gms.common.internal.I.m(this.f14239b, c1499n.f14239b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14238a, this.f14239b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 2, this.f14238a, i7, false);
        m5.d.A(parcel, 3, this.f14239b, i7, false);
        m5.d.r(parcel, 4, this.f14240c, false);
        m5.d.J(G2, parcel);
    }
}
