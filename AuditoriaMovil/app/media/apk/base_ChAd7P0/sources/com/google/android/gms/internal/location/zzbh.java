package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0740n;
import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbh implements InterfaceC0747v, zzdr {
    final /* synthetic */ zzbi zza;
    private final zzbg zzb;
    private C0742p zzc;
    private boolean zzd = true;

    public zzbh(zzbi zzbiVar, C0742p c0742p, zzbg zzbgVar) {
        this.zza = zzbiVar;
        this.zzc = c0742p;
        this.zzb = zzbgVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
    public final void accept(Object obj, Object obj2) {
        C0740n c0740n;
        boolean z7;
        zzdz zzdzVar = (zzdz) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            c0740n = this.zzc.f9271c;
            z7 = this.zzd;
            this.zzc.a();
        }
        if (c0740n == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            this.zzb.zza(zzdzVar, c0740n, z7, taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final synchronized C0742p zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final synchronized void zzb(C0742p c0742p) {
        C0742p c0742p2 = this.zzc;
        if (c0742p2 != c0742p) {
            c0742p2.a();
            this.zzc = c0742p;
        }
    }

    @Override // com.google.android.gms.internal.location.zzdr
    public final void zzc() {
        C0740n c0740n;
        synchronized (this) {
            this.zzd = false;
            c0740n = this.zzc.f9271c;
        }
        if (c0740n != null) {
            this.zza.doUnregisterEventListener(c0740n, 2441);
        }
    }
}
