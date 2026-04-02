package com.google.android.gms.internal.p000authapiphone;

import B5.M;
import W2.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzv extends l {
    private static final h zza;
    private static final AbstractC0726a zzb;
    private static final i zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new i("SmsCodeBrowser.API", zztVar, obj);
    }

    public zzv(Activity activity) {
        super(activity, activity, zzc, e.f9157U, k.f9283c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{zzac.zzb};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        };
        a7.f329b = 1566;
        return doWrite(a7.a());
    }

    public zzv(Context context) {
        super(context, null, zzc, e.f9157U, k.f9283c);
    }
}
