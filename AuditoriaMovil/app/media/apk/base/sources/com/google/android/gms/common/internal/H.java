package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class H implements r {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f9312a;

    public H(IBinder iBinder) {
        this.f9312a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9312a;
    }

    public final void b(K k2, C0762k c0762k) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(k2.asBinder());
            obtain.writeInt(1);
            android.support.v4.media.session.b.a(c0762k, obtain, 0);
            this.f9312a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
