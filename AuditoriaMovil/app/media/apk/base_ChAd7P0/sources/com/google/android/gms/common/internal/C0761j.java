package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.google.android.gms.common.internal.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761j extends X2.a {
    public static final Parcelable.Creator<C0761j> CREATOR = new android.support.v4.media.session.b(11);

    /* renamed from: a  reason: collision with root package name */
    public final C0773w f9360a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9361b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9362c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f9363d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9364e;
    public final int[] f;

    public C0761j(C0773w c0773w, boolean z7, boolean z8, int[] iArr, int i7, int[] iArr2) {
        this.f9360a = c0773w;
        this.f9361b = z7;
        this.f9362c = z8;
        this.f9363d = iArr;
        this.f9364e = i7;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 1, this.f9360a, i7, false);
        m5.d.K(parcel, 2, 4);
        parcel.writeInt(this.f9361b ? 1 : 0);
        m5.d.K(parcel, 3, 4);
        parcel.writeInt(this.f9362c ? 1 : 0);
        m5.d.x(parcel, 4, this.f9363d, false);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f9364e);
        m5.d.x(parcel, 6, this.f, false);
        m5.d.J(G2, parcel);
    }
}
