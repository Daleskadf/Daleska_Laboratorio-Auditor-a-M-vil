package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class O extends X2.a {
    public static final Parcelable.Creator<O> CREATOR = new android.support.v4.media.session.b(10);

    /* renamed from: a  reason: collision with root package name */
    public Bundle f9324a;

    /* renamed from: b  reason: collision with root package name */
    public W2.d[] f9325b;

    /* renamed from: c  reason: collision with root package name */
    public int f9326c;

    /* renamed from: d  reason: collision with root package name */
    public C0761j f9327d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.q(parcel, 1, this.f9324a, false);
        m5.d.E(parcel, 2, this.f9325b, i7);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f9326c);
        m5.d.A(parcel, 4, this.f9327d, i7, false);
        m5.d.J(G2, parcel);
    }
}
