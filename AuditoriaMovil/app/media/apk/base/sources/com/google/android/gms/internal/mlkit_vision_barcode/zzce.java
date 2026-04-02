package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class zzce implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzci zze;

    public /* synthetic */ zzce(zzci zzciVar, zzcd zzcdVar) {
        int i7;
        this.zze = zzciVar;
        i7 = zzciVar.zzf;
        this.zzb = i7;
        this.zzc = zzciVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i7;
        i7 = this.zze.zzf;
        if (i7 == this.zzb) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i7 = this.zzc;
            this.zzd = i7;
            Object zza = zza(i7);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z7;
        zzb();
        if (this.zzd >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzaz.zzf(z7, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i7 = this.zzd;
        zzci zzciVar = this.zze;
        zzciVar.remove(zzci.zzg(zzciVar, i7));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i7);
}
