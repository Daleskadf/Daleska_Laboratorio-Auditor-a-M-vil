package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class zzbh implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzbi zzc;

    public zzbh(zzbi zzbiVar) {
        this.zzc = zzbiVar;
        this.zza = zzbiVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new zzco(key, this.zzc.zzb.zzd(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z7;
        int i7;
        if (this.zzb != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzaz.zzf(z7, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzbr zzbrVar = this.zzc.zzb;
        i7 = zzbrVar.zzb;
        zzbrVar.zzb = i7 - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
