package v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import s3.C1770E;
/* loaded from: classes.dex */
public final class g extends X2.a {
    public static final Parcelable.Creator<g> CREATOR = new C1770E(21);

    /* renamed from: a  reason: collision with root package name */
    public final int f16051a;

    /* renamed from: b  reason: collision with root package name */
    public final W2.b f16052b;

    /* renamed from: c  reason: collision with root package name */
    public final E f16053c;

    public g(int i7, W2.b bVar, E e7) {
        this.f16051a = i7;
        this.f16052b = bVar;
        this.f16053c = e7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f16051a);
        m5.d.A(parcel, 2, this.f16052b, i7, false);
        m5.d.A(parcel, 3, this.f16053c, i7, false);
        m5.d.J(G2, parcel);
    }
}
