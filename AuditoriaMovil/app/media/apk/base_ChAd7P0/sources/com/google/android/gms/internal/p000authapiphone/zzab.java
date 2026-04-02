package com.google.android.gms.internal.p000authapiphone;

import B5.M;
import S2.a;
import W2.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzab  reason: invalid package */
/* loaded from: classes.dex */
public final class zzab extends a {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        a7.f331d = new d[]{zzac.zzc};
        a7.f329b = 1567;
        return doWrite(a7.a());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        a7.f331d = new d[]{zzac.zzd};
        a7.f329b = 1568;
        return doWrite(a7.a());
    }

    public zzab(Context context) {
        super(context);
    }
}
