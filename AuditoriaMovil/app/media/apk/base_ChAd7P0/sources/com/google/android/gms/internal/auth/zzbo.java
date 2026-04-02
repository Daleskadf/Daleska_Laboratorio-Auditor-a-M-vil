package com.google.android.gms.internal.auth;

import B5.M;
import P2.b;
import P2.c;
import T2.a;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class zzbo extends l {
    public zzbo(Activity activity, c cVar) {
        super(activity, activity, b.f4010a, cVar == null ? c.f4011b : cVar, k.f9283c);
    }

    public final Task<String> getSpatulaHeader() {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        };
        a7.f329b = 1520;
        return doRead(a7.a());
    }

    public final Task<T2.b> performProxyRequest(final a aVar) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                a aVar2 = aVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), aVar2);
            }
        };
        a7.f329b = 1518;
        return doWrite(a7.a());
    }

    public zzbo(Context context, c cVar) {
        super(context, null, b.f4010a, cVar == null ? c.f4011b : cVar, k.f9283c);
    }
}
