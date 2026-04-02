package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.google.android.gms.common.internal.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770t extends X2.a {
    public static final Parcelable.Creator<C0770t> CREATOR = new android.support.v4.media.session.b(6);

    /* renamed from: X  reason: collision with root package name */
    public final String f9389X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f9390Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f9391Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f9392a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9393b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9394c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9395d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9396e;
    public final String f;

    public C0770t(int i7, int i8, int i9, long j, long j8, String str, String str2, int i10, int i11) {
        this.f9392a = i7;
        this.f9393b = i8;
        this.f9394c = i9;
        this.f9395d = j;
        this.f9396e = j8;
        this.f = str;
        this.f9389X = str2;
        this.f9390Y = i10;
        this.f9391Z = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f9392a);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f9393b);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f9394c);
        m5.d.K(parcel, 4, 8);
        parcel.writeLong(this.f9395d);
        m5.d.K(parcel, 5, 8);
        parcel.writeLong(this.f9396e);
        m5.d.B(parcel, 6, this.f, false);
        m5.d.B(parcel, 7, this.f9389X, false);
        m5.d.K(parcel, 8, 4);
        parcel.writeInt(this.f9390Y);
        m5.d.K(parcel, 9, 4);
        parcel.writeInt(this.f9391Z);
        m5.d.J(G2, parcel);
    }
}
