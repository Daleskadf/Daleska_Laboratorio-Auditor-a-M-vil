package com.google.android.gms.internal.mlkit_vision_barcode;

import Y2.b;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C0770t;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class zzwr {
    private final y zza;
    private final AtomicLong zzb = new AtomicLong(-1);

    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.common.internal.y, com.google.android.gms.common.api.l] */
    public zzwr(Context context, String str) {
        this.zza = new l(context, null, b.f6701a, new z("mlkit:vision"), k.f9283c);
    }

    public static zzwr zza(Context context) {
        return new zzwr(context, "mlkit:vision");
    }

    public final /* synthetic */ void zzb(long j, Exception exc) {
        this.zzb.set(j);
    }

    public final synchronized void zzc(int i7, int i8, long j, long j8) {
        AtomicLong atomicLong = this.zzb;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && elapsedRealtime - this.zzb.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        ((b) this.zza).c(new x(0, Arrays.asList(new C0770t(i7, i8, 0, j, j8, null, null, 0, -1)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwq
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzwr.this.zzb(elapsedRealtime, exc);
            }
        });
    }
}
