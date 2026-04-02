package n3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500o extends AbstractC1501p {
    public static final Parcelable.Creator<C1500o> CREATOR = new U(26);

    /* renamed from: a  reason: collision with root package name */
    public final C1469B f14241a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f14242b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14243c;

    public C1500o(C1469B c1469b, Uri uri, byte[] bArr) {
        boolean z7;
        boolean z8;
        com.google.android.gms.common.internal.I.i(c1469b);
        this.f14241a = c1469b;
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
        this.f14242b = uri;
        if (bArr != null && bArr.length != 32) {
            z9 = false;
        }
        com.google.android.gms.common.internal.I.a("clientDataHash must be 32 bytes long", z9);
        this.f14243c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1500o)) {
            return false;
        }
        C1500o c1500o = (C1500o) obj;
        if (!com.google.android.gms.common.internal.I.m(this.f14241a, c1500o.f14241a) || !com.google.android.gms.common.internal.I.m(this.f14242b, c1500o.f14242b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14241a, this.f14242b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 2, this.f14241a, i7, false);
        m5.d.A(parcel, 3, this.f14242b, i7, false);
        m5.d.r(parcel, 4, this.f14243c, false);
        m5.d.J(G2, parcel);
    }
}
