package a3;

import W2.m;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* renamed from: a3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446b extends X2.a {
    public static final Parcelable.Creator<C0446b> CREATOR = new m(6);

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f6945a;

    public C0446b(PendingIntent pendingIntent) {
        this.f6945a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.A(parcel, 1, this.f6945a, i7, false);
        d.J(G2, parcel);
    }
}
