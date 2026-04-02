package p3;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
/* loaded from: classes.dex */
public abstract class H extends zzb implements I {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.location.zza, p3.I] */
    public static I zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof I) {
            return (I) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            zze();
        } else {
            zzc.zzd(parcel);
            zzd((Location) zzc.zza(parcel, Location.CREATOR));
        }
        return true;
    }
}
