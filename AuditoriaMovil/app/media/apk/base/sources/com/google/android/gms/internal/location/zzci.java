package com.google.android.gms.internal.location;

import X0.c;
import a.AbstractC0412a;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C0740n;
import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.common.api.internal.C0746u;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import p3.C1667g;
import p3.InterfaceC1666f;
/* loaded from: classes.dex */
public final class zzci extends l {
    public static final /* synthetic */ int zza = 0;

    public zzci(Activity activity) {
        super(activity, activity, zzbi.zzb, e.f9157U, k.f9283c);
    }

    @Override // com.google.android.gms.common.api.l
    public final String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final Task<Void> removeOrientationUpdates(InterfaceC1666f interfaceC1666f) {
        return doUnregisterEventListener(AbstractC0412a.j(interfaceC1666f, InterfaceC1666f.class.getSimpleName()), 2440).continueWith(zzcm.zza, zzck.zza);
    }

    public final Task<Void> requestOrientationUpdates(final C1667g c1667g, Executor executor, InterfaceC1666f interfaceC1666f) {
        final C0742p i7 = AbstractC0412a.i(interfaceC1666f, InterfaceC1666f.class.getSimpleName(), executor);
        InterfaceC0747v interfaceC0747v = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzcl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzdz) obj).zzC(C0742p.this, c1667g, (TaskCompletionSource) obj2);
            }
        };
        InterfaceC0747v interfaceC0747v2 = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzcj
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                C0740n c0740n = C0742p.this.f9271c;
                if (c0740n != null) {
                    zzdzVar.zzD(c0740n, taskCompletionSource);
                }
            }
        };
        c a7 = C0746u.a();
        a7.f6249c = interfaceC0747v;
        a7.f6250d = interfaceC0747v2;
        a7.f6251e = i7;
        a7.f6248b = 2434;
        return doRegisterEventListener(a7.c());
    }

    public zzci(Context context) {
        super(context, null, zzbi.zzb, e.f9157U, k.f9283c);
    }
}
