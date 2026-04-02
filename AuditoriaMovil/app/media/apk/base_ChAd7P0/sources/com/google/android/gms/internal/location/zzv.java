package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.InterfaceC0737k;
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
public interface zzv extends IInterface {
    @Deprecated
    void zzA(Location location);

    void zzB(Location location, InterfaceC0737k interfaceC0737k);

    void zzC(zzr zzrVar);

    void zzD(p pVar, zzab zzabVar, String str);

    void zzE(zzo zzoVar);

    void zzF(zzj zzjVar);

    @Deprecated
    void zzd(j jVar, PendingIntent pendingIntent, zzt zztVar);

    void zze(j jVar, PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k);

    @Deprecated
    void zzf(zzem zzemVar, zzt zztVar);

    void zzg(zzem zzemVar, InterfaceC0737k interfaceC0737k);

    void zzh(long j, boolean z7, PendingIntent pendingIntent);

    void zzi(y yVar, PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k);

    void zzj(C1663c c1663c, PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k);

    void zzk(PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k);

    void zzl(PendingIntent pendingIntent);

    void zzm(PendingIntent pendingIntent, t tVar, InterfaceC0737k interfaceC0737k);

    void zzn(PendingIntent pendingIntent, InterfaceC0737k interfaceC0737k);

    void zzo(u uVar, zzee zzeeVar);

    @Deprecated
    LocationAvailability zzp(String str);

    void zzq(k kVar, zzee zzeeVar);

    @Deprecated
    void zzr(k kVar, zzz zzzVar);

    @Deprecated
    Location zzs();

    InterfaceC0768q zzt(C1664d c1664d, zzee zzeeVar);

    @Deprecated
    InterfaceC0768q zzu(C1664d c1664d, zzz zzzVar);

    @Deprecated
    void zzv(zzei zzeiVar);

    void zzw(zzee zzeeVar, LocationRequest locationRequest, InterfaceC0737k interfaceC0737k);

    void zzx(zzee zzeeVar, InterfaceC0737k interfaceC0737k);

    @Deprecated
    void zzy(boolean z7);

    void zzz(boolean z7, InterfaceC0737k interfaceC0737k);
}
