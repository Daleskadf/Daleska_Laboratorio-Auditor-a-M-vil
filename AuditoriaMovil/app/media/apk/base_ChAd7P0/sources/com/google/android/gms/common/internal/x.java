package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public final class x extends X2.a {
    public static final Parcelable.Creator<x> CREATOR = new android.support.v4.media.session.b(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f9405a;

    /* renamed from: b  reason: collision with root package name */
    public List f9406b;

    public x(int i7, List list) {
        this.f9405a = i7;
        this.f9406b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f9405a);
        m5.d.F(parcel, 2, this.f9406b, false);
        m5.d.J(G2, parcel);
    }
}
