package a4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class E extends AbstractC0456e {
    public static final Parcelable.Creator<E> CREATOR = new W2.m(15);

    /* renamed from: a  reason: collision with root package name */
    public final String f6960a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6961b;

    public E(String str, String str2) {
        com.google.android.gms.common.internal.I.e(str);
        this.f6960a = str;
        com.google.android.gms.common.internal.I.e(str2);
        this.f6961b = str2;
    }

    @Override // a4.AbstractC0456e
    public final String k() {
        return "twitter.com";
    }

    @Override // a4.AbstractC0456e
    public final String l() {
        return "twitter.com";
    }

    @Override // a4.AbstractC0456e
    public final AbstractC0456e m() {
        return new E(this.f6960a, this.f6961b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f6960a, false);
        m5.d.B(parcel, 2, this.f6961b, false);
        m5.d.J(G2, parcel);
    }
}
