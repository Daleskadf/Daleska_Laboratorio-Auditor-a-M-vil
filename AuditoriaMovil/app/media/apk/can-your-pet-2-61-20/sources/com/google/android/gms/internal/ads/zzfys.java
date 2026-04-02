package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzfys implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfyw zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfys(zzfyw zzfywVar, zzfyr zzfyrVar) {
        int i;
        this.zze = zzfywVar;
        i = zzfywVar.zzf;
        this.zzb = i;
        this.zzc = zzfywVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            Object zza = zza(i);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfwr.zzk(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzfyw zzfywVar = this.zze;
        zzfywVar.remove(zzfyw.zzg(zzfywVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
