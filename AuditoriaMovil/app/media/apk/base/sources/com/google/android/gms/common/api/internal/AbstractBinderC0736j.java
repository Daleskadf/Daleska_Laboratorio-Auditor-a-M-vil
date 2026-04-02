package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
/* renamed from: com.google.android.gms.common.api.internal.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0736j extends zab implements InterfaceC0737k {
    public AbstractBinderC0736j() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.common.api.internal.k, com.google.android.gms.internal.base.zaa] */
    public static InterfaceC0737k asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        if (queryLocalInterface instanceof InterfaceC0737k) {
            return (InterfaceC0737k) queryLocalInterface;
        }
        return new zaa(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zac.zab(parcel);
            onResult((Status) zac.zaa(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
