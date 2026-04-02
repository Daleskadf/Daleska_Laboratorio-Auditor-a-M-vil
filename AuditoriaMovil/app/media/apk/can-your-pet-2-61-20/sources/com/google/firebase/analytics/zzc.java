package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzds;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.0 */
/* loaded from: classes3.dex */
final class zzc implements Callable<String> {
    private final /* synthetic */ FirebaseAnalytics zza;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        zzds zzdsVar;
        zzdsVar = this.zza.zzb;
        return zzdsVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }
}
