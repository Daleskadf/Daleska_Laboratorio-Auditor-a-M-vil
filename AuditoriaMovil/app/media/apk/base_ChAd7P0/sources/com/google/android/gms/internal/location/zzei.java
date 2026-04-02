package com.google.android.gms.internal.location;

import X2.a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
import p3.E;
import p3.F;
import p3.H;
import p3.I;
@Deprecated
/* loaded from: classes.dex */
public final class zzei extends a {
    public static final Parcelable.Creator<zzei> CREATOR = new zzej();
    private final int zza;
    private final zzeg zzb;
    private final I zzc;
    private final F zzd;
    private final PendingIntent zze;
    private final zzr zzf;
    private final String zzg;

    public zzei(int i7, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        I i8;
        F f;
        this.zza = i7;
        this.zzb = zzegVar;
        zzr zzrVar = null;
        if (iBinder != null) {
            i8 = H.zzb(iBinder);
        } else {
            i8 = null;
        }
        this.zzc = i8;
        this.zze = pendingIntent;
        if (iBinder2 != null) {
            f = E.zzb(iBinder2);
        } else {
            f = null;
        }
        this.zzd = f;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzr) {
                zzrVar = (zzr) queryLocalInterface;
            } else {
                zzrVar = new zzp(iBinder3);
            }
        }
        this.zzf = zzrVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        IBinder asBinder;
        IBinder asBinder2;
        int i8 = this.zza;
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.A(parcel, 2, this.zzb, i7, false);
        I i9 = this.zzc;
        IBinder iBinder = null;
        if (i9 == null) {
            asBinder = null;
        } else {
            asBinder = i9.asBinder();
        }
        d.v(parcel, 3, asBinder);
        d.A(parcel, 4, this.zze, i7, false);
        F f = this.zzd;
        if (f == null) {
            asBinder2 = null;
        } else {
            asBinder2 = f.asBinder();
        }
        d.v(parcel, 5, asBinder2);
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            iBinder = zzrVar.asBinder();
        }
        d.v(parcel, 6, iBinder);
        d.B(parcel, 8, this.zzg, false);
        d.J(G2, parcel);
    }
}
