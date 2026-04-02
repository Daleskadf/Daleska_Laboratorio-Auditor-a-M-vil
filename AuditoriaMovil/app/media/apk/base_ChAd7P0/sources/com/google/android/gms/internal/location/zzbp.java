package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.C1664d;
/* loaded from: classes.dex */
final /* synthetic */ class zzbp implements InterfaceC0747v {
    private final /* synthetic */ C1664d zza;
    private final /* synthetic */ CancellationToken zzb;

    public /* synthetic */ zzbp(C1664d c1664d, CancellationToken cancellationToken) {
        this.zza = c1664d;
        this.zzb = cancellationToken;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        i iVar = zzbi.zzb;
        ((zzdz) obj).zzr(this.zza, this.zzb, (TaskCompletionSource) obj2);
    }
}
