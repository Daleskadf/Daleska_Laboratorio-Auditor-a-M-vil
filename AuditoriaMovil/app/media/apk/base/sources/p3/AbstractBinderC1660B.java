package p3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
/* renamed from: p3.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1660B extends zzb implements C {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.location.zza, p3.C] */
    public static C zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof C) {
            return (C) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzc.zzd(parcel);
            zzd((C1665e) zzc.zza(parcel, C1665e.CREATOR));
            return true;
        }
        return false;
    }
}
