package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcs;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzgdj extends zzgcs.zzi {
    private static final zzgdf zzbd;
    private static final zzgeo zzbe = new zzgeo(zzgdj.class);
    private volatile int remaining;
    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgdf zzgdiVar;
        Throwable th;
        try {
            zzgdiVar = new zzgdg(AtomicReferenceFieldUpdater.newUpdater(zzgdj.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgdj.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzgdiVar = new zzgdi(null);
            th = th2;
        }
        zzbd = zzgdiVar;
        if (th != null) {
            zzbe.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdj(int i) {
        this.remaining = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzA() {
        return zzbd.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zze(newSetFromMap);
            zzbd.zzb(this, null, newSetFromMap);
            return (Set) Objects.requireNonNull(this.seenExceptions);
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
