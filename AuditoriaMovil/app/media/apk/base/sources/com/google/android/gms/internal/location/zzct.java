package com.google.android.gms.internal.location;

import B5.M;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p3.j;
/* loaded from: classes.dex */
public final class zzct extends l {
    public static final /* synthetic */ int zza = 0;

    public zzct(Activity activity) {
        super(activity, activity, zzbi.zzb, e.f9157U, k.f9283c);
    }

    public final Task<Void> addGeofences(final j jVar, final PendingIntent pendingIntent) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzcw
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzdz) obj).zzE(j.this, pendingIntent, (TaskCompletionSource) obj2);
            }
        };
        a7.f329b = 2424;
        return doWrite(a7.a());
    }

    public final Task<Void> removeGeofences(final PendingIntent pendingIntent) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzcu
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzdz) obj).zzF(zzem.zzb(pendingIntent), (TaskCompletionSource) obj2);
            }
        };
        a7.f329b = 2425;
        return doWrite(a7.a());
    }

    public zzct(Context context) {
        super(context, null, zzbi.zzb, e.f9157U, k.f9283c);
    }

    public final Task<Void> removeGeofences(final List<String> list) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzcv
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzdz) obj).zzF(zzem.zza(list), (TaskCompletionSource) obj2);
            }
        };
        a7.f329b = 2425;
        return doWrite(a7.a());
    }
}
