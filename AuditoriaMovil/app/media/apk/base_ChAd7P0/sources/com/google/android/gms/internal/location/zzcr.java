package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0732f;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;
import p3.InterfaceC1669i;
/* loaded from: classes.dex */
public final class zzcr {
    public static /* synthetic */ TaskCompletionSource zza(final InterfaceC0732f interfaceC0732f) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzcs
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

    @Deprecated
    public final r addGeofences(o oVar, List<InterfaceC1669i> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1669i interfaceC1669i : list) {
            I.a("Geofence must be created using Geofence.Builder.", interfaceC1669i instanceof zzek);
            arrayList.add((zzek) interfaceC1669i);
        }
        I.a("No geofence has been added to this request.", !arrayList.isEmpty());
        return ((com.google.android.gms.common.api.internal.I) oVar).f9188b.doWrite((l) new zzcn(this, oVar, new p3.j(5, null, new ArrayList(arrayList)), pendingIntent));
    }

    public final r removeGeofences(o oVar, PendingIntent pendingIntent) {
        return ((com.google.android.gms.common.api.internal.I) oVar).f9188b.doWrite((l) new zzco(this, oVar, pendingIntent));
    }

    public final r removeGeofences(o oVar, List<String> list) {
        return ((com.google.android.gms.common.api.internal.I) oVar).f9188b.doWrite((l) new zzcp(this, oVar, list));
    }

    public final r addGeofences(o oVar, p3.j jVar, PendingIntent pendingIntent) {
        return ((com.google.android.gms.common.api.internal.I) oVar).f9188b.doWrite((l) new zzcn(this, oVar, jVar, pendingIntent));
    }
}
