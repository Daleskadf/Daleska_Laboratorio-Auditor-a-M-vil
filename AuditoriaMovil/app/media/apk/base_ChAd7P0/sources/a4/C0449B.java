package a4;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: a4.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449B extends AbstractC0456e {
    public static final Parcelable.Creator<C0449B> CREATOR = new W2.m(13);

    /* renamed from: a  reason: collision with root package name */
    public final String f6952a;

    public C0449B(String str) {
        com.google.android.gms.common.internal.I.e(str);
        this.f6952a = str;
    }

    @Override // a4.AbstractC0456e
    public final String k() {
        return "playgames.google.com";
    }

    @Override // a4.AbstractC0456e
    public final String l() {
        return "playgames.google.com";
    }

    @Override // a4.AbstractC0456e
    public final AbstractC0456e m() {
        return new C0449B(this.f6952a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f6952a, false);
        m5.d.J(G2, parcel);
    }
}
