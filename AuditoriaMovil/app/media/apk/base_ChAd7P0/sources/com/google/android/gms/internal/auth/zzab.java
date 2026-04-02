package com.google.android.gms.internal.auth;

import B5.M;
import N2.b;
import N2.g;
import W2.d;
import Z2.a;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.Status;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzab extends l implements zzg {
    private static final h zza;
    private static final AbstractC0726a zzb;
    private static final i zzc;
    private static final a zzd;
    private final Context zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new i("GoogleAuthService.API", zzvVar, obj);
        zzd = new a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, null, zzc, e.f9157U, k.f9283c);
        this.zze = context;
    }

    public static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (!android.support.v4.media.session.a.D(status, obj, taskCompletionSource)) {
            zzd.f("The task is already complete.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{g.f3398c};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        a7.f329b = 1513;
        return doWrite(a7.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final b bVar) {
        I.j(bVar, "request cannot be null.");
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{g.f3397b};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                b bVar2 = bVar;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
            }
        };
        a7.f329b = 1515;
        return doWrite(a7.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        I.j(account, "Account name cannot be null!");
        I.f(str, "Scope cannot be null!");
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{g.f3398c};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        a7.f329b = 1512;
        return doWrite(a7.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        I.j(account, "account cannot be null.");
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{g.f3397b};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        };
        a7.f329b = 1517;
        return doWrite(a7.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        I.j(str, "Client package name cannot be null!");
        M a7 = AbstractC0751z.a();
        a7.f331d = new d[]{g.f3397b};
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        a7.f329b = 1514;
        return doWrite(a7.a());
    }
}
