package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfjx {
    public static final zzfke zza(Callable callable, Object obj, zzfkf zzfkfVar) {
        zzgep zzgepVar;
        zzgepVar = zzfkfVar.zzb;
        return zzb(callable, zzgepVar, obj, zzfkfVar);
    }

    public static final zzfke zzb(Callable callable, zzgep zzgepVar, Object obj, zzfkf zzfkfVar) {
        ListenableFuture listenableFuture;
        listenableFuture = zzfkf.zza;
        return new zzfke(zzfkfVar, obj, listenableFuture, Collections.emptyList(), zzgepVar.zzb(callable));
    }

    public static final zzfke zzc(ListenableFuture listenableFuture, Object obj, zzfkf zzfkfVar) {
        ListenableFuture listenableFuture2;
        listenableFuture2 = zzfkf.zza;
        return new zzfke(zzfkfVar, obj, listenableFuture2, Collections.emptyList(), listenableFuture);
    }

    public static final zzfke zzd(final zzfjr zzfjrVar, zzgep zzgepVar, Object obj, zzfkf zzfkfVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfjr.this.zza();
                return null;
            }
        }, zzgepVar, obj, zzfkfVar);
    }
}
