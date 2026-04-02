package r3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.GoogleMapOptions;
/* renamed from: r3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1741e extends zza {
    /* JADX WARN: Multi-variable type inference failed */
    public final C1737a b() {
        C1737a zzaVar;
        Parcel zzJ = zzJ(4, zza());
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzaVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof C1737a) {
                zzaVar = (C1737a) queryLocalInterface;
            } else {
                zzaVar = new zza(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            }
        }
        zzJ.recycle();
        return zzaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1743g c(i3.b bVar, GoogleMapOptions googleMapOptions) {
        C1743g zzaVar;
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zzc.zzd(zza, googleMapOptions);
        Parcel zzJ = zzJ(3, zza);
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzaVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof C1743g) {
                zzaVar = (C1743g) queryLocalInterface;
            } else {
                zzaVar = new zza(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
            }
        }
        zzJ.recycle();
        return zzaVar;
    }
}
