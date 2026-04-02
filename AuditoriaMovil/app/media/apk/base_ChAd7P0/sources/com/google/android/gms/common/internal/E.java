package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.common.zza;
/* loaded from: classes.dex */
public final class E extends X2.a {
    public static final Parcelable.Creator<E> CREATOR = new android.support.v4.media.session.b(8);

    /* renamed from: a  reason: collision with root package name */
    public final int f9302a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f9303b;

    /* renamed from: c  reason: collision with root package name */
    public final W2.b f9304c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9305d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9306e;

    public E(int i7, IBinder iBinder, W2.b bVar, boolean z7, boolean z8) {
        this.f9302a = i7;
        this.f9303b = iBinder;
        this.f9304c = bVar;
        this.f9305d = z7;
        this.f9306e = z8;
    }

    public final boolean equals(Object obj) {
        Object zzaVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        if (this.f9304c.equals(e7.f9304c)) {
            Object obj2 = null;
            IBinder iBinder = this.f9303b;
            if (iBinder == null) {
                zzaVar = null;
            } else {
                int i7 = AbstractBinderC0752a.f9348a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof InterfaceC0766o) {
                    zzaVar = (InterfaceC0766o) queryLocalInterface;
                } else {
                    zzaVar = new zza(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                }
            }
            IBinder iBinder2 = e7.f9303b;
            if (iBinder2 != null) {
                int i8 = AbstractBinderC0752a.f9348a;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof InterfaceC0766o) {
                    obj2 = (InterfaceC0766o) queryLocalInterface2;
                } else {
                    obj2 = new zza(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
                }
            }
            if (I.m(zzaVar, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.K(parcel, 1, 4);
        parcel.writeInt(this.f9302a);
        m5.d.v(parcel, 2, this.f9303b);
        m5.d.A(parcel, 3, this.f9304c, i7, false);
        m5.d.K(parcel, 4, 4);
        parcel.writeInt(this.f9305d ? 1 : 0);
        m5.d.K(parcel, 5, 4);
        parcel.writeInt(this.f9306e ? 1 : 0);
        m5.d.J(G2, parcel);
    }
}
