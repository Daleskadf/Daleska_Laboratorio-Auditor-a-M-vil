package a4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class r extends AbstractC0456e {
    public static final Parcelable.Creator<r> CREATOR = new W2.m(8);

    /* renamed from: a  reason: collision with root package name */
    public final String f7045a;

    public r(String str) {
        com.google.android.gms.common.internal.I.e(str);
        this.f7045a = str;
    }

    @Override // a4.AbstractC0456e
    public final String k() {
        return "github.com";
    }

    @Override // a4.AbstractC0456e
    public final String l() {
        return "github.com";
    }

    @Override // a4.AbstractC0456e
    public final AbstractC0456e m() {
        return new r(this.f7045a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f7045a, false);
        m5.d.J(G2, parcel);
    }
}
