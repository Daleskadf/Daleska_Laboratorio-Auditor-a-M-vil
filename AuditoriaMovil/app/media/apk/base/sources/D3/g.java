package d3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class g extends X2.a {
    public static final Parcelable.Creator<g> CREATOR = new android.support.v4.media.session.b(14);

    /* renamed from: a  reason: collision with root package name */
    public final int f10316a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10317b;

    /* renamed from: c  reason: collision with root package name */
    public final C0896a f10318c;

    public g(C0896a c0896a, String str) {
        this.f10316a = 1;
        this.f10317b = str;
        this.f10318c = c0896a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f10316a);
        m5.d.B(parcel, 2, this.f10317b, false);
        m5.d.A(parcel, 3, this.f10318c, i7, false);
        m5.d.J(G2, parcel);
    }

    public g(C0896a c0896a, String str, int i7) {
        this.f10316a = i7;
        this.f10317b = str;
        this.f10318c = c0896a;
    }
}
