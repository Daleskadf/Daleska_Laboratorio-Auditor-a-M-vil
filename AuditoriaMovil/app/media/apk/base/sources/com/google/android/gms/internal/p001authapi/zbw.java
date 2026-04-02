package com.google.android.gms.internal.p001authapi;

import R2.f;
import R2.i;
import R2.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC0737k;
/* renamed from: com.google.android.gms.internal.auth-api.zbw  reason: invalid package */
/* loaded from: classes.dex */
public final class zbw extends zba implements IInterface {
    public zbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbm zbmVar, f fVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbmVar);
        zbc.zbc(zba, fVar);
        zbb(1, zba);
    }

    public final void zbd(zbp zbpVar, i iVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbpVar);
        zbc.zbc(zba, iVar);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbr zbrVar, j jVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbrVar);
        zbc.zbc(zba, jVar);
        zbb(3, zba);
    }

    public final void zbf(InterfaceC0737k interfaceC0737k, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC0737k);
        zba.writeString(str);
        zbb(2, zba);
    }
}
