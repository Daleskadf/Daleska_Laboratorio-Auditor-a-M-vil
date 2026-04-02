package com.google.android.gms.internal.location;

import B5.M;
import W2.d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.BinderC0748w;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.C1663c;
import p3.t;
import p3.y;
import p3.z;
/* loaded from: classes.dex */
public final class zzaj extends l {
    static final h zza;
    public static final i zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        zzb = new i("ActivityRecognition.API", new zzag(), obj);
    }

    public zzaj(Activity activity) {
        super(activity, activity, zzb, e.f9157U, k.f9283c);
    }

    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzam
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                ((zzv) ((zzg) obj).getService()).zzk(pendingIntent, new BinderC0748w(new zzai((TaskCompletionSource) obj2)));
            }
        };
        a7.f329b = 2406;
        return doWrite(a7.a());
    }

    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzak
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                ((zzg) obj).zzp(pendingIntent);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        a7.f329b = 2402;
        return doWrite(a7.a());
    }

    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzan
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                zzai zzaiVar = new zzai((TaskCompletionSource) obj2);
                PendingIntent pendingIntent2 = pendingIntent;
                I.j(pendingIntent2, "PendingIntent must be specified.");
                ((zzv) ((zzg) obj).getService()).zzn(pendingIntent2, new BinderC0748w(zzaiVar));
            }
        };
        a7.f329b = 2411;
        return doWrite(a7.a());
    }

    public final Task<Void> requestActivityTransitionUpdates(final C1663c c1663c, final PendingIntent pendingIntent) {
        c1663c.f15089d = getContextAttributionTag();
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzal
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                zzai zzaiVar = new zzai((TaskCompletionSource) obj2);
                C1663c c1663c2 = C1663c.this;
                I.j(c1663c2, "activityTransitionRequest must be specified.");
                PendingIntent pendingIntent2 = pendingIntent;
                I.j(pendingIntent2, "PendingIntent must be specified.");
                ((zzv) ((zzg) obj).getService()).zzj(c1663c2, pendingIntent2, new BinderC0748w(zzaiVar));
            }
        };
        a7.f329b = 2405;
        return doWrite(a7.a());
    }

    public final Task<Void> requestActivityUpdates(long j, final PendingIntent pendingIntent) {
        boolean z7;
        boolean z8 = false;
        if (j >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("intervalMillis can't be negative.", z7);
        if (j != Long.MIN_VALUE) {
            z8 = true;
        }
        I.k("Must set intervalMillis.", z8);
        final y yVar = new y(j, true, null, null, null, false, null, 0L, null);
        yVar.f15151Z = getContextAttributionTag();
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzap
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzaj.zzb;
                zzai zzaiVar = new zzai((TaskCompletionSource) obj2);
                y yVar2 = y.this;
                I.j(yVar2, "ActivityRecognitionRequest can't be null.");
                PendingIntent pendingIntent2 = pendingIntent;
                I.j(pendingIntent2, "PendingIntent must be specified.");
                ((zzv) ((zzg) obj).getService()).zzi(yVar2, pendingIntent2, new BinderC0748w(zzaiVar));
            }
        };
        a7.f329b = 2401;
        return doWrite(a7.a());
    }

    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final t tVar) {
        I.j(pendingIntent, "PendingIntent must be specified.");
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzao
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzv) ((zzg) obj).getService()).zzm(pendingIntent, tVar, new zzah(zzaj.this, (TaskCompletionSource) obj2));
            }
        };
        a7.f331d = new d[]{z.f15157a};
        a7.f329b = 2410;
        return doRead(a7.a());
    }

    public zzaj(Context context) {
        super(context, null, zzb, e.f9157U, k.f9283c);
    }
}
