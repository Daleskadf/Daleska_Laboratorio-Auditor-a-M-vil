package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class zzbk implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzbl zzc;

    public zzbk(zzbl zzblVar, Iterator it) {
        this.zzb = it;
        this.zzc = zzblVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z7;
        int i7;
        if (this.zza != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzaz.zzf(z7, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzbr zzbrVar = this.zzc.zza;
        i7 = zzbrVar.zzb;
        zzbrVar.zzb = i7 - collection.size();
        collection.clear();
        this.zza = null;
    }
}
