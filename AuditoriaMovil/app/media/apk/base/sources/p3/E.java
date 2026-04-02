package p3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* loaded from: classes.dex */
public abstract class E extends zzb implements F {
    /* JADX WARN: Type inference failed for: r1v1, types: [p3.F, com.google.android.gms.internal.location.zza] */
    public static F zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof F) {
            return (F) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return false;
                }
                zzf();
            } else {
                zzc.zzd(parcel);
                zze((LocationAvailability) zzc.zza(parcel, LocationAvailability.CREATOR));
            }
        } else {
            zzc.zzd(parcel);
            zzd((LocationResult) zzc.zza(parcel, LocationResult.CREATOR));
        }
        return true;
    }
}
