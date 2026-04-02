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
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzr  reason: invalid package */
/* loaded from: classes.dex */
public final class zzr extends l {
    private static final h zza;
    private static final AbstractC0726a zzb;
    private static final i zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("SmsCodeAutofill.API", zznVar, obj);
    }

    public zzr(Activity activity) {
        super(activity, activity, zzc, e.f9157U, k.f9283c);
    }

    public final Task<Integer> checkPermissionState() {
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{zzac.zza};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        a7.f329b = 1564;
        return doRead(a7.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        I.i(str);
        I.a("The package name cannot be empty.", !str.isEmpty());
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{zzac.zza};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        a7.f329b = 1565;
        return doRead(a7.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{zzac.zza};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        a7.f329b = 1563;
        return doWrite(a7.a());
    }

    public zzr(Context context) {
        super(context, null, zzc, e.f9157U, k.f9283c);
    }
}
