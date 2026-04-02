package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.google.android.gms.common.internal.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773w extends X2.a {
    public static final Parcelable.Creator<C0773w> CREATOR = new android.support.v4.media.session.b(9);

    /* renamed from: a  reason: collision with root package name */
    public final int f9400a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9401b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9402c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9403d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9404e;

    public C0773w(int i7, boolean z7, boolean z8, int i8, int i9) {
        this.f9400a = i7;
        this.f9401b = z7;
        this.f9402c = z8;
        this.f9403d = i8;
        this.f9404e = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f9400a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f9401b ? 1 : 0);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f9402c ? 1 : 0);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f9403d);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f9404e);
        m5.d.J(G2, parcel);
    }
}
