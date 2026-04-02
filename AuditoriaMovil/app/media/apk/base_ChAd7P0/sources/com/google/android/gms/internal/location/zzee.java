package com.google.android.gms.internal.location;

import X2.a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
import p3.F;
import p3.I;
/* loaded from: classes.dex */
public final class zzee extends a {
    public static final Parcelable.Creator<zzee> CREATOR = new zzef();
    private final int zza;
    private final IBinder zzb;
    private final IBinder zzc;
    private final PendingIntent zzd;
    private final String zze;

    public zzee(int i7, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.zza = i7;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [p3.I, android.os.IBinder] */
    public static zzee zza(IInterface iInterface, I i7, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzee(1, iInterface, i7, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [p3.F, android.os.IBinder] */
    public static zzee zzb(IInterface iInterface, F f, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzee(2, iInterface, f, null, str);
    }

    public static zzee zzc(PendingIntent pendingIntent) {
        return new zzee(3, null, null, pendingIntent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzee zzd(zzz zzzVar) {
        return new zzee(4, null, zzzVar, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(i8);
        d.v(parcel, 2, this.zzb);
        d.v(parcel, 3, this.zzc);
        d.A(parcel, 4, this.zzd, i7, false);
        d.B(parcel, 6, this.zze, false);
        d.J(G2, parcel);
    }
}
