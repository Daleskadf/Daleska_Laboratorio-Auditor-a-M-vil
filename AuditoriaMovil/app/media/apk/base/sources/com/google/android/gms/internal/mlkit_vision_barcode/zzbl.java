package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbl extends zzdc {
    final /* synthetic */ zzbr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(zzbr zzbrVar, Map map) {
        super(map);
        this.zza = zzbrVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdc, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzcx.zza(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzb.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.zzb.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzb.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzbk(this, this.zzb.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdc, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.zzb.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzbr zzbrVar = this.zza;
            i7 = zzbrVar.zzb;
            zzbrVar.zzb = i7 - size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
