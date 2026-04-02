package com.google.android.gms.internal.location;

import B5.M;
import W2.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.p;
import p3.q;
import p3.z;
/* loaded from: classes.dex */
public final class zzda extends l {
    public static final /* synthetic */ int zza = 0;

    public zzda(Activity activity) {
        super(activity, activity, zzbi.zzb, e.f9157U, k.f9283c);
    }

    public final Task<q> checkLocationSettings(final p pVar) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzdb
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                boolean z7;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                p pVar2 = p.this;
                if (pVar2 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                I.a("locationSettingsRequest can't be null", z7);
                ((zzv) zzdzVar.getService()).zzD(pVar2, new zzde(taskCompletionSource), null);
            }
        };
        a7.f329b = 2426;
        return doRead(a7.a());
    }

    public final Task<Boolean> isGoogleLocationAccuracyEnabled() {
        M a7 = AbstractC0751z.a();
        a7.f330c = zzdc.zza;
        a7.f329b = 2444;
        a7.f331d = new d[]{z.f15162g};
        return doRead(a7.a());
    }

    public zzda(Context context) {
        super(context, null, zzbi.zzb, e.f9157U, k.f9283c);
    }
}
