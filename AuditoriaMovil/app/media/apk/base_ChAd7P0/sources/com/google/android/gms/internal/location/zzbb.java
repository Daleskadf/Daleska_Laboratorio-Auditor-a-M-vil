package com.google.android.gms.internal.location;

import a.AbstractC0412a;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.I;
import com.google.android.gms.common.api.internal.InterfaceC0732f;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.m;
/* loaded from: classes.dex */
public final class zzbb {
    public static /* synthetic */ TaskCompletionSource zza(final InterfaceC0732f interfaceC0732f) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzbd
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                InterfaceC0732f interfaceC0732f2 = InterfaceC0732f.this;
                if (task.isSuccessful()) {
                    interfaceC0732f2.setResult(Status.f9152e);
                } else if (task.isCanceled()) {
                    interfaceC0732f2.setFailedResult(Status.f9151Z);
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof j) {
                        interfaceC0732f2.setFailedResult(((j) exception).getStatus());
                    } else {
                        interfaceC0732f2.setFailedResult(Status.f9149X);
                    }
                }
            }
        });
        return taskCompletionSource;
    }

    public final r flushLocations(o oVar) {
        return ((I) oVar).f9188b.doWrite((l) new zzaq(this, oVar));
    }

    public final Location getLastLocation(o oVar) {
        boolean z7;
        if (oVar != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        com.google.android.gms.common.internal.I.a("GoogleApiClient parameter is required.", z7);
        i iVar = zzbi.zzb;
        oVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final LocationAvailability getLocationAvailability(o oVar) {
        boolean z7;
        if (oVar != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        com.google.android.gms.common.internal.I.a("GoogleApiClient parameter is required.", z7);
        i iVar = zzbi.zzb;
        oVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final r removeLocationUpdates(o oVar, PendingIntent pendingIntent) {
        return ((I) oVar).f9188b.doWrite((l) new zzav(this, oVar, pendingIntent));
    }

    public final r requestLocationUpdates(o oVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return ((I) oVar).f9188b.doWrite((l) new zzat(this, oVar, pendingIntent, locationRequest));
    }

    public final r setMockLocation(o oVar, Location location) {
        return ((I) oVar).f9188b.doWrite((l) new zzay(this, oVar, location));
    }

    public final r setMockMode(o oVar, boolean z7) {
        return ((I) oVar).f9188b.doWrite((l) new zzax(this, oVar, z7));
    }

    public final r removeLocationUpdates(o oVar, p3.l lVar) {
        return ((I) oVar).f9188b.doWrite((l) new zzaw(this, oVar, lVar));
    }

    public final r requestLocationUpdates(o oVar, LocationRequest locationRequest, p3.l lVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            com.google.android.gms.common.internal.I.j(looper, "invalid null looper");
        }
        return ((I) oVar).f9188b.doWrite((l) new zzas(this, oVar, AbstractC0412a.h(looper, lVar, p3.l.class.getSimpleName()), locationRequest));
    }

    public final r removeLocationUpdates(o oVar, m mVar) {
        return ((I) oVar).f9188b.doWrite((l) new zzau(this, oVar, mVar));
    }

    public final r requestLocationUpdates(o oVar, LocationRequest locationRequest, m mVar) {
        Looper myLooper = Looper.myLooper();
        com.google.android.gms.common.internal.I.j(myLooper, "invalid null looper");
        return ((I) oVar).f9188b.doWrite((l) new zzar(this, oVar, AbstractC0412a.h(myLooper, mVar, m.class.getSimpleName()), locationRequest));
    }

    public final r requestLocationUpdates(o oVar, LocationRequest locationRequest, m mVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            com.google.android.gms.common.internal.I.j(looper, "invalid null looper");
        }
        return ((I) oVar).f9188b.doWrite((l) new zzar(this, oVar, AbstractC0412a.h(looper, mVar, m.class.getSimpleName()), locationRequest));
    }
}
