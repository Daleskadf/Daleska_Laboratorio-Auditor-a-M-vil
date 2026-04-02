package a3;

import W2.m;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
/* renamed from: a3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447c extends X2.a {
    public static final Parcelable.Creator<C0447c> CREATOR = new m(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f6946a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6947b;

    public C0447c(int i7, boolean z7) {
        this.f6946a = i7;
        this.f6947b = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(this.f6946a);
        d.K(parcel, 2, 4);
        parcel.writeInt(this.f6947b ? 1 : 0);
        d.J(G2, parcel);
    }
}
