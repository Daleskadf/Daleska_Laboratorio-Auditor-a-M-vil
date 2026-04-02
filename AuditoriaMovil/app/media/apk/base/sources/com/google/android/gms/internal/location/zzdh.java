package com.google.android.gms.internal.location;

import a.AbstractC0412a;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p3.l;
/* loaded from: classes.dex */
final class zzdh extends l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzdz zzb;

    public zzdh(zzdz zzdzVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        this.zzb = zzdzVar;
    }

    @Override // p3.l
    public final void onLocationResult(LocationResult locationResult) {
        Location location;
        TaskCompletionSource taskCompletionSource = this.zza;
        List list = locationResult.f9440a;
        int size = list.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) list.get(size - 1);
        }
        taskCompletionSource.trySetResult(location);
        try {
            this.zzb.zzw(AbstractC0412a.j(this, "GetCurrentLocation"), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }
}
