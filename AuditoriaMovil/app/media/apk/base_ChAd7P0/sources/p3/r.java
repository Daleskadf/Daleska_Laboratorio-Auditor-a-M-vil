package p3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import n3.c0;
/* loaded from: classes.dex */
public final class r extends X2.a implements com.google.android.gms.common.api.t {
    public static final Parcelable.Creator<r> CREATOR = new c0(17);

    /* renamed from: a  reason: collision with root package name */
    public final Status f15128a;

    /* renamed from: b  reason: collision with root package name */
    public final s f15129b;

    public r(Status status, s sVar) {
        this.f15128a = status;
        this.f15129b = sVar;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f15128a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f15128a, i7, false);
        m5.d.A(parcel, 2, this.f15129b, i7, false);
        m5.d.J(G2, parcel);
    }
}
