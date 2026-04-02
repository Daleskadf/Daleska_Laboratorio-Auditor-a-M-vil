package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC0737k;
import com.google.android.gms.common.internal.AbstractBinderC0767p;
import com.google.android.gms.common.internal.InterfaceC0768q;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import p3.C1663c;
import p3.C1664d;
import p3.j;
import p3.k;
import p3.p;
import p3.t;
import p3.u;
import p3.y;
/* loaded from: classes.dex */
public final class zzu extends zza implements zzv {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzA(Location location) {
        Parcel zza = zza();
        zzc.zzb(zza, location);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzB(Location location, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, location);
        zzc.zzc(zza, interfaceC0737k);
        zzc(85, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzC(zzr zzrVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzrVar);
        zzc(67, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzD(p pVar, zzab zzabVar, String str) {
        Parcel zza = zza();
        zzc.zzb(zza, pVar);
        zzc.zzc(zza, zzabVar);
        zza.writeString(null);
        zzc(63, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzE(zzo zzoVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzoVar);
        zzc(95, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzF(zzj zzjVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzjVar);
        zzc(75, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzd(j jVar, PendingIntent pendingIntent, zzt zztVar) {
        Parcel zza = zza();
        zzc.zzb(zza, jVar);
        zzc.zzb(zza, pendingIntent);
        zzc.zzc(zza, zztVar);
        zzc(57, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zze(j jVar, PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, jVar);
        zzc.zzb(zza, pendingIntent);
        zzc.zzc(zza, interfaceC0737k);
        zzc(97, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzf(zzem zzemVar, zzt zztVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzemVar);
        zzc.zzc(zza, zztVar);
        zzc(74, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzg(zzem zzemVar, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, zzemVar);
        zzc.zzc(zza, interfaceC0737k);
        zzc(98, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzh(long j, boolean z7, PendingIntent pendingIntent) {
        Parcel zza = zza();
        zza.writeLong(j);
        int i7 = zzc.zza;
        zza.writeInt(1);
        zzc.zzb(zza, pendingIntent);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzi(y yVar, PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, yVar);
        zzc.zzb(zza, pendingIntent);
        zzc.zzc(zza, interfaceC0737k);
        zzc(70, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzj(C1663c c1663c, PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, c1663c);
        zzc.zzb(zza, pendingIntent);
        zzc.zzc(zza, interfaceC0737k);
        zzc(72, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzk(PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, pendingIntent);
        zzc.zzc(zza, interfaceC0737k);
        zzc(73, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzl(PendingIntent pendingIntent) {
        Parcel zza = zza();
        zzc.zzb(zza, pendingIntent);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzm(PendingIntent pendingIntent, t tVar, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, pendingIntent);
        zzc.zzb(zza, tVar);
        zzc.zzc(zza, interfaceC0737k);
        zzc(79, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzn(PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, pendingIntent);
        zzc.zzc(zza, interfaceC0737k);
        zzc(69, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzo(u uVar, zzee zzeeVar) {
        Parcel zza = zza();
        zzc.zzb(zza, uVar);
        zzc.zzb(zza, zzeeVar);
        zzc(91, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final LocationAvailability zzp(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(34, zza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(zzb, LocationAvailability.CREATOR);
        zzb.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzq(k kVar, zzee zzeeVar) {
        Parcel zza = zza();
        zzc.zzb(zza, kVar);
        zzc.zzb(zza, zzeeVar);
        zzc(90, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzr(k kVar, zzz zzzVar) {
        Parcel zza = zza();
        zzc.zzb(zza, kVar);
        zzc.zzc(zza, zzzVar);
        zzc(82, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final Location zzs() {
        Parcel zzb = zzb(7, zza());
        Location location = (Location) zzc.zza(zzb, Location.CREATOR);
        zzb.recycle();
        return location;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.common.internal.q] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // com.google.android.gms.internal.location.zzv
    public final InterfaceC0768q zzt(C1664d c1664d, zzee zzeeVar) {
        InterfaceC0768q zzaVar;
        Parcel zza = zza();
        zzc.zzb(zza, c1664d);
        zzc.zzb(zza, zzeeVar);
        Parcel zzb = zzb(92, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        int i7 = AbstractBinderC0767p.f9385a;
        if (readStrongBinder == null) {
            zzaVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof InterfaceC0768q) {
                zzaVar = (InterfaceC0768q) queryLocalInterface;
            } else {
                zzaVar = new com.google.android.gms.internal.common.zza(readStrongBinder, "com.google.android.gms.common.internal.ICancelToken");
            }
        }
        zzb.recycle();
        return zzaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.common.internal.q] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // com.google.android.gms.internal.location.zzv
    public final InterfaceC0768q zzu(C1664d c1664d, zzz zzzVar) {
        InterfaceC0768q zzaVar;
        Parcel zza = zza();
        zzc.zzb(zza, c1664d);
        zzc.zzc(zza, zzzVar);
        Parcel zzb = zzb(87, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        int i7 = AbstractBinderC0767p.f9385a;
        if (readStrongBinder == null) {
            zzaVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof InterfaceC0768q) {
                zzaVar = (InterfaceC0768q) queryLocalInterface;
            } else {
                zzaVar = new com.google.android.gms.internal.common.zza(readStrongBinder, "com.google.android.gms.common.internal.ICancelToken");
            }
        }
        zzb.recycle();
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzv(zzei zzeiVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzeiVar);
        zzc(59, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzw(zzee zzeeVar, LocationRequest locationRequest, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, zzeeVar);
        zzc.zzb(zza, locationRequest);
        zzc.zzc(zza, interfaceC0737k);
        zzc(88, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzx(zzee zzeeVar, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        zzc.zzb(zza, zzeeVar);
        zzc.zzc(zza, interfaceC0737k);
        zzc(89, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzy(boolean z7) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.location.zzv
    public final void zzz(boolean z7, InterfaceC0737k interfaceC0737k) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc.zzc(zza, interfaceC0737k);
        zzc(84, zza);
    }
}
