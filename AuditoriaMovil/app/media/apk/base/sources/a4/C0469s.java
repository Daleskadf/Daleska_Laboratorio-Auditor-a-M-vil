package a4;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: a4.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469s extends AbstractC0456e {
    public static final Parcelable.Creator<C0469s> CREATOR = new W2.m(9);

    /* renamed from: a  reason: collision with root package name */
    public final String f7046a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7047b;

    public C0469s(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f7046a = str;
        this.f7047b = str2;
    }

    @Override // a4.AbstractC0456e
    public final String k() {
        return "google.com";
    }

    @Override // a4.AbstractC0456e
    public final String l() {
        return "google.com";
    }

    @Override // a4.AbstractC0456e
    public final AbstractC0456e m() {
        return new C0469s(this.f7046a, this.f7047b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.B(parcel, 1, this.f7046a, false);
        m5.d.B(parcel, 2, this.f7047b, false);
        m5.d.J(G2, parcel);
    }
}
