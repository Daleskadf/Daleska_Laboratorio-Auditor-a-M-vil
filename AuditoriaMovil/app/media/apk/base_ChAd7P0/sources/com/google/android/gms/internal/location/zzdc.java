package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final /* synthetic */ class zzdc implements InterfaceC0747v {
    static final /* synthetic */ zzdc zza = new zzdc();

    private /* synthetic */ zzdc() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        ((zzv) ((zzdz) obj).getService()).zzE(new zzdm((TaskCompletionSource) obj2));
    }
}
