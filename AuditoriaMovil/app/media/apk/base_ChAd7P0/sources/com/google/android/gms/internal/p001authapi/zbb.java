package com.google.android.gms.internal.p001authapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.google.android.gms.internal.auth-api.zbb  reason: invalid package */
/* loaded from: classes.dex */
public class zbb extends Binder implements IInterface {
    public zbb(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 > 16777215) {
            if (super.onTransact(i7, parcel, parcel2, i8)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zba(i7, parcel, parcel2, i8);
    }

    public boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        throw null;
    }
}
