package a4;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: a4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458g extends AbstractC0456e {
    public static final Parcelable.Creator<C0458g> CREATOR = new W2.m(21);

    /* renamed from: a  reason: collision with root package name */
    public final String f7034a;

    public C0458g(String str) {
        com.google.android.gms.common.internal.I.e(str);
        this.f7034a = str;
    }

    @Override // a4.AbstractC0456e
    public final String k() {
        return "facebook.com";
    }

    @Override // a4.AbstractC0456e
    public final String l() {
        return "facebook.com";
    }

    @Override // a4.AbstractC0456e
    public final AbstractC0456e m() {
        return new C0458g(this.f7034a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f7034a, false);
        m5.d.J(G2, parcel);
    }
}
