package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzds;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.0 */
/* loaded from: classes3.dex */
final class zzb implements Callable<Long> {
    private final /* synthetic */ FirebaseAnalytics zza;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        zzds zzdsVar;
        zzdsVar = this.zza.zzb;
        return zzdsVar.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }
}
