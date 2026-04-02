package com.google.android.gms.internal.location;

import X2.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
import p3.AbstractBinderC1660B;
import p3.C;
/* loaded from: classes.dex */
public final class zzj extends a {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    final int zza;
    final zzh zzb;
    final C zzc;
    final zzr zzd;

    public zzj(int i7, zzh zzhVar, IBinder iBinder, IBinder iBinder2) {
        C zzb;
        this.zza = i7;
        this.zzb = zzhVar;
        zzr zzrVar = null;
        if (iBinder == null) {
            zzb = null;
        } else {
            zzb = AbstractBinderC1660B.zzb(iBinder);
        }
        this.zzc = zzb;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzr) {
                zzrVar = (zzr) queryLocalInterface;
            } else {
                zzrVar = new zzp(iBinder2);
            }
        }
        this.zzd = zzrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        int G2 = d.G(20293, parcel);
        int i8 = this.zza;
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.A(parcel, 2, this.zzb, i7, false);
        C c8 = this.zzc;
        IBinder iBinder = null;
        if (c8 == null) {
            asBinder = null;
        } else {
            asBinder = c8.asBinder();
        }
        d.v(parcel, 3, asBinder);
        zzr zzrVar = this.zzd;
        if (zzrVar != null) {
            iBinder = zzrVar.asBinder();
        }
        d.v(parcel, 4, iBinder);
        d.J(G2, parcel);
    }
}
